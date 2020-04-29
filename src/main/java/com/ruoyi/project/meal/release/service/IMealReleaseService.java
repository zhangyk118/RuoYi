package com.ruoyi.project.meal.release.service;

import java.util.List;
import com.ruoyi.project.meal.release.domain.MealRelease;

/**
 * 套餐发布Service接口
 * 
 * @author zyk
 * @date 2020-04-18
 */
public interface IMealReleaseService 
{
    /**
     * 查询套餐发布
     * 
     * @param id 套餐发布ID
     * @return 套餐发布
     */
    public MealRelease selectMealReleaseById(Long id);

    /**
     * 查询套餐发布列表
     * 
     * @param mealRelease 套餐发布
     * @return 套餐发布集合
     */
    public List<MealRelease> selectMealReleaseList(MealRelease mealRelease);

    /**
     * 新增套餐发布
     * 
     * @param mealRelease 套餐发布
     * @return 结果
     */
    public int insertMealRelease(MealRelease mealRelease);

    /**
     * 修改套餐发布
     * 
     * @param mealRelease 套餐发布
     * @return 结果
     */
    public int updateMealRelease(MealRelease mealRelease);

    /**
     * 批量删除套餐发布
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMealReleaseByIds(String ids);

    /**
     * 删除套餐发布信息
     * 
     * @param id 套餐发布ID
     * @return 结果
     */
    public int deleteMealReleaseById(Long id);

    /**
     * 根据菜品类型查询菜品
     */
    public List<MealRelease> selectMealType(String id);
}
