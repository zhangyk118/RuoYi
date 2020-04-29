package com.ruoyi.project.system.manage.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ruoyi.project.system.route.service.IRouteTableService;
import com.ruoyi.project.system.user.domain.User;
import org.apache.ibatis.annotations.Param;
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
import com.ruoyi.project.system.manage.domain.FoodManage;
import com.ruoyi.project.system.manage.service.IFoodManageService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 主食分拣管理Controller
 * 
 * @author zyk
 * @date 2020-04-25
 */
@Controller
@RequestMapping("/system/manage")
public class FoodManageController extends BaseController
{
    private String prefix = "system/manage";

    @Autowired
    private IFoodManageService foodManageService;

    @RequiresPermissions("system:manage:view")
    @GetMapping()
    public String manage()
    {
        return prefix + "/manage";
    }
    @Autowired
    private IRouteTableService routeTableService;
    /**
     * 查询主食分拣管理列表
     */
    @RequiresPermissions("system:manage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FoodManage foodManage)
    {
        startPage();
        List<FoodManage> list = foodManageService.selectFoodManageList(foodManage);
        return getDataTable(list);
    }

    /**
     * 导出主食分拣管理列表
     */
    @RequiresPermissions("system:manage:export")
    @Log(title = "主食分拣管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FoodManage foodManage)
    {
        List<FoodManage> list = foodManageService.selectFoodManageList(foodManage);
        ExcelUtil<FoodManage> util = new ExcelUtil<FoodManage>(FoodManage.class);
        return util.exportExcel(list, "manage");
    }

    /**
     * 新增主食分拣管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存主食分拣管理
     */
    @RequiresPermissions("system:manage:add")
    @Log(title = "主食分拣管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FoodManage foodManage)
    {
        return toAjax(foodManageService.insertFoodManage(foodManage));
    }

    /**
     * 修改主食分拣管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FoodManage foodManage = foodManageService.selectFoodManageById(id);
        mmap.put("foodManage", foodManage);
        //查询出主食分拣人的id和姓名
        List<Integer> userId=routeTableService.selectRole(103);
        if(Objects.nonNull(userId) && userId.size()>0){
            List<User> userName=routeTableService.selectUserName(userId);
            mmap.put("dhy",userName);
        }
        return prefix + "/edit";
    }

    /**
     * 修改保存主食分拣管理
     */
    @RequiresPermissions("system:manage:edit")
    @Log(title = "主食分拣管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    @Transactional
    public AjaxResult editSave(FoodManage foodManage)
    {
        List ids=new ArrayList();
        ids.add(foodManage.getSortingId());
        List<User> user= routeTableService.selectUserName(ids);
        if(user.size()>0){
            foodManage.setSortingName(user.get(0).getUserName());
        }
        return toAjax(foodManageService.updateFoodManage(foodManage));
    }

    /**
     * 删除主食分拣管理
     */
    @RequiresPermissions("system:manage:remove")
    @Log(title = "主食分拣管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(foodManageService.deleteFoodManageByIds(ids));
    }
}
