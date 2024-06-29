package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCostRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCostRechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("recharge_id =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("recharge_id <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("recharge_id >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_id >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("recharge_id <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("recharge_id <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("recharge_id like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("recharge_id not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("recharge_id in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("recharge_id not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("recharge_id between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("recharge_id not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRechargeContentIsNull() {
            addCriterion("recharge_content is null");
            return (Criteria) this;
        }

        public Criteria andRechargeContentIsNotNull() {
            addCriterion("recharge_content is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeContentEqualTo(String value) {
            addCriterion("recharge_content =", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentNotEqualTo(String value) {
            addCriterion("recharge_content <>", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentGreaterThan(String value) {
            addCriterion("recharge_content >", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_content >=", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentLessThan(String value) {
            addCriterion("recharge_content <", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentLessThanOrEqualTo(String value) {
            addCriterion("recharge_content <=", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentLike(String value) {
            addCriterion("recharge_content like", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentNotLike(String value) {
            addCriterion("recharge_content not like", value, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentIn(List<String> values) {
            addCriterion("recharge_content in", values, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentNotIn(List<String> values) {
            addCriterion("recharge_content not in", values, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentBetween(String value1, String value2) {
            addCriterion("recharge_content between", value1, value2, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andRechargeContentNotBetween(String value1, String value2) {
            addCriterion("recharge_content not between", value1, value2, "rechargeContent");
            return (Criteria) this;
        }

        public Criteria andListIdIsNull() {
            addCriterion("list_id is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("list_id is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(String value) {
            addCriterion("list_id =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(String value) {
            addCriterion("list_id <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(String value) {
            addCriterion("list_id >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(String value) {
            addCriterion("list_id >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(String value) {
            addCriterion("list_id <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(String value) {
            addCriterion("list_id <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLike(String value) {
            addCriterion("list_id like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotLike(String value) {
            addCriterion("list_id not like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<String> values) {
            addCriterion("list_id in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<String> values) {
            addCriterion("list_id not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(String value1, String value2) {
            addCriterion("list_id between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(String value1, String value2) {
            addCriterion("list_id not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIsNull() {
            addCriterion("recharge_num is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIsNotNull() {
            addCriterion("recharge_num is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumEqualTo(Double value) {
            addCriterion("recharge_num =", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotEqualTo(Double value) {
            addCriterion("recharge_num <>", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumGreaterThan(Double value) {
            addCriterion("recharge_num >", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_num >=", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumLessThan(Double value) {
            addCriterion("recharge_num <", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumLessThanOrEqualTo(Double value) {
            addCriterion("recharge_num <=", value, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumIn(List<Double> values) {
            addCriterion("recharge_num in", values, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotIn(List<Double> values) {
            addCriterion("recharge_num not in", values, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumBetween(Double value1, Double value2) {
            addCriterion("recharge_num between", value1, value2, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeNumNotBetween(Double value1, Double value2) {
            addCriterion("recharge_num not between", value1, value2, "rechargeNum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumIsNull() {
            addCriterion("recharge_ynum is null");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumIsNotNull() {
            addCriterion("recharge_ynum is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumEqualTo(Double value) {
            addCriterion("recharge_ynum =", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumNotEqualTo(Double value) {
            addCriterion("recharge_ynum <>", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumGreaterThan(Double value) {
            addCriterion("recharge_ynum >", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_ynum >=", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumLessThan(Double value) {
            addCriterion("recharge_ynum <", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumLessThanOrEqualTo(Double value) {
            addCriterion("recharge_ynum <=", value, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumIn(List<Double> values) {
            addCriterion("recharge_ynum in", values, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumNotIn(List<Double> values) {
            addCriterion("recharge_ynum not in", values, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumBetween(Double value1, Double value2) {
            addCriterion("recharge_ynum between", value1, value2, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeYnumNotBetween(Double value1, Double value2) {
            addCriterion("recharge_ynum not between", value1, value2, "rechargeYnum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumIsNull() {
            addCriterion("recharge_get_num is null");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumIsNotNull() {
            addCriterion("recharge_get_num is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumEqualTo(Integer value) {
            addCriterion("recharge_get_num =", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumNotEqualTo(Integer value) {
            addCriterion("recharge_get_num <>", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumGreaterThan(Integer value) {
            addCriterion("recharge_get_num >", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_get_num >=", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumLessThan(Integer value) {
            addCriterion("recharge_get_num <", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_get_num <=", value, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumIn(List<Integer> values) {
            addCriterion("recharge_get_num in", values, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumNotIn(List<Integer> values) {
            addCriterion("recharge_get_num not in", values, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumBetween(Integer value1, Integer value2) {
            addCriterion("recharge_get_num between", value1, value2, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_get_num not between", value1, value2, "rechargeGetNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralIsNull() {
            addCriterion("recharge_get_integral is null");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralIsNotNull() {
            addCriterion("recharge_get_integral is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralEqualTo(Integer value) {
            addCriterion("recharge_get_integral =", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralNotEqualTo(Integer value) {
            addCriterion("recharge_get_integral <>", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralGreaterThan(Integer value) {
            addCriterion("recharge_get_integral >", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_get_integral >=", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralLessThan(Integer value) {
            addCriterion("recharge_get_integral <", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_get_integral <=", value, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralIn(List<Integer> values) {
            addCriterion("recharge_get_integral in", values, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralNotIn(List<Integer> values) {
            addCriterion("recharge_get_integral not in", values, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralBetween(Integer value1, Integer value2) {
            addCriterion("recharge_get_integral between", value1, value2, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andRechargeGetIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_get_integral not between", value1, value2, "rechargeGetIntegral");
            return (Criteria) this;
        }

        public Criteria andIsDeductionIsNull() {
            addCriterion("is_deduction is null");
            return (Criteria) this;
        }

        public Criteria andIsDeductionIsNotNull() {
            addCriterion("is_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeductionEqualTo(String value) {
            addCriterion("is_deduction =", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionNotEqualTo(String value) {
            addCriterion("is_deduction <>", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionGreaterThan(String value) {
            addCriterion("is_deduction >", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionGreaterThanOrEqualTo(String value) {
            addCriterion("is_deduction >=", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionLessThan(String value) {
            addCriterion("is_deduction <", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionLessThanOrEqualTo(String value) {
            addCriterion("is_deduction <=", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionLike(String value) {
            addCriterion("is_deduction like", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionNotLike(String value) {
            addCriterion("is_deduction not like", value, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionIn(List<String> values) {
            addCriterion("is_deduction in", values, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionNotIn(List<String> values) {
            addCriterion("is_deduction not in", values, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionBetween(String value1, String value2) {
            addCriterion("is_deduction between", value1, value2, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andIsDeductionNotBetween(String value1, String value2) {
            addCriterion("is_deduction not between", value1, value2, "isDeduction");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(String value) {
            addCriterion("recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(String value) {
            addCriterion("recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(String value) {
            addCriterion("recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(String value) {
            addCriterion("recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(String value) {
            addCriterion("recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLike(String value) {
            addCriterion("recharge_type like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotLike(String value) {
            addCriterion("recharge_type not like", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<String> values) {
            addCriterion("recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<String> values) {
            addCriterion("recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(String value1, String value2) {
            addCriterion("recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(String value1, String value2) {
            addCriterion("recharge_type not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinIsNull() {
            addCriterion("recharge_join is null");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinIsNotNull() {
            addCriterion("recharge_join is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinEqualTo(String value) {
            addCriterion("recharge_join =", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinNotEqualTo(String value) {
            addCriterion("recharge_join <>", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinGreaterThan(String value) {
            addCriterion("recharge_join >", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_join >=", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinLessThan(String value) {
            addCriterion("recharge_join <", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinLessThanOrEqualTo(String value) {
            addCriterion("recharge_join <=", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinLike(String value) {
            addCriterion("recharge_join like", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinNotLike(String value) {
            addCriterion("recharge_join not like", value, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinIn(List<String> values) {
            addCriterion("recharge_join in", values, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinNotIn(List<String> values) {
            addCriterion("recharge_join not in", values, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinBetween(String value1, String value2) {
            addCriterion("recharge_join between", value1, value2, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargeJoinNotBetween(String value1, String value2) {
            addCriterion("recharge_join not between", value1, value2, "rechargeJoin");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseIsNull() {
            addCriterion("recharge_purchase is null");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseIsNotNull() {
            addCriterion("recharge_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseEqualTo(Integer value) {
            addCriterion("recharge_purchase =", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseNotEqualTo(Integer value) {
            addCriterion("recharge_purchase <>", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseGreaterThan(Integer value) {
            addCriterion("recharge_purchase >", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_purchase >=", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseLessThan(Integer value) {
            addCriterion("recharge_purchase <", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_purchase <=", value, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseIn(List<Integer> values) {
            addCriterion("recharge_purchase in", values, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseNotIn(List<Integer> values) {
            addCriterion("recharge_purchase not in", values, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseBetween(Integer value1, Integer value2) {
            addCriterion("recharge_purchase between", value1, value2, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andRechargePurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_purchase not between", value1, value2, "rechargePurchase");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNull() {
            addCriterion("lrsj is null");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNotNull() {
            addCriterion("lrsj is not null");
            return (Criteria) this;
        }

        public Criteria andLrsjEqualTo(String value) {
            addCriterion("lrsj =", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotEqualTo(String value) {
            addCriterion("lrsj <>", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThan(String value) {
            addCriterion("lrsj >", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThanOrEqualTo(String value) {
            addCriterion("lrsj >=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThan(String value) {
            addCriterion("lrsj <", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThanOrEqualTo(String value) {
            addCriterion("lrsj <=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLike(String value) {
            addCriterion("lrsj like", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotLike(String value) {
            addCriterion("lrsj not like", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjIn(List<String> values) {
            addCriterion("lrsj in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotIn(List<String> values) {
            addCriterion("lrsj not in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjBetween(String value1, String value2) {
            addCriterion("lrsj between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotBetween(String value1, String value2) {
            addCriterion("lrsj not between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrzhIsNull() {
            addCriterion("lrzh is null");
            return (Criteria) this;
        }

        public Criteria andLrzhIsNotNull() {
            addCriterion("lrzh is not null");
            return (Criteria) this;
        }

        public Criteria andLrzhEqualTo(String value) {
            addCriterion("lrzh =", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhNotEqualTo(String value) {
            addCriterion("lrzh <>", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhGreaterThan(String value) {
            addCriterion("lrzh >", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhGreaterThanOrEqualTo(String value) {
            addCriterion("lrzh >=", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhLessThan(String value) {
            addCriterion("lrzh <", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhLessThanOrEqualTo(String value) {
            addCriterion("lrzh <=", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhLike(String value) {
            addCriterion("lrzh like", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhNotLike(String value) {
            addCriterion("lrzh not like", value, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhIn(List<String> values) {
            addCriterion("lrzh in", values, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhNotIn(List<String> values) {
            addCriterion("lrzh not in", values, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhBetween(String value1, String value2) {
            addCriterion("lrzh between", value1, value2, "lrzh");
            return (Criteria) this;
        }

        public Criteria andLrzhNotBetween(String value1, String value2) {
            addCriterion("lrzh not between", value1, value2, "lrzh");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("zt like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("zt not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("zt not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("gxsj is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("gxsj is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(String value) {
            addCriterion("gxsj =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(String value) {
            addCriterion("gxsj <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(String value) {
            addCriterion("gxsj >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(String value) {
            addCriterion("gxsj >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(String value) {
            addCriterion("gxsj <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(String value) {
            addCriterion("gxsj <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLike(String value) {
            addCriterion("gxsj like", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotLike(String value) {
            addCriterion("gxsj not like", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<String> values) {
            addCriterion("gxsj in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<String> values) {
            addCriterion("gxsj not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(String value1, String value2) {
            addCriterion("gxsj between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(String value1, String value2) {
            addCriterion("gxsj not between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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