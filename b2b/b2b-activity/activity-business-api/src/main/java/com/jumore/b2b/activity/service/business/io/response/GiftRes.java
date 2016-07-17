package com.jumore.b2b.activity.service.business.io.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 奖励
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class GiftRes implements Serializable {
    /**
     * 序列@
     */
    private Long ID;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态@1:启用;2:停用
     */
    private Integer status;

    /**
     * 类别编码
     */
    private String categoryCode;

    /**
     * 有效果期@从获得时开始
     */
    private Integer cycle;

    /**
     * 价值@
     */
    private Long value;

    /**
     * 计量单位@
     */
    private String unitCode;

    /**
     * 使用方式@1:直接领取;2:手工领取;3:赠送
     */
    private Integer userWay;

    /**
     * 锁定@true.false,上线后不可更改
     */
    private String locked;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 第三方业务编码
     */
    private String thiredBusCode;

    /**
     * 总数
     */
    private Long deficitNum;

    /**
     * 可用数量
     */
    private Long stockNum;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 来源
     */
    private Long srcCode;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    public Integer getUserWay() {
        return userWay;
    }

    public void setUserWay(Integer userWay) {
        this.userWay = userWay;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getThiredBusCode() {
        return thiredBusCode;
    }

    public void setThiredBusCode(String thiredBusCode) {
        this.thiredBusCode = thiredBusCode == null ? null : thiredBusCode.trim();
    }

    public Long getDeficitNum() {
        return deficitNum;
    }

    public void setDeficitNum(Long deficitNum) {
        this.deficitNum = deficitNum;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(Long srcCode) {
        this.srcCode = srcCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GiftRes other = (GiftRes) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
            && (this.getCycle() == null ? other.getCycle() == null : this.getCycle().equals(other.getCycle()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getUnitCode() == null ? other.getUnitCode() == null : this.getUnitCode().equals(other.getUnitCode()))
            && (this.getUserWay() == null ? other.getUserWay() == null : this.getUserWay().equals(other.getUserWay()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getBusinessCode() == null ? other.getBusinessCode() == null : this.getBusinessCode().equals(other.getBusinessCode()))
            && (this.getThiredBusCode() == null ? other.getThiredBusCode() == null : this.getThiredBusCode().equals(other.getThiredBusCode()))
            && (this.getDeficitNum() == null ? other.getDeficitNum() == null : this.getDeficitNum().equals(other.getDeficitNum()))
            && (this.getStockNum() == null ? other.getStockNum() == null : this.getStockNum().equals(other.getStockNum()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSrcCode() == null ? other.getSrcCode() == null : this.getSrcCode().equals(other.getSrcCode()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        result = prime * result + ((getCycle() == null) ? 0 : getCycle().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getUnitCode() == null) ? 0 : getUnitCode().hashCode());
        result = prime * result + ((getUserWay() == null) ? 0 : getUserWay().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getBusinessCode() == null) ? 0 : getBusinessCode().hashCode());
        result = prime * result + ((getThiredBusCode() == null) ? 0 : getThiredBusCode().hashCode());
        result = prime * result + ((getDeficitNum() == null) ? 0 : getDeficitNum().hashCode());
        result = prime * result + ((getStockNum() == null) ? 0 : getStockNum().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSrcCode() == null) ? 0 : getSrcCode().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}