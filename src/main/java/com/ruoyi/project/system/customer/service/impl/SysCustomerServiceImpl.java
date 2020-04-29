package com.ruoyi.project.system.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.customer.mapper.SysCustomerMapper;
import com.ruoyi.project.system.customer.domain.SysCustomer;
import com.ruoyi.project.system.customer.service.ISysCustomerService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 客户管理Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-17
 */
@Service
public class SysCustomerServiceImpl implements ISysCustomerService 
{
    @Autowired
    private SysCustomerMapper sysCustomerMapper;

    /**
     * 查询客户管理
     * 
     * @param id 客户管理ID
     * @return 客户管理
     */
    @Override
    public SysCustomer selectSysCustomerById(Long id)
    {
        return sysCustomerMapper.selectSysCustomerById(id);
    }

    /**
     * 查询客户管理列表
     * 
     * @param sysCustomer 客户管理
     * @return 客户管理
     */
    @Override
    public List<SysCustomer> selectSysCustomerList(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.selectSysCustomerList(sysCustomer);
    }

    /**
     * 新增客户管理
     * 
     * @param sysCustomer 客户管理
     * @return 结果
     */
    @Override
    public int insertSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.insertSysCustomer(sysCustomer);
    }

    /**
     * 修改客户管理
     * 
     * @param sysCustomer 客户管理
     * @return 结果
     */
    @Override
    public int updateSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.updateSysCustomer(sysCustomer);
    }

    /**
     * 删除客户管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysCustomerByIds(String ids)
    {
        return sysCustomerMapper.deleteSysCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户管理信息
     * 
     * @param id 客户管理ID
     * @return 结果
     */
    @Override
    public int deleteSysCustomerById(Long id)
    {
        return sysCustomerMapper.deleteSysCustomerById(id);
    }
}
