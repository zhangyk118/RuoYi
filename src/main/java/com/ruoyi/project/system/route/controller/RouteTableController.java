package com.ruoyi.project.system.route.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.service.IUserService;
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
import com.ruoyi.project.system.route.domain.RouteTable;
import com.ruoyi.project.system.route.service.IRouteTableService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 流水线路Controller
 * 
 * @author zyk
 * @date 2020-04-23
 */
@Controller
@RequestMapping("/system/route")
public class RouteTableController extends BaseController
{
    private String prefix = "system/route";

    @Autowired
    private IRouteTableService routeTableService;
    @Autowired
    private IUserService userService;
    @RequiresPermissions("system:route:view")
    @GetMapping()
    public String route()
    {
        return prefix + "/route";
    }

    /**
     * 查询流水线路列表
     */
    @RequiresPermissions("system:route:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RouteTable routeTable)
    {
        startPage();
        List<RouteTable> list = routeTableService.selectRouteTableList(routeTable);
        return getDataTable(list);
    }

    /**
     * 导出流水线路列表
     */
    @RequiresPermissions("system:route:export")
    @Log(title = "流水线路", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RouteTable routeTable)
    {
        List<RouteTable> list = routeTableService.selectRouteTableList(routeTable);
        ExcelUtil<RouteTable> util = new ExcelUtil<RouteTable>(RouteTable.class);
        return util.exportExcel(list, "route");
    }

    /**
     * 新增流水线路
     */
    @GetMapping("/add")
    public String add(ModelMap map)
    {
        //打餐员
        List<Integer> userId=routeTableService.selectRole(101);
        if(Objects.nonNull(userId) && userId.size()>0){
            List<User> userName=routeTableService.selectUserName(userId);
            map.put("userName",userName);
        }
        //打荷员
        List<Integer> catog=routeTableService.selectRole(102);
        if(Objects.nonNull(catog) && catog.size()>0){
            List<User> catogName=routeTableService.selectUserName(catog);
            map.put("catos",catogName);
        }
        return prefix + "/add";
    }

    /**
     * 新增保存流水线路
     */
    @RequiresPermissions("system:route:add")
    @Log(title = "流水线路", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RouteTable routeTable)
    {

        List<RouteTable> route = routeTableService.selectRoure(routeTable.getRouteId());
        if(route.size()==0){
            List id=new ArrayList();
            id.add(routeTable.getCatererId());
            List<User> users= routeTableService.selectUserName(id);
            if(users.size()>0){
                routeTable.setCatererName(users.get(0).getUserName());
            }
            List ids=new ArrayList();
            ids.add(routeTable.getCartographerId());
            List<User> user= routeTableService.selectUserName(ids);
            if(user.size()>0){
                routeTable.setCartographerName(user.get(0).getUserName());
            }
            return toAjax(routeTableService.insertRouteTable(routeTable));
        }else {
            return AjaxResult.error("路线已存在，请重新输入");
        }

    }

    /**
     * 修改流水线路
     */
    @GetMapping("/edit/{routeId}")
    public String edit(@PathVariable("routeId") Long routeId, ModelMap mmap)
    {
        RouteTable routeTable = routeTableService.selectRouteTableById(routeId);
        //打餐员
        List<Integer> userId=routeTableService.selectRole(101);
        if(Objects.nonNull(userId) && userId.size()>0){
            List<User> userName=routeTableService.selectUserName(userId);
            mmap.put("userName",userName);
        }
        //打荷员
        List<Integer> catog=routeTableService.selectRole(102);
        if(Objects.nonNull(catog) && catog.size()>0){
            List<User> catogName=routeTableService.selectUserName(catog);
            mmap.put("catos",catogName);
        }
        mmap.put("routeTable", routeTable);
        return prefix + "/edit";
    }

    /**
     * 修改保存流水线路
     */
    @RequiresPermissions("system:route:edit")
    @Log(title = "流水线路", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RouteTable routeTable)
    {
        List<RouteTable> route = routeTableService.selectRoure(routeTable.getRouteId());
        if(route.size()==1){
            return AjaxResult.error("路线已存在，请重新输入");
        }else {
            List list=new ArrayList();
            list.add(routeTable.getCatererId());
            List<User> users=routeTableService.selectUserName(list);
            if(users.size()>0){
                routeTable.setCatererName(users.get(0).getUserName());
            }
            List ids=new ArrayList();
            ids.add(routeTable.getCartographerId());
            List<User> user= routeTableService.selectUserName(ids);
            if(user.size()>0){
                routeTable.setCartographerName(user.get(0).getUserName());
            }
            return toAjax(routeTableService.updateRouteTable(routeTable));
        }

    }

    /**
     * 删除流水线路
     */
    @RequiresPermissions("system:route:remove")
    @Log(title = "流水线路", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(routeTableService.deleteRouteTableByIds(ids));
    }
}
