/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * DictQueryHelper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictQueryHelper() {
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
     * 数据字典
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

        public Criteria andLadderIsNull() {
            addCriterion("ladder is null");
            return (Criteria) this;
        }

        public Criteria andLadderIsNotNull() {
            addCriterion("ladder is not null");
            return (Criteria) this;
        }

        public Criteria andLadderEqualTo(String value) {
            addCriterion("ladder =", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotEqualTo(String value) {
            addCriterion("ladder <>", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderGreaterThan(String value) {
            addCriterion("ladder >", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderGreaterThanOrEqualTo(String value) {
            addCriterion("ladder >=", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLessThan(String value) {
            addCriterion("ladder <", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLessThanOrEqualTo(String value) {
            addCriterion("ladder <=", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLike(String value) {
            addCriterion("ladder like", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotLike(String value) {
            addCriterion("ladder not like", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderIn(List<String> values) {
            addCriterion("ladder in", values, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotIn(List<String> values) {
            addCriterion("ladder not in", values, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderBetween(String value1, String value2) {
            addCriterion("ladder between", value1, value2, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotBetween(String value1, String value2) {
            addCriterion("ladder not between", value1, value2, "ladder");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("itemCode is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("itemCode is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("itemCode =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("itemCode <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("itemCode >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("itemCode >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("itemCode <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("itemCode <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("itemCode like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("itemCode not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("itemCode in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("itemCode not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("itemCode between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("itemCode not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCommentIsNull() {
            addCriterion("itemComment is null");
            return (Criteria) this;
        }

        public Criteria andItemCommentIsNotNull() {
            addCriterion("itemComment is not null");
            return (Criteria) this;
        }

        public Criteria andItemCommentEqualTo(String value) {
            addCriterion("itemComment =", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentNotEqualTo(String value) {
            addCriterion("itemComment <>", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentGreaterThan(String value) {
            addCriterion("itemComment >", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentGreaterThanOrEqualTo(String value) {
            addCriterion("itemComment >=", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentLessThan(String value) {
            addCriterion("itemComment <", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentLessThanOrEqualTo(String value) {
            addCriterion("itemComment <=", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentLike(String value) {
            addCriterion("itemComment like", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentNotLike(String value) {
            addCriterion("itemComment not like", value, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentIn(List<String> values) {
            addCriterion("itemComment in", values, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentNotIn(List<String> values) {
            addCriterion("itemComment not in", values, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentBetween(String value1, String value2) {
            addCriterion("itemComment between", value1, value2, "itemComment");
            return (Criteria) this;
        }

        public Criteria andItemCommentNotBetween(String value1, String value2) {
            addCriterion("itemComment not between", value1, value2, "itemComment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIsNull() {
            addCriterion("keyCode is null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIsNotNull() {
            addCriterion("keyCode is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeEqualTo(String value) {
            addCriterion("keyCode =", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotEqualTo(String value) {
            addCriterion("keyCode <>", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThan(String value) {
            addCriterion("keyCode >", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("keyCode >=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThan(String value) {
            addCriterion("keyCode <", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThanOrEqualTo(String value) {
            addCriterion("keyCode <=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLike(String value) {
            addCriterion("keyCode like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotLike(String value) {
            addCriterion("keyCode not like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIn(List<String> values) {
            addCriterion("keyCode in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotIn(List<String> values) {
            addCriterion("keyCode not in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeBetween(String value1, String value2) {
            addCriterion("keyCode between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotBetween(String value1, String value2) {
            addCriterion("keyCode not between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyValIsNull() {
            addCriterion("keyVal is null");
            return (Criteria) this;
        }

        public Criteria andKeyValIsNotNull() {
            addCriterion("keyVal is not null");
            return (Criteria) this;
        }

        public Criteria andKeyValEqualTo(String value) {
            addCriterion("keyVal =", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValNotEqualTo(String value) {
            addCriterion("keyVal <>", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValGreaterThan(String value) {
            addCriterion("keyVal >", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValGreaterThanOrEqualTo(String value) {
            addCriterion("keyVal >=", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValLessThan(String value) {
            addCriterion("keyVal <", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValLessThanOrEqualTo(String value) {
            addCriterion("keyVal <=", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValLike(String value) {
            addCriterion("keyVal like", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValNotLike(String value) {
            addCriterion("keyVal not like", value, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValIn(List<String> values) {
            addCriterion("keyVal in", values, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValNotIn(List<String> values) {
            addCriterion("keyVal not in", values, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValBetween(String value1, String value2) {
            addCriterion("keyVal between", value1, value2, "keyVal");
            return (Criteria) this;
        }

        public Criteria andKeyValNotBetween(String value1, String value2) {
            addCriterion("keyVal not between", value1, value2, "keyVal");
            return (Criteria) this;
        }

        public Criteria andSqrtIsNull() {
            addCriterion("sqrt is null");
            return (Criteria) this;
        }

        public Criteria andSqrtIsNotNull() {
            addCriterion("sqrt is not null");
            return (Criteria) this;
        }

        public Criteria andSqrtEqualTo(Long value) {
            addCriterion("sqrt =", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtNotEqualTo(Long value) {
            addCriterion("sqrt <>", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtGreaterThan(Long value) {
            addCriterion("sqrt >", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtGreaterThanOrEqualTo(Long value) {
            addCriterion("sqrt >=", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtLessThan(Long value) {
            addCriterion("sqrt <", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtLessThanOrEqualTo(Long value) {
            addCriterion("sqrt <=", value, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtIn(List<Long> values) {
            addCriterion("sqrt in", values, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtNotIn(List<Long> values) {
            addCriterion("sqrt not in", values, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtBetween(Long value1, Long value2) {
            addCriterion("sqrt between", value1, value2, "sqrt");
            return (Criteria) this;
        }

        public Criteria andSqrtNotBetween(Long value1, Long value2) {
            addCriterion("sqrt not between", value1, value2, "sqrt");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNull() {
            addCriterion("appendBy is null");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNotNull() {
            addCriterion("appendBy is not null");
            return (Criteria) this;
        }

        public Criteria andAppendByEqualTo(Long value) {
            addCriterion("appendBy =", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotEqualTo(Long value) {
            addCriterion("appendBy <>", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThan(Long value) {
            addCriterion("appendBy >", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThanOrEqualTo(Long value) {
            addCriterion("appendBy >=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThan(Long value) {
            addCriterion("appendBy <", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThanOrEqualTo(Long value) {
            addCriterion("appendBy <=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByIn(List<Long> values) {
            addCriterion("appendBy in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotIn(List<Long> values) {
            addCriterion("appendBy not in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByBetween(Long value1, Long value2) {
            addCriterion("appendBy between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotBetween(Long value1, Long value2) {
            addCriterion("appendBy not between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIsNull() {
            addCriterion("appendTime is null");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIsNotNull() {
            addCriterion("appendTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppendTimeEqualTo(Date value) {
            addCriterion("appendTime =", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotEqualTo(Date value) {
            addCriterion("appendTime <>", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeGreaterThan(Date value) {
            addCriterion("appendTime >", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appendTime >=", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeLessThan(Date value) {
            addCriterion("appendTime <", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeLessThanOrEqualTo(Date value) {
            addCriterion("appendTime <=", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIn(List<Date> values) {
            addCriterion("appendTime in", values, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotIn(List<Date> values) {
            addCriterion("appendTime not in", values, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeBetween(Date value1, Date value2) {
            addCriterion("appendTime between", value1, value2, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotBetween(Date value1, Date value2) {
            addCriterion("appendTime not between", value1, value2, "appendTime");
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

        public Criteria andRefactorCodeIsNull() {
            addCriterion("refactorCode is null");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeIsNotNull() {
            addCriterion("refactorCode is not null");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeEqualTo(String value) {
            addCriterion("refactorCode =", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeNotEqualTo(String value) {
            addCriterion("refactorCode <>", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeGreaterThan(String value) {
            addCriterion("refactorCode >", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("refactorCode >=", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeLessThan(String value) {
            addCriterion("refactorCode <", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeLessThanOrEqualTo(String value) {
            addCriterion("refactorCode <=", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeLike(String value) {
            addCriterion("refactorCode like", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeNotLike(String value) {
            addCriterion("refactorCode not like", value, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeIn(List<String> values) {
            addCriterion("refactorCode in", values, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeNotIn(List<String> values) {
            addCriterion("refactorCode not in", values, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeBetween(String value1, String value2) {
            addCriterion("refactorCode between", value1, value2, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeNotBetween(String value1, String value2) {
            addCriterion("refactorCode not between", value1, value2, "refactorCode");
            return (Criteria) this;
        }

        public Criteria andLadderLikeInsensitive(String value) {
            addCriterion("upper(ladder) like", value.toUpperCase(), "ladder");
            return (Criteria) this;
        }

        public Criteria andItemCodeLikeInsensitive(String value) {
            addCriterion("upper(itemCode) like", value.toUpperCase(), "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCommentLikeInsensitive(String value) {
            addCriterion("upper(itemComment) like", value.toUpperCase(), "itemComment");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLikeInsensitive(String value) {
            addCriterion("upper(keyCode) like", value.toUpperCase(), "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyValLikeInsensitive(String value) {
            addCriterion("upper(keyVal) like", value.toUpperCase(), "keyVal");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andRefactorCodeLikeInsensitive(String value) {
            addCriterion("upper(refactorCode) like", value.toUpperCase(), "refactorCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 数据字典
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