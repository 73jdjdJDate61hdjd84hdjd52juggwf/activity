package com.jumore.b2b.activity.service.business.io.request;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户礼物表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class UserGiftReq implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户业务ID
     */
    private Long userId;

    /**
     * 平台来源
     */
    private Long platformCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 礼物来源的业务ID
     */
    private Long srcBizId;

    /**
     * 礼物来源名称@活动,个人
     */
    private String srcBizName;

    /**
     * 过期时间
     */
    private Date overdueTime;

    /**
     * 状态@0:默认;1:未领取，2:领取中;3:已领取,4:已使用;5:已过期(第三方的礼物会有第二中状态)
     */
    private Integer status;

    /**
     * 创建人@可能是系统，也可以是人
     */
    private Long creatBy;

    /**
     * 创建时间
     */
    private Date creattime;

    /**
     * 礼物名称
     */
    private String gitName;

    /**
     * 价值
     */
    private Long amount;

    /**
     * 礼物业务编码
     */
    private String giftBizCode;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(Long platformCode) {
        this.platformCode = platformCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getSrcBizId() {
        return srcBizId;
    }

    public void setSrcBizId(Long srcBizId) {
        this.srcBizId = srcBizId;
    }

    public String getSrcBizName() {
        return srcBizName;
    }

    public void setSrcBizName(String srcBizName) {
        this.srcBizName = srcBizName == null ? null : srcBizName.trim();
    }

    public Date getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(Date overdueTime) {
        this.overdueTime = overdueTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(Long creatBy) {
        this.creatBy = creatBy;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getGitName() {
        return gitName;
    }

    public void setGitName(String gitName) {
        this.gitName = gitName == null ? null : gitName.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getGiftBizCode() {
        return giftBizCode;
    }

    public void setGiftBizCode(String giftBizCode) {
        this.giftBizCode = giftBizCode == null ? null : giftBizCode.trim();
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
        UserGiftReq other = (UserGiftReq) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPlatformCode() == null ? other.getPlatformCode() == null : this.getPlatformCode().equals(other.getPlatformCode()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getSrcBizId() == null ? other.getSrcBizId() == null : this.getSrcBizId().equals(other.getSrcBizId()))
            && (this.getSrcBizName() == null ? other.getSrcBizName() == null : this.getSrcBizName().equals(other.getSrcBizName()))
            && (this.getOverdueTime() == null ? other.getOverdueTime() == null : this.getOverdueTime().equals(other.getOverdueTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatBy() == null ? other.getCreatBy() == null : this.getCreatBy().equals(other.getCreatBy()))
            && (this.getCreattime() == null ? other.getCreattime() == null : this.getCreattime().equals(other.getCreattime()))
            && (this.getGitName() == null ? other.getGitName() == null : this.getGitName().equals(other.getGitName()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGiftBizCode() == null ? other.getGiftBizCode() == null : this.getGiftBizCode().equals(other.getGiftBizCode()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPlatformCode() == null) ? 0 : getPlatformCode().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getSrcBizId() == null) ? 0 : getSrcBizId().hashCode());
        result = prime * result + ((getSrcBizName() == null) ? 0 : getSrcBizName().hashCode());
        result = prime * result + ((getOverdueTime() == null) ? 0 : getOverdueTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatBy() == null) ? 0 : getCreatBy().hashCode());
        result = prime * result + ((getCreattime() == null) ? 0 : getCreattime().hashCode());
        result = prime * result + ((getGitName() == null) ? 0 : getGitName().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGiftBizCode() == null) ? 0 : getGiftBizCode().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}