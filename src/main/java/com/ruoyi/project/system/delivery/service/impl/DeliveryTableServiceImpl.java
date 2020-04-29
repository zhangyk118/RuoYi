package com.ruoyi.project.system.delivery.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.delivery.mapper.DeliveryTableMapper;
import com.ruoyi.project.system.delivery.domain.DeliveryTable;
import com.ruoyi.project.system.delivery.service.IDeliveryTableService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 配送管理Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-24
 */
@Service
public class DeliveryTableServiceImpl implements IDeliveryTableService 
{
    @Autowired
    private DeliveryTableMapper deliveryTableMapper;

    /**
     * 查询配送管理
     * 
     * @param id 配送管理ID
     * @return 配送管理
     */
    @Override
    public DeliveryTable selectDeliveryTableById(Long id)
    {
        return deliveryTableMapper.selectDeliveryTableById(id);
    }

    /**
     * 查询配送管理列表
     * 
     * @param deliveryTable 配送管理
     * @return 配送管理
     */
    @Override
    public List<DeliveryTable> selectDeliveryTableList(DeliveryTable deliveryTable)
    {
        return deliveryTableMapper.selectDeliveryTableList(deliveryTable);
    }

    /**
     * 新增配送管理
     * 
     * @param deliveryTable 配送管理
     * @return 结果
     */
    @Override
    public int insertDeliveryTable(DeliveryTable deliveryTable)
    {
        return deliveryTableMapper.insertDeliveryTable(deliveryTable);
    }

    /**
     * 修改配送管理
     * 
     * @param deliveryTable 配送管理
     * @return 结果
     */
    @Override
    public int updateDeliveryTable(DeliveryTable deliveryTable)
    {
        return deliveryTableMapper.updateDeliveryTable(deliveryTable);
    }

    @Override
    public int updateDeliveryTables(DeliveryTable deliveryTable) {
        return deliveryTableMapper.updateDeliveryTables(deliveryTable);
    }

    /**
     * 删除配送管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryTableByIds(String ids)
    {
        return deliveryTableMapper.deleteDeliveryTableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除配送管理信息
     * 
     * @param id 配送管理ID
     * @return 结果
     */
    @Override
    public int deleteDeliveryTableById(Long id)
    {
        return deliveryTableMapper.deleteDeliveryTableById(id);
    }

    /**
     * 删除公司
     * @param ids
     * @return
     */
    @Override
    public int deleteCommpanty(String ids) {
        return deliveryTableMapper.deleteCommpany(Convert.toStrArray(ids));
    }
}
