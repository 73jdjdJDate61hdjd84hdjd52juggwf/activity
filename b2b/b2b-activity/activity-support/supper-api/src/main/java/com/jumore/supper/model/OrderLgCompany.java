package com.jumore.supper.model;

import java.io.Serializable;
import java.util.Date;

public class OrderLgCompany implements Serializable {
    private Long id;

    private Long orderId;

    private String orderNo;

    private Long lgCompanyId;

    private String lgCompanyName;

    private Long pdDealOrders;

    private String logo;

    private Date createTime;

    private Long industryId;

    private Long deleteFlag;

    private Long status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getLgCompanyId() {
        return lgCompanyId;
    }

    public void setLgCompanyId(Long lgCompanyId) {
        this.lgCompanyId = lgCompanyId;
    }

    public String getLgCompanyName() {
        return lgCompanyName;
    }

    public void setLgCompanyName(String lgCompanyName) {
        this.lgCompanyName = lgCompanyName;
    }

    public Long getPdDealOrders() {
        return pdDealOrders;
    }

    public void setPdDealOrders(Long pdDealOrders) {
        this.pdDealOrders = pdDealOrders;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public Long getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
        OrderLgCompany other = (OrderLgCompany) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getLgCompanyId() == null ? other.getLgCompanyId() == null : this.getLgCompanyId().equals(other.getLgCompanyId()))
            && (this.getLgCompanyName() == null ? other.getLgCompanyName() == null : this.getLgCompanyName().equals(other.getLgCompanyName()))
            && (this.getPdDealOrders() == null ? other.getPdDealOrders() == null : this.getPdDealOrders().equals(other.getPdDealOrders()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getLgCompanyId() == null) ? 0 : getLgCompanyId().hashCode());
        result = prime * result + ((getLgCompanyName() == null) ? 0 : getLgCompanyName().hashCode());
        result = prime * result + ((getPdDealOrders() == null) ? 0 : getPdDealOrders().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}