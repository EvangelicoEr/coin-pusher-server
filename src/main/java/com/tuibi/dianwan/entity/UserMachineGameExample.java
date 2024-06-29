package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserMachineGameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMachineGameExample() {
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

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(String value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(String value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(String value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(String value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(String value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLike(String value) {
            addCriterion("game_id like", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotLike(String value) {
            addCriterion("game_id not like", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<String> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<String> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(String value1, String value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(String value1, String value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
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

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
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

        public Criteria andIsGameIsNull() {
            addCriterion("is_game is null");
            return (Criteria) this;
        }

        public Criteria andIsGameIsNotNull() {
            addCriterion("is_game is not null");
            return (Criteria) this;
        }

        public Criteria andIsGameEqualTo(String value) {
            addCriterion("is_game =", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotEqualTo(String value) {
            addCriterion("is_game <>", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThan(String value) {
            addCriterion("is_game >", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameGreaterThanOrEqualTo(String value) {
            addCriterion("is_game >=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThan(String value) {
            addCriterion("is_game <", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLessThanOrEqualTo(String value) {
            addCriterion("is_game <=", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameLike(String value) {
            addCriterion("is_game like", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotLike(String value) {
            addCriterion("is_game not like", value, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameIn(List<String> values) {
            addCriterion("is_game in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotIn(List<String> values) {
            addCriterion("is_game not in", values, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameBetween(String value1, String value2) {
            addCriterion("is_game between", value1, value2, "isGame");
            return (Criteria) this;
        }

        public Criteria andIsGameNotBetween(String value1, String value2) {
            addCriterion("is_game not between", value1, value2, "isGame");
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

        public Criteria andUserCodeSrcIsNull() {
            addCriterion("user_code_src is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcIsNotNull() {
            addCriterion("user_code_src is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcEqualTo(String value) {
            addCriterion("user_code_src =", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcNotEqualTo(String value) {
            addCriterion("user_code_src <>", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcGreaterThan(String value) {
            addCriterion("user_code_src >", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcGreaterThanOrEqualTo(String value) {
            addCriterion("user_code_src >=", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcLessThan(String value) {
            addCriterion("user_code_src <", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcLessThanOrEqualTo(String value) {
            addCriterion("user_code_src <=", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcLike(String value) {
            addCriterion("user_code_src like", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcNotLike(String value) {
            addCriterion("user_code_src not like", value, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcIn(List<String> values) {
            addCriterion("user_code_src in", values, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcNotIn(List<String> values) {
            addCriterion("user_code_src not in", values, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcBetween(String value1, String value2) {
            addCriterion("user_code_src between", value1, value2, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andUserCodeSrcNotBetween(String value1, String value2) {
            addCriterion("user_code_src not between", value1, value2, "userCodeSrc");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdIsNull() {
            addCriterion("user_cost_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdIsNotNull() {
            addCriterion("user_cost_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdEqualTo(String value) {
            addCriterion("user_cost_log_id =", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdNotEqualTo(String value) {
            addCriterion("user_cost_log_id <>", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdGreaterThan(String value) {
            addCriterion("user_cost_log_id >", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_cost_log_id >=", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdLessThan(String value) {
            addCriterion("user_cost_log_id <", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdLessThanOrEqualTo(String value) {
            addCriterion("user_cost_log_id <=", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdLike(String value) {
            addCriterion("user_cost_log_id like", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdNotLike(String value) {
            addCriterion("user_cost_log_id not like", value, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdIn(List<String> values) {
            addCriterion("user_cost_log_id in", values, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdNotIn(List<String> values) {
            addCriterion("user_cost_log_id not in", values, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdBetween(String value1, String value2) {
            addCriterion("user_cost_log_id between", value1, value2, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andUserCostLogIdNotBetween(String value1, String value2) {
            addCriterion("user_cost_log_id not between", value1, value2, "userCostLogId");
            return (Criteria) this;
        }

        public Criteria andSxsjIsNull() {
            addCriterion("sxsj is null");
            return (Criteria) this;
        }

        public Criteria andSxsjIsNotNull() {
            addCriterion("sxsj is not null");
            return (Criteria) this;
        }

        public Criteria andSxsjEqualTo(String value) {
            addCriterion("sxsj =", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjNotEqualTo(String value) {
            addCriterion("sxsj <>", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjGreaterThan(String value) {
            addCriterion("sxsj >", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjGreaterThanOrEqualTo(String value) {
            addCriterion("sxsj >=", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjLessThan(String value) {
            addCriterion("sxsj <", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjLessThanOrEqualTo(String value) {
            addCriterion("sxsj <=", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjLike(String value) {
            addCriterion("sxsj like", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjNotLike(String value) {
            addCriterion("sxsj not like", value, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjIn(List<String> values) {
            addCriterion("sxsj in", values, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjNotIn(List<String> values) {
            addCriterion("sxsj not in", values, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjBetween(String value1, String value2) {
            addCriterion("sxsj between", value1, value2, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxsjNotBetween(String value1, String value2) {
            addCriterion("sxsj not between", value1, value2, "sxsj");
            return (Criteria) this;
        }

        public Criteria andSxStatusIsNull() {
            addCriterion("sx_status is null");
            return (Criteria) this;
        }

        public Criteria andSxStatusIsNotNull() {
            addCriterion("sx_status is not null");
            return (Criteria) this;
        }

        public Criteria andSxStatusEqualTo(String value) {
            addCriterion("sx_status =", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusNotEqualTo(String value) {
            addCriterion("sx_status <>", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusGreaterThan(String value) {
            addCriterion("sx_status >", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sx_status >=", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusLessThan(String value) {
            addCriterion("sx_status <", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusLessThanOrEqualTo(String value) {
            addCriterion("sx_status <=", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusLike(String value) {
            addCriterion("sx_status like", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusNotLike(String value) {
            addCriterion("sx_status not like", value, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusIn(List<String> values) {
            addCriterion("sx_status in", values, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusNotIn(List<String> values) {
            addCriterion("sx_status not in", values, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusBetween(String value1, String value2) {
            addCriterion("sx_status between", value1, value2, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andSxStatusNotBetween(String value1, String value2) {
            addCriterion("sx_status not between", value1, value2, "sxStatus");
            return (Criteria) this;
        }

        public Criteria andDdrcsjIsNull() {
            addCriterion("ddrcsj is null");
            return (Criteria) this;
        }

        public Criteria andDdrcsjIsNotNull() {
            addCriterion("ddrcsj is not null");
            return (Criteria) this;
        }

        public Criteria andDdrcsjEqualTo(String value) {
            addCriterion("ddrcsj =", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjNotEqualTo(String value) {
            addCriterion("ddrcsj <>", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjGreaterThan(String value) {
            addCriterion("ddrcsj >", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjGreaterThanOrEqualTo(String value) {
            addCriterion("ddrcsj >=", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjLessThan(String value) {
            addCriterion("ddrcsj <", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjLessThanOrEqualTo(String value) {
            addCriterion("ddrcsj <=", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjLike(String value) {
            addCriterion("ddrcsj like", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjNotLike(String value) {
            addCriterion("ddrcsj not like", value, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjIn(List<String> values) {
            addCriterion("ddrcsj in", values, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjNotIn(List<String> values) {
            addCriterion("ddrcsj not in", values, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjBetween(String value1, String value2) {
            addCriterion("ddrcsj between", value1, value2, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andDdrcsjNotBetween(String value1, String value2) {
            addCriterion("ddrcsj not between", value1, value2, "ddrcsj");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("rank not between", value1, value2, "rank");
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