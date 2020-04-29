package com.ruoyi.project.rest.item.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 餐品对象 rest_item
 * 
 * @author zyk
 * @date 2020-04-18
 */
public class RestItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 餐品名称 */
    @Excel(name = "餐品名称")
    private String itemName;

    /** 餐品类型 */
    @Excel(name = "餐品类型")
    private String itemType;

    /** 餐品口味 */
    @Excel(name = "餐品口味")
    private String itemFlavor;

    /** 价格 */
    @Excel(name = "价格")
    private Double itemPrice;

    /** 折扣 */
    @Excel(name = "折扣")
    private Double itemDescount;

    /** 餐品状态 */
    @Excel(name = "餐品状态")
    private String itemStart;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String itemImg;

    /** 是否显示 */
    @Excel(name = "是否显示")
    private String isDisplay;

    /** 描述 */
    @Excel(name = "描述")
    private String bads;

    /** 累计销量 */
    @Excel(name = "累计销量")
    private Long totalNumber;

    /** 累计点赞 */
    @Excel(name = "累计点赞")
    private String totalFabulous;

    /** 累计差评 */
    @Excel(name = "累计差评")
    private Long totalBad;

    /** 发布数量 */
    @Excel(name = "发布数量")
    private Long releaseNumber;

    /** 所属餐厅 */
    @Excel(name = "所属餐厅")
    private String toRestaurant;

    /** 备用字段 */
    @Excel(name = "备用字段")
    private String def1;

    /** 备用字段 */
    @Excel(name = "备用字段")
    private String def2;

    /** 备用字段 */
    @Excel(name = "备用字段")
    private String def3;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    }

    public String getItemName() 
    {
        return itemName;
    }
    public void setItemType(String itemType) 
    {
        this.itemType = itemType;
    }

    public String getItemType() 
    {
        return itemType;
    }
    public void setItemFlavor(String itemFlavor) 
    {
        this.itemFlavor = itemFlavor;
    }

    public String getItemFlavor() 
    {
        return itemFlavor;
    }
    public void setItemPrice(Double itemPrice) 
    {
        this.itemPrice = itemPrice;
    }

    public Double getItemPrice() 
    {
        return itemPrice;
    }
    public void setItemDescount(Double itemDescount) 
    {
        this.itemDescount = itemDescount;
    }

    public Double getItemDescount() 
    {
        return itemDescount;
    }
    public void setItemStart(String itemStart) 
    {
        this.itemStart = itemStart;
    }

    public String getItemStart() 
    {
        return itemStart;
    }
    public void setItemImg(String itemImg) 
    {
        this.itemImg = itemImg;
    }

    public String getItemImg() 
    {
        return itemImg;
    }
    public void setIsDisplay(String isDisplay) 
    {
        this.isDisplay = isDisplay;
    }

    public String getIsDisplay() 
    {
        return isDisplay;
    }
    public void setBads(String bads) 
    {
        this.bads = bads;
    }

    public String getBads() 
    {
        return bads;
    }
    public void setTotalNumber(Long totalNumber) 
    {
        this.totalNumber = totalNumber;
    }

    public Long getTotalNumber() 
    {
        return totalNumber;
    }
    public void setTotalFabulous(String totalFabulous) 
    {
        this.totalFabulous = totalFabulous;
    }

    public String getTotalFabulous() 
    {
        return totalFabulous;
    }
    public void setTotalBad(Long totalBad) 
    {
        this.totalBad = totalBad;
    }

    public Long getTotalBad() 
    {
        return totalBad;
    }
    public void setReleaseNumber(Long releaseNumber) 
    {
        this.releaseNumber = releaseNumber;
    }

    public Long getReleaseNumber() 
    {
        return releaseNumber;
    }
    public void setToRestaurant(String toRestaurant) 
    {
        this.toRestaurant = toRestaurant;
    }

    public String getToRestaurant() 
    {
        return toRestaurant;
    }
    public void setDef1(String def1) 
    {
        this.def1 = def1;
    }

    public String getDef1() 
    {
        return def1;
    }
    public void setDef2(String def2) 
    {
        this.def2 = def2;
    }

    public String getDef2() 
    {
        return def2;
    }
    public void setDef3(String def3) 
    {
        this.def3 = def3;
    }

    public String getDef3() 
    {
        return def3;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("itemName", getItemName())
            .append("itemType", getItemType())
            .append("itemFlavor", getItemFlavor())
            .append("itemPrice", getItemPrice())
            .append("itemDescount", getItemDescount())
            .append("itemStart", getItemStart())
            .append("itemImg", getItemImg())
            .append("isDisplay", getIsDisplay())
            .append("bads", getBads())
            .append("totalNumber", getTotalNumber())
            .append("totalFabulous", getTotalFabulous())
            .append("totalBad", getTotalBad())
            .append("releaseNumber", getReleaseNumber())
            .append("toRestaurant", getToRestaurant())
            .append("def1", getDef1())
            .append("def2", getDef2())
            .append("def3", getDef3())
            .toString();
    }
}
