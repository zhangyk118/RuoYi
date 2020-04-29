package com.ruoyi.project.system.delivery.service;

import java.util.List;
import com.ruoyi.project.system.delivery.domain.DeliveryTable;

/**
 * 配送管理Service接口
 * 
 * @author zyk
 * @date 2020-04-24
 */
public interface IDeliveryTableService 
{
    /**
     * 查询配送管理
     * 
     * @param id 配送管理ID
     * @return 配送管理
     */
    public DeliveryTable selectDeliveryTableById(Long id);

    /**
     * 查询配送管理列表
     * 
     * @param deliveryTable 配送管理
     * @return 配送管理集合
     */
    public List<DeliveryTable> selectDeliveryTableList(DeliveryTable deliveryTable);

    /**
     * 新增配送管理
     * 
     * @param deliveryTable 配送管理
     * @return 结果
     */
    public int insertDeliveryTable(DeliveryTable deliveryTable);

    /**
     * 修改配送管理
     * 
     * @param deliveryTable 配送管理
     * @return 结果
     */
    public int updateDeliveryTable(DeliveryTable deliveryTable);
    public int updateDeliveryTables(DeliveryTable deliveryTable);
    /**
     * 批量删除配送管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeliveryTableByIds(String ids);

    /**
     * 删除配送管理信息
     * 
     * @param id 配送管理ID
     * @return 结果
     */
    public int deleteDeliveryTableById(Long id);

    /**
     * 删除公司
     */
    public  int deleteCommpanty(String ids);
}
