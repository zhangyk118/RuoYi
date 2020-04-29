package com.ruoyi.project.meal.release.service.impl;

import java.util.List;

import com.ruoyi.project.rest.item.mapper.RestItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.meal.release.mapper.MealReleaseMapper;
import com.ruoyi.project.meal.release.domain.MealRelease;
import com.ruoyi.project.meal.release.service.IMealReleaseService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 套餐发布Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-18
 */
@Service
public class MealReleaseServiceImpl implements IMealReleaseService
{
    @Autowired
    private MealReleaseMapper mealReleaseMapper;
    @Autowired
    private RestItemMapper restItemMapper;
    /**
     * 查询套餐发布
     * 
     * @param id 套餐发布ID
     * @return 套餐发布
     */
    @Override
    public MealRelease selectMealReleaseById(Long id)
    {
        return mealReleaseMapper.selectMealReleaseById(id);
    }

    /**
     * 查询套餐发布列表
     * 
     * @param mealRelease 套餐发布
     * @return 套餐发布
     */
    @Override
    public List<MealRelease> selectMealReleaseList(MealRelease mealRelease)
    {
        return mealReleaseMapper.selectMealReleaseList(mealRelease);
    }

    /**
     * 新增套餐发布
     * 
     * @param mealRelease 套餐发布
     * @return 结果
     */
    @Override
    public int insertMealRelease(MealRelease mealRelease)
    {
        return mealReleaseMapper.insertMealRelease(mealRelease);
    }

    /**
     * 修改套餐发布
     * 
     * @param mealRelease 套餐发布
     * @return 结果
     */
    @Override
    public int updateMealRelease(MealRelease mealRelease)
    {
        return mealReleaseMapper.updateMealRelease(mealRelease);
    }

    /**
     * 删除套餐发布对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMealReleaseByIds(String ids)
    {
        return mealReleaseMapper.deleteMealReleaseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除套餐发布信息
     * 
     * @param id 套餐发布ID
     * @return 结果
     */
    @Override
    public int deleteMealReleaseById(Long id)
    {
        return mealReleaseMapper.deleteMealReleaseById(id);
    }

    /**
     * 根据菜品类型查询菜品
     * @param id
     * @return
     */
    @Override
    public List<MealRelease> selectMealType(String id) {
        return restItemMapper.selectMealType(id);
    }


}
