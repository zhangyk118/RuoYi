package com.ruoyi.project.system.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

import java.util.Date;

/**
 * 客户管理对象 sys_customer
 *
 * @author zyk
 * @date 2020-04-17
 */
public class SysCustomer extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 区域
     */
    @Excel(name = "区域")
    private String region;

    /**
     * 公司编号
     */
    @Excel(name = "公司编号")
    private String companyCode;

    /**
     * 公司名称
     */
    @Excel(name = "公司名称")
    private String companyName;

    /**
     * 楼宇
     */
    @Excel(name = "楼宇")
    private String floor;

    /**
     * 单元
     */
    @Excel(name = "单元")
    private String unitNumber;

    /**
     * l楼层
     */
    @Excel(name = "l楼层")
    private String floorNumber;

    /**
     * 房号
     */
    @Excel(name = "房号")
    private String roomNumber;

    /**
     * 状态
     */
    @Excel(name = "状态")
    private String status;

    /**
     * 送餐时间（午餐）
     */
    @Excel(name = "送餐时间", readConverterExp = "午=餐")
    private Date giveLunchTime;

    /**
     * 送餐时间（晚餐）
     */
    @Excel(name = "送餐时间", readConverterExp = "晚=餐")
    private Date giveDinnerTime;

    /**
     * 配送时长（午餐）
     */
    @Excel(name = "配送时长", readConverterExp = "午=餐")
    private Long deliveLunchLong;

    /**
     * 配送时长（晚餐）
     */
    @Excel(name = "配送时长", readConverterExp = "晚=餐")
    private Long deliveDinnerLong;

    /**
     * 订餐截止时间（午餐）
     */
    @Excel(name = "订餐截止时间", readConverterExp = "午=餐")
    private Date orderDeadlineLunch;

    /**
     * 订餐截止时间（晚餐）
     */
    @Excel(name = "订餐截止时间", readConverterExp = "晚=餐")
    private Date orderDeadlineDinner;

    /**
     * 备用字段
     */
    @Excel(name = "备用字段")
    private String def1;

    /**
     * 备用字段
     */
    @Excel(name = "备用字段")
    private String def2;

    /**
     * 所属流水线路
     */
    @Excel(name = "所属流水线路")
    private String flowLine;

    public String getFlowLine() {
        return flowLine;
    }

    public void setFlowLine(String flowLine) {
        this.flowLine = flowLine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setGiveLunchTime(Date giveLunchTime) {
        this.giveLunchTime = giveLunchTime;
    }

    public Date getGiveLunchTime() {
        return giveLunchTime;
    }

    public void setGiveDinnerTime(Date giveDinnerTime) {
        this.giveDinnerTime = giveDinnerTime;
    }

    public Date getGiveDinnerTime() {
        return giveDinnerTime;
    }

    public void setDeliveLunchLong(Long deliveLunchLong) {
        this.deliveLunchLong = deliveLunchLong;
    }

    public Long getDeliveLunchLong() {
        return deliveLunchLong;
    }

    public void setDeliveDinnerLong(Long deliveDinnerLong) {
        this.deliveDinnerLong = deliveDinnerLong;
    }

    public Long getDeliveDinnerLong() {
        return deliveDinnerLong;
    }

    public void setOrderDeadlineLunch(Date orderDeadlineLunch) {
        this.orderDeadlineLunch = orderDeadlineLunch;
    }

    public Date getOrderDeadlineLunch() {
        return orderDeadlineLunch;
    }

    public void setOrderDeadlineDinner(Date orderDeadlineDinner) {
        this.orderDeadlineDinner = orderDeadlineDinner;
    }

    public Date getOrderDeadlineDinner() {
        return orderDeadlineDinner;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef2() {
        return def2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("region", getRegion())
                .append("companyCode", getCompanyCode())
                .append("companyName", getCompanyName())
                .append("floor", getFloor())
                .append("unitNumber", getUnitNumber())
                .append("floorNumber", getFloorNumber())
                .append("roomNumber", getRoomNumber())
                .append("status", getStatus())
                .append("giveLunchTime", getGiveLunchTime())
                .append("giveDinnerTime", getGiveDinnerTime())
                .append("deliveLunchLong", getDeliveLunchLong())
                .append("deliveDinnerLong", getDeliveDinnerLong())
                .append("orderDeadlineLunch", getOrderDeadlineLunch())
                .append("orderDeadlineDinner", getOrderDeadlineDinner())
                .append("def1", getDef1())
                .append("def2", getDef2())
                .append("flowLine", getFlowLine())
                .toString();
    }
}
