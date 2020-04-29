package com.ruoyi.project.system.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 主食分拣管理对象 food_manage
 * 
 * @author zyk
 * @date 2020-04-25
 */
public class FoodManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 公司id */
    @Excel(name = "公司id")
    private Long companyId;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 主食分拣人id */
    @Excel(name = "主食分拣人id")
    private Long sortingId;

    /** 主食分拣人名称 */
    @Excel(name = "主食分拣人名称")
    private String sortingName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setSortingId(Long sortingId) 
    {
        this.sortingId = sortingId;
    }

    public Long getSortingId() 
    {
        return sortingId;
    }
    public void setSortingName(String sortingName) 
    {
        this.sortingName = sortingName;
    }

    public String getSortingName() 
    {
        return sortingName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("companyId", getCompanyId())
            .append("companyName", getCompanyName())
            .append("sortingId", getSortingId())
            .append("sortingName", getSortingName())
            .toString();
    }
}
