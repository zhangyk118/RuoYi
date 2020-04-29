package com.ruoyi.project.meal.release.controller;

import java.util.List;

import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.system.user.domain.User;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.meal.release.domain.MealRelease;
import com.ruoyi.project.meal.release.service.IMealReleaseService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 套餐发布Controller
 * 
 * @author zyk
 * @date 2020-04-18
 */
@Controller
@RequestMapping("/meal/release")
public class MealReleaseController extends BaseController
{
    private String prefix = "meal/release";

    @Autowired
    private IMealReleaseService mealReleaseService;

    @RequiresPermissions("meal:release:view")
    @GetMapping()
    public String release()
    {
        return prefix + "/release";
    }

    /**
     * 查询套餐发布列表
     */
    @RequiresPermissions("meal:release:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MealRelease mealRelease)
    {
        startPage();
        User s=ShiroUtils.getSysUser();
        List<MealRelease> list = mealReleaseService.selectMealReleaseList(mealRelease);
        return getDataTable(list);
    }

    /**
     * 导出套餐发布列表
     */
    @RequiresPermissions("meal:release:export")
    @Log(title = "套餐发布", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MealRelease mealRelease)
    {
        List<MealRelease> list = mealReleaseService.selectMealReleaseList(mealRelease);
        ExcelUtil<MealRelease> util = new ExcelUtil<MealRelease>(MealRelease.class);
        return util.exportExcel(list, "release");
    }

    /**
     * 新增套餐发布
     */
    @GetMapping("/add")
    public String add(ModelMap map)
    {
        //菜品类型为荤菜的菜品
        map.put("meat",mealReleaseService.selectMealType("1"));
        map.put("dish",mealReleaseService.selectMealType("2"));
        return prefix + "/add";
    }

    /**
     * 新增保存套餐发布
     */
    @RequiresPermissions("meal:release:add")
    @Log(title = "套餐发布", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated MealRelease mealRelease)
    {
        return toAjax(mealReleaseService.insertMealRelease(mealRelease));
    }

    /**
     * 修改套餐发布
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MealRelease mealRelease = mealReleaseService.selectMealReleaseById(id);
        mmap.put("mealRelease", mealRelease);
        return prefix + "/edit";
    }

    /**
     * 修改保存套餐发布
     */
    @RequiresPermissions("meal:release:edit")
    @Log(title = "套餐发布", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MealRelease mealRelease)
    {
        return toAjax(mealReleaseService.updateMealRelease(mealRelease));
    }

    /**
     * 删除套餐发布
     */
    @RequiresPermissions("meal:release:remove")
    @Log(title = "套餐发布", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mealReleaseService.deleteMealReleaseByIds(ids));
    }
}
