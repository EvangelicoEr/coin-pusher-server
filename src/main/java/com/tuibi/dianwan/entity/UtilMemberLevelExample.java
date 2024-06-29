package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilMemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilMemberLevelExample() {
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

        public Criteria andMemberLevelIdIsNull() {
            addCriterion("member_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIsNotNull() {
            addCriterion("member_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdEqualTo(Integer value) {
            addCriterion("member_level_id =", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotEqualTo(Integer value) {
            addCriterion("member_level_id <>", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThan(Integer value) {
            addCriterion("member_level_id >", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_id >=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThan(Integer value) {
            addCriterion("member_level_id <", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_id <=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIn(List<Integer> values) {
            addCriterion("member_level_id in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotIn(List<Integer> values) {
            addCriterion("member_level_id not in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("member_level_id between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_id not between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoIsNull() {
            addCriterion("member_level_logo is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoIsNotNull() {
            addCriterion("member_level_logo is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoEqualTo(String value) {
            addCriterion("member_level_logo =", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoNotEqualTo(String value) {
            addCriterion("member_level_logo <>", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoGreaterThan(String value) {
            addCriterion("member_level_logo >", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_logo >=", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoLessThan(String value) {
            addCriterion("member_level_logo <", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoLessThanOrEqualTo(String value) {
            addCriterion("member_level_logo <=", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoLike(String value) {
            addCriterion("member_level_logo like", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoNotLike(String value) {
            addCriterion("member_level_logo not like", value, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoIn(List<String> values) {
            addCriterion("member_level_logo in", values, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoNotIn(List<String> values) {
            addCriterion("member_level_logo not in", values, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoBetween(String value1, String value2) {
            addCriterion("member_level_logo between", value1, value2, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLogoNotBetween(String value1, String value2) {
            addCriterion("member_level_logo not between", value1, value2, "memberLevelLogo");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNull() {
            addCriterion("member_level_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNotNull() {
            addCriterion("member_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameEqualTo(String value) {
            addCriterion("member_level_name =", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotEqualTo(String value) {
            addCriterion("member_level_name <>", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThan(String value) {
            addCriterion("member_level_name >", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_name >=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThan(String value) {
            addCriterion("member_level_name <", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThanOrEqualTo(String value) {
            addCriterion("member_level_name <=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLike(String value) {
            addCriterion("member_level_name like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotLike(String value) {
            addCriterion("member_level_name not like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIn(List<String> values) {
            addCriterion("member_level_name in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotIn(List<String> values) {
            addCriterion("member_level_name not in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameBetween(String value1, String value2) {
            addCriterion("member_level_name between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotBetween(String value1, String value2) {
            addCriterion("member_level_name not between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumIsNull() {
            addCriterion("member_level_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumIsNotNull() {
            addCriterion("member_level_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumEqualTo(Integer value) {
            addCriterion("member_level_num =", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumNotEqualTo(Integer value) {
            addCriterion("member_level_num <>", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumGreaterThan(Integer value) {
            addCriterion("member_level_num >", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_num >=", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumLessThan(Integer value) {
            addCriterion("member_level_num <", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_num <=", value, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumIn(List<Integer> values) {
            addCriterion("member_level_num in", values, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumNotIn(List<Integer> values) {
            addCriterion("member_level_num not in", values, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumBetween(Integer value1, Integer value2) {
            addCriterion("member_level_num between", value1, value2, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_num not between", value1, value2, "memberLevelNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyIsNull() {
            addCriterion("member_level_money is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyIsNotNull() {
            addCriterion("member_level_money is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyEqualTo(Integer value) {
            addCriterion("member_level_money =", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyNotEqualTo(Integer value) {
            addCriterion("member_level_money <>", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyGreaterThan(Integer value) {
            addCriterion("member_level_money >", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_money >=", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyLessThan(Integer value) {
            addCriterion("member_level_money <", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_money <=", value, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyIn(List<Integer> values) {
            addCriterion("member_level_money in", values, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyNotIn(List<Integer> values) {
            addCriterion("member_level_money not in", values, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyBetween(Integer value1, Integer value2) {
            addCriterion("member_level_money between", value1, value2, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberLevelMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_money not between", value1, value2, "memberLevelMoney");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumIsNull() {
            addCriterion("member_reward_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumIsNotNull() {
            addCriterion("member_reward_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumEqualTo(Integer value) {
            addCriterion("member_reward_num =", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumNotEqualTo(Integer value) {
            addCriterion("member_reward_num <>", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumGreaterThan(Integer value) {
            addCriterion("member_reward_num >", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_reward_num >=", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumLessThan(Integer value) {
            addCriterion("member_reward_num <", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumLessThanOrEqualTo(Integer value) {
            addCriterion("member_reward_num <=", value, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumIn(List<Integer> values) {
            addCriterion("member_reward_num in", values, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumNotIn(List<Integer> values) {
            addCriterion("member_reward_num not in", values, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumBetween(Integer value1, Integer value2) {
            addCriterion("member_reward_num between", value1, value2, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberRewardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("member_reward_num not between", value1, value2, "memberRewardNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumIsNull() {
            addCriterion("recharge_gift_num is null");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumIsNotNull() {
            addCriterion("recharge_gift_num is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumEqualTo(Double value) {
            addCriterion("recharge_gift_num =", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumNotEqualTo(Double value) {
            addCriterion("recharge_gift_num <>", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumGreaterThan(Double value) {
            addCriterion("recharge_gift_num >", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_gift_num >=", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumLessThan(Double value) {
            addCriterion("recharge_gift_num <", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumLessThanOrEqualTo(Double value) {
            addCriterion("recharge_gift_num <=", value, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumIn(List<Double> values) {
            addCriterion("recharge_gift_num in", values, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumNotIn(List<Double> values) {
            addCriterion("recharge_gift_num not in", values, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumBetween(Double value1, Double value2) {
            addCriterion("recharge_gift_num between", value1, value2, "rechargeGiftNum");
            return (Criteria) this;
        }

        public Criteria andRechargeGiftNumNotBetween(Double value1, Double value2) {
            addCriterion("recharge_gift_num not between", value1, value2, "rechargeGiftNum");
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

        public Criteria andZtEqualTo(Integer value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(Integer value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(Integer value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(Integer value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(Integer value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<Integer> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<Integer> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(Integer value1, Integer value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMemberExtraIsNull() {
            addCriterion("member_extra is null");
            return (Criteria) this;
        }

        public Criteria andMemberExtraIsNotNull() {
            addCriterion("member_extra is not null");
            return (Criteria) this;
        }

        public Criteria andMemberExtraEqualTo(String value) {
            addCriterion("member_extra =", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraNotEqualTo(String value) {
            addCriterion("member_extra <>", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraGreaterThan(String value) {
            addCriterion("member_extra >", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraGreaterThanOrEqualTo(String value) {
            addCriterion("member_extra >=", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraLessThan(String value) {
            addCriterion("member_extra <", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraLessThanOrEqualTo(String value) {
            addCriterion("member_extra <=", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraLike(String value) {
            addCriterion("member_extra like", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraNotLike(String value) {
            addCriterion("member_extra not like", value, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraIn(List<String> values) {
            addCriterion("member_extra in", values, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraNotIn(List<String> values) {
            addCriterion("member_extra not in", values, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraBetween(String value1, String value2) {
            addCriterion("member_extra between", value1, value2, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberExtraNotBetween(String value1, String value2) {
            addCriterion("member_extra not between", value1, value2, "memberExtra");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenIsNull() {
            addCriterion("member_quicken is null");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenIsNotNull() {
            addCriterion("member_quicken is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenEqualTo(String value) {
            addCriterion("member_quicken =", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenNotEqualTo(String value) {
            addCriterion("member_quicken <>", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenGreaterThan(String value) {
            addCriterion("member_quicken >", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenGreaterThanOrEqualTo(String value) {
            addCriterion("member_quicken >=", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenLessThan(String value) {
            addCriterion("member_quicken <", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenLessThanOrEqualTo(String value) {
            addCriterion("member_quicken <=", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenLike(String value) {
            addCriterion("member_quicken like", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenNotLike(String value) {
            addCriterion("member_quicken not like", value, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenIn(List<String> values) {
            addCriterion("member_quicken in", values, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenNotIn(List<String> values) {
            addCriterion("member_quicken not in", values, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenBetween(String value1, String value2) {
            addCriterion("member_quicken between", value1, value2, "memberQuicken");
            return (Criteria) this;
        }

        public Criteria andMemberQuickenNotBetween(String value1, String value2) {
            addCriterion("member_quicken not between", value1, value2, "memberQuicken");
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