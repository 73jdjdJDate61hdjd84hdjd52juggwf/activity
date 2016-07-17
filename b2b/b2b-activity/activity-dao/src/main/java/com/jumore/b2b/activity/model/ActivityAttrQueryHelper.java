/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * ActivityAttrQueryHelper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.model;

import java.util.ArrayList;
import java.util.List;

public class ActivityAttrQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAttrQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 活动属性
     * 
     * @author 菠萝大象
     * @version 1.0 2016-07-01
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parentId =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parentId <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parentId >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parentId >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parentId <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parentId <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parentId in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parentId not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parentId between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parentId not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNull() {
            addCriterion("activityImg is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgIsNotNull() {
            addCriterion("activityImg is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgEqualTo(String value) {
            addCriterion("activityImg =", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotEqualTo(String value) {
            addCriterion("activityImg <>", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThan(String value) {
            addCriterion("activityImg >", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgGreaterThanOrEqualTo(String value) {
            addCriterion("activityImg >=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThan(String value) {
            addCriterion("activityImg <", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLessThanOrEqualTo(String value) {
            addCriterion("activityImg <=", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgLike(String value) {
            addCriterion("activityImg like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotLike(String value) {
            addCriterion("activityImg not like", value, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgIn(List<String> values) {
            addCriterion("activityImg in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotIn(List<String> values) {
            addCriterion("activityImg not in", values, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgBetween(String value1, String value2) {
            addCriterion("activityImg between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andActivityImgNotBetween(String value1, String value2) {
            addCriterion("activityImg not between", value1, value2, "activityImg");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("giftId is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("giftId is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Long value) {
            addCriterion("giftId =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Long value) {
            addCriterion("giftId <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Long value) {
            addCriterion("giftId >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("giftId >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Long value) {
            addCriterion("giftId <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("giftId <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Long> values) {
            addCriterion("giftId in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Long> values) {
            addCriterion("giftId not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Long value1, Long value2) {
            addCriterion("giftId between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("giftId not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("giftName is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("giftName is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("giftName =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("giftName <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("giftName >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("giftName >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("giftName <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("giftName <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("giftName like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("giftName not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("giftName in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("giftName not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("giftName between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("giftName not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("shareTitle is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("shareTitle is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("shareTitle =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("shareTitle <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("shareTitle >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("shareTitle >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("shareTitle <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("shareTitle <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("shareTitle like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("shareTitle not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("shareTitle in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("shareTitle not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("shareTitle between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("shareTitle not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNull() {
            addCriterion("shareUrl is null");
            return (Criteria) this;
        }

        public Criteria andShareUrlIsNotNull() {
            addCriterion("shareUrl is not null");
            return (Criteria) this;
        }

        public Criteria andShareUrlEqualTo(String value) {
            addCriterion("shareUrl =", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotEqualTo(String value) {
            addCriterion("shareUrl <>", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThan(String value) {
            addCriterion("shareUrl >", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("shareUrl >=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThan(String value) {
            addCriterion("shareUrl <", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLessThanOrEqualTo(String value) {
            addCriterion("shareUrl <=", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlLike(String value) {
            addCriterion("shareUrl like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotLike(String value) {
            addCriterion("shareUrl not like", value, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlIn(List<String> values) {
            addCriterion("shareUrl in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotIn(List<String> values) {
            addCriterion("shareUrl not in", values, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlBetween(String value1, String value2) {
            addCriterion("shareUrl between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andShareUrlNotBetween(String value1, String value2) {
            addCriterion("shareUrl not between", value1, value2, "shareUrl");
            return (Criteria) this;
        }

        public Criteria andSimgIsNull() {
            addCriterion("simg is null");
            return (Criteria) this;
        }

        public Criteria andSimgIsNotNull() {
            addCriterion("simg is not null");
            return (Criteria) this;
        }

        public Criteria andSimgEqualTo(String value) {
            addCriterion("simg =", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotEqualTo(String value) {
            addCriterion("simg <>", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgGreaterThan(String value) {
            addCriterion("simg >", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgGreaterThanOrEqualTo(String value) {
            addCriterion("simg >=", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLessThan(String value) {
            addCriterion("simg <", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLessThanOrEqualTo(String value) {
            addCriterion("simg <=", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLike(String value) {
            addCriterion("simg like", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotLike(String value) {
            addCriterion("simg not like", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgIn(List<String> values) {
            addCriterion("simg in", values, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotIn(List<String> values) {
            addCriterion("simg not in", values, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgBetween(String value1, String value2) {
            addCriterion("simg between", value1, value2, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotBetween(String value1, String value2) {
            addCriterion("simg not between", value1, value2, "simg");
            return (Criteria) this;
        }

        public Criteria andLimgIsNull() {
            addCriterion("limg is null");
            return (Criteria) this;
        }

        public Criteria andLimgIsNotNull() {
            addCriterion("limg is not null");
            return (Criteria) this;
        }

        public Criteria andLimgEqualTo(String value) {
            addCriterion("limg =", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgNotEqualTo(String value) {
            addCriterion("limg <>", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgGreaterThan(String value) {
            addCriterion("limg >", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgGreaterThanOrEqualTo(String value) {
            addCriterion("limg >=", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgLessThan(String value) {
            addCriterion("limg <", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgLessThanOrEqualTo(String value) {
            addCriterion("limg <=", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgLike(String value) {
            addCriterion("limg like", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgNotLike(String value) {
            addCriterion("limg not like", value, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgIn(List<String> values) {
            addCriterion("limg in", values, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgNotIn(List<String> values) {
            addCriterion("limg not in", values, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgBetween(String value1, String value2) {
            addCriterion("limg between", value1, value2, "limg");
            return (Criteria) this;
        }

        public Criteria andLimgNotBetween(String value1, String value2) {
            addCriterion("limg not between", value1, value2, "limg");
            return (Criteria) this;
        }

        public Criteria andLowestImgIsNull() {
            addCriterion("lowestImg is null");
            return (Criteria) this;
        }

        public Criteria andLowestImgIsNotNull() {
            addCriterion("lowestImg is not null");
            return (Criteria) this;
        }

        public Criteria andLowestImgEqualTo(String value) {
            addCriterion("lowestImg =", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgNotEqualTo(String value) {
            addCriterion("lowestImg <>", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgGreaterThan(String value) {
            addCriterion("lowestImg >", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgGreaterThanOrEqualTo(String value) {
            addCriterion("lowestImg >=", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgLessThan(String value) {
            addCriterion("lowestImg <", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgLessThanOrEqualTo(String value) {
            addCriterion("lowestImg <=", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgLike(String value) {
            addCriterion("lowestImg like", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgNotLike(String value) {
            addCriterion("lowestImg not like", value, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgIn(List<String> values) {
            addCriterion("lowestImg in", values, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgNotIn(List<String> values) {
            addCriterion("lowestImg not in", values, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgBetween(String value1, String value2) {
            addCriterion("lowestImg between", value1, value2, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andLowestImgNotBetween(String value1, String value2) {
            addCriterion("lowestImg not between", value1, value2, "lowestImg");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andActivityImgLikeInsensitive(String value) {
            addCriterion("upper(activityImg) like", value.toUpperCase(), "activityImg");
            return (Criteria) this;
        }

        public Criteria andGiftNameLikeInsensitive(String value) {
            addCriterion("upper(giftName) like", value.toUpperCase(), "giftName");
            return (Criteria) this;
        }

        public Criteria andShareTitleLikeInsensitive(String value) {
            addCriterion("upper(shareTitle) like", value.toUpperCase(), "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareUrlLikeInsensitive(String value) {
            addCriterion("upper(shareUrl) like", value.toUpperCase(), "shareUrl");
            return (Criteria) this;
        }

        public Criteria andSimgLikeInsensitive(String value) {
            addCriterion("upper(simg) like", value.toUpperCase(), "simg");
            return (Criteria) this;
        }

        public Criteria andLimgLikeInsensitive(String value) {
            addCriterion("upper(limg) like", value.toUpperCase(), "limg");
            return (Criteria) this;
        }

        public Criteria andLowestImgLikeInsensitive(String value) {
            addCriterion("upper(lowestImg) like", value.toUpperCase(), "lowestImg");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 活动属性
     * 
     * @author 菠萝大象
     * @version 1.0 2016-07-01
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}