package com.ruoyi.project.meal.release.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 套餐发布对象 meal_release
 * 
 * @author zyk
 * @date 2020-04-18
 */
public class MealRelease extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 编号 */
    @Excel(name = "编号")
    private String code;

    /** 餐品大类编号 */
    @Excel(name = "餐品大类编号")
    private String mealClassCode;

    /** 餐品大类名称 */
    @Excel(name = "餐品大类名称")
    private String mealClassName;

    /** 商户名称 */
    @Excel(name = "商户名称")
    private String merchantName;

    /** 荤菜数量 */
    @Excel(name = "荤菜数量")
    private Long meatNumber;

    /** 荤菜id(多个以逗号分割) */
    @Excel(name = "荤菜id(多个以逗号分割)")
    private String meatId;

    /** 素菜数量 */
    @Excel(name = "素菜数量")
    private Long elementNumber;

    /** 素材id(多个以逗号分割） */
    @Excel(name = "素材id(多个以逗号分割）")
    private String elementId;

    /** 主食数量 */
    @Excel(name = "主食数量")
    private Long stapleNumber;

    /** 主食id */
    @Excel(name = "主食id")
    private String stapleFoodId;

    /** 饮品数量 */
    @Excel(name = "饮品数量")
    private Long drinkNumber;

    /** 饮品id */
    @Excel(name = "饮品id")
    private String drinkId;

    /** 发布时间 */
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 到期自动隐藏（0 显示 1隐藏） */
    @Excel(name = "到期自动隐藏", readConverterExp = "0=,显=示,1=隐藏")
    private String isDisplay;

    /** 删除标志位（0 未删除 1已删除） */
    @Excel(name = "删除标志位", readConverterExp = "0=,未=删除,1=已删除")
    private String dr;

    /** 价格 */
    @Excel(name = "价格")
    private Double price;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

    /** 备用字段 */
    @Excel(name = "备用字段")
    private String def;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setMealClassCode(String mealClassCode) 
    {
        this.mealClassCode = mealClassCode;
    }

    public String getMealClassCode() 
    {
        return mealClassCode;
    }
    public void setMealClassName(String mealClassName) 
    {
        this.mealClassName = mealClassName;
    }

    public String getMealClassName() 
    {
        return mealClassName;
    }
    public void setMerchantName(String merchantName) 
    {
        this.merchantName = merchantName;
    }

    public String getMerchantName() 
    {
        return merchantName;
    }
    public void setMeatNumber(Long meatNumber) 
    {
        this.meatNumber = meatNumber;
    }

    public Long getMeatNumber() 
    {
        return meatNumber;
    }
    public void setMeatId(String meatId)
    {
        this.meatId = meatId;
    }

    public String getMeatId()
    {
        return meatId;
    }
    public void setElementNumber(Long elementNumber) 
    {
        this.elementNumber = elementNumber;
    }

    public Long getElementNumber() 
    {
        return elementNumber;
    }
    public void setElementId(String elementId)
    {
        this.elementId = elementId;
    }

    public String getElementId()
    {
        return elementId;
    }
    public void setStapleNumber(Long stapleNumber) 
    {
        this.stapleNumber = stapleNumber;
    }

    public Long getStapleNumber() 
    {
        return stapleNumber;
    }
    public void setStapleFoodId(String stapleFoodId)
    {
        this.stapleFoodId = stapleFoodId;
    }

    public String getStapleFoodId()
    {
        return stapleFoodId;
    }
    public void setDrinkNumber(Long drinkNumber) 
    {
        this.drinkNumber = drinkNumber;
    }

    public Long getDrinkNumber() 
    {
        return drinkNumber;
    }
    public void setDrinkId(String drinkId)
    {
        this.drinkId = drinkId;
    }

    public String getDrinkId()
    {
        return drinkId;
    }
    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }
    public void setIsDisplay(String isDisplay) 
    {
        this.isDisplay = isDisplay;
    }

    public String getIsDisplay() 
    {
        return isDisplay;
    }
    public void setDr(String dr) 
    {
        this.dr = dr;
    }

    public String getDr() 
    {
        return dr;
    }
    public void setPrice(Double price) 
    {
        this.price = price;
    }

    public Double getPrice() 
    {
        return price;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }
    public void setDef(String def) 
    {
        this.def = def;
    }

    public String getDef() 
    {
        return def;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("mealClassCode", getMealClassCode())
            .append("mealClassName", getMealClassName())
            .append("merchantName", getMerchantName())
            .append("meatNumber", getMeatNumber())
            .append("meatId", getMeatId())
            .append("elementNumber", getElementNumber())
            .append("elementId", getElementId())
            .append("stapleNumber", getStapleNumber())
            .append("stapleFoodId", getStapleFoodId())
            .append("drinkNumber", getDrinkNumber())
            .append("drinkId", getDrinkId())
            .append("releaseTime", getReleaseTime())
            .append("isDisplay", getIsDisplay())
            .append("dr", getDr())
            .append("price", getPrice())
            .append("bak", getBak())
            .append("def", getDef())
            .toString();
    }
}
