package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilDailyGiftsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilDailyGiftsExample() {
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

        public Criteria andDailyGiftsIdIsNull() {
            addCriterion("daily_gifts_id is null");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdIsNotNull() {
            addCriterion("daily_gifts_id is not null");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdEqualTo(Integer value) {
            addCriterion("daily_gifts_id =", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdNotEqualTo(Integer value) {
            addCriterion("daily_gifts_id <>", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdGreaterThan(Integer value) {
            addCriterion("daily_gifts_id >", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_gifts_id >=", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdLessThan(Integer value) {
            addCriterion("daily_gifts_id <", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdLessThanOrEqualTo(Integer value) {
            addCriterion("daily_gifts_id <=", value, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdIn(List<Integer> values) {
            addCriterion("daily_gifts_id in", values, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdNotIn(List<Integer> values) {
            addCriterion("daily_gifts_id not in", values, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdBetween(Integer value1, Integer value2) {
            addCriterion("daily_gifts_id between", value1, value2, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andDailyGiftsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_gifts_id not between", value1, value2, "dailyGiftsId");
            return (Criteria) this;
        }

        public Criteria andGiftsDayIsNull() {
            addCriterion("gifts_day is null");
            return (Criteria) this;
        }

        public Criteria andGiftsDayIsNotNull() {
            addCriterion("gifts_day is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsDayEqualTo(Integer value) {
            addCriterion("gifts_day =", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayNotEqualTo(Integer value) {
            addCriterion("gifts_day <>", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayGreaterThan(Integer value) {
            addCriterion("gifts_day >", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_day >=", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayLessThan(Integer value) {
            addCriterion("gifts_day <", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_day <=", value, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayIn(List<Integer> values) {
            addCriterion("gifts_day in", values, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayNotIn(List<Integer> values) {
            addCriterion("gifts_day not in", values, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayBetween(Integer value1, Integer value2) {
            addCriterion("gifts_day between", value1, value2, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsDayNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_day not between", value1, value2, "giftsDay");
            return (Criteria) this;
        }

        public Criteria andGiftsNumIsNull() {
            addCriterion("gifts_num is null");
            return (Criteria) this;
        }

        public Criteria andGiftsNumIsNotNull() {
            addCriterion("gifts_num is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsNumEqualTo(Integer value) {
            addCriterion("gifts_num =", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumNotEqualTo(Integer value) {
            addCriterion("gifts_num <>", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumGreaterThan(Integer value) {
            addCriterion("gifts_num >", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gifts_num >=", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumLessThan(Integer value) {
            addCriterion("gifts_num <", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumLessThanOrEqualTo(Integer value) {
            addCriterion("gifts_num <=", value, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumIn(List<Integer> values) {
            addCriterion("gifts_num in", values, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumNotIn(List<Integer> values) {
            addCriterion("gifts_num not in", values, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumBetween(Integer value1, Integer value2) {
            addCriterion("gifts_num between", value1, value2, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("gifts_num not between", value1, value2, "giftsNum");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyIsNull() {
            addCriterion("gifts_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyIsNotNull() {
            addCriterion("gifts_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyEqualTo(Double value) {
            addCriterion("gifts_money =", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyNotEqualTo(Double value) {
            addCriterion("gifts_money <>", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyGreaterThan(Double value) {
            addCriterion("gifts_money >", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("gifts_money >=", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyLessThan(Double value) {
            addCriterion("gifts_money <", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("gifts_money <=", value, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyIn(List<Double> values) {
            addCriterion("gifts_money in", values, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyNotIn(List<Double> values) {
            addCriterion("gifts_money not in", values, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyBetween(Double value1, Double value2) {
            addCriterion("gifts_money between", value1, value2, "giftsMoney");
            return (Criteria) this;
        }

        public Criteria andGiftsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("gifts_money not between", value1, value2, "giftsMoney");
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

        public Criteria andListIosIdIsNull() {
            addCriterion("list_ios_id is null");
            return (Criteria) this;
        }

        public Criteria andListIosIdIsNotNull() {
            addCriterion("list_ios_id is not null");
            return (Criteria) this;
        }

        public Criteria andListIosIdEqualTo(String value) {
            addCriterion("list_ios_id =", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdNotEqualTo(String value) {
            addCriterion("list_ios_id <>", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdGreaterThan(String value) {
            addCriterion("list_ios_id >", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdGreaterThanOrEqualTo(String value) {
            addCriterion("list_ios_id >=", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdLessThan(String value) {
            addCriterion("list_ios_id <", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdLessThanOrEqualTo(String value) {
            addCriterion("list_ios_id <=", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdLike(String value) {
            addCriterion("list_ios_id like", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdNotLike(String value) {
            addCriterion("list_ios_id not like", value, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdIn(List<String> values) {
            addCriterion("list_ios_id in", values, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdNotIn(List<String> values) {
            addCriterion("list_ios_id not in", values, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdBetween(String value1, String value2) {
            addCriterion("list_ios_id between", value1, value2, "listIosId");
            return (Criteria) this;
        }

        public Criteria andListIosIdNotBetween(String value1, String value2) {
            addCriterion("list_ios_id not between", value1, value2, "listIosId");
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