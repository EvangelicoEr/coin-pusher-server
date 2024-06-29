package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilCardVoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilCardVoucherExample() {
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

        public Criteria andVoucherIdIsNull() {
            addCriterion("voucher_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("voucher_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(Integer value) {
            addCriterion("voucher_id =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(Integer value) {
            addCriterion("voucher_id <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(Integer value) {
            addCriterion("voucher_id >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_id >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(Integer value) {
            addCriterion("voucher_id <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_id <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<Integer> values) {
            addCriterion("voucher_id in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<Integer> values) {
            addCriterion("voucher_id not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(Integer value1, Integer value2) {
            addCriterion("voucher_id between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_id not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNull() {
            addCriterion("voucher_type is null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIsNotNull() {
            addCriterion("voucher_type is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeEqualTo(Integer value) {
            addCriterion("voucher_type =", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotEqualTo(Integer value) {
            addCriterion("voucher_type <>", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThan(Integer value) {
            addCriterion("voucher_type >", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_type >=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThan(Integer value) {
            addCriterion("voucher_type <", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_type <=", value, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeIn(List<Integer> values) {
            addCriterion("voucher_type in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotIn(List<Integer> values) {
            addCriterion("voucher_type not in", values, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeBetween(Integer value1, Integer value2) {
            addCriterion("voucher_type between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_type not between", value1, value2, "voucherType");
            return (Criteria) this;
        }

        public Criteria andVoucherNameIsNull() {
            addCriterion("voucher_name is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNameIsNotNull() {
            addCriterion("voucher_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNameEqualTo(String value) {
            addCriterion("voucher_name =", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameNotEqualTo(String value) {
            addCriterion("voucher_name <>", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameGreaterThan(String value) {
            addCriterion("voucher_name >", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_name >=", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameLessThan(String value) {
            addCriterion("voucher_name <", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameLessThanOrEqualTo(String value) {
            addCriterion("voucher_name <=", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameLike(String value) {
            addCriterion("voucher_name like", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameNotLike(String value) {
            addCriterion("voucher_name not like", value, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameIn(List<String> values) {
            addCriterion("voucher_name in", values, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameNotIn(List<String> values) {
            addCriterion("voucher_name not in", values, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameBetween(String value1, String value2) {
            addCriterion("voucher_name between", value1, value2, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherNameNotBetween(String value1, String value2) {
            addCriterion("voucher_name not between", value1, value2, "voucherName");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainIsNull() {
            addCriterion("voucher_explain is null");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainIsNotNull() {
            addCriterion("voucher_explain is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainEqualTo(String value) {
            addCriterion("voucher_explain =", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainNotEqualTo(String value) {
            addCriterion("voucher_explain <>", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainGreaterThan(String value) {
            addCriterion("voucher_explain >", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_explain >=", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainLessThan(String value) {
            addCriterion("voucher_explain <", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainLessThanOrEqualTo(String value) {
            addCriterion("voucher_explain <=", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainLike(String value) {
            addCriterion("voucher_explain like", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainNotLike(String value) {
            addCriterion("voucher_explain not like", value, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainIn(List<String> values) {
            addCriterion("voucher_explain in", values, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainNotIn(List<String> values) {
            addCriterion("voucher_explain not in", values, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainBetween(String value1, String value2) {
            addCriterion("voucher_explain between", value1, value2, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherExplainNotBetween(String value1, String value2) {
            addCriterion("voucher_explain not between", value1, value2, "voucherExplain");
            return (Criteria) this;
        }

        public Criteria andVoucherNumIsNull() {
            addCriterion("voucher_num is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumIsNotNull() {
            addCriterion("voucher_num is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumEqualTo(Integer value) {
            addCriterion("voucher_num =", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumNotEqualTo(Integer value) {
            addCriterion("voucher_num <>", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumGreaterThan(Integer value) {
            addCriterion("voucher_num >", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("voucher_num >=", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumLessThan(Integer value) {
            addCriterion("voucher_num <", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumLessThanOrEqualTo(Integer value) {
            addCriterion("voucher_num <=", value, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumIn(List<Integer> values) {
            addCriterion("voucher_num in", values, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumNotIn(List<Integer> values) {
            addCriterion("voucher_num not in", values, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumBetween(Integer value1, Integer value2) {
            addCriterion("voucher_num between", value1, value2, "voucherNum");
            return (Criteria) this;
        }

        public Criteria andVoucherNumNotBetween(Integer value1, Integer value2) {
            addCriterion("voucher_num not between", value1, value2, "voucherNum");
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