package com.ruoyi.project.order.form.service.impl;

import java.util.List;
import java.util.Objects;

import com.alibaba.fastjson.JSONArray;
import com.ruoyi.project.websocket.WebSocketServer;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.order.form.mapper.OrderMapper;
import com.ruoyi.project.order.form.domain.Order;
import com.ruoyi.project.order.form.service.IOrderService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 订单管理Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-26
 */
@Service
public class OrderServiceImpl extends Thread implements IOrderService
{
    @Autowired
    private OrderMapper orderMapper;
    private String id;
    private IOrderService iOrderService;
    private int sum;//更新前
    private int new_sum;//更新后
    private boolean stopMe = true;
    private Order order;
    /**
     * 查询订单管理
     * 
     * @param id 订单管理ID
     * @return 订单管理
     */
    @Override
    public Order selectOrderById(Long id)
    {
        return orderMapper.selectOrderById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param order 订单管理
     * @return 订单管理
     */
    @Override
    public List<Order> selectOrderList(Order order)
    {
        return orderMapper.selectOrderList(order);
    }

    /**
     * 新增订单管理
     * 
     * @param order 订单管理
     * @return 结果
     */
    @Override
    public int insertOrder(Order order)
    {
        return orderMapper.insertOrder(order);
    }

    /**
     * 修改订单管理
     * 
     * @param order 订单管理
     * @return 结果
     */
    @Override
    public int updateOrder(Order order)
    {
        return orderMapper.updateOrder(order);
    }

    /**
     * 删除订单管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderByIds(String ids)
    {
        return orderMapper.deleteOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理ID
     * @return 结果
     */
    @Override
    public int deleteOrderById(Long id)
    {
        return orderMapper.deleteOrderById(id);
    }

    @Override
    public int selectNumber(String state) {
        return orderMapper.selectOrderNumber(state);
    }

    @Override
    public List<Order> selectOrderState(String id) {
        return orderMapper.orderState(id);
    }
    public void setOrder(Order order) {
        this.order = order;
    }
}
