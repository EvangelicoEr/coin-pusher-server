package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCharterMachineLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCharterMachineLogExample() {
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
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(String value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(String value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(String value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(String value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(String value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(String value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLike(String value) {
            addCriterion("machine_id like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotLike(String value) {
            addCriterion("machine_id not like", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<String> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<String> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(String value1, String value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(String value1, String value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andSrcNumIsNull() {
            addCriterion("src_num is null");
            return (Criteria) this;
        }

        public Criteria andSrcNumIsNotNull() {
            addCriterion("src_num is not null");
            return (Criteria) this;
        }

        public Criteria andSrcNumEqualTo(Integer value) {
            addCriterion("src_num =", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumNotEqualTo(Integer value) {
            addCriterion("src_num <>", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumGreaterThan(Integer value) {
            addCriterion("src_num >", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_num >=", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumLessThan(Integer value) {
            addCriterion("src_num <", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumLessThanOrEqualTo(Integer value) {
            addCriterion("src_num <=", value, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumIn(List<Integer> values) {
            addCriterion("src_num in", values, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumNotIn(List<Integer> values) {
            addCriterion("src_num not in", values, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumBetween(Integer value1, Integer value2) {
            addCriterion("src_num between", value1, value2, "srcNum");
            return (Criteria) this;
        }

        public Criteria andSrcNumNotBetween(Integer value1, Integer value2) {
            addCriterion("src_num not between", value1, value2, "srcNum");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andIsGrandIsNull() {
            addCriterion("is_grand is null");
            return (Criteria) this;
        }

        public Criteria andIsGrandIsNotNull() {
            addCriterion("is_grand is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrandEqualTo(Integer value) {
            addCriterion("is_grand =", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandNotEqualTo(Integer value) {
            addCriterion("is_grand <>", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandGreaterThan(Integer value) {
            addCriterion("is_grand >", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_grand >=", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandLessThan(Integer value) {
            addCriterion("is_grand <", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandLessThanOrEqualTo(Integer value) {
            addCriterion("is_grand <=", value, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandIn(List<Integer> values) {
            addCriterion("is_grand in", values, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandNotIn(List<Integer> values) {
            addCriterion("is_grand not in", values, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandBetween(Integer value1, Integer value2) {
            addCriterion("is_grand between", value1, value2, "isGrand");
            return (Criteria) this;
        }

        public Criteria andIsGrandNotBetween(Integer value1, Integer value2) {
            addCriterion("is_grand not between", value1, value2, "isGrand");
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

        public Criteria andSrcCostIsNull() {
            addCriterion("src_cost is null");
            return (Criteria) this;
        }

        public Criteria andSrcCostIsNotNull() {
            addCriterion("src_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSrcCostEqualTo(Integer value) {
            addCriterion("src_cost =", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostNotEqualTo(Integer value) {
            addCriterion("src_cost <>", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostGreaterThan(Integer value) {
            addCriterion("src_cost >", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_cost >=", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostLessThan(Integer value) {
            addCriterion("src_cost <", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostLessThanOrEqualTo(Integer value) {
            addCriterion("src_cost <=", value, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostIn(List<Integer> values) {
            addCriterion("src_cost in", values, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostNotIn(List<Integer> values) {
            addCriterion("src_cost not in", values, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostBetween(Integer value1, Integer value2) {
            addCriterion("src_cost between", value1, value2, "srcCost");
            return (Criteria) this;
        }

        public Criteria andSrcCostNotBetween(Integer value1, Integer value2) {
            addCriterion("src_cost not between", value1, value2, "srcCost");
            return (Criteria) this;
        }

        public Criteria andDesCostIsNull() {
            addCriterion("des_cost is null");
            return (Criteria) this;
        }

        public Criteria andDesCostIsNotNull() {
            addCriterion("des_cost is not null");
            return (Criteria) this;
        }

        public Criteria andDesCostEqualTo(Integer value) {
            addCriterion("des_cost =", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostNotEqualTo(Integer value) {
            addCriterion("des_cost <>", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostGreaterThan(Integer value) {
            addCriterion("des_cost >", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_cost >=", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostLessThan(Integer value) {
            addCriterion("des_cost <", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostLessThanOrEqualTo(Integer value) {
            addCriterion("des_cost <=", value, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostIn(List<Integer> values) {
            addCriterion("des_cost in", values, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostNotIn(List<Integer> values) {
            addCriterion("des_cost not in", values, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostBetween(Integer value1, Integer value2) {
            addCriterion("des_cost between", value1, value2, "desCost");
            return (Criteria) this;
        }

        public Criteria andDesCostNotBetween(Integer value1, Integer value2) {
            addCriterion("des_cost not between", value1, value2, "desCost");
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