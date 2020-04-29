package com.ruoyi.project.order.form.service;

import java.util.List;
import com.ruoyi.project.order.form.domain.Order;

/**
 * 订单管理Service接口
 * 
 * @author zyk
 * @date 2020-04-26
 */
public interface IOrderService 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理ID
     * @return 订单管理
     */
    public Order selectOrderById(Long id);

    /**
     * 查询订单管理列表
     * 
     * @param order 订单管理
     * @return 订单管理集合
     */
    public List<Order> selectOrderList(Order order);

    /**
     * 新增订单管理
     * 
     * @param order 订单管理
     * @return 结果
     */
    public int insertOrder(Order order);

    /**
     * 修改订单管理
     * 
     * @param order 订单管理
     * @return 结果
     */
    public int updateOrder(Order order);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderByIds(String ids);

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理ID
     * @return 结果
     */
    public int deleteOrderById(Long id);

    /**
     * 查询订单数量
     */
    public int selectNumber(String state);
    /**
     * 根据订单状态查询订单
     */
    public List<Order> selectOrderState(String id);
}
