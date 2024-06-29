package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilGiftCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilGiftCodeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNull() {
            addCriterion("code_name is null");
            return (Criteria) this;
        }

        public Criteria andCodeNameIsNotNull() {
            addCriterion("code_name is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNameEqualTo(String value) {
            addCriterion("code_name =", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotEqualTo(String value) {
            addCriterion("code_name <>", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThan(String value) {
            addCriterion("code_name >", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("code_name >=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThan(String value) {
            addCriterion("code_name <", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLessThanOrEqualTo(String value) {
            addCriterion("code_name <=", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameLike(String value) {
            addCriterion("code_name like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotLike(String value) {
            addCriterion("code_name not like", value, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameIn(List<String> values) {
            addCriterion("code_name in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotIn(List<String> values) {
            addCriterion("code_name not in", values, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameBetween(String value1, String value2) {
            addCriterion("code_name between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNameNotBetween(String value1, String value2) {
            addCriterion("code_name not between", value1, value2, "codeName");
            return (Criteria) this;
        }

        public Criteria andCodeNumIsNull() {
            addCriterion("code_num is null");
            return (Criteria) this;
        }

        public Criteria andCodeNumIsNotNull() {
            addCriterion("code_num is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNumEqualTo(String value) {
            addCriterion("code_num =", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumNotEqualTo(String value) {
            addCriterion("code_num <>", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumGreaterThan(String value) {
            addCriterion("code_num >", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumGreaterThanOrEqualTo(String value) {
            addCriterion("code_num >=", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumLessThan(String value) {
            addCriterion("code_num <", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumLessThanOrEqualTo(String value) {
            addCriterion("code_num <=", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumLike(String value) {
            addCriterion("code_num like", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumNotLike(String value) {
            addCriterion("code_num not like", value, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumIn(List<String> values) {
            addCriterion("code_num in", values, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumNotIn(List<String> values) {
            addCriterion("code_num not in", values, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumBetween(String value1, String value2) {
            addCriterion("code_num between", value1, value2, "codeNum");
            return (Criteria) this;
        }

        public Criteria andCodeNumNotBetween(String value1, String value2) {
            addCriterion("code_num not between", value1, value2, "codeNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumIsNull() {
            addCriterion("reward_gold_num is null");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumIsNotNull() {
            addCriterion("reward_gold_num is not null");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumEqualTo(Integer value) {
            addCriterion("reward_gold_num =", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumNotEqualTo(Integer value) {
            addCriterion("reward_gold_num <>", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumGreaterThan(Integer value) {
            addCriterion("reward_gold_num >", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_gold_num >=", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumLessThan(Integer value) {
            addCriterion("reward_gold_num <", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumLessThanOrEqualTo(Integer value) {
            addCriterion("reward_gold_num <=", value, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumIn(List<Integer> values) {
            addCriterion("reward_gold_num in", values, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumNotIn(List<Integer> values) {
            addCriterion("reward_gold_num not in", values, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumBetween(Integer value1, Integer value2) {
            addCriterion("reward_gold_num between", value1, value2, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardGoldNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_gold_num not between", value1, value2, "rewardGoldNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumIsNull() {
            addCriterion("reward_diamonds_num is null");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumIsNotNull() {
            addCriterion("reward_diamonds_num is not null");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumEqualTo(Integer value) {
            addCriterion("reward_diamonds_num =", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumNotEqualTo(Integer value) {
            addCriterion("reward_diamonds_num <>", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumGreaterThan(Integer value) {
            addCriterion("reward_diamonds_num >", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_diamonds_num >=", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumLessThan(Integer value) {
            addCriterion("reward_diamonds_num <", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumLessThanOrEqualTo(Integer value) {
            addCriterion("reward_diamonds_num <=", value, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumIn(List<Integer> values) {
            addCriterion("reward_diamonds_num in", values, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumNotIn(List<Integer> values) {
            addCriterion("reward_diamonds_num not in", values, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumBetween(Integer value1, Integer value2) {
            addCriterion("reward_diamonds_num between", value1, value2, "rewardDiamondsNum");
            return (Criteria) this;
        }

        public Criteria andRewardDiamondsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_diamonds_num not between", value1, value2, "rewardDiamondsNum");
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