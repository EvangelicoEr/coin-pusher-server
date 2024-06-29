package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineGroupExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIsNull() {
            addCriterion("group_order is null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIsNotNull() {
            addCriterion("group_order is not null");
            return (Criteria) this;
        }

        public Criteria andGroupOrderEqualTo(Integer value) {
            addCriterion("group_order =", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderNotEqualTo(Integer value) {
            addCriterion("group_order <>", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderGreaterThan(Integer value) {
            addCriterion("group_order >", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_order >=", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderLessThan(Integer value) {
            addCriterion("group_order <", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderLessThanOrEqualTo(Integer value) {
            addCriterion("group_order <=", value, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderIn(List<Integer> values) {
            addCriterion("group_order in", values, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderNotIn(List<Integer> values) {
            addCriterion("group_order not in", values, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderBetween(Integer value1, Integer value2) {
            addCriterion("group_order between", value1, value2, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("group_order not between", value1, value2, "groupOrder");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIsNull() {
            addCriterion("group_logo is null");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIsNotNull() {
            addCriterion("group_logo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupLogoEqualTo(String value) {
            addCriterion("group_logo =", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotEqualTo(String value) {
            addCriterion("group_logo <>", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoGreaterThan(String value) {
            addCriterion("group_logo >", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoGreaterThanOrEqualTo(String value) {
            addCriterion("group_logo >=", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLessThan(String value) {
            addCriterion("group_logo <", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLessThanOrEqualTo(String value) {
            addCriterion("group_logo <=", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoLike(String value) {
            addCriterion("group_logo like", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotLike(String value) {
            addCriterion("group_logo not like", value, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoIn(List<String> values) {
            addCriterion("group_logo in", values, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotIn(List<String> values) {
            addCriterion("group_logo not in", values, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoBetween(String value1, String value2) {
            addCriterion("group_logo between", value1, value2, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupLogoNotBetween(String value1, String value2) {
            addCriterion("group_logo not between", value1, value2, "groupLogo");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(String value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(String value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(String value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(String value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLike(String value) {
            addCriterion("group_type like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotLike(String value) {
            addCriterion("group_type not like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<String> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<String> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(String value1, String value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(String value1, String value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupGiveIsNull() {
            addCriterion("group_give is null");
            return (Criteria) this;
        }

        public Criteria andGroupGiveIsNotNull() {
            addCriterion("group_give is not null");
            return (Criteria) this;
        }

        public Criteria andGroupGiveEqualTo(Integer value) {
            addCriterion("group_give =", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveNotEqualTo(Integer value) {
            addCriterion("group_give <>", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveGreaterThan(Integer value) {
            addCriterion("group_give >", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_give >=", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveLessThan(Integer value) {
            addCriterion("group_give <", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveLessThanOrEqualTo(Integer value) {
            addCriterion("group_give <=", value, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveIn(List<Integer> values) {
            addCriterion("group_give in", values, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveNotIn(List<Integer> values) {
            addCriterion("group_give not in", values, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveBetween(Integer value1, Integer value2) {
            addCriterion("group_give between", value1, value2, "groupGive");
            return (Criteria) this;
        }

        public Criteria andGroupGiveNotBetween(Integer value1, Integer value2) {
            addCriterion("group_give not between", value1, value2, "groupGive");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andRankTypeIsNull() {
            addCriterion("rank_type is null");
            return (Criteria) this;
        }

        public Criteria andRankTypeIsNotNull() {
            addCriterion("rank_type is not null");
            return (Criteria) this;
        }

        public Criteria andRankTypeEqualTo(Integer value) {
            addCriterion("rank_type =", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeNotEqualTo(Integer value) {
            addCriterion("rank_type <>", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeGreaterThan(Integer value) {
            addCriterion("rank_type >", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_type >=", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeLessThan(Integer value) {
            addCriterion("rank_type <", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rank_type <=", value, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeIn(List<Integer> values) {
            addCriterion("rank_type in", values, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeNotIn(List<Integer> values) {
            addCriterion("rank_type not in", values, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeBetween(Integer value1, Integer value2) {
            addCriterion("rank_type between", value1, value2, "rankType");
            return (Criteria) this;
        }

        public Criteria andRankTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_type not between", value1, value2, "rankType");
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

        public Criteria andChannelIdsIsNull() {
            addCriterion("channel_ids is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdsIsNotNull() {
            addCriterion("channel_ids is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdsEqualTo(String value) {
            addCriterion("channel_ids =", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsNotEqualTo(String value) {
            addCriterion("channel_ids <>", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsGreaterThan(String value) {
            addCriterion("channel_ids >", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsGreaterThanOrEqualTo(String value) {
            addCriterion("channel_ids >=", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsLessThan(String value) {
            addCriterion("channel_ids <", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsLessThanOrEqualTo(String value) {
            addCriterion("channel_ids <=", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsLike(String value) {
            addCriterion("channel_ids like", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsNotLike(String value) {
            addCriterion("channel_ids not like", value, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsIn(List<String> values) {
            addCriterion("channel_ids in", values, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsNotIn(List<String> values) {
            addCriterion("channel_ids not in", values, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsBetween(String value1, String value2) {
            addCriterion("channel_ids between", value1, value2, "channelIds");
            return (Criteria) this;
        }

        public Criteria andChannelIdsNotBetween(String value1, String value2) {
            addCriterion("channel_ids not between", value1, value2, "channelIds");
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