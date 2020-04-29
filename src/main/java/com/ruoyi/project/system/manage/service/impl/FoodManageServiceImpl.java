package com.ruoyi.project.system.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.manage.mapper.FoodManageMapper;
import com.ruoyi.project.system.manage.domain.FoodManage;
import com.ruoyi.project.system.manage.service.IFoodManageService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 主食分拣管理Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-25
 */
@Service
public class FoodManageServiceImpl implements IFoodManageService 
{
    @Autowired
    private FoodManageMapper foodManageMapper;

    /**
     * 查询主食分拣管理
     * 
     * @param id 主食分拣管理ID
     * @return 主食分拣管理
     */
    @Override
    public FoodManage selectFoodManageById(Long id)
    {
        return foodManageMapper.selectFoodManageById(id);
    }

    /**
     * 查询主食分拣管理列表
     * 
     * @param foodManage 主食分拣管理
     * @return 主食分拣管理
     */
    @Override
    public List<FoodManage> selectFoodManageList(FoodManage foodManage)
    {
        return foodManageMapper.selectFoodManageList(foodManage);
    }

    /**
     * 新增主食分拣管理
     * 
     * @param foodManage 主食分拣管理
     * @return 结果
     */
    @Override
    public int insertFoodManage(FoodManage foodManage)
    {
        return foodManageMapper.insertFoodManage(foodManage);
    }

    /**
     * 修改主食分拣管理
     * 
     * @param foodManage 主食分拣管理
     * @return 结果
     */
    @Override
    public int updateFoodManage(FoodManage foodManage)
    {
        return foodManageMapper.updateFoodManage(foodManage);
    }

    @Override
    public int updateFoodManages(FoodManage foodManage) {
        return foodManageMapper.updateFoodManages(foodManage);
    }

    /**
     * 删除主食分拣管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFoodManageByIds(String ids)
    {
        return foodManageMapper.deleteFoodManageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除主食分拣管理信息
     * 
     * @param id 主食分拣管理ID
     * @return 结果
     */
    @Override
    public int deleteFoodManageById(Long id)
    {
        return foodManageMapper.deleteFoodManageById(id);
    }

    @Override
    public int deletefoods(String ids) {
        return foodManageMapper.deleteFoods(Convert.toStrArray(ids));
    }
}
