package com.ruoyi.project.prod.controller;


import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.order.form.domain.Order;
import com.ruoyi.project.order.form.service.IOrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("prod/from")
public class Production extends BaseController {
    private String prefix = "prod/form";
    @Autowired
    private IOrderService orderService;
    @RequiresPermissions("prod:form:view")
    @GetMapping()
    public String form()
    {
        return prefix + "/form";
    }
    /**
     * 查询订单管理列表
     */
    @RequiresPermissions("prod:form:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Order order)
    {
        //检测数据库变化
        startPage();
        //查询订单状是3 未打餐的订单数据
        List<Order> list = orderService.selectOrderState("3");
        return getDataTable(list);
    }

}
