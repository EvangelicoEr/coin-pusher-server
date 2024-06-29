package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilSigninCumulativeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilSigninCumulativeExample() {
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

        public Criteria andCumulativeIdIsNull() {
            addCriterion("cumulative_id is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdIsNotNull() {
            addCriterion("cumulative_id is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdEqualTo(Integer value) {
            addCriterion("cumulative_id =", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdNotEqualTo(Integer value) {
            addCriterion("cumulative_id <>", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdGreaterThan(Integer value) {
            addCriterion("cumulative_id >", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_id >=", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdLessThan(Integer value) {
            addCriterion("cumulative_id <", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_id <=", value, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdIn(List<Integer> values) {
            addCriterion("cumulative_id in", values, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdNotIn(List<Integer> values) {
            addCriterion("cumulative_id not in", values, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_id between", value1, value2, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_id not between", value1, value2, "cumulativeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIsNull() {
            addCriterion("cumulative_time is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIsNotNull() {
            addCriterion("cumulative_time is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeEqualTo(Integer value) {
            addCriterion("cumulative_time =", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotEqualTo(Integer value) {
            addCriterion("cumulative_time <>", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeGreaterThan(Integer value) {
            addCriterion("cumulative_time >", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_time >=", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeLessThan(Integer value) {
            addCriterion("cumulative_time <", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_time <=", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIn(List<Integer> values) {
            addCriterion("cumulative_time in", values, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotIn(List<Integer> values) {
            addCriterion("cumulative_time not in", values, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_time between", value1, value2, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_time not between", value1, value2, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIsNull() {
            addCriterion("cumulative_type is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIsNotNull() {
            addCriterion("cumulative_type is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeEqualTo(Integer value) {
            addCriterion("cumulative_type =", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeNotEqualTo(Integer value) {
            addCriterion("cumulative_type <>", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeGreaterThan(Integer value) {
            addCriterion("cumulative_type >", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_type >=", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeLessThan(Integer value) {
            addCriterion("cumulative_type <", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_type <=", value, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIn(List<Integer> values) {
            addCriterion("cumulative_type in", values, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeNotIn(List<Integer> values) {
            addCriterion("cumulative_type not in", values, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_type between", value1, value2, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_type not between", value1, value2, "cumulativeType");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumIsNull() {
            addCriterion("cumulative_num is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumIsNotNull() {
            addCriterion("cumulative_num is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumEqualTo(Integer value) {
            addCriterion("cumulative_num =", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumNotEqualTo(Integer value) {
            addCriterion("cumulative_num <>", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumGreaterThan(Integer value) {
            addCriterion("cumulative_num >", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_num >=", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumLessThan(Integer value) {
            addCriterion("cumulative_num <", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_num <=", value, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumIn(List<Integer> values) {
            addCriterion("cumulative_num in", values, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumNotIn(List<Integer> values) {
            addCriterion("cumulative_num not in", values, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_num between", value1, value2, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_num not between", value1, value2, "cumulativeNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdIsNull() {
            addCriterion("cumulative_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdIsNotNull() {
            addCriterion("cumulative_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdEqualTo(Integer value) {
            addCriterion("cumulative_type_id =", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdNotEqualTo(Integer value) {
            addCriterion("cumulative_type_id <>", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdGreaterThan(Integer value) {
            addCriterion("cumulative_type_id >", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cumulative_type_id >=", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdLessThan(Integer value) {
            addCriterion("cumulative_type_id <", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cumulative_type_id <=", value, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdIn(List<Integer> values) {
            addCriterion("cumulative_type_id in", values, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdNotIn(List<Integer> values) {
            addCriterion("cumulative_type_id not in", values, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_type_id between", value1, value2, "cumulativeTypeId");
            return (Criteria) this;
        }

        public Criteria andCumulativeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cumulative_type_id not between", value1, value2, "cumulativeTypeId");
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