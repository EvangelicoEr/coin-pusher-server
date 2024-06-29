package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SysParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysParamExample() {
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

        public Criteria andPrikeyIdIsNull() {
            addCriterion("prikey_id is null");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdIsNotNull() {
            addCriterion("prikey_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdEqualTo(Integer value) {
            addCriterion("prikey_id =", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdNotEqualTo(Integer value) {
            addCriterion("prikey_id <>", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdGreaterThan(Integer value) {
            addCriterion("prikey_id >", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prikey_id >=", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdLessThan(Integer value) {
            addCriterion("prikey_id <", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdLessThanOrEqualTo(Integer value) {
            addCriterion("prikey_id <=", value, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdIn(List<Integer> values) {
            addCriterion("prikey_id in", values, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdNotIn(List<Integer> values) {
            addCriterion("prikey_id not in", values, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdBetween(Integer value1, Integer value2) {
            addCriterion("prikey_id between", value1, value2, "prikeyId");
            return (Criteria) this;
        }

        public Criteria andPrikeyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prikey_id not between", value1, value2, "prikeyId");
            return (Criteria) this;
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

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNull() {
            addCriterion("param_desc is null");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNotNull() {
            addCriterion("param_desc is not null");
            return (Criteria) this;
        }

        public Criteria andParamDescEqualTo(String value) {
            addCriterion("param_desc =", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotEqualTo(String value) {
            addCriterion("param_desc <>", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThan(String value) {
            addCriterion("param_desc >", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("param_desc >=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThan(String value) {
            addCriterion("param_desc <", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThanOrEqualTo(String value) {
            addCriterion("param_desc <=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLike(String value) {
            addCriterion("param_desc like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotLike(String value) {
            addCriterion("param_desc not like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescIn(List<String> values) {
            addCriterion("param_desc in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotIn(List<String> values) {
            addCriterion("param_desc not in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescBetween(String value1, String value2) {
            addCriterion("param_desc between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotBetween(String value1, String value2) {
            addCriterion("param_desc not between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andVal1IsNull() {
            addCriterion("val1 is null");
            return (Criteria) this;
        }

        public Criteria andVal1IsNotNull() {
            addCriterion("val1 is not null");
            return (Criteria) this;
        }

        public Criteria andVal1EqualTo(Integer value) {
            addCriterion("val1 =", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotEqualTo(Integer value) {
            addCriterion("val1 <>", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThan(Integer value) {
            addCriterion("val1 >", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1GreaterThanOrEqualTo(Integer value) {
            addCriterion("val1 >=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThan(Integer value) {
            addCriterion("val1 <", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1LessThanOrEqualTo(Integer value) {
            addCriterion("val1 <=", value, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1In(List<Integer> values) {
            addCriterion("val1 in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotIn(List<Integer> values) {
            addCriterion("val1 not in", values, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1Between(Integer value1, Integer value2) {
            addCriterion("val1 between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andVal1NotBetween(Integer value1, Integer value2) {
            addCriterion("val1 not between", value1, value2, "val1");
            return (Criteria) this;
        }

        public Criteria andVal2IsNull() {
            addCriterion("val2 is null");
            return (Criteria) this;
        }

        public Criteria andVal2IsNotNull() {
            addCriterion("val2 is not null");
            return (Criteria) this;
        }

        public Criteria andVal2EqualTo(Integer value) {
            addCriterion("val2 =", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotEqualTo(Integer value) {
            addCriterion("val2 <>", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThan(Integer value) {
            addCriterion("val2 >", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2GreaterThanOrEqualTo(Integer value) {
            addCriterion("val2 >=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThan(Integer value) {
            addCriterion("val2 <", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2LessThanOrEqualTo(Integer value) {
            addCriterion("val2 <=", value, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2In(List<Integer> values) {
            addCriterion("val2 in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotIn(List<Integer> values) {
            addCriterion("val2 not in", values, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2Between(Integer value1, Integer value2) {
            addCriterion("val2 between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal2NotBetween(Integer value1, Integer value2) {
            addCriterion("val2 not between", value1, value2, "val2");
            return (Criteria) this;
        }

        public Criteria andVal3IsNull() {
            addCriterion("val3 is null");
            return (Criteria) this;
        }

        public Criteria andVal3IsNotNull() {
            addCriterion("val3 is not null");
            return (Criteria) this;
        }

        public Criteria andVal3EqualTo(Integer value) {
            addCriterion("val3 =", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotEqualTo(Integer value) {
            addCriterion("val3 <>", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThan(Integer value) {
            addCriterion("val3 >", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3GreaterThanOrEqualTo(Integer value) {
            addCriterion("val3 >=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThan(Integer value) {
            addCriterion("val3 <", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3LessThanOrEqualTo(Integer value) {
            addCriterion("val3 <=", value, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3In(List<Integer> values) {
            addCriterion("val3 in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotIn(List<Integer> values) {
            addCriterion("val3 not in", values, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3Between(Integer value1, Integer value2) {
            addCriterion("val3 between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal3NotBetween(Integer value1, Integer value2) {
            addCriterion("val3 not between", value1, value2, "val3");
            return (Criteria) this;
        }

        public Criteria andVal4IsNull() {
            addCriterion("val4 is null");
            return (Criteria) this;
        }

        public Criteria andVal4IsNotNull() {
            addCriterion("val4 is not null");
            return (Criteria) this;
        }

        public Criteria andVal4EqualTo(Integer value) {
            addCriterion("val4 =", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4NotEqualTo(Integer value) {
            addCriterion("val4 <>", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4GreaterThan(Integer value) {
            addCriterion("val4 >", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4GreaterThanOrEqualTo(Integer value) {
            addCriterion("val4 >=", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4LessThan(Integer value) {
            addCriterion("val4 <", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4LessThanOrEqualTo(Integer value) {
            addCriterion("val4 <=", value, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4In(List<Integer> values) {
            addCriterion("val4 in", values, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4NotIn(List<Integer> values) {
            addCriterion("val4 not in", values, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4Between(Integer value1, Integer value2) {
            addCriterion("val4 between", value1, value2, "val4");
            return (Criteria) this;
        }

        public Criteria andVal4NotBetween(Integer value1, Integer value2) {
            addCriterion("val4 not between", value1, value2, "val4");
            return (Criteria) this;
        }

        public Criteria andVal5IsNull() {
            addCriterion("val5 is null");
            return (Criteria) this;
        }

        public Criteria andVal5IsNotNull() {
            addCriterion("val5 is not null");
            return (Criteria) this;
        }

        public Criteria andVal5EqualTo(Integer value) {
            addCriterion("val5 =", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5NotEqualTo(Integer value) {
            addCriterion("val5 <>", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5GreaterThan(Integer value) {
            addCriterion("val5 >", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5GreaterThanOrEqualTo(Integer value) {
            addCriterion("val5 >=", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5LessThan(Integer value) {
            addCriterion("val5 <", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5LessThanOrEqualTo(Integer value) {
            addCriterion("val5 <=", value, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5In(List<Integer> values) {
            addCriterion("val5 in", values, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5NotIn(List<Integer> values) {
            addCriterion("val5 not in", values, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5Between(Integer value1, Integer value2) {
            addCriterion("val5 between", value1, value2, "val5");
            return (Criteria) this;
        }

        public Criteria andVal5NotBetween(Integer value1, Integer value2) {
            addCriterion("val5 not between", value1, value2, "val5");
            return (Criteria) this;
        }

        public Criteria andVal6IsNull() {
            addCriterion("val6 is null");
            return (Criteria) this;
        }

        public Criteria andVal6IsNotNull() {
            addCriterion("val6 is not null");
            return (Criteria) this;
        }

        public Criteria andVal6EqualTo(Integer value) {
            addCriterion("val6 =", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6NotEqualTo(Integer value) {
            addCriterion("val6 <>", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6GreaterThan(Integer value) {
            addCriterion("val6 >", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6GreaterThanOrEqualTo(Integer value) {
            addCriterion("val6 >=", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6LessThan(Integer value) {
            addCriterion("val6 <", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6LessThanOrEqualTo(Integer value) {
            addCriterion("val6 <=", value, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6In(List<Integer> values) {
            addCriterion("val6 in", values, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6NotIn(List<Integer> values) {
            addCriterion("val6 not in", values, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6Between(Integer value1, Integer value2) {
            addCriterion("val6 between", value1, value2, "val6");
            return (Criteria) this;
        }

        public Criteria andVal6NotBetween(Integer value1, Integer value2) {
            addCriterion("val6 not between", value1, value2, "val6");
            return (Criteria) this;
        }

        public Criteria andStr1IsNull() {
            addCriterion("str1 is null");
            return (Criteria) this;
        }

        public Criteria andStr1IsNotNull() {
            addCriterion("str1 is not null");
            return (Criteria) this;
        }

        public Criteria andStr1EqualTo(String value) {
            addCriterion("str1 =", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotEqualTo(String value) {
            addCriterion("str1 <>", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1GreaterThan(String value) {
            addCriterion("str1 >", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1GreaterThanOrEqualTo(String value) {
            addCriterion("str1 >=", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1LessThan(String value) {
            addCriterion("str1 <", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1LessThanOrEqualTo(String value) {
            addCriterion("str1 <=", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1Like(String value) {
            addCriterion("str1 like", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotLike(String value) {
            addCriterion("str1 not like", value, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1In(List<String> values) {
            addCriterion("str1 in", values, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotIn(List<String> values) {
            addCriterion("str1 not in", values, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1Between(String value1, String value2) {
            addCriterion("str1 between", value1, value2, "str1");
            return (Criteria) this;
        }

        public Criteria andStr1NotBetween(String value1, String value2) {
            addCriterion("str1 not between", value1, value2, "str1");
            return (Criteria) this;
        }

        public Criteria andStr2IsNull() {
            addCriterion("str2 is null");
            return (Criteria) this;
        }

        public Criteria andStr2IsNotNull() {
            addCriterion("str2 is not null");
            return (Criteria) this;
        }

        public Criteria andStr2EqualTo(String value) {
            addCriterion("str2 =", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotEqualTo(String value) {
            addCriterion("str2 <>", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2GreaterThan(String value) {
            addCriterion("str2 >", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2GreaterThanOrEqualTo(String value) {
            addCriterion("str2 >=", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2LessThan(String value) {
            addCriterion("str2 <", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2LessThanOrEqualTo(String value) {
            addCriterion("str2 <=", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2Like(String value) {
            addCriterion("str2 like", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotLike(String value) {
            addCriterion("str2 not like", value, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2In(List<String> values) {
            addCriterion("str2 in", values, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotIn(List<String> values) {
            addCriterion("str2 not in", values, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2Between(String value1, String value2) {
            addCriterion("str2 between", value1, value2, "str2");
            return (Criteria) this;
        }

        public Criteria andStr2NotBetween(String value1, String value2) {
            addCriterion("str2 not between", value1, value2, "str2");
            return (Criteria) this;
        }

        public Criteria andStr3IsNull() {
            addCriterion("str3 is null");
            return (Criteria) this;
        }

        public Criteria andStr3IsNotNull() {
            addCriterion("str3 is not null");
            return (Criteria) this;
        }

        public Criteria andStr3EqualTo(String value) {
            addCriterion("str3 =", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3NotEqualTo(String value) {
            addCriterion("str3 <>", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3GreaterThan(String value) {
            addCriterion("str3 >", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3GreaterThanOrEqualTo(String value) {
            addCriterion("str3 >=", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3LessThan(String value) {
            addCriterion("str3 <", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3LessThanOrEqualTo(String value) {
            addCriterion("str3 <=", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3Like(String value) {
            addCriterion("str3 like", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3NotLike(String value) {
            addCriterion("str3 not like", value, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3In(List<String> values) {
            addCriterion("str3 in", values, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3NotIn(List<String> values) {
            addCriterion("str3 not in", values, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3Between(String value1, String value2) {
            addCriterion("str3 between", value1, value2, "str3");
            return (Criteria) this;
        }

        public Criteria andStr3NotBetween(String value1, String value2) {
            addCriterion("str3 not between", value1, value2, "str3");
            return (Criteria) this;
        }

        public Criteria andStr4IsNull() {
            addCriterion("str4 is null");
            return (Criteria) this;
        }

        public Criteria andStr4IsNotNull() {
            addCriterion("str4 is not null");
            return (Criteria) this;
        }

        public Criteria andStr4EqualTo(String value) {
            addCriterion("str4 =", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4NotEqualTo(String value) {
            addCriterion("str4 <>", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4GreaterThan(String value) {
            addCriterion("str4 >", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4GreaterThanOrEqualTo(String value) {
            addCriterion("str4 >=", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4LessThan(String value) {
            addCriterion("str4 <", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4LessThanOrEqualTo(String value) {
            addCriterion("str4 <=", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4Like(String value) {
            addCriterion("str4 like", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4NotLike(String value) {
            addCriterion("str4 not like", value, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4In(List<String> values) {
            addCriterion("str4 in", values, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4NotIn(List<String> values) {
            addCriterion("str4 not in", values, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4Between(String value1, String value2) {
            addCriterion("str4 between", value1, value2, "str4");
            return (Criteria) this;
        }

        public Criteria andStr4NotBetween(String value1, String value2) {
            addCriterion("str4 not between", value1, value2, "str4");
            return (Criteria) this;
        }

        public Criteria andSendClientIsNull() {
            addCriterion("send_client is null");
            return (Criteria) this;
        }

        public Criteria andSendClientIsNotNull() {
            addCriterion("send_client is not null");
            return (Criteria) this;
        }

        public Criteria andSendClientEqualTo(Integer value) {
            addCriterion("send_client =", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientNotEqualTo(Integer value) {
            addCriterion("send_client <>", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientGreaterThan(Integer value) {
            addCriterion("send_client >", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_client >=", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientLessThan(Integer value) {
            addCriterion("send_client <", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientLessThanOrEqualTo(Integer value) {
            addCriterion("send_client <=", value, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientIn(List<Integer> values) {
            addCriterion("send_client in", values, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientNotIn(List<Integer> values) {
            addCriterion("send_client not in", values, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientBetween(Integer value1, Integer value2) {
            addCriterion("send_client between", value1, value2, "sendClient");
            return (Criteria) this;
        }

        public Criteria andSendClientNotBetween(Integer value1, Integer value2) {
            addCriterion("send_client not between", value1, value2, "sendClient");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(LocalDateTime value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(LocalDateTime value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(LocalDateTime value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(LocalDateTime value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<LocalDateTime> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<LocalDateTime> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
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