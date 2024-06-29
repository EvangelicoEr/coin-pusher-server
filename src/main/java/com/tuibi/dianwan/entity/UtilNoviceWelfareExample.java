package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilNoviceWelfareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilNoviceWelfareExample() {
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

        public Criteria andNoviceWelfareIdIsNull() {
            addCriterion("novice_welfare_id is null");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdIsNotNull() {
            addCriterion("novice_welfare_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdEqualTo(Integer value) {
            addCriterion("novice_welfare_id =", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdNotEqualTo(Integer value) {
            addCriterion("novice_welfare_id <>", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdGreaterThan(Integer value) {
            addCriterion("novice_welfare_id >", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("novice_welfare_id >=", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdLessThan(Integer value) {
            addCriterion("novice_welfare_id <", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdLessThanOrEqualTo(Integer value) {
            addCriterion("novice_welfare_id <=", value, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdIn(List<Integer> values) {
            addCriterion("novice_welfare_id in", values, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdNotIn(List<Integer> values) {
            addCriterion("novice_welfare_id not in", values, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdBetween(Integer value1, Integer value2) {
            addCriterion("novice_welfare_id between", value1, value2, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andNoviceWelfareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("novice_welfare_id not between", value1, value2, "noviceWelfareId");
            return (Criteria) this;
        }

        public Criteria andWelfareNameIsNull() {
            addCriterion("welfare_name is null");
            return (Criteria) this;
        }

        public Criteria andWelfareNameIsNotNull() {
            addCriterion("welfare_name is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareNameEqualTo(String value) {
            addCriterion("welfare_name =", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameNotEqualTo(String value) {
            addCriterion("welfare_name <>", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameGreaterThan(String value) {
            addCriterion("welfare_name >", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameGreaterThanOrEqualTo(String value) {
            addCriterion("welfare_name >=", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameLessThan(String value) {
            addCriterion("welfare_name <", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameLessThanOrEqualTo(String value) {
            addCriterion("welfare_name <=", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameLike(String value) {
            addCriterion("welfare_name like", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameNotLike(String value) {
            addCriterion("welfare_name not like", value, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameIn(List<String> values) {
            addCriterion("welfare_name in", values, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameNotIn(List<String> values) {
            addCriterion("welfare_name not in", values, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameBetween(String value1, String value2) {
            addCriterion("welfare_name between", value1, value2, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareNameNotBetween(String value1, String value2) {
            addCriterion("welfare_name not between", value1, value2, "welfareName");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyIsNull() {
            addCriterion("welfare_money is null");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyIsNotNull() {
            addCriterion("welfare_money is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyEqualTo(Double value) {
            addCriterion("welfare_money =", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyNotEqualTo(Double value) {
            addCriterion("welfare_money <>", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyGreaterThan(Double value) {
            addCriterion("welfare_money >", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("welfare_money >=", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyLessThan(Double value) {
            addCriterion("welfare_money <", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyLessThanOrEqualTo(Double value) {
            addCriterion("welfare_money <=", value, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyIn(List<Double> values) {
            addCriterion("welfare_money in", values, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyNotIn(List<Double> values) {
            addCriterion("welfare_money not in", values, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyBetween(Double value1, Double value2) {
            addCriterion("welfare_money between", value1, value2, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareMoneyNotBetween(Double value1, Double value2) {
            addCriterion("welfare_money not between", value1, value2, "welfareMoney");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeIsNull() {
            addCriterion("welfare_type is null");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeIsNotNull() {
            addCriterion("welfare_type is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeEqualTo(Integer value) {
            addCriterion("welfare_type =", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeNotEqualTo(Integer value) {
            addCriterion("welfare_type <>", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeGreaterThan(Integer value) {
            addCriterion("welfare_type >", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("welfare_type >=", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeLessThan(Integer value) {
            addCriterion("welfare_type <", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeLessThanOrEqualTo(Integer value) {
            addCriterion("welfare_type <=", value, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeIn(List<Integer> values) {
            addCriterion("welfare_type in", values, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeNotIn(List<Integer> values) {
            addCriterion("welfare_type not in", values, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeBetween(Integer value1, Integer value2) {
            addCriterion("welfare_type between", value1, value2, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("welfare_type not between", value1, value2, "welfareType");
            return (Criteria) this;
        }

        public Criteria andWelfareNumIsNull() {
            addCriterion("welfare_num is null");
            return (Criteria) this;
        }

        public Criteria andWelfareNumIsNotNull() {
            addCriterion("welfare_num is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareNumEqualTo(Integer value) {
            addCriterion("welfare_num =", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumNotEqualTo(Integer value) {
            addCriterion("welfare_num <>", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumGreaterThan(Integer value) {
            addCriterion("welfare_num >", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("welfare_num >=", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumLessThan(Integer value) {
            addCriterion("welfare_num <", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumLessThanOrEqualTo(Integer value) {
            addCriterion("welfare_num <=", value, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumIn(List<Integer> values) {
            addCriterion("welfare_num in", values, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumNotIn(List<Integer> values) {
            addCriterion("welfare_num not in", values, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumBetween(Integer value1, Integer value2) {
            addCriterion("welfare_num between", value1, value2, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareNumNotBetween(Integer value1, Integer value2) {
            addCriterion("welfare_num not between", value1, value2, "welfareNum");
            return (Criteria) this;
        }

        public Criteria andWelfareSortIsNull() {
            addCriterion("welfare_sort is null");
            return (Criteria) this;
        }

        public Criteria andWelfareSortIsNotNull() {
            addCriterion("welfare_sort is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareSortEqualTo(Integer value) {
            addCriterion("welfare_sort =", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortNotEqualTo(Integer value) {
            addCriterion("welfare_sort <>", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortGreaterThan(Integer value) {
            addCriterion("welfare_sort >", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("welfare_sort >=", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortLessThan(Integer value) {
            addCriterion("welfare_sort <", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortLessThanOrEqualTo(Integer value) {
            addCriterion("welfare_sort <=", value, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortIn(List<Integer> values) {
            addCriterion("welfare_sort in", values, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortNotIn(List<Integer> values) {
            addCriterion("welfare_sort not in", values, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortBetween(Integer value1, Integer value2) {
            addCriterion("welfare_sort between", value1, value2, "welfareSort");
            return (Criteria) this;
        }

        public Criteria andWelfareSortNotBetween(Integer value1, Integer value2) {
            addCriterion("welfare_sort not between", value1, value2, "welfareSort");
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

        public Criteria andNowMoneyIsNull() {
            addCriterion("now_money is null");
            return (Criteria) this;
        }

        public Criteria andNowMoneyIsNotNull() {
            addCriterion("now_money is not null");
            return (Criteria) this;
        }

        public Criteria andNowMoneyEqualTo(Integer value) {
            addCriterion("now_money =", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyNotEqualTo(Integer value) {
            addCriterion("now_money <>", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyGreaterThan(Integer value) {
            addCriterion("now_money >", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_money >=", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyLessThan(Integer value) {
            addCriterion("now_money <", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("now_money <=", value, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyIn(List<Integer> values) {
            addCriterion("now_money in", values, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyNotIn(List<Integer> values) {
            addCriterion("now_money not in", values, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyBetween(Integer value1, Integer value2) {
            addCriterion("now_money between", value1, value2, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andNowMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("now_money not between", value1, value2, "nowMoney");
            return (Criteria) this;
        }

        public Criteria andDayNumIsNull() {
            addCriterion("day_num is null");
            return (Criteria) this;
        }

        public Criteria andDayNumIsNotNull() {
            addCriterion("day_num is not null");
            return (Criteria) this;
        }

        public Criteria andDayNumEqualTo(Integer value) {
            addCriterion("day_num =", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumNotEqualTo(Integer value) {
            addCriterion("day_num <>", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumGreaterThan(Integer value) {
            addCriterion("day_num >", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_num >=", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumLessThan(Integer value) {
            addCriterion("day_num <", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumLessThanOrEqualTo(Integer value) {
            addCriterion("day_num <=", value, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumIn(List<Integer> values) {
            addCriterion("day_num in", values, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumNotIn(List<Integer> values) {
            addCriterion("day_num not in", values, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumBetween(Integer value1, Integer value2) {
            addCriterion("day_num between", value1, value2, "dayNum");
            return (Criteria) this;
        }

        public Criteria andDayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("day_num not between", value1, value2, "dayNum");
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