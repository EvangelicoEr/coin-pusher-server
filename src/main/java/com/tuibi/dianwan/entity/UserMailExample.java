package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserMailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMailExample() {
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

        public Criteria andMailIdIsNull() {
            addCriterion("mail_id is null");
            return (Criteria) this;
        }

        public Criteria andMailIdIsNotNull() {
            addCriterion("mail_id is not null");
            return (Criteria) this;
        }

        public Criteria andMailIdEqualTo(Long value) {
            addCriterion("mail_id =", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotEqualTo(Long value) {
            addCriterion("mail_id <>", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThan(Long value) {
            addCriterion("mail_id >", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mail_id >=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThan(Long value) {
            addCriterion("mail_id <", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThanOrEqualTo(Long value) {
            addCriterion("mail_id <=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdIn(List<Long> values) {
            addCriterion("mail_id in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotIn(List<Long> values) {
            addCriterion("mail_id not in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdBetween(Long value1, Long value2) {
            addCriterion("mail_id between", value1, value2, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotBetween(Long value1, Long value2) {
            addCriterion("mail_id not between", value1, value2, "mailId");
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

        public Criteria andMailNameIsNull() {
            addCriterion("mail_name is null");
            return (Criteria) this;
        }

        public Criteria andMailNameIsNotNull() {
            addCriterion("mail_name is not null");
            return (Criteria) this;
        }

        public Criteria andMailNameEqualTo(String value) {
            addCriterion("mail_name =", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotEqualTo(String value) {
            addCriterion("mail_name <>", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameGreaterThan(String value) {
            addCriterion("mail_name >", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameGreaterThanOrEqualTo(String value) {
            addCriterion("mail_name >=", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLessThan(String value) {
            addCriterion("mail_name <", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLessThanOrEqualTo(String value) {
            addCriterion("mail_name <=", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLike(String value) {
            addCriterion("mail_name like", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotLike(String value) {
            addCriterion("mail_name not like", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameIn(List<String> values) {
            addCriterion("mail_name in", values, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotIn(List<String> values) {
            addCriterion("mail_name not in", values, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameBetween(String value1, String value2) {
            addCriterion("mail_name between", value1, value2, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotBetween(String value1, String value2) {
            addCriterion("mail_name not between", value1, value2, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailContentIsNull() {
            addCriterion("mail_content is null");
            return (Criteria) this;
        }

        public Criteria andMailContentIsNotNull() {
            addCriterion("mail_content is not null");
            return (Criteria) this;
        }

        public Criteria andMailContentEqualTo(String value) {
            addCriterion("mail_content =", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotEqualTo(String value) {
            addCriterion("mail_content <>", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentGreaterThan(String value) {
            addCriterion("mail_content >", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentGreaterThanOrEqualTo(String value) {
            addCriterion("mail_content >=", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLessThan(String value) {
            addCriterion("mail_content <", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLessThanOrEqualTo(String value) {
            addCriterion("mail_content <=", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentLike(String value) {
            addCriterion("mail_content like", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotLike(String value) {
            addCriterion("mail_content not like", value, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentIn(List<String> values) {
            addCriterion("mail_content in", values, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotIn(List<String> values) {
            addCriterion("mail_content not in", values, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentBetween(String value1, String value2) {
            addCriterion("mail_content between", value1, value2, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailContentNotBetween(String value1, String value2) {
            addCriterion("mail_content not between", value1, value2, "mailContent");
            return (Criteria) this;
        }

        public Criteria andMailCostIsNull() {
            addCriterion("mail_cost is null");
            return (Criteria) this;
        }

        public Criteria andMailCostIsNotNull() {
            addCriterion("mail_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMailCostEqualTo(Integer value) {
            addCriterion("mail_cost =", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostNotEqualTo(Integer value) {
            addCriterion("mail_cost <>", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostGreaterThan(Integer value) {
            addCriterion("mail_cost >", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_cost >=", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostLessThan(Integer value) {
            addCriterion("mail_cost <", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostLessThanOrEqualTo(Integer value) {
            addCriterion("mail_cost <=", value, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostIn(List<Integer> values) {
            addCriterion("mail_cost in", values, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostNotIn(List<Integer> values) {
            addCriterion("mail_cost not in", values, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostBetween(Integer value1, Integer value2) {
            addCriterion("mail_cost between", value1, value2, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailCostNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_cost not between", value1, value2, "mailCost");
            return (Criteria) this;
        }

        public Criteria andMailIntegralIsNull() {
            addCriterion("mail_integral is null");
            return (Criteria) this;
        }

        public Criteria andMailIntegralIsNotNull() {
            addCriterion("mail_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMailIntegralEqualTo(Integer value) {
            addCriterion("mail_integral =", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralNotEqualTo(Integer value) {
            addCriterion("mail_integral <>", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralGreaterThan(Integer value) {
            addCriterion("mail_integral >", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_integral >=", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralLessThan(Integer value) {
            addCriterion("mail_integral <", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("mail_integral <=", value, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralIn(List<Integer> values) {
            addCriterion("mail_integral in", values, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralNotIn(List<Integer> values) {
            addCriterion("mail_integral not in", values, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralBetween(Integer value1, Integer value2) {
            addCriterion("mail_integral between", value1, value2, "mailIntegral");
            return (Criteria) this;
        }

        public Criteria andMailIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_integral not between", value1, value2, "mailIntegral");
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

        public Criteria andLoginTipIsNull() {
            addCriterion("login_tip is null");
            return (Criteria) this;
        }

        public Criteria andLoginTipIsNotNull() {
            addCriterion("login_tip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTipEqualTo(Integer value) {
            addCriterion("login_tip =", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipNotEqualTo(Integer value) {
            addCriterion("login_tip <>", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipGreaterThan(Integer value) {
            addCriterion("login_tip >", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_tip >=", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipLessThan(Integer value) {
            addCriterion("login_tip <", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipLessThanOrEqualTo(Integer value) {
            addCriterion("login_tip <=", value, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipIn(List<Integer> values) {
            addCriterion("login_tip in", values, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipNotIn(List<Integer> values) {
            addCriterion("login_tip not in", values, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipBetween(Integer value1, Integer value2) {
            addCriterion("login_tip between", value1, value2, "loginTip");
            return (Criteria) this;
        }

        public Criteria andLoginTipNotBetween(Integer value1, Integer value2) {
            addCriterion("login_tip not between", value1, value2, "loginTip");
            return (Criteria) this;
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

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Boolean value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Boolean value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Boolean value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Boolean value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Boolean value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Boolean> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Boolean> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Boolean value1, Boolean value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del not between", value1, value2, "del");
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