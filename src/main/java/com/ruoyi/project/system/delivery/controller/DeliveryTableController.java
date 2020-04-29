package com.ruoyi.project.system.delivery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ruoyi.project.system.route.service.IRouteTableService;
import com.ruoyi.project.system.user.domain.User;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.delivery.domain.DeliveryTable;
import com.ruoyi.project.system.delivery.service.IDeliveryTableService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 配送管理Controller
 * 
 * @author zyk
 * @date 2020-04-24
 */
@Controller
@RequestMapping("/system/delivery")
public class DeliveryTableController extends BaseController
{
    private String prefix = "system/delivery";

    @Autowired
    private IDeliveryTableService deliveryTableService;
    @Autowired
    private IRouteTableService routeTableService;
    @RequiresPermissions("system:delivery:view")
    @GetMapping()
    public String delivery()
    {
        return prefix + "/delivery";
    }

    /**
     * 查询配送管理列表
     */
    @RequiresPermissions("system:delivery:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DeliveryTable deliveryTable)
    {
        startPage();
        List<DeliveryTable> list = deliveryTableService.selectDeliveryTableList(deliveryTable);
        return getDataTable(list);
    }

    /**
     * 导出配送管理列表
     */
    @RequiresPermissions("system:delivery:export")
    @Log(title = "配送管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DeliveryTable deliveryTable)
    {
        List<DeliveryTable> list = deliveryTableService.selectDeliveryTableList(deliveryTable);
        ExcelUtil<DeliveryTable> util = new ExcelUtil<DeliveryTable>(DeliveryTable.class);
        return util.exportExcel(list, "delivery");
    }

    /**
     * 新增配送管理
     */
    @GetMapping("/add")
    public String add(ModelMap map)
    {
        //打餐员
        List<Integer> userId=routeTableService.selectRole(104);
        if(Objects.nonNull(userId) && userId.size()>0){
            List<User> userName=routeTableService.selectUserName(userId);
            map.put("dhy",userName);
        }
        return prefix + "/add";
    }

    /**
     * 新增保存配送管理
     */
    @RequiresPermissions("system:delivery:add")
    @Log(title = "配送管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DeliveryTable deliveryTable)
    {
        return toAjax(deliveryTableService.insertDeliveryTable(deliveryTable));
    }

    /**
     * 修改配送管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        //打餐员
        List<Integer> userId=routeTableService.selectRole(104);
        if(Objects.nonNull(userId) && userId.size()>0){
            List<User> userName=routeTableService.selectUserName(userId);
            mmap.put("dhy",userName);
        }
        DeliveryTable deliveryTable = deliveryTableService.selectDeliveryTableById(id);
        mmap.put("deliveryTable", deliveryTable);
        return prefix + "/edit";
    }

    /**
     * 修改保存配送管理
     */
    @RequiresPermissions("system:delivery:edit")
    @Log(title = "配送管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DeliveryTable deliveryTable)
    {
        List ids=new ArrayList();
        ids.add(deliveryTable.getDistributorId());
        List<User> user= routeTableService.selectUserName(ids);
        if(user.size()>0){
            deliveryTable.setDistributorName(user.get(0).getUserName());
        }
        return toAjax(deliveryTableService.updateDeliveryTable(deliveryTable));
    }

    /**
     * 删除配送管理
     */
    @RequiresPermissions("system:delivery:remove")
    @Log(title = "配送管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deliveryTableService.deleteDeliveryTableByIds(ids));
    }
}
