package com.ruoyi.project.rest.item.service;

import java.util.List;
import com.ruoyi.project.rest.item.domain.RestItem;

/**
 * 餐品Service接口
 * 
 * @author zyk
 * @date 2020-04-18
 */
public interface IRestItemService 
{
    /**
     * 查询餐品
     * 
     * @param id 餐品ID
     * @return 餐品
     */
    public RestItem selectRestItemById(Long id);

    /**
     * 查询餐品列表
     * 
     * @param restItem 餐品
     * @return 餐品集合
     */
    public List<RestItem> selectRestItemList(RestItem restItem);

    /**
     * 新增餐品
     * 
     * @param restItem 餐品
     * @return 结果
     */
    public int insertRestItem(RestItem restItem);

    /**
     * 修改餐品
     * 
     * @param restItem 餐品
     * @return 结果
     */
    public int updateRestItem(RestItem restItem);

    /**
     * 批量删除餐品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRestItemByIds(String ids);

    /**
     * 删除餐品信息
     * 
     * @param id 餐品ID
     * @return 结果
     */
    public int deleteRestItemById(Long id);
}
