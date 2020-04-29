package com.ruoyi.project.system.customer.controller;

import java.util.List;
import java.util.Objects;

import com.ruoyi.project.system.delivery.domain.DeliveryTable;
import com.ruoyi.project.system.delivery.service.IDeliveryTableService;
import com.ruoyi.project.system.manage.domain.FoodManage;
import com.ruoyi.project.system.manage.service.IFoodManageService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.customer.domain.SysCustomer;
import com.ruoyi.project.system.customer.service.ISysCustomerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 客户管理Controller
 * 
 * @author zyk
 * @date 2020-04-17
 */
@Controller
@RequestMapping("/system/customer")
public class SysCustomerController extends BaseController
{
    private String prefix = "system/customer";

    @Autowired
    private ISysCustomerService sysCustomerService;
    @Autowired
    private IDeliveryTableService deliveryTableService;
    @Autowired
    private IFoodManageService foodManageService;

    @RequiresPermissions("system:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }

    /**
     * 查询客户管理列表
     */
    @RequiresPermissions("system:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysCustomer sysCustomer)
    {
        startPage();
        List<SysCustomer> list = sysCustomerService.selectSysCustomerList(sysCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户管理列表
     */
    @RequiresPermissions("system:customer:export")
    @Log(title = "客户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysCustomer sysCustomer)
    {
        List<SysCustomer> list = sysCustomerService.selectSysCustomerList(sysCustomer);
        ExcelUtil<SysCustomer> util = new ExcelUtil<SysCustomer>(SysCustomer.class);
        return util.exportExcel(list, "customer");
    }

    /**
     * 新增客户管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户管理
     */
    @RequiresPermissions("system:customer:add")
    @Log(title = "客户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    @Transactional
    public AjaxResult addSave(SysCustomer sysCustomer) {
        try {
            toAjax(sysCustomerService.insertSysCustomer(sysCustomer));
            //同步到路线和主食分拣表
            DeliveryTable deliveryTable = new DeliveryTable();
            deliveryTable.setCompanyId(sysCustomer.getId());
            deliveryTable.setCompanyName(sysCustomer.getCompanyName());
            FoodManage foodManage=new FoodManage();
            foodManage.setCompanyId(sysCustomer.getId());
            foodManage.setCompanyName(sysCustomer.getCompanyName());
            if (Objects.nonNull(deliveryTable) && Objects.nonNull(foodManage)) {
                deliveryTableService.insertDeliveryTable(deliveryTable);
                foodManageService.insertFoodManage(foodManage);
            }
        } catch (Exception e) {
            return toAjax(0);
        }
        return toAjax(1);
    }
    /**
     * 修改客户管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SysCustomer sysCustomer = sysCustomerService.selectSysCustomerById(id);
        mmap.put("sysCustomer", sysCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户管理
     */
    @RequiresPermissions("system:customer:edit")
    @Log(title = "客户管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    @Transactional
    public AjaxResult editSave(SysCustomer sysCustomer)
    {
        //同步路线和主食分拣表
        DeliveryTable deliveryTable=new DeliveryTable();
        deliveryTable.setCompanyId(sysCustomer.getId());
        deliveryTable.setCompanyName(sysCustomer.getCompanyName());
        FoodManage foodManage=new FoodManage();
        foodManage.setCompanyId(sysCustomer.getId());
        foodManage.setCompanyName(sysCustomer.getCompanyName());
        if(Objects.nonNull(deliveryTable)){
            deliveryTableService.updateDeliveryTables(deliveryTable);
            foodManageService.updateFoodManages(foodManage);
        }
        return toAjax(sysCustomerService.updateSysCustomer(sysCustomer));
    }

    /**
     * 删除客户管理
     */
    @RequiresPermissions("system:customer:remove")
    @Log(title = "客户管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    @Transactional
    public AjaxResult remove(String ids)
    {
        deliveryTableService.deleteCommpanty(ids);
        foodManageService.deletefoods(ids);
        return toAjax(sysCustomerService.deleteSysCustomerByIds(ids));
    }
}
