package com.ruoyi.project.system.route.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 流水线路对象 route_table
 * 
 * @author zyk
 * @date 2020-04-23
 */
public class RouteTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;
    /** 路线 */
    private Long id;

    /** 路线 */
    private Long routeId;

    /** 打餐员id */
    @Excel(name = "打餐员id")
    private Long catererId;

    /** 打餐员名称 */
    @Excel(name = "打餐员名称")
    private String catererName;

    /** 打荷员id */
    @Excel(name = "打荷员id")
    private Long cartographerId;

    /** 打荷员名称 */
    @Excel(name = "打荷员名称")
    private String cartographerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRouteId(Long routeId)
    {
        this.routeId = routeId;
    }

    public Long getRouteId() 
    {
        return routeId;
    }
    public void setCatererId(Long catererId) 
    {
        this.catererId = catererId;
    }

    public Long getCatererId() 
    {
        return catererId;
    }
    public void setCatererName(String catererName) 
    {
        this.catererName = catererName;
    }

    public String getCatererName() 
    {
        return catererName;
    }
    public void setCartographerId(Long cartographerId) 
    {
        this.cartographerId = cartographerId;
    }

    public Long getCartographerId() 
    {
        return cartographerId;
    }
    public void setCartographerName(String cartographerName) 
    {
        this.cartographerName = cartographerName;
    }

    public String getCartographerName() 
    {
        return cartographerName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE).append("routeId", getRouteId())
            .append("id", getId())
            .append("catererId", getCatererId())
            .append("catererName", getCatererName())
            .append("cartographerId", getCartographerId())
            .append("cartographerName", getCartographerName())
            .toString();
    }
}
