package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserCharterMachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCharterMachineExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUserCostGetIsNull() {
            addCriterion("user_cost_get is null");
            return (Criteria) this;
        }

        public Criteria andUserCostGetIsNotNull() {
            addCriterion("user_cost_get is not null");
            return (Criteria) this;
        }

        public Criteria andUserCostGetEqualTo(Integer value) {
            addCriterion("user_cost_get =", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetNotEqualTo(Integer value) {
            addCriterion("user_cost_get <>", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetGreaterThan(Integer value) {
            addCriterion("user_cost_get >", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_cost_get >=", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetLessThan(Integer value) {
            addCriterion("user_cost_get <", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetLessThanOrEqualTo(Integer value) {
            addCriterion("user_cost_get <=", value, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetIn(List<Integer> values) {
            addCriterion("user_cost_get in", values, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetNotIn(List<Integer> values) {
            addCriterion("user_cost_get not in", values, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetBetween(Integer value1, Integer value2) {
            addCriterion("user_cost_get between", value1, value2, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostGetNotBetween(Integer value1, Integer value2) {
            addCriterion("user_cost_get not between", value1, value2, "userCostGet");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseIsNull() {
            addCriterion("user_cost_lose is null");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseIsNotNull() {
            addCriterion("user_cost_lose is not null");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseEqualTo(Integer value) {
            addCriterion("user_cost_lose =", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseNotEqualTo(Integer value) {
            addCriterion("user_cost_lose <>", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseGreaterThan(Integer value) {
            addCriterion("user_cost_lose >", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_cost_lose >=", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseLessThan(Integer value) {
            addCriterion("user_cost_lose <", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseLessThanOrEqualTo(Integer value) {
            addCriterion("user_cost_lose <=", value, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseIn(List<Integer> values) {
            addCriterion("user_cost_lose in", values, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseNotIn(List<Integer> values) {
            addCriterion("user_cost_lose not in", values, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseBetween(Integer value1, Integer value2) {
            addCriterion("user_cost_lose between", value1, value2, "userCostLose");
            return (Criteria) this;
        }

        public Criteria andUserCostLoseNotBetween(Integer value1, Integer value2) {
            addCriterion("user_cost_lose not between", value1, value2, "userCostLose");
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

        public Criteria andZsjIsNull() {
            addCriterion("zsj is null");
            return (Criteria) this;
        }

        public Criteria andZsjIsNotNull() {
            addCriterion("zsj is not null");
            return (Criteria) this;
        }

        public Criteria andZsjEqualTo(String value) {
            addCriterion("zsj =", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjNotEqualTo(String value) {
            addCriterion("zsj <>", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjGreaterThan(String value) {
            addCriterion("zsj >", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjGreaterThanOrEqualTo(String value) {
            addCriterion("zsj >=", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjLessThan(String value) {
            addCriterion("zsj <", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjLessThanOrEqualTo(String value) {
            addCriterion("zsj <=", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjLike(String value) {
            addCriterion("zsj like", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjNotLike(String value) {
            addCriterion("zsj not like", value, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjIn(List<String> values) {
            addCriterion("zsj in", values, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjNotIn(List<String> values) {
            addCriterion("zsj not in", values, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjBetween(String value1, String value2) {
            addCriterion("zsj between", value1, value2, "zsj");
            return (Criteria) this;
        }

        public Criteria andZsjNotBetween(String value1, String value2) {
            addCriterion("zsj not between", value1, value2, "zsj");
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

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(Integer value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(Integer value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(Integer value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(Integer value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<Integer> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<Integer> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(Integer value1, Integer value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
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

        public Criteria andVoucherTimeIsNull() {
            addCriterion("voucher_time is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeIsNotNull() {
            addCriterion("voucher_time is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeEqualTo(Integer value) {
            addCriterion("voucher_time =", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeNotEqualTo(Integer value) {
            addCriterion("voucher_time <>", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeGreaterThan(Integer value) {
            addCriterion("voucher_time >", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_time >=", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeLessThan(Integer value) {
            addCriterion("voucher_time <", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_time <=", value, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeIn(List<Integer> values) {
            addCriterion("voucher_time in", values, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeNotIn(List<Integer> values) {
            addCriterion("voucher_time not in", values, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeBetween(Integer value1, Integer value2) {
            addCriterion("voucher_time between", value1, value2, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andVoucherTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_time not between", value1, value2, "voucherTime");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIsNull() {
            addCriterion("is_leave is null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIsNotNull() {
            addCriterion("is_leave is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeaveEqualTo(Integer value) {
            addCriterion("is_leave =", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotEqualTo(Integer value) {
            addCriterion("is_leave <>", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThan(Integer value) {
            addCriterion("is_leave >", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_leave >=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThan(Integer value) {
            addCriterion("is_leave <", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveLessThanOrEqualTo(Integer value) {
            addCriterion("is_leave <=", value, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveIn(List<Integer> values) {
            addCriterion("is_leave in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotIn(List<Integer> values) {
            addCriterion("is_leave not in", values, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveBetween(Integer value1, Integer value2) {
            addCriterion("is_leave between", value1, value2, "isLeave");
            return (Criteria) this;
        }

        public Criteria andIsLeaveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_leave not between", value1, value2, "isLeave");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIsNull() {
            addCriterion("machine_group_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIsNotNull() {
            addCriterion("machine_group_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumEqualTo(String value) {
            addCriterion("machine_group_num =", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotEqualTo(String value) {
            addCriterion("machine_group_num <>", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumGreaterThan(String value) {
            addCriterion("machine_group_num >", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumGreaterThanOrEqualTo(String value) {
            addCriterion("machine_group_num >=", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumLessThan(String value) {
            addCriterion("machine_group_num <", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumLessThanOrEqualTo(String value) {
            addCriterion("machine_group_num <=", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumLike(String value) {
            addCriterion("machine_group_num like", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotLike(String value) {
            addCriterion("machine_group_num not like", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIn(List<String> values) {
            addCriterion("machine_group_num in", values, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotIn(List<String> values) {
            addCriterion("machine_group_num not in", values, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumBetween(String value1, String value2) {
            addCriterion("machine_group_num between", value1, value2, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotBetween(String value1, String value2) {
            addCriterion("machine_group_num not between", value1, value2, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdIsNull() {
            addCriterion("machine_log_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdIsNotNull() {
            addCriterion("machine_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdEqualTo(String value) {
            addCriterion("machine_log_id =", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdNotEqualTo(String value) {
            addCriterion("machine_log_id <>", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdGreaterThan(String value) {
            addCriterion("machine_log_id >", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("machine_log_id >=", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdLessThan(String value) {
            addCriterion("machine_log_id <", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdLessThanOrEqualTo(String value) {
            addCriterion("machine_log_id <=", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdLike(String value) {
            addCriterion("machine_log_id like", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdNotLike(String value) {
            addCriterion("machine_log_id not like", value, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdIn(List<String> values) {
            addCriterion("machine_log_id in", values, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdNotIn(List<String> values) {
            addCriterion("machine_log_id not in", values, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdBetween(String value1, String value2) {
            addCriterion("machine_log_id between", value1, value2, "machineLogId");
            return (Criteria) this;
        }

        public Criteria andMachineLogIdNotBetween(String value1, String value2) {
            addCriterion("machine_log_id not between", value1, value2, "machineLogId");
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