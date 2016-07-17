package com.jumore.b2b.activity.service.business.io.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 礼物日志表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class UserGiftLog implements Serializable {
    /**
     * 主键
     */
    private Long ID_;

    /**
     * 创建时间
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 修改时间
     */
    private Long platformCode;

    /**
     * 发起人Id
            发起者
     */
    private Long initiatorId;

    /**
     * 发起者姓名
     */
    private String initiatorName;

    /**
     * 陈述
     */
    private String statement;

    /**
     * 价值
     */
    private Long amount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 类型编码
     */
    private String typeCode;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getID_() {
        return ID_;
    }

    public void setID_(Long ID_) {
        this.ID_ = ID_;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(Long platformCode) {
        this.platformCode = platformCode;
    }

    public Long getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName == null ? null : initiatorName.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
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
        UserGiftLog other = (UserGiftLog) that;
        return (this.getID_() == null ? other.getID_() == null : this.getID_().equals(other.getID_()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPlatformCode() == null ? other.getPlatformCode() == null : this.getPlatformCode().equals(other.getPlatformCode()))
            && (this.getInitiatorId() == null ? other.getInitiatorId() == null : this.getInitiatorId().equals(other.getInitiatorId()))
            && (this.getInitiatorName() == null ? other.getInitiatorName() == null : this.getInitiatorName().equals(other.getInitiatorName()))
            && (this.getStatement() == null ? other.getStatement() == null : this.getStatement().equals(other.getStatement()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getTypeCode() == null ? other.getTypeCode() == null : this.getTypeCode().equals(other.getTypeCode()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID_() == null) ? 0 : getID_().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPlatformCode() == null) ? 0 : getPlatformCode().hashCode());
        result = prime * result + ((getInitiatorId() == null) ? 0 : getInitiatorId().hashCode());
        result = prime * result + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode());
        result = prime * result + ((getStatement() == null) ? 0 : getStatement().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getTypeCode() == null) ? 0 : getTypeCode().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}