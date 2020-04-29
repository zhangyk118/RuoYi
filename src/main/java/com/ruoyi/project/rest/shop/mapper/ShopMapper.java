package com.ruoyi.project.rest.shop.mapper;

import java.util.List;
import com.ruoyi.project.rest.shop.domain.Shop;

/**
 * 商家信息Mapper接口
 * 
 * @author zyk
 * @date 2020-04-16
 */
public interface ShopMapper 
{
    /**
     * 查询商家信息
     * 
     * @param id 商家信息ID
     * @return 商家信息
     */
    public Shop selectShopById(Long id);

    /**
     * 查询商家信息列表
     * 
     * @param shop 商家信息
     * @return 商家信息集合
     */
    public List<Shop> selectShopList(Shop shop);

    /**
     * 新增商家信息
     * 
     * @param shop 商家信息
     * @return 结果
     */
    public int insertShop(Shop shop);

    /**
     * 修改商家信息
     * 
     * @param shop 商家信息
     * @return 结果
     */
    public int updateShop(Shop shop);

    /**
     * 删除商家信息
     * 
     * @param id 商家信息ID
     * @return 结果
     */
    public int deleteShopById(Long id);

    /**
     * 批量删除商家信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteShopByIds(String[] ids);
}
