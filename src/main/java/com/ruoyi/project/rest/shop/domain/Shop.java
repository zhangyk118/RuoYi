package com.ruoyi.project.rest.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 商家信息对象 rest_shop
 * 
 * @author zyk
 * @date 2020-04-16
 */
public class Shop extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 商家编号 */
    @Excel(name = "商家编号")
    private String code;

    /** 店主姓名 */
    @Excel(name = "店主姓名")
    private String shopkeeperName;

    /** 商家名称 */
    @Excel(name = "商家名称")
    private String shopName;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 营业起始时间 */
    @Excel(name = "营业起始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date openTime;

    /** 营业截止时间 */
    @Excel(name = "营业截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 入住时间 */
    @Excel(name = "入住时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date moveTime;

    /** 商家类型 */
    @Excel(name = "商家类型")
    private String shopType;

    /** 商家状态 */
    @Excel(name = "商家状态")
    private String shopState;

    /** 商家等级 */
    @Excel(name = "商家等级")
    private String shopGrade;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private Long idNumber;

    /** 点赞数 */
    @Excel(name = "点赞数")
    private Long fabloousNumber;

    /** 差评数 */
    @Excel(name = "差评数")
    private Long badNumber;

    /** 累计外卖额 */
    @Excel(name = "累计外卖额")
    private Double cumulativeTakeOut;

    /** 累计外卖数 */
    @Excel(name = "累计外卖数")
    private Long cumulativeTakeNumber;

    /** 商家地址 */
    @Excel(name = "商家地址")
    private String shopAdress;

    /** 备用字段 */
    @Excel(name = "备用字段")
    private String def1;

    /** 备用字段2 */
    @Excel(name = "备用字段2")
    private String def2;

    /** 备用字段3 */
    @Excel(name = "备用字段3")
    private String def3;

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
    public void setShopkeeperName(String shopkeeperName) 
    {
        this.shopkeeperName = shopkeeperName;
    }

    public String getShopkeeperName() 
    {
        return shopkeeperName;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setOpenTime(Date openTime) 
    {
        this.openTime = openTime;
    }

    public Date getOpenTime() 
    {
        return openTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setMoveTime(Date moveTime) 
    {
        this.moveTime = moveTime;
    }

    public Date getMoveTime() 
    {
        return moveTime;
    }
    public void setShopType(String shopType) 
    {
        this.shopType = shopType;
    }

    public String getShopType() 
    {
        return shopType;
    }
    public void setShopState(String shopState) 
    {
        this.shopState = shopState;
    }

    public String getShopState() 
    {
        return shopState;
    }
    public void setShopGrade(String shopGrade) 
    {
        this.shopGrade = shopGrade;
    }

    public String getShopGrade() 
    {
        return shopGrade;
    }
    public void setIdNumber(Long idNumber) 
    {
        this.idNumber = idNumber;
    }

    public Long getIdNumber() 
    {
        return idNumber;
    }
    public void setFabloousNumber(Long fabloousNumber) 
    {
        this.fabloousNumber = fabloousNumber;
    }

    public Long getFabloousNumber() 
    {
        return fabloousNumber;
    }
    public void setBadNumber(Long badNumber) 
    {
        this.badNumber = badNumber;
    }

    public Long getBadNumber() 
    {
        return badNumber;
    }
    public void setCumulativeTakeOut(Double cumulativeTakeOut) 
    {
        this.cumulativeTakeOut = cumulativeTakeOut;
    }

    public Double getCumulativeTakeOut() 
    {
        return cumulativeTakeOut;
    }
    public void setCumulativeTakeNumber(Long cumulativeTakeNumber) 
    {
        this.cumulativeTakeNumber = cumulativeTakeNumber;
    }

    public Long getCumulativeTakeNumber() 
    {
        return cumulativeTakeNumber;
    }
    public void setShopAdress(String shopAdress) 
    {
        this.shopAdress = shopAdress;
    }

    public String getShopAdress() 
    {
        return shopAdress;
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
            .append("code", getCode())
            .append("shopkeeperName", getShopkeeperName())
            .append("shopName", getShopName())
            .append("contact", getContact())
            .append("openTime", getOpenTime())
            .append("endTime", getEndTime())
            .append("moveTime", getMoveTime())
            .append("shopType", getShopType())
            .append("shopState", getShopState())
            .append("shopGrade", getShopGrade())
            .append("idNumber", getIdNumber())
            .append("fabloousNumber", getFabloousNumber())
            .append("badNumber", getBadNumber())
            .append("cumulativeTakeOut", getCumulativeTakeOut())
            .append("cumulativeTakeNumber", getCumulativeTakeNumber())
            .append("shopAdress", getShopAdress())
            .append("def1", getDef1())
            .append("def2", getDef2())
            .append("def3", getDef3())
            .toString();
    }
}
