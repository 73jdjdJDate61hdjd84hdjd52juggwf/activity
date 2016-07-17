package com.jumore.b2b.activity.service.business.io.response;

import java.io.Serializable;

/**
 * 活动属性
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class ActivityAttrRes implements Serializable {
    /**
     * 序列
     */
    private Long id;

    /**
     * 活动Id
     */
    private Long parentId;

    /**
     * 活动图片
     */
    private String activityImg;

    /**
     * 礼物Id
     */
    private Long giftId;

    /**
     * 礼物名称
     */
    private String giftName;

    /**
     * 分享标题
     */
    private String shareTitle;

    /**
     * 分享地址
     */
    private String shareUrl;

    /**
     * 图片
     */
    private String simg;

    /**
     * 小图片
     */
    private String limg;

    /**
     * logo
     */
    private String lowestImg;

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getActivityImg() {
        return activityImg;
    }

    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg == null ? null : activityImg.trim();
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    public String getLimg() {
        return limg;
    }

    public void setLimg(String limg) {
        this.limg = limg == null ? null : limg.trim();
    }

    public String getLowestImg() {
        return lowestImg;
    }

    public void setLowestImg(String lowestImg) {
        this.lowestImg = lowestImg == null ? null : lowestImg.trim();
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
        ActivityAttrRes other = (ActivityAttrRes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getActivityImg() == null ? other.getActivityImg() == null : this.getActivityImg().equals(other.getActivityImg()))
            && (this.getGiftId() == null ? other.getGiftId() == null : this.getGiftId().equals(other.getGiftId()))
            && (this.getGiftName() == null ? other.getGiftName() == null : this.getGiftName().equals(other.getGiftName()))
            && (this.getShareTitle() == null ? other.getShareTitle() == null : this.getShareTitle().equals(other.getShareTitle()))
            && (this.getShareUrl() == null ? other.getShareUrl() == null : this.getShareUrl().equals(other.getShareUrl()))
            && (this.getSimg() == null ? other.getSimg() == null : this.getSimg().equals(other.getSimg()))
            && (this.getLimg() == null ? other.getLimg() == null : this.getLimg().equals(other.getLimg()))
            && (this.getLowestImg() == null ? other.getLowestImg() == null : this.getLowestImg().equals(other.getLowestImg()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getActivityImg() == null) ? 0 : getActivityImg().hashCode());
        result = prime * result + ((getGiftId() == null) ? 0 : getGiftId().hashCode());
        result = prime * result + ((getGiftName() == null) ? 0 : getGiftName().hashCode());
        result = prime * result + ((getShareTitle() == null) ? 0 : getShareTitle().hashCode());
        result = prime * result + ((getShareUrl() == null) ? 0 : getShareUrl().hashCode());
        result = prime * result + ((getSimg() == null) ? 0 : getSimg().hashCode());
        result = prime * result + ((getLimg() == null) ? 0 : getLimg().hashCode());
        result = prime * result + ((getLowestImg() == null) ? 0 : getLowestImg().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}