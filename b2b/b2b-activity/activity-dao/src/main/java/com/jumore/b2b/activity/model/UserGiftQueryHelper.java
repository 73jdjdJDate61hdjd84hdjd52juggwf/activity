/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * UserGiftQueryHelper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserGiftQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserGiftQueryHelper() {
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
     * 用户礼物表
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNull() {
            addCriterion("platformCode is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNotNull() {
            addCriterion("platformCode is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeEqualTo(Long value) {
            addCriterion("platformCode =", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotEqualTo(Long value) {
            addCriterion("platformCode <>", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThan(Long value) {
            addCriterion("platformCode >", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("platformCode >=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThan(Long value) {
            addCriterion("platformCode <", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThanOrEqualTo(Long value) {
            addCriterion("platformCode <=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIn(List<Long> values) {
            addCriterion("platformCode in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotIn(List<Long> values) {
            addCriterion("platformCode not in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeBetween(Long value1, Long value2) {
            addCriterion("platformCode between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotBetween(Long value1, Long value2) {
            addCriterion("platformCode not between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdIsNull() {
            addCriterion("srcBizId is null");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdIsNotNull() {
            addCriterion("srcBizId is not null");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdEqualTo(Long value) {
            addCriterion("srcBizId =", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdNotEqualTo(Long value) {
            addCriterion("srcBizId <>", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdGreaterThan(Long value) {
            addCriterion("srcBizId >", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdGreaterThanOrEqualTo(Long value) {
            addCriterion("srcBizId >=", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdLessThan(Long value) {
            addCriterion("srcBizId <", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdLessThanOrEqualTo(Long value) {
            addCriterion("srcBizId <=", value, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdIn(List<Long> values) {
            addCriterion("srcBizId in", values, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdNotIn(List<Long> values) {
            addCriterion("srcBizId not in", values, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdBetween(Long value1, Long value2) {
            addCriterion("srcBizId between", value1, value2, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizIdNotBetween(Long value1, Long value2) {
            addCriterion("srcBizId not between", value1, value2, "srcBizId");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameIsNull() {
            addCriterion("srcBizName is null");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameIsNotNull() {
            addCriterion("srcBizName is not null");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameEqualTo(String value) {
            addCriterion("srcBizName =", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameNotEqualTo(String value) {
            addCriterion("srcBizName <>", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameGreaterThan(String value) {
            addCriterion("srcBizName >", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameGreaterThanOrEqualTo(String value) {
            addCriterion("srcBizName >=", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameLessThan(String value) {
            addCriterion("srcBizName <", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameLessThanOrEqualTo(String value) {
            addCriterion("srcBizName <=", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameLike(String value) {
            addCriterion("srcBizName like", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameNotLike(String value) {
            addCriterion("srcBizName not like", value, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameIn(List<String> values) {
            addCriterion("srcBizName in", values, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameNotIn(List<String> values) {
            addCriterion("srcBizName not in", values, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameBetween(String value1, String value2) {
            addCriterion("srcBizName between", value1, value2, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameNotBetween(String value1, String value2) {
            addCriterion("srcBizName not between", value1, value2, "srcBizName");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIsNull() {
            addCriterion("overdueTime is null");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIsNotNull() {
            addCriterion("overdueTime is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeEqualTo(Date value) {
            addCriterion("overdueTime =", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotEqualTo(Date value) {
            addCriterion("overdueTime <>", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeGreaterThan(Date value) {
            addCriterion("overdueTime >", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overdueTime >=", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeLessThan(Date value) {
            addCriterion("overdueTime <", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeLessThanOrEqualTo(Date value) {
            addCriterion("overdueTime <=", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIn(List<Date> values) {
            addCriterion("overdueTime in", values, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotIn(List<Date> values) {
            addCriterion("overdueTime not in", values, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeBetween(Date value1, Date value2) {
            addCriterion("overdueTime between", value1, value2, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotBetween(Date value1, Date value2) {
            addCriterion("overdueTime not between", value1, value2, "overdueTime");
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

        public Criteria andCreatByIsNull() {
            addCriterion("creatBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatByIsNotNull() {
            addCriterion("creatBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatByEqualTo(Long value) {
            addCriterion("creatBy =", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotEqualTo(Long value) {
            addCriterion("creatBy <>", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByGreaterThan(Long value) {
            addCriterion("creatBy >", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByGreaterThanOrEqualTo(Long value) {
            addCriterion("creatBy >=", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByLessThan(Long value) {
            addCriterion("creatBy <", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByLessThanOrEqualTo(Long value) {
            addCriterion("creatBy <=", value, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByIn(List<Long> values) {
            addCriterion("creatBy in", values, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotIn(List<Long> values) {
            addCriterion("creatBy not in", values, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByBetween(Long value1, Long value2) {
            addCriterion("creatBy between", value1, value2, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreatByNotBetween(Long value1, Long value2) {
            addCriterion("creatBy not between", value1, value2, "creatBy");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creattime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creattime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creattime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creattime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creattime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creattime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creattime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andGitNameIsNull() {
            addCriterion("gitName is null");
            return (Criteria) this;
        }

        public Criteria andGitNameIsNotNull() {
            addCriterion("gitName is not null");
            return (Criteria) this;
        }

        public Criteria andGitNameEqualTo(String value) {
            addCriterion("gitName =", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameNotEqualTo(String value) {
            addCriterion("gitName <>", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameGreaterThan(String value) {
            addCriterion("gitName >", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameGreaterThanOrEqualTo(String value) {
            addCriterion("gitName >=", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameLessThan(String value) {
            addCriterion("gitName <", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameLessThanOrEqualTo(String value) {
            addCriterion("gitName <=", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameLike(String value) {
            addCriterion("gitName like", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameNotLike(String value) {
            addCriterion("gitName not like", value, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameIn(List<String> values) {
            addCriterion("gitName in", values, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameNotIn(List<String> values) {
            addCriterion("gitName not in", values, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameBetween(String value1, String value2) {
            addCriterion("gitName between", value1, value2, "gitName");
            return (Criteria) this;
        }

        public Criteria andGitNameNotBetween(String value1, String value2) {
            addCriterion("gitName not between", value1, value2, "gitName");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeIsNull() {
            addCriterion("giftBizCode is null");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeIsNotNull() {
            addCriterion("giftBizCode is not null");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeEqualTo(String value) {
            addCriterion("giftBizCode =", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeNotEqualTo(String value) {
            addCriterion("giftBizCode <>", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeGreaterThan(String value) {
            addCriterion("giftBizCode >", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("giftBizCode >=", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeLessThan(String value) {
            addCriterion("giftBizCode <", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeLessThanOrEqualTo(String value) {
            addCriterion("giftBizCode <=", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeLike(String value) {
            addCriterion("giftBizCode like", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeNotLike(String value) {
            addCriterion("giftBizCode not like", value, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeIn(List<String> values) {
            addCriterion("giftBizCode in", values, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeNotIn(List<String> values) {
            addCriterion("giftBizCode not in", values, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeBetween(String value1, String value2) {
            addCriterion("giftBizCode between", value1, value2, "giftBizCode");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeNotBetween(String value1, String value2) {
            addCriterion("giftBizCode not between", value1, value2, "giftBizCode");
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

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(userName) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andSrcBizNameLikeInsensitive(String value) {
            addCriterion("upper(srcBizName) like", value.toUpperCase(), "srcBizName");
            return (Criteria) this;
        }

        public Criteria andGitNameLikeInsensitive(String value) {
            addCriterion("upper(gitName) like", value.toUpperCase(), "gitName");
            return (Criteria) this;
        }

        public Criteria andGiftBizCodeLikeInsensitive(String value) {
            addCriterion("upper(giftBizCode) like", value.toUpperCase(), "giftBizCode");
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
     * 用户礼物表
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