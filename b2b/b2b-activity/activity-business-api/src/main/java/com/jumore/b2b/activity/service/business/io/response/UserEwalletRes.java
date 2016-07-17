package com.jumore.b2b.activity.service.business.io.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户现金钱包
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class UserEwalletRes implements Serializable {
    /**
     * 主键@
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 平台编码
     */
    private Long platformCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String userMobile;

    /**
     * 余额(单位是分)
     */
    private Long balance;

    /**
     * 上次取款金额
     */
    private Long lastTakenBalance;

    /**
     * 上次取款时间
     */
    private Date lastTakenTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次取款账号
     */
    private String lastTakenAcc;

    /**
     * 状态@
     */
    private Integer status;

    /**
     * 锁定＠锁定后不能提款
     */
    private String locked;

    /**
     * 锁定时间
     */
    private Date lockTime;

    /**
     * 解锁时间
     */
    private Date unlockTime;

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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getLastTakenBalance() {
        return lastTakenBalance;
    }

    public void setLastTakenBalance(Long lastTakenBalance) {
        this.lastTakenBalance = lastTakenBalance;
    }

    public Date getLastTakenTime() {
        return lastTakenTime;
    }

    public void setLastTakenTime(Date lastTakenTime) {
        this.lastTakenTime = lastTakenTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastTakenAcc() {
        return lastTakenAcc;
    }

    public void setLastTakenAcc(String lastTakenAcc) {
        this.lastTakenAcc = lastTakenAcc == null ? null : lastTakenAcc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(Date unlockTime) {
        this.unlockTime = unlockTime;
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
        UserEwalletRes other = (UserEwalletRes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPlatformCode() == null ? other.getPlatformCode() == null : this.getPlatformCode().equals(other.getPlatformCode()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getLastTakenBalance() == null ? other.getLastTakenBalance() == null : this.getLastTakenBalance().equals(other.getLastTakenBalance()))
            && (this.getLastTakenTime() == null ? other.getLastTakenTime() == null : this.getLastTakenTime().equals(other.getLastTakenTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastTakenAcc() == null ? other.getLastTakenAcc() == null : this.getLastTakenAcc().equals(other.getLastTakenAcc()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getUnlockTime() == null ? other.getUnlockTime() == null : this.getUnlockTime().equals(other.getUnlockTime()))
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
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getLastTakenBalance() == null) ? 0 : getLastTakenBalance().hashCode());
        result = prime * result + ((getLastTakenTime() == null) ? 0 : getLastTakenTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastTakenAcc() == null) ? 0 : getLastTakenAcc().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getUnlockTime() == null) ? 0 : getUnlockTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}