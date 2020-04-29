package com.ruoyi.project.rest.item.mapper;

import java.util.List;

import com.ruoyi.project.meal.release.domain.MealRelease;
import com.ruoyi.project.rest.item.domain.RestItem;

/**
 * 餐品Mapper接口
 * 
 * @author zyk
 * @date 2020-04-18
 */
public interface RestItemMapper 
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
     * 删除餐品
     * 
     * @param id 餐品ID
     * @return 结果
     */
    public int deleteRestItemById(Long id);

    /**
     * 批量删除餐品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRestItemByIds(String[] ids);

    /**
     * 根据菜品类型查询菜品
     */
    public List<MealRelease> selectMealType(String id);
}
