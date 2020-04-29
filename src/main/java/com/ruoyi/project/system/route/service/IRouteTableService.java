package com.ruoyi.project.system.route.service;

import java.util.List;
import com.ruoyi.project.system.route.domain.RouteTable;
import com.ruoyi.project.system.user.domain.User;

/**
 * 流水线路Service接口
 * 
 * @author zyk
 * @date 2020-04-23
 */
public interface IRouteTableService 
{
    /**
     * 查询流水线路
     * 
     * @param routeId 流水线路ID
     * @return 流水线路
     */
    public  RouteTable selectRouteTableById(Long routeId);

    /**
     * 查询线路是否已经存在
     * @param routeId
     * @return
     */
    public List<RouteTable> selectRoure(Long routeId);

    /**
     * 查询流水线路列表
     * 
     * @param routeTable 流水线路
     * @return 流水线路集合
     */
    public List<RouteTable> selectRouteTableList(RouteTable routeTable);

    /**
     * 新增流水线路
     * 
     * @param routeTable 流水线路
     * @return 结果
     */
    public int insertRouteTable(RouteTable routeTable);

    /**
     * 修改流水线路
     * 
     * @param routeTable 流水线路
     * @return 结果
     */
    public int updateRouteTable(RouteTable routeTable);

    /**
     * 批量删除流水线路
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRouteTableByIds(String ids);

    /**
     * 删除流水线路信息
     * 
     * @param routeId 流水线路ID
     * @return 结果
     */
    public int deleteRouteTableById(Long routeId);

    /**
     * 查询流水线路列表
     *
     * @param
     * @return 流水线路集合
     */
    public List<Integer> selectRole(Integer role);

    /**
     * 查询角色所对应的人员
     * @param
     * @return
     */
    public List<User> selectUserName(List<Integer> userId);
}
