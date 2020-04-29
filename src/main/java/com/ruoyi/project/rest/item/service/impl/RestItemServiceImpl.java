package com.ruoyi.project.rest.item.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.rest.item.mapper.RestItemMapper;
import com.ruoyi.project.rest.item.domain.RestItem;
import com.ruoyi.project.rest.item.service.IRestItemService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 餐品Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-18
 */
@Service
public class RestItemServiceImpl implements IRestItemService 
{
    @Autowired
    private RestItemMapper restItemMapper;

    /**
     * 查询餐品
     * 
     * @param id 餐品ID
     * @return 餐品
     */
    @Override
    public RestItem selectRestItemById(Long id)
    {
        return restItemMapper.selectRestItemById(id);
    }

    /**
     * 查询餐品列表
     * 
     * @param restItem 餐品
     * @return 餐品
     */
    @Override
    public List<RestItem> selectRestItemList(RestItem restItem)
    {
        return restItemMapper.selectRestItemList(restItem);
    }

    /**
     * 新增餐品
     * 
     * @param restItem 餐品
     * @return 结果
     */
    @Override
    public int insertRestItem(RestItem restItem)
    {
        return restItemMapper.insertRestItem(restItem);
    }

    /**
     * 修改餐品
     * 
     * @param restItem 餐品
     * @return 结果
     */
    @Override
    public int updateRestItem(RestItem restItem)
    {
        return restItemMapper.updateRestItem(restItem);
    }

    /**
     * 删除餐品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRestItemByIds(String ids)
    {
        return restItemMapper.deleteRestItemByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除餐品信息
     * 
     * @param id 餐品ID
     * @return 结果
     */
    @Override
    public int deleteRestItemById(Long id)
    {
        return restItemMapper.deleteRestItemById(id);
    }
}
