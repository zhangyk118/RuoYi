package com.ruoyi.project.order.form.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 订单管理对象 order_form
 * 
 * @author zyk
 * @date 2020-04-29
 */
public class Order extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 公司id */
    @Excel(name = "公司id")
    private String companyId;

    /** 餐品大类编号 */
    @Excel(name = "餐品大类编号")
    private String mealClassCode;

    /** 餐品大类名称 */
    @Excel(name = "餐品大类名称")
    private String mealClassName;

    /** 荤菜数量 */
    @Excel(name = "荤菜数量")
    private Long meatNumber;

    /** 荤菜名称（json字符串） */
    @Excel(name = "荤菜名称", readConverterExp = "j=son字符串")
    private String meatName;

    /** 荤菜id(多个以逗号分割) */
    @Excel(name = "荤菜id(多个以逗号分割)")
    private String meatId;

    /** 素菜数量 */
    @Excel(name = "素菜数量")
    private Long elementNumber;

    /** 素菜名称（json字符串） */
    @Excel(name = "素菜名称", readConverterExp = "j=son字符串")
    private String elementName;

    /** 素材id(多个以逗号分割） */
    @Excel(name = "素材id(多个以逗号分割）")
    private String elementId;

    /** 主食数量 */
    @Excel(name = "主食数量")
    private Long stapleNumber;

    /** 主食名称（json字符串） */
    @Excel(name = "主食名称", readConverterExp = "j=son字符串")
    private String stapleFoodName;

    /** 主食id */
    @Excel(name = "主食id")
    private String stapleFoodId;

    /** 饮品数量 */
    @Excel(name = "饮品数量")
    private Long drinkNumber;

    /** 饮品id */
    @Excel(name = "饮品id")
    private String drinkId;

    /** 完成主食数量 */
    @Excel(name = "完成主食数量")
    private Long completeNumber;

    /** 未完成主食分拣数量 */
    @Excel(name = "未完成主食分拣数量")
    private Long surplusNumber;

    /** 订单数 */
    @Excel(name = "订单数")
    private Long orderNumber;

    /** 已完成订单数 */
    @Excel(name = "已完成订单数")
    private Long completeOrderNumber;

    /** 未完成订单数 */
    @Excel(name = "未完成订单数")
    private Long notOrderNumber;

    /** 1 已下单 ，2 已退单， 3 未打餐 ，4 已打餐，5 未打盒，6 已打盒，7 未装箱，8 未出发，9 已出发 ，10 未送达，11 已送达 ，12 已完成 */
    @Excel(name = "1 已下单 ，2 已退单， 3 未打餐 ，4 已打餐，5 未打盒，6 已打盒，7 未装箱，8 未出发，9 已出发 ，10 未送达，11 已送达 ，12 已完成")
    private String orderStatus;

    /** 出发时间 */
    @Excel(name = "出发时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date leaveTime;

    /** 送达时间 */
    @Excel(name = "送达时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date serviceTime;

    /** 接单时间 */
    @Excel(name = "接单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiptTime;

    /** 备注 */
    @Excel(name = "备注")
    private String bak;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setCompanyId(String companyId) 
    {
        this.companyId = companyId;
    }

    public String getCompanyId() 
    {
        return companyId;
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
    public void setMeatNumber(Long meatNumber) 
    {
        this.meatNumber = meatNumber;
    }

    public Long getMeatNumber() 
    {
        return meatNumber;
    }
    public void setMeatName(String meatName) 
    {
        this.meatName = meatName;
    }

    public String getMeatName() 
    {
        return meatName;
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
    public void setElementName(String elementName) 
    {
        this.elementName = elementName;
    }

    public String getElementName() 
    {
        return elementName;
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
    public void setStapleFoodName(String stapleFoodName) 
    {
        this.stapleFoodName = stapleFoodName;
    }

    public String getStapleFoodName() 
    {
        return stapleFoodName;
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
    public void setCompleteNumber(Long completeNumber) 
    {
        this.completeNumber = completeNumber;
    }

    public Long getCompleteNumber() 
    {
        return completeNumber;
    }
    public void setSurplusNumber(Long surplusNumber) 
    {
        this.surplusNumber = surplusNumber;
    }

    public Long getSurplusNumber() 
    {
        return surplusNumber;
    }
    public void setOrderNumber(Long orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public Long getOrderNumber() 
    {
        return orderNumber;
    }
    public void setCompleteOrderNumber(Long completeOrderNumber) 
    {
        this.completeOrderNumber = completeOrderNumber;
    }

    public Long getCompleteOrderNumber() 
    {
        return completeOrderNumber;
    }
    public void setNotOrderNumber(Long notOrderNumber) 
    {
        this.notOrderNumber = notOrderNumber;
    }

    public Long getNotOrderNumber() 
    {
        return notOrderNumber;
    }
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public void setLeaveTime(Date leaveTime) 
    {
        this.leaveTime = leaveTime;
    }

    public Date getLeaveTime() 
    {
        return leaveTime;
    }
    public void setServiceTime(Date serviceTime) 
    {
        this.serviceTime = serviceTime;
    }

    public Date getServiceTime() 
    {
        return serviceTime;
    }
    public void setReceiptTime(Date receiptTime) 
    {
        this.receiptTime = receiptTime;
    }

    public Date getReceiptTime() 
    {
        return receiptTime;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyName", getCompanyName())
            .append("companyId", getCompanyId())
            .append("mealClassCode", getMealClassCode())
            .append("mealClassName", getMealClassName())
            .append("meatNumber", getMeatNumber())
            .append("meatName", getMeatName())
            .append("meatId", getMeatId())
            .append("elementNumber", getElementNumber())
            .append("elementName", getElementName())
            .append("elementId", getElementId())
            .append("stapleNumber", getStapleNumber())
            .append("stapleFoodName", getStapleFoodName())
            .append("stapleFoodId", getStapleFoodId())
            .append("drinkNumber", getDrinkNumber())
            .append("drinkId", getDrinkId())
            .append("completeNumber", getCompleteNumber())
            .append("surplusNumber", getSurplusNumber())
            .append("orderNumber", getOrderNumber())
            .append("completeOrderNumber", getCompleteOrderNumber())
            .append("notOrderNumber", getNotOrderNumber())
            .append("orderStatus", getOrderStatus())
            .append("leaveTime", getLeaveTime())
            .append("serviceTime", getServiceTime())
            .append("receiptTime", getReceiptTime())
            .append("bak", getBak())
            .toString();
    }
}
