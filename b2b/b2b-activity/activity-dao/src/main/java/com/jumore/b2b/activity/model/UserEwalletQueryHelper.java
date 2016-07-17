/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * UserEwalletQueryHelper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserEwalletQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEwalletQueryHelper() {
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
     * 用户现金钱包
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

        public Criteria andUserMobileIsNull() {
            addCriterion("userMobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("userMobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("userMobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("userMobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("userMobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("userMobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("userMobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("userMobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("userMobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("userMobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("userMobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("userMobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("userMobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("userMobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Long value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Long value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Long value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Long value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Long value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Long> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Long> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Long value1, Long value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Long value1, Long value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceIsNull() {
            addCriterion("lastTakenBalance is null");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceIsNotNull() {
            addCriterion("lastTakenBalance is not null");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceEqualTo(Long value) {
            addCriterion("lastTakenBalance =", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceNotEqualTo(Long value) {
            addCriterion("lastTakenBalance <>", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceGreaterThan(Long value) {
            addCriterion("lastTakenBalance >", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("lastTakenBalance >=", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceLessThan(Long value) {
            addCriterion("lastTakenBalance <", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceLessThanOrEqualTo(Long value) {
            addCriterion("lastTakenBalance <=", value, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceIn(List<Long> values) {
            addCriterion("lastTakenBalance in", values, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceNotIn(List<Long> values) {
            addCriterion("lastTakenBalance not in", values, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceBetween(Long value1, Long value2) {
            addCriterion("lastTakenBalance between", value1, value2, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenBalanceNotBetween(Long value1, Long value2) {
            addCriterion("lastTakenBalance not between", value1, value2, "lastTakenBalance");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeIsNull() {
            addCriterion("lastTakenTime is null");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeIsNotNull() {
            addCriterion("lastTakenTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeEqualTo(Date value) {
            addCriterion("lastTakenTime =", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeNotEqualTo(Date value) {
            addCriterion("lastTakenTime <>", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeGreaterThan(Date value) {
            addCriterion("lastTakenTime >", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastTakenTime >=", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeLessThan(Date value) {
            addCriterion("lastTakenTime <", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastTakenTime <=", value, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeIn(List<Date> values) {
            addCriterion("lastTakenTime in", values, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeNotIn(List<Date> values) {
            addCriterion("lastTakenTime not in", values, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeBetween(Date value1, Date value2) {
            addCriterion("lastTakenTime between", value1, value2, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastTakenTime not between", value1, value2, "lastTakenTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccIsNull() {
            addCriterion("lastTakenAcc is null");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccIsNotNull() {
            addCriterion("lastTakenAcc is not null");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccEqualTo(String value) {
            addCriterion("lastTakenAcc =", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccNotEqualTo(String value) {
            addCriterion("lastTakenAcc <>", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccGreaterThan(String value) {
            addCriterion("lastTakenAcc >", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccGreaterThanOrEqualTo(String value) {
            addCriterion("lastTakenAcc >=", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccLessThan(String value) {
            addCriterion("lastTakenAcc <", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccLessThanOrEqualTo(String value) {
            addCriterion("lastTakenAcc <=", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccLike(String value) {
            addCriterion("lastTakenAcc like", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccNotLike(String value) {
            addCriterion("lastTakenAcc not like", value, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccIn(List<String> values) {
            addCriterion("lastTakenAcc in", values, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccNotIn(List<String> values) {
            addCriterion("lastTakenAcc not in", values, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccBetween(String value1, String value2) {
            addCriterion("lastTakenAcc between", value1, value2, "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccNotBetween(String value1, String value2) {
            addCriterion("lastTakenAcc not between", value1, value2, "lastTakenAcc");
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

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("locked like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("locked not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("lockTime is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("lockTime is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Date value) {
            addCriterion("lockTime =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Date value) {
            addCriterion("lockTime <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Date value) {
            addCriterion("lockTime >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lockTime >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Date value) {
            addCriterion("lockTime <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("lockTime <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Date> values) {
            addCriterion("lockTime in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Date> values) {
            addCriterion("lockTime not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Date value1, Date value2) {
            addCriterion("lockTime between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("lockTime not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNull() {
            addCriterion("unlockTime is null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNotNull() {
            addCriterion("unlockTime is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeEqualTo(Date value) {
            addCriterion("unlockTime =", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotEqualTo(Date value) {
            addCriterion("unlockTime <>", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThan(Date value) {
            addCriterion("unlockTime >", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unlockTime >=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThan(Date value) {
            addCriterion("unlockTime <", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("unlockTime <=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIn(List<Date> values) {
            addCriterion("unlockTime in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotIn(List<Date> values) {
            addCriterion("unlockTime not in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeBetween(Date value1, Date value2) {
            addCriterion("unlockTime between", value1, value2, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("unlockTime not between", value1, value2, "unlockTime");
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

        public Criteria andUserMobileLikeInsensitive(String value) {
            addCriterion("upper(userMobile) like", value.toUpperCase(), "userMobile");
            return (Criteria) this;
        }

        public Criteria andLastTakenAccLikeInsensitive(String value) {
            addCriterion("upper(lastTakenAcc) like", value.toUpperCase(), "lastTakenAcc");
            return (Criteria) this;
        }

        public Criteria andLockedLikeInsensitive(String value) {
            addCriterion("upper(locked) like", value.toUpperCase(), "locked");
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
     * 用户现金钱包
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