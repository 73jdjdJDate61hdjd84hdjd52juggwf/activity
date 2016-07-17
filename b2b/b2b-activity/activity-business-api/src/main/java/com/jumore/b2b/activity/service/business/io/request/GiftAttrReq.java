package com.jumore.b2b.activity.service.business.io.request;

import java.io.Serializable;

/**
 * 奖励属性表
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class GiftAttrReq implements Serializable {
    /**
     * 序列@
     */
    private Long ID;

    /**
     * 礼物ID
     */
    private Long giftId;

    private static final long serialVersionUID = 1L;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
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
        GiftAttrReq other = (GiftAttrReq) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getGiftId() == null ? other.getGiftId() == null : this.getGiftId().equals(other.getGiftId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getGiftId() == null) ? 0 : getGiftId().hashCode());
        return result;
    }
}