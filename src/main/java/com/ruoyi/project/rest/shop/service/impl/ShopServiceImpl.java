package com.ruoyi.project.rest.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.rest.shop.mapper.ShopMapper;
import com.ruoyi.project.rest.shop.domain.Shop;
import com.ruoyi.project.rest.shop.service.IShopService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 商家信息Service业务层处理
 * 
 * @author zyk
 * @date 2020-04-16
 */
@Service
public class ShopServiceImpl implements IShopService 
{
    @Autowired
    private ShopMapper shopMapper;

    /**
     * 查询商家信息
     * 
     * @param id 商家信息ID
     * @return 商家信息
     */
    @Override
    public Shop selectShopById(Long id)
    {
        return shopMapper.selectShopById(id);
    }

    /**
     * 查询商家信息列表
     * 
     * @param shop 商家信息
     * @return 商家信息
     */
    @Override
    public List<Shop> selectShopList(Shop shop)
    {
        return shopMapper.selectShopList(shop);
    }

    /**
     * 新增商家信息
     * 
     * @param shop 商家信息
     * @return 结果
     */
    @Override
    public int insertShop(Shop shop)
    {
        return shopMapper.insertShop(shop);
    }

    /**
     * 修改商家信息
     * 
     * @param shop 商家信息
     * @return 结果
     */
    @Override
    public int updateShop(Shop shop)
    {
        return shopMapper.updateShop(shop);
    }

    /**
     * 删除商家信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteShopByIds(String ids)
    {
        return shopMapper.deleteShopByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商家信息信息
     * 
     * @param id 商家信息ID
     * @return 结果
     */
    @Override
    public int deleteShopById(Long id)
    {
        return shopMapper.deleteShopById(id);
    }
}
