package com.ruoyi.project.system.route.service.impl;

import java.util.List;

import com.ruoyi.project.system.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.route.mapper.RouteTableMapper;
import com.ruoyi.project.system.route.domain.RouteTable;
import com.ruoyi.project.system.route.service.IRouteTableService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 流水线路Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-23
 */
@Service
public class RouteTableServiceImpl implements IRouteTableService
{
    @Autowired
    private RouteTableMapper routeTableMapper;

    /**
     * 查询流水线路
     * 
     * @param routeId 流水线路ID
     * @return 流水线路
     */
    @Override
    public RouteTable selectRouteTableById(Long routeId)
    {
        return routeTableMapper.selectRouteTableById(routeId);
    }

    @Override
    public List<RouteTable> selectRoure(Long routeId) {
        return routeTableMapper.selectRouteId(routeId);
    }

    /**
     * 查询流水线路列表
     * 
     * @param routeTable 流水线路
     * @return 流水线路
     */
    @Override
    public List<RouteTable> selectRouteTableList(RouteTable routeTable)
    {
        return routeTableMapper.selectRouteTableList(routeTable);
    }

    /**
     * 新增流水线路
     * 
     * @param routeTable 流水线路
     * @return 结果
     */
    @Override
    public int insertRouteTable(RouteTable routeTable)
    {
        return routeTableMapper.insertRouteTable(routeTable);
    }

    /**
     * 修改流水线路
     * 
     * @param routeTable 流水线路
     * @return 结果
     */
    @Override
    public int updateRouteTable(RouteTable routeTable)
    {
        return routeTableMapper.updateRouteTable(routeTable);
    }

    /**
     * 删除流水线路对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRouteTableByIds(String ids)
    {
        return routeTableMapper.deleteRouteTableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流水线路信息
     * 
     * @param routeId 流水线路ID
     * @return 结果
     */
    @Override
    public int deleteRouteTableById(Long routeId)
    {
        return routeTableMapper.deleteRouteTableById(routeId);
    }

    @Override
    public List<Integer> selectRole(Integer role) {
        return routeTableMapper.selectRole(role);
    }

    @Override
    public List<User> selectUserName(List<Integer> userId) {
        return routeTableMapper.selectUserName(userId);
    }

}
