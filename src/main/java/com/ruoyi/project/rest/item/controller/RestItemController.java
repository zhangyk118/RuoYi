package com.ruoyi.project.rest.item.controller;

import java.util.List;
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
import com.ruoyi.project.rest.item.domain.RestItem;
import com.ruoyi.project.rest.item.service.IRestItemService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 餐品Controller
 * 
 * @author zyk
 * @date 2020-04-18
 */
@Controller
@RequestMapping("/rest/item")
public class RestItemController extends BaseController
{
    private String prefix = "rest/item";

    @Autowired
    private IRestItemService restItemService;

    @RequiresPermissions("rest:item:view")
    @GetMapping()
    public String item()
    {
        return prefix + "/item";
    }

    /**
     * 查询餐品列表
     */
    @RequiresPermissions("rest:item:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RestItem restItem)
    {
        startPage();
        List<RestItem> list = restItemService.selectRestItemList(restItem);
        return getDataTable(list);
    }

    /**
     * 导出餐品列表
     */
    @RequiresPermissions("rest:item:export")
    @Log(title = "餐品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RestItem restItem)
    {
        List<RestItem> list = restItemService.selectRestItemList(restItem);
        ExcelUtil<RestItem> util = new ExcelUtil<RestItem>(RestItem.class);
        return util.exportExcel(list, "item");
    }

    /**
     * 新增餐品
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存餐品
     */
    @RequiresPermissions("rest:item:add")
    @Log(title = "餐品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RestItem restItem)
    {
        return toAjax(restItemService.insertRestItem(restItem));
    }

    /**
     * 修改餐品
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RestItem restItem = restItemService.selectRestItemById(id);
        mmap.put("restItem", restItem);
        return prefix + "/edit";
    }

    /**
     * 修改保存餐品
     */
    @RequiresPermissions("rest:item:edit")
    @Log(title = "餐品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RestItem restItem)
    {
        return toAjax(restItemService.updateRestItem(restItem));
    }

    /**
     * 删除餐品
     */
    @RequiresPermissions("rest:item:remove")
    @Log(title = "餐品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(restItemService.deleteRestItemByIds(ids));
    }
}
