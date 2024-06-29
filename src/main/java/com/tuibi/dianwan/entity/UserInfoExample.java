package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserOpenidIsNull() {
            addCriterion("user_openid is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNotNull() {
            addCriterion("user_openid is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidEqualTo(String value) {
            addCriterion("user_openid =", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotEqualTo(String value) {
            addCriterion("user_openid <>", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThan(String value) {
            addCriterion("user_openid >", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("user_openid >=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThan(String value) {
            addCriterion("user_openid <", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThanOrEqualTo(String value) {
            addCriterion("user_openid <=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLike(String value) {
            addCriterion("user_openid like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotLike(String value) {
            addCriterion("user_openid not like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIn(List<String> values) {
            addCriterion("user_openid in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotIn(List<String> values) {
            addCriterion("user_openid not in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidBetween(String value1, String value2) {
            addCriterion("user_openid between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotBetween(String value1, String value2) {
            addCriterion("user_openid not between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIsNull() {
            addCriterion("user_union_id is null");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIsNotNull() {
            addCriterion("user_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdEqualTo(String value) {
            addCriterion("user_union_id =", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotEqualTo(String value) {
            addCriterion("user_union_id <>", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdGreaterThan(String value) {
            addCriterion("user_union_id >", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_union_id >=", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLessThan(String value) {
            addCriterion("user_union_id <", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLessThanOrEqualTo(String value) {
            addCriterion("user_union_id <=", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLike(String value) {
            addCriterion("user_union_id like", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotLike(String value) {
            addCriterion("user_union_id not like", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIn(List<String> values) {
            addCriterion("user_union_id in", values, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotIn(List<String> values) {
            addCriterion("user_union_id not in", values, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdBetween(String value1, String value2) {
            addCriterion("user_union_id between", value1, value2, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotBetween(String value1, String value2) {
            addCriterion("user_union_id not between", value1, value2, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserAppleidIsNull() {
            addCriterion("user_appleid is null");
            return (Criteria) this;
        }

        public Criteria andUserAppleidIsNotNull() {
            addCriterion("user_appleid is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppleidEqualTo(String value) {
            addCriterion("user_appleid =", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidNotEqualTo(String value) {
            addCriterion("user_appleid <>", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidGreaterThan(String value) {
            addCriterion("user_appleid >", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidGreaterThanOrEqualTo(String value) {
            addCriterion("user_appleid >=", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidLessThan(String value) {
            addCriterion("user_appleid <", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidLessThanOrEqualTo(String value) {
            addCriterion("user_appleid <=", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidLike(String value) {
            addCriterion("user_appleid like", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidNotLike(String value) {
            addCriterion("user_appleid not like", value, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidIn(List<String> values) {
            addCriterion("user_appleid in", values, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidNotIn(List<String> values) {
            addCriterion("user_appleid not in", values, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidBetween(String value1, String value2) {
            addCriterion("user_appleid between", value1, value2, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserAppleidNotBetween(String value1, String value2) {
            addCriterion("user_appleid not between", value1, value2, "userAppleid");
            return (Criteria) this;
        }

        public Criteria andUserUpIdIsNull() {
            addCriterion("user_up_id is null");
            return (Criteria) this;
        }

        public Criteria andUserUpIdIsNotNull() {
            addCriterion("user_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpIdEqualTo(String value) {
            addCriterion("user_up_id =", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdNotEqualTo(String value) {
            addCriterion("user_up_id <>", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdGreaterThan(String value) {
            addCriterion("user_up_id >", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_up_id >=", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdLessThan(String value) {
            addCriterion("user_up_id <", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdLessThanOrEqualTo(String value) {
            addCriterion("user_up_id <=", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdLike(String value) {
            addCriterion("user_up_id like", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdNotLike(String value) {
            addCriterion("user_up_id not like", value, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdIn(List<String> values) {
            addCriterion("user_up_id in", values, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdNotIn(List<String> values) {
            addCriterion("user_up_id not in", values, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdBetween(String value1, String value2) {
            addCriterion("user_up_id between", value1, value2, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserUpIdNotBetween(String value1, String value2) {
            addCriterion("user_up_id not between", value1, value2, "userUpId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameIsNull() {
            addCriterion("register_user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameIsNotNull() {
            addCriterion("register_user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameEqualTo(String value) {
            addCriterion("register_user_nickname =", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameNotEqualTo(String value) {
            addCriterion("register_user_nickname <>", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameGreaterThan(String value) {
            addCriterion("register_user_nickname >", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("register_user_nickname >=", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameLessThan(String value) {
            addCriterion("register_user_nickname <", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("register_user_nickname <=", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameLike(String value) {
            addCriterion("register_user_nickname like", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameNotLike(String value) {
            addCriterion("register_user_nickname not like", value, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameIn(List<String> values) {
            addCriterion("register_user_nickname in", values, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameNotIn(List<String> values) {
            addCriterion("register_user_nickname not in", values, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameBetween(String value1, String value2) {
            addCriterion("register_user_nickname between", value1, value2, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andRegisterUserNicknameNotBetween(String value1, String value2) {
            addCriterion("register_user_nickname not between", value1, value2, "registerUserNickname");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNull() {
            addCriterion("user_img is null");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNotNull() {
            addCriterion("user_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserImgEqualTo(String value) {
            addCriterion("user_img =", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotEqualTo(String value) {
            addCriterion("user_img <>", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThan(String value) {
            addCriterion("user_img >", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_img >=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThan(String value) {
            addCriterion("user_img <", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThanOrEqualTo(String value) {
            addCriterion("user_img <=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLike(String value) {
            addCriterion("user_img like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotLike(String value) {
            addCriterion("user_img not like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgIn(List<String> values) {
            addCriterion("user_img in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotIn(List<String> values) {
            addCriterion("user_img not in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgBetween(String value1, String value2) {
            addCriterion("user_img between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotBetween(String value1, String value2) {
            addCriterion("user_img not between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgIsNull() {
            addCriterion("register_user_img is null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgIsNotNull() {
            addCriterion("register_user_img is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgEqualTo(String value) {
            addCriterion("register_user_img =", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgNotEqualTo(String value) {
            addCriterion("register_user_img <>", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgGreaterThan(String value) {
            addCriterion("register_user_img >", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("register_user_img >=", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgLessThan(String value) {
            addCriterion("register_user_img <", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgLessThanOrEqualTo(String value) {
            addCriterion("register_user_img <=", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgLike(String value) {
            addCriterion("register_user_img like", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgNotLike(String value) {
            addCriterion("register_user_img not like", value, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgIn(List<String> values) {
            addCriterion("register_user_img in", values, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgNotIn(List<String> values) {
            addCriterion("register_user_img not in", values, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgBetween(String value1, String value2) {
            addCriterion("register_user_img between", value1, value2, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andRegisterUserImgNotBetween(String value1, String value2) {
            addCriterion("register_user_img not between", value1, value2, "registerUserImg");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIsNull() {
            addCriterion("member_level_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIsNotNull() {
            addCriterion("member_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdEqualTo(Integer value) {
            addCriterion("member_level_id =", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotEqualTo(Integer value) {
            addCriterion("member_level_id <>", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThan(Integer value) {
            addCriterion("member_level_id >", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level_id >=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThan(Integer value) {
            addCriterion("member_level_id <", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_level_id <=", value, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdIn(List<Integer> values) {
            addCriterion("member_level_id in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotIn(List<Integer> values) {
            addCriterion("member_level_id not in", values, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("member_level_id between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level_id not between", value1, value2, "memberLevelId");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueIsNull() {
            addCriterion("member_cumulative_value is null");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueIsNotNull() {
            addCriterion("member_cumulative_value is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueEqualTo(Double value) {
            addCriterion("member_cumulative_value =", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueNotEqualTo(Double value) {
            addCriterion("member_cumulative_value <>", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueGreaterThan(Double value) {
            addCriterion("member_cumulative_value >", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueGreaterThanOrEqualTo(Double value) {
            addCriterion("member_cumulative_value >=", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueLessThan(Double value) {
            addCriterion("member_cumulative_value <", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueLessThanOrEqualTo(Double value) {
            addCriterion("member_cumulative_value <=", value, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueIn(List<Double> values) {
            addCriterion("member_cumulative_value in", values, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueNotIn(List<Double> values) {
            addCriterion("member_cumulative_value not in", values, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueBetween(Double value1, Double value2) {
            addCriterion("member_cumulative_value between", value1, value2, "memberCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andMemberCumulativeValueNotBetween(Double value1, Double value2) {
            addCriterion("member_cumulative_value not between", value1, value2, "memberCumulativeValue");
            return (Criteria) this;
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

        public Criteria andExperienceCumulativeValueIsNull() {
            addCriterion("experience_cumulative_value is null");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueIsNotNull() {
            addCriterion("experience_cumulative_value is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueEqualTo(Integer value) {
            addCriterion("experience_cumulative_value =", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueNotEqualTo(Integer value) {
            addCriterion("experience_cumulative_value <>", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueGreaterThan(Integer value) {
            addCriterion("experience_cumulative_value >", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_cumulative_value >=", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueLessThan(Integer value) {
            addCriterion("experience_cumulative_value <", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueLessThanOrEqualTo(Integer value) {
            addCriterion("experience_cumulative_value <=", value, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueIn(List<Integer> values) {
            addCriterion("experience_cumulative_value in", values, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueNotIn(List<Integer> values) {
            addCriterion("experience_cumulative_value not in", values, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueBetween(Integer value1, Integer value2) {
            addCriterion("experience_cumulative_value between", value1, value2, "experienceCumulativeValue");
            return (Criteria) this;
        }

        public Criteria andExperienceCumulativeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_cumulative_value not between", value1, value2, "experienceCumulativeValue");
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

        public Criteria andUserIntegralGetIsNull() {
            addCriterion("user_integral_get is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetIsNotNull() {
            addCriterion("user_integral_get is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetEqualTo(Integer value) {
            addCriterion("user_integral_get =", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetNotEqualTo(Integer value) {
            addCriterion("user_integral_get <>", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetGreaterThan(Integer value) {
            addCriterion("user_integral_get >", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_integral_get >=", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetLessThan(Integer value) {
            addCriterion("user_integral_get <", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetLessThanOrEqualTo(Integer value) {
            addCriterion("user_integral_get <=", value, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetIn(List<Integer> values) {
            addCriterion("user_integral_get in", values, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetNotIn(List<Integer> values) {
            addCriterion("user_integral_get not in", values, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetBetween(Integer value1, Integer value2) {
            addCriterion("user_integral_get between", value1, value2, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGetNotBetween(Integer value1, Integer value2) {
            addCriterion("user_integral_get not between", value1, value2, "userIntegralGet");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseIsNull() {
            addCriterion("user_integral_lose is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseIsNotNull() {
            addCriterion("user_integral_lose is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseEqualTo(Integer value) {
            addCriterion("user_integral_lose =", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseNotEqualTo(Integer value) {
            addCriterion("user_integral_lose <>", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseGreaterThan(Integer value) {
            addCriterion("user_integral_lose >", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_integral_lose >=", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseLessThan(Integer value) {
            addCriterion("user_integral_lose <", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseLessThanOrEqualTo(Integer value) {
            addCriterion("user_integral_lose <=", value, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseIn(List<Integer> values) {
            addCriterion("user_integral_lose in", values, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseNotIn(List<Integer> values) {
            addCriterion("user_integral_lose not in", values, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseBetween(Integer value1, Integer value2) {
            addCriterion("user_integral_lose between", value1, value2, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLoseNotBetween(Integer value1, Integer value2) {
            addCriterion("user_integral_lose not between", value1, value2, "userIntegralLose");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNull() {
            addCriterion("user_agent is null");
            return (Criteria) this;
        }

        public Criteria andUserAgentIsNotNull() {
            addCriterion("user_agent is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgentEqualTo(Integer value) {
            addCriterion("user_agent =", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotEqualTo(Integer value) {
            addCriterion("user_agent <>", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThan(Integer value) {
            addCriterion("user_agent >", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_agent >=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThan(Integer value) {
            addCriterion("user_agent <", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentLessThanOrEqualTo(Integer value) {
            addCriterion("user_agent <=", value, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentIn(List<Integer> values) {
            addCriterion("user_agent in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotIn(List<Integer> values) {
            addCriterion("user_agent not in", values, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentBetween(Integer value1, Integer value2) {
            addCriterion("user_agent between", value1, value2, "userAgent");
            return (Criteria) this;
        }

        public Criteria andUserAgentNotBetween(Integer value1, Integer value2) {
            addCriterion("user_agent not between", value1, value2, "userAgent");
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

        public Criteria andIsRealNameIsNull() {
            addCriterion("is_real_name is null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIsNotNull() {
            addCriterion("is_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameEqualTo(Integer value) {
            addCriterion("is_real_name =", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotEqualTo(Integer value) {
            addCriterion("is_real_name <>", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThan(Integer value) {
            addCriterion("is_real_name >", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_real_name >=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThan(Integer value) {
            addCriterion("is_real_name <", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThanOrEqualTo(Integer value) {
            addCriterion("is_real_name <=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIn(List<Integer> values) {
            addCriterion("is_real_name in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotIn(List<Integer> values) {
            addCriterion("is_real_name not in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameBetween(Integer value1, Integer value2) {
            addCriterion("is_real_name between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotBetween(Integer value1, Integer value2) {
            addCriterion("is_real_name not between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardIsNull() {
            addCriterion("user_real_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardIsNotNull() {
            addCriterion("user_real_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardEqualTo(String value) {
            addCriterion("user_real_idcard =", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardNotEqualTo(String value) {
            addCriterion("user_real_idcard <>", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardGreaterThan(String value) {
            addCriterion("user_real_idcard >", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_idcard >=", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardLessThan(String value) {
            addCriterion("user_real_idcard <", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardLessThanOrEqualTo(String value) {
            addCriterion("user_real_idcard <=", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardLike(String value) {
            addCriterion("user_real_idcard like", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardNotLike(String value) {
            addCriterion("user_real_idcard not like", value, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardIn(List<String> values) {
            addCriterion("user_real_idcard in", values, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardNotIn(List<String> values) {
            addCriterion("user_real_idcard not in", values, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardBetween(String value1, String value2) {
            addCriterion("user_real_idcard between", value1, value2, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andUserRealIdcardNotBetween(String value1, String value2) {
            addCriterion("user_real_idcard not between", value1, value2, "userRealIdcard");
            return (Criteria) this;
        }

        public Criteria andRechargeDayIsNull() {
            addCriterion("recharge_day is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDayIsNotNull() {
            addCriterion("recharge_day is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDayEqualTo(Integer value) {
            addCriterion("recharge_day =", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayNotEqualTo(Integer value) {
            addCriterion("recharge_day <>", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayGreaterThan(Integer value) {
            addCriterion("recharge_day >", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_day >=", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayLessThan(Integer value) {
            addCriterion("recharge_day <", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_day <=", value, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayIn(List<Integer> values) {
            addCriterion("recharge_day in", values, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayNotIn(List<Integer> values) {
            addCriterion("recharge_day not in", values, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayBetween(Integer value1, Integer value2) {
            addCriterion("recharge_day between", value1, value2, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_day not between", value1, value2, "rechargeDay");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(String value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(String value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(String value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(String value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(String value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLike(String value) {
            addCriterion("recharge_time like", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotLike(String value) {
            addCriterion("recharge_time not like", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<String> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<String> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(String value1, String value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(String value1, String value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNull() {
            addCriterion("is_recharge is null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNotNull() {
            addCriterion("is_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeEqualTo(Integer value) {
            addCriterion("is_recharge =", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotEqualTo(Integer value) {
            addCriterion("is_recharge <>", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThan(Integer value) {
            addCriterion("is_recharge >", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recharge >=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThan(Integer value) {
            addCriterion("is_recharge <", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThanOrEqualTo(Integer value) {
            addCriterion("is_recharge <=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIn(List<Integer> values) {
            addCriterion("is_recharge in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotIn(List<Integer> values) {
            addCriterion("is_recharge not in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeBetween(Integer value1, Integer value2) {
            addCriterion("is_recharge between", value1, value2, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recharge not between", value1, value2, "isRecharge");
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

        public Criteria andLoginDayIsNull() {
            addCriterion("login_day is null");
            return (Criteria) this;
        }

        public Criteria andLoginDayIsNotNull() {
            addCriterion("login_day is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDayEqualTo(Integer value) {
            addCriterion("login_day =", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayNotEqualTo(Integer value) {
            addCriterion("login_day <>", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayGreaterThan(Integer value) {
            addCriterion("login_day >", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_day >=", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayLessThan(Integer value) {
            addCriterion("login_day <", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayLessThanOrEqualTo(Integer value) {
            addCriterion("login_day <=", value, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayIn(List<Integer> values) {
            addCriterion("login_day in", values, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayNotIn(List<Integer> values) {
            addCriterion("login_day not in", values, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayBetween(Integer value1, Integer value2) {
            addCriterion("login_day between", value1, value2, "loginDay");
            return (Criteria) this;
        }

        public Criteria andLoginDayNotBetween(Integer value1, Integer value2) {
            addCriterion("login_day not between", value1, value2, "loginDay");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelIsNull() {
            addCriterion("promote_level is null");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelIsNotNull() {
            addCriterion("promote_level is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelEqualTo(Integer value) {
            addCriterion("promote_level =", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelNotEqualTo(Integer value) {
            addCriterion("promote_level <>", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelGreaterThan(Integer value) {
            addCriterion("promote_level >", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("promote_level >=", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelLessThan(Integer value) {
            addCriterion("promote_level <", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelLessThanOrEqualTo(Integer value) {
            addCriterion("promote_level <=", value, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelIn(List<Integer> values) {
            addCriterion("promote_level in", values, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelNotIn(List<Integer> values) {
            addCriterion("promote_level not in", values, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelBetween(Integer value1, Integer value2) {
            addCriterion("promote_level between", value1, value2, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andPromoteLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("promote_level not between", value1, value2, "promoteLevel");
            return (Criteria) this;
        }

        public Criteria andUpPromoteIsNull() {
            addCriterion("up_promote is null");
            return (Criteria) this;
        }

        public Criteria andUpPromoteIsNotNull() {
            addCriterion("up_promote is not null");
            return (Criteria) this;
        }

        public Criteria andUpPromoteEqualTo(Integer value) {
            addCriterion("up_promote =", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteNotEqualTo(Integer value) {
            addCriterion("up_promote <>", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteGreaterThan(Integer value) {
            addCriterion("up_promote >", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_promote >=", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteLessThan(Integer value) {
            addCriterion("up_promote <", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteLessThanOrEqualTo(Integer value) {
            addCriterion("up_promote <=", value, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteIn(List<Integer> values) {
            addCriterion("up_promote in", values, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteNotIn(List<Integer> values) {
            addCriterion("up_promote not in", values, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteBetween(Integer value1, Integer value2) {
            addCriterion("up_promote between", value1, value2, "upPromote");
            return (Criteria) this;
        }

        public Criteria andUpPromoteNotBetween(Integer value1, Integer value2) {
            addCriterion("up_promote not between", value1, value2, "upPromote");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNull() {
            addCriterion("last_logintime is null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNotNull() {
            addCriterion("last_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeEqualTo(LocalDateTime value) {
            addCriterion("last_logintime =", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotEqualTo(LocalDateTime value) {
            addCriterion("last_logintime <>", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThan(LocalDateTime value) {
            addCriterion("last_logintime >", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_logintime >=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThan(LocalDateTime value) {
            addCriterion("last_logintime <", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_logintime <=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIn(List<LocalDateTime> values) {
            addCriterion("last_logintime in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotIn(List<LocalDateTime> values) {
            addCriterion("last_logintime not in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_logintime between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_logintime not between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIsNull() {
            addCriterion("last_loginip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIsNotNull() {
            addCriterion("last_loginip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginipEqualTo(String value) {
            addCriterion("last_loginip =", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotEqualTo(String value) {
            addCriterion("last_loginip <>", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipGreaterThan(String value) {
            addCriterion("last_loginip >", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("last_loginip >=", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLessThan(String value) {
            addCriterion("last_loginip <", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLessThanOrEqualTo(String value) {
            addCriterion("last_loginip <=", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLike(String value) {
            addCriterion("last_loginip like", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotLike(String value) {
            addCriterion("last_loginip not like", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIn(List<String> values) {
            addCriterion("last_loginip in", values, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotIn(List<String> values) {
            addCriterion("last_loginip not in", values, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipBetween(String value1, String value2) {
            addCriterion("last_loginip between", value1, value2, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotBetween(String value1, String value2) {
            addCriterion("last_loginip not between", value1, value2, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNull() {
            addCriterion("client_version is null");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNotNull() {
            addCriterion("client_version is not null");
            return (Criteria) this;
        }

        public Criteria andClientVersionEqualTo(String value) {
            addCriterion("client_version =", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotEqualTo(String value) {
            addCriterion("client_version <>", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThan(String value) {
            addCriterion("client_version >", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThanOrEqualTo(String value) {
            addCriterion("client_version >=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThan(String value) {
            addCriterion("client_version <", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThanOrEqualTo(String value) {
            addCriterion("client_version <=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLike(String value) {
            addCriterion("client_version like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLike(String value) {
            addCriterion("client_version not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionIn(List<String> values) {
            addCriterion("client_version in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotIn(List<String> values) {
            addCriterion("client_version not in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionBetween(String value1, String value2) {
            addCriterion("client_version between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotBetween(String value1, String value2) {
            addCriterion("client_version not between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionIsNull() {
            addCriterion("client_lua_version is null");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionIsNotNull() {
            addCriterion("client_lua_version is not null");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionEqualTo(String value) {
            addCriterion("client_lua_version =", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionNotEqualTo(String value) {
            addCriterion("client_lua_version <>", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionGreaterThan(String value) {
            addCriterion("client_lua_version >", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionGreaterThanOrEqualTo(String value) {
            addCriterion("client_lua_version >=", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionLessThan(String value) {
            addCriterion("client_lua_version <", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionLessThanOrEqualTo(String value) {
            addCriterion("client_lua_version <=", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionLike(String value) {
            addCriterion("client_lua_version like", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionNotLike(String value) {
            addCriterion("client_lua_version not like", value, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionIn(List<String> values) {
            addCriterion("client_lua_version in", values, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionNotIn(List<String> values) {
            addCriterion("client_lua_version not in", values, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionBetween(String value1, String value2) {
            addCriterion("client_lua_version between", value1, value2, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andClientLuaVersionNotBetween(String value1, String value2) {
            addCriterion("client_lua_version not between", value1, value2, "clientLuaVersion");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformIsNull() {
            addCriterion("login_platform is null");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformIsNotNull() {
            addCriterion("login_platform is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformEqualTo(String value) {
            addCriterion("login_platform =", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformNotEqualTo(String value) {
            addCriterion("login_platform <>", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformGreaterThan(String value) {
            addCriterion("login_platform >", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("login_platform >=", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformLessThan(String value) {
            addCriterion("login_platform <", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformLessThanOrEqualTo(String value) {
            addCriterion("login_platform <=", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformLike(String value) {
            addCriterion("login_platform like", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformNotLike(String value) {
            addCriterion("login_platform not like", value, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformIn(List<String> values) {
            addCriterion("login_platform in", values, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformNotIn(List<String> values) {
            addCriterion("login_platform not in", values, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformBetween(String value1, String value2) {
            addCriterion("login_platform between", value1, value2, "loginPlatform");
            return (Criteria) this;
        }

        public Criteria andLoginPlatformNotBetween(String value1, String value2) {
            addCriterion("login_platform not between", value1, value2, "loginPlatform");
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