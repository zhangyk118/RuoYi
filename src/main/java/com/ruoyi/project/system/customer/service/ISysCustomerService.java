package com.ruoyi.project.system.customer.service;

import java.util.List;
import com.ruoyi.project.system.customer.domain.SysCustomer;

/**
 * 客户管理Service接口
 * 
 * @author zyk
 * @date 2020-04-17
 */
public interface ISysCustomerService 
{
    /**
     * 查询客户管理
     * 
     * @param id 客户管理ID
     * @return 客户管理
     */
    public SysCustomer selectSysCustomerById(Long id);

    /**
     * 查询客户管理列表
     * 
     * @param sysCustomer 客户管理
     * @return 客户管理集合
     */
    public List<SysCustomer> selectSysCustomerList(SysCustomer sysCustomer);

    /**
     * 新增客户管理
     * 
     * @param sysCustomer 客户管理
     * @return 结果
     */
    public int insertSysCustomer(SysCustomer sysCustomer);

    /**
     * 修改客户管理
     * 
     * @param sysCustomer 客户管理
     * @return 结果
     */
    public int updateSysCustomer(SysCustomer sysCustomer);

    /**
     * 批量删除客户管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysCustomerByIds(String ids);

    /**
     * 删除客户管理信息
     * 
     * @param id 客户管理ID
     * @return 结果
     */
    public int deleteSysCustomerById(Long ids);
}
