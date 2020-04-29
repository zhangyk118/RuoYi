package com.ruoyi.project.system.manage.service;

import java.util.List;
import com.ruoyi.project.system.manage.domain.FoodManage;

/**
 * 主食分拣管理Service接口
 * 
 * @author zyk
 * @date 2020-04-25
 */
public interface IFoodManageService 
{
    /**
     * 查询主食分拣管理
     * 
     * @param id 主食分拣管理ID
     * @return 主食分拣管理
     */
    public FoodManage selectFoodManageById(Long id);

    /**
     * 查询主食分拣管理列表
     * 
     * @param foodManage 主食分拣管理
     * @return 主食分拣管理集合
     */
    public List<FoodManage> selectFoodManageList(FoodManage foodManage);

    /**
     * 新增主食分拣管理
     * 
     * @param foodManage 主食分拣管理
     * @return 结果
     */
    public int insertFoodManage(FoodManage foodManage);

    /**
     * 修改主食分拣管理
     * 
     * @param foodManage 主食分拣管理
     * @return 结果
     */
    public int updateFoodManage(FoodManage foodManage);

    /**
     * 修改主食分拣管理
     *
     * @param foodManage 主食分拣管理
     * @return 结果
     */
    public int updateFoodManages(FoodManage foodManage);
    /**
     * 批量删除主食分拣管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFoodManageByIds(String ids);

    /**
     * 删除主食分拣管理信息
     * 
     * @param id 主食分拣管理ID
     * @return 结果
     */
    public int deleteFoodManageById(Long id);
    public int deletefoods(String ids);
}
