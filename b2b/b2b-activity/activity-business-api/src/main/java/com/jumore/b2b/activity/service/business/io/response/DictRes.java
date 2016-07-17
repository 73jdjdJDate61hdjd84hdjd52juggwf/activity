package com.jumore.b2b.activity.service.business.io.response;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据字典
 * 
 * @author 菠萝大象
 * @version 1.0 2016-07-01
 */
public class DictRes implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 父节点
     */
    private Long parentId;

    /**
     * 树阶
     */
    private String ladder;

    /**
     * 选项名称
     */
    private String itemCode;

    /**
     * 选项描述
     */
    private String itemComment;

    /**
     * 状态@停用:1|启用:0
     */
    private Integer status;

    /**
     * 编码
     */
    private String keyCode;

    /**
     * 值
     */
    private String keyVal;

    /**
     * 排序
     */
    private Long sqrt;

    /**
     * 创建人
     */
    private Long appendBy;

    /**
     * 创建时间
     */
    private Date appendTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 引用编码
     */
    private String refactorCode;

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

    public String getLadder() {
        return ladder;
    }

    public void setLadder(String ladder) {
        this.ladder = ladder == null ? null : ladder.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemComment() {
        return itemComment;
    }

    public void setItemComment(String itemComment) {
        this.itemComment = itemComment == null ? null : itemComment.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode == null ? null : keyCode.trim();
    }

    public String getKeyVal() {
        return keyVal;
    }

    public void setKeyVal(String keyVal) {
        this.keyVal = keyVal == null ? null : keyVal.trim();
    }

    public Long getSqrt() {
        return sqrt;
    }

    public void setSqrt(Long sqrt) {
        this.sqrt = sqrt;
    }

    public Long getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Long appendBy) {
        this.appendBy = appendBy;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRefactorCode() {
        return refactorCode;
    }

    public void setRefactorCode(String refactorCode) {
        this.refactorCode = refactorCode == null ? null : refactorCode.trim();
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
        DictRes other = (DictRes) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getLadder() == null ? other.getLadder() == null : this.getLadder().equals(other.getLadder()))
            && (this.getItemCode() == null ? other.getItemCode() == null : this.getItemCode().equals(other.getItemCode()))
            && (this.getItemComment() == null ? other.getItemComment() == null : this.getItemComment().equals(other.getItemComment()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getKeyCode() == null ? other.getKeyCode() == null : this.getKeyCode().equals(other.getKeyCode()))
            && (this.getKeyVal() == null ? other.getKeyVal() == null : this.getKeyVal().equals(other.getKeyVal()))
            && (this.getSqrt() == null ? other.getSqrt() == null : this.getSqrt().equals(other.getSqrt()))
            && (this.getAppendBy() == null ? other.getAppendBy() == null : this.getAppendBy().equals(other.getAppendBy()))
            && (this.getAppendTime() == null ? other.getAppendTime() == null : this.getAppendTime().equals(other.getAppendTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRefactorCode() == null ? other.getRefactorCode() == null : this.getRefactorCode().equals(other.getRefactorCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getLadder() == null) ? 0 : getLadder().hashCode());
        result = prime * result + ((getItemCode() == null) ? 0 : getItemCode().hashCode());
        result = prime * result + ((getItemComment() == null) ? 0 : getItemComment().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getKeyCode() == null) ? 0 : getKeyCode().hashCode());
        result = prime * result + ((getKeyVal() == null) ? 0 : getKeyVal().hashCode());
        result = prime * result + ((getSqrt() == null) ? 0 : getSqrt().hashCode());
        result = prime * result + ((getAppendBy() == null) ? 0 : getAppendBy().hashCode());
        result = prime * result + ((getAppendTime() == null) ? 0 : getAppendTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRefactorCode() == null) ? 0 : getRefactorCode().hashCode());
        return result;
    }
}