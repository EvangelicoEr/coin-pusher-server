package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilExperienceLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilExperienceLevelExample() {
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

        public Criteria andExperienceLevelIdIsNull() {
            addCriterion("experience_level_id is null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdIsNotNull() {
            addCriterion("experience_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdEqualTo(Integer value) {
            addCriterion("experience_level_id =", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdNotEqualTo(Integer value) {
            addCriterion("experience_level_id <>", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdGreaterThan(Integer value) {
            addCriterion("experience_level_id >", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_level_id >=", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdLessThan(Integer value) {
            addCriterion("experience_level_id <", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("experience_level_id <=", value, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdIn(List<Integer> values) {
            addCriterion("experience_level_id in", values, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdNotIn(List<Integer> values) {
            addCriterion("experience_level_id not in", values, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("experience_level_id between", value1, value2, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_level_id not between", value1, value2, "experienceLevelId");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoIsNull() {
            addCriterion("experience_level_logo is null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoIsNotNull() {
            addCriterion("experience_level_logo is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoEqualTo(String value) {
            addCriterion("experience_level_logo =", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoNotEqualTo(String value) {
            addCriterion("experience_level_logo <>", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoGreaterThan(String value) {
            addCriterion("experience_level_logo >", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoGreaterThanOrEqualTo(String value) {
            addCriterion("experience_level_logo >=", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoLessThan(String value) {
            addCriterion("experience_level_logo <", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoLessThanOrEqualTo(String value) {
            addCriterion("experience_level_logo <=", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoLike(String value) {
            addCriterion("experience_level_logo like", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoNotLike(String value) {
            addCriterion("experience_level_logo not like", value, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoIn(List<String> values) {
            addCriterion("experience_level_logo in", values, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoNotIn(List<String> values) {
            addCriterion("experience_level_logo not in", values, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoBetween(String value1, String value2) {
            addCriterion("experience_level_logo between", value1, value2, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelLogoNotBetween(String value1, String value2) {
            addCriterion("experience_level_logo not between", value1, value2, "experienceLevelLogo");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameIsNull() {
            addCriterion("experience_level_name is null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameIsNotNull() {
            addCriterion("experience_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameEqualTo(String value) {
            addCriterion("experience_level_name =", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameNotEqualTo(String value) {
            addCriterion("experience_level_name <>", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameGreaterThan(String value) {
            addCriterion("experience_level_name >", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("experience_level_name >=", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameLessThan(String value) {
            addCriterion("experience_level_name <", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameLessThanOrEqualTo(String value) {
            addCriterion("experience_level_name <=", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameLike(String value) {
            addCriterion("experience_level_name like", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameNotLike(String value) {
            addCriterion("experience_level_name not like", value, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameIn(List<String> values) {
            addCriterion("experience_level_name in", values, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameNotIn(List<String> values) {
            addCriterion("experience_level_name not in", values, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameBetween(String value1, String value2) {
            addCriterion("experience_level_name between", value1, value2, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNameNotBetween(String value1, String value2) {
            addCriterion("experience_level_name not between", value1, value2, "experienceLevelName");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumIsNull() {
            addCriterion("experience_level_num is null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumIsNotNull() {
            addCriterion("experience_level_num is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumEqualTo(String value) {
            addCriterion("experience_level_num =", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumNotEqualTo(String value) {
            addCriterion("experience_level_num <>", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumGreaterThan(String value) {
            addCriterion("experience_level_num >", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumGreaterThanOrEqualTo(String value) {
            addCriterion("experience_level_num >=", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumLessThan(String value) {
            addCriterion("experience_level_num <", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumLessThanOrEqualTo(String value) {
            addCriterion("experience_level_num <=", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumLike(String value) {
            addCriterion("experience_level_num like", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumNotLike(String value) {
            addCriterion("experience_level_num not like", value, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumIn(List<String> values) {
            addCriterion("experience_level_num in", values, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumNotIn(List<String> values) {
            addCriterion("experience_level_num not in", values, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumBetween(String value1, String value2) {
            addCriterion("experience_level_num between", value1, value2, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelNumNotBetween(String value1, String value2) {
            addCriterion("experience_level_num not between", value1, value2, "experienceLevelNum");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceIsNull() {
            addCriterion("experience_level_experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceIsNotNull() {
            addCriterion("experience_level_experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceEqualTo(Integer value) {
            addCriterion("experience_level_experience =", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceNotEqualTo(Integer value) {
            addCriterion("experience_level_experience <>", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceGreaterThan(Integer value) {
            addCriterion("experience_level_experience >", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_level_experience >=", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceLessThan(Integer value) {
            addCriterion("experience_level_experience <", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("experience_level_experience <=", value, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceIn(List<Integer> values) {
            addCriterion("experience_level_experience in", values, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceNotIn(List<Integer> values) {
            addCriterion("experience_level_experience not in", values, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceBetween(Integer value1, Integer value2) {
            addCriterion("experience_level_experience between", value1, value2, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceLevelExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_level_experience not between", value1, value2, "experienceLevelExperience");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeIsNull() {
            addCriterion("experience_reward_type is null");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeIsNotNull() {
            addCriterion("experience_reward_type is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeEqualTo(Integer value) {
            addCriterion("experience_reward_type =", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeNotEqualTo(Integer value) {
            addCriterion("experience_reward_type <>", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeGreaterThan(Integer value) {
            addCriterion("experience_reward_type >", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_reward_type >=", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeLessThan(Integer value) {
            addCriterion("experience_reward_type <", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("experience_reward_type <=", value, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeIn(List<Integer> values) {
            addCriterion("experience_reward_type in", values, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeNotIn(List<Integer> values) {
            addCriterion("experience_reward_type not in", values, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeBetween(Integer value1, Integer value2) {
            addCriterion("experience_reward_type between", value1, value2, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_reward_type not between", value1, value2, "experienceRewardType");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumIsNull() {
            addCriterion("experience_reward_num is null");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumIsNotNull() {
            addCriterion("experience_reward_num is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumEqualTo(Integer value) {
            addCriterion("experience_reward_num =", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumNotEqualTo(Integer value) {
            addCriterion("experience_reward_num <>", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumGreaterThan(Integer value) {
            addCriterion("experience_reward_num >", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_reward_num >=", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumLessThan(Integer value) {
            addCriterion("experience_reward_num <", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumLessThanOrEqualTo(Integer value) {
            addCriterion("experience_reward_num <=", value, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumIn(List<Integer> values) {
            addCriterion("experience_reward_num in", values, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumNotIn(List<Integer> values) {
            addCriterion("experience_reward_num not in", values, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumBetween(Integer value1, Integer value2) {
            addCriterion("experience_reward_num between", value1, value2, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andExperienceRewardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_reward_num not between", value1, value2, "experienceRewardNum");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNull() {
            addCriterion("is_card is null");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNotNull() {
            addCriterion("is_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardEqualTo(Integer value) {
            addCriterion("is_card =", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotEqualTo(Integer value) {
            addCriterion("is_card <>", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThan(Integer value) {
            addCriterion("is_card >", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_card >=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThan(Integer value) {
            addCriterion("is_card <", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThanOrEqualTo(Integer value) {
            addCriterion("is_card <=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardIn(List<Integer> values) {
            addCriterion("is_card in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotIn(List<Integer> values) {
            addCriterion("is_card not in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardBetween(Integer value1, Integer value2) {
            addCriterion("is_card between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotBetween(Integer value1, Integer value2) {
            addCriterion("is_card not between", value1, value2, "isCard");
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