package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UserMachineLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMachineLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(String value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(String value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(String value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(String value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(String value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLike(String value) {
            addCriterion("log_id like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotLike(String value) {
            addCriterion("log_id not like", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<String> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<String> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(String value1, String value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(String value1, String value2) {
            addCriterion("log_id not between", value1, value2, "logId");
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

        public Criteria andMachineNameIsNull() {
            addCriterion("machine_name is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("machine_name is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("machine_name =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("machine_name <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("machine_name >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("machine_name >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("machine_name <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("machine_name <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("machine_name like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("machine_name not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("machine_name in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("machine_name not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("machine_name between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("machine_name not between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andLogNum1IsNull() {
            addCriterion("log_num1 is null");
            return (Criteria) this;
        }

        public Criteria andLogNum1IsNotNull() {
            addCriterion("log_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andLogNum1EqualTo(Integer value) {
            addCriterion("log_num1 =", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1NotEqualTo(Integer value) {
            addCriterion("log_num1 <>", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1GreaterThan(Integer value) {
            addCriterion("log_num1 >", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("log_num1 >=", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1LessThan(Integer value) {
            addCriterion("log_num1 <", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1LessThanOrEqualTo(Integer value) {
            addCriterion("log_num1 <=", value, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1In(List<Integer> values) {
            addCriterion("log_num1 in", values, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1NotIn(List<Integer> values) {
            addCriterion("log_num1 not in", values, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1Between(Integer value1, Integer value2) {
            addCriterion("log_num1 between", value1, value2, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("log_num1 not between", value1, value2, "logNum1");
            return (Criteria) this;
        }

        public Criteria andLogNum2IsNull() {
            addCriterion("log_num2 is null");
            return (Criteria) this;
        }

        public Criteria andLogNum2IsNotNull() {
            addCriterion("log_num2 is not null");
            return (Criteria) this;
        }

        public Criteria andLogNum2EqualTo(Integer value) {
            addCriterion("log_num2 =", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2NotEqualTo(Integer value) {
            addCriterion("log_num2 <>", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2GreaterThan(Integer value) {
            addCriterion("log_num2 >", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("log_num2 >=", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2LessThan(Integer value) {
            addCriterion("log_num2 <", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2LessThanOrEqualTo(Integer value) {
            addCriterion("log_num2 <=", value, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2In(List<Integer> values) {
            addCriterion("log_num2 in", values, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2NotIn(List<Integer> values) {
            addCriterion("log_num2 not in", values, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2Between(Integer value1, Integer value2) {
            addCriterion("log_num2 between", value1, value2, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("log_num2 not between", value1, value2, "logNum2");
            return (Criteria) this;
        }

        public Criteria andLogImgIsNull() {
            addCriterion("log_img is null");
            return (Criteria) this;
        }

        public Criteria andLogImgIsNotNull() {
            addCriterion("log_img is not null");
            return (Criteria) this;
        }

        public Criteria andLogImgEqualTo(String value) {
            addCriterion("log_img =", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgNotEqualTo(String value) {
            addCriterion("log_img <>", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgGreaterThan(String value) {
            addCriterion("log_img >", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgGreaterThanOrEqualTo(String value) {
            addCriterion("log_img >=", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgLessThan(String value) {
            addCriterion("log_img <", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgLessThanOrEqualTo(String value) {
            addCriterion("log_img <=", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgLike(String value) {
            addCriterion("log_img like", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgNotLike(String value) {
            addCriterion("log_img not like", value, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgIn(List<String> values) {
            addCriterion("log_img in", values, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgNotIn(List<String> values) {
            addCriterion("log_img not in", values, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgBetween(String value1, String value2) {
            addCriterion("log_img between", value1, value2, "logImg");
            return (Criteria) this;
        }

        public Criteria andLogImgNotBetween(String value1, String value2) {
            addCriterion("log_img not between", value1, value2, "logImg");
            return (Criteria) this;
        }

        public Criteria andIsGrantIsNull() {
            addCriterion("is_grant is null");
            return (Criteria) this;
        }

        public Criteria andIsGrantIsNotNull() {
            addCriterion("is_grant is not null");
            return (Criteria) this;
        }

        public Criteria andIsGrantEqualTo(Integer value) {
            addCriterion("is_grant =", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantNotEqualTo(Integer value) {
            addCriterion("is_grant <>", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantGreaterThan(Integer value) {
            addCriterion("is_grant >", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_grant >=", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantLessThan(Integer value) {
            addCriterion("is_grant <", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantLessThanOrEqualTo(Integer value) {
            addCriterion("is_grant <=", value, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantIn(List<Integer> values) {
            addCriterion("is_grant in", values, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantNotIn(List<Integer> values) {
            addCriterion("is_grant not in", values, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantBetween(Integer value1, Integer value2) {
            addCriterion("is_grant between", value1, value2, "isGrant");
            return (Criteria) this;
        }

        public Criteria andIsGrantNotBetween(Integer value1, Integer value2) {
            addCriterion("is_grant not between", value1, value2, "isGrant");
            return (Criteria) this;
        }

        public Criteria andCatchWIsNull() {
            addCriterion("catch_w is null");
            return (Criteria) this;
        }

        public Criteria andCatchWIsNotNull() {
            addCriterion("catch_w is not null");
            return (Criteria) this;
        }

        public Criteria andCatchWEqualTo(String value) {
            addCriterion("catch_w =", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWNotEqualTo(String value) {
            addCriterion("catch_w <>", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWGreaterThan(String value) {
            addCriterion("catch_w >", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWGreaterThanOrEqualTo(String value) {
            addCriterion("catch_w >=", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWLessThan(String value) {
            addCriterion("catch_w <", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWLessThanOrEqualTo(String value) {
            addCriterion("catch_w <=", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWLike(String value) {
            addCriterion("catch_w like", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWNotLike(String value) {
            addCriterion("catch_w not like", value, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWIn(List<String> values) {
            addCriterion("catch_w in", values, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWNotIn(List<String> values) {
            addCriterion("catch_w not in", values, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWBetween(String value1, String value2) {
            addCriterion("catch_w between", value1, value2, "catchW");
            return (Criteria) this;
        }

        public Criteria andCatchWNotBetween(String value1, String value2) {
            addCriterion("catch_w not between", value1, value2, "catchW");
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

        public Criteria andInLogImgIsNull() {
            addCriterion("in_log_img is null");
            return (Criteria) this;
        }

        public Criteria andInLogImgIsNotNull() {
            addCriterion("in_log_img is not null");
            return (Criteria) this;
        }

        public Criteria andInLogImgEqualTo(String value) {
            addCriterion("in_log_img =", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgNotEqualTo(String value) {
            addCriterion("in_log_img <>", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgGreaterThan(String value) {
            addCriterion("in_log_img >", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgGreaterThanOrEqualTo(String value) {
            addCriterion("in_log_img >=", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgLessThan(String value) {
            addCriterion("in_log_img <", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgLessThanOrEqualTo(String value) {
            addCriterion("in_log_img <=", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgLike(String value) {
            addCriterion("in_log_img like", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgNotLike(String value) {
            addCriterion("in_log_img not like", value, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgIn(List<String> values) {
            addCriterion("in_log_img in", values, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgNotIn(List<String> values) {
            addCriterion("in_log_img not in", values, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgBetween(String value1, String value2) {
            addCriterion("in_log_img between", value1, value2, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andInLogImgNotBetween(String value1, String value2) {
            addCriterion("in_log_img not between", value1, value2, "inLogImg");
            return (Criteria) this;
        }

        public Criteria andLogNum3IsNull() {
            addCriterion("log_num3 is null");
            return (Criteria) this;
        }

        public Criteria andLogNum3IsNotNull() {
            addCriterion("log_num3 is not null");
            return (Criteria) this;
        }

        public Criteria andLogNum3EqualTo(Integer value) {
            addCriterion("log_num3 =", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3NotEqualTo(Integer value) {
            addCriterion("log_num3 <>", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3GreaterThan(Integer value) {
            addCriterion("log_num3 >", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3GreaterThanOrEqualTo(Integer value) {
            addCriterion("log_num3 >=", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3LessThan(Integer value) {
            addCriterion("log_num3 <", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3LessThanOrEqualTo(Integer value) {
            addCriterion("log_num3 <=", value, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3In(List<Integer> values) {
            addCriterion("log_num3 in", values, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3NotIn(List<Integer> values) {
            addCriterion("log_num3 not in", values, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3Between(Integer value1, Integer value2) {
            addCriterion("log_num3 between", value1, value2, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum3NotBetween(Integer value1, Integer value2) {
            addCriterion("log_num3 not between", value1, value2, "logNum3");
            return (Criteria) this;
        }

        public Criteria andLogNum4IsNull() {
            addCriterion("log_num4 is null");
            return (Criteria) this;
        }

        public Criteria andLogNum4IsNotNull() {
            addCriterion("log_num4 is not null");
            return (Criteria) this;
        }

        public Criteria andLogNum4EqualTo(Integer value) {
            addCriterion("log_num4 =", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4NotEqualTo(Integer value) {
            addCriterion("log_num4 <>", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4GreaterThan(Integer value) {
            addCriterion("log_num4 >", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4GreaterThanOrEqualTo(Integer value) {
            addCriterion("log_num4 >=", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4LessThan(Integer value) {
            addCriterion("log_num4 <", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4LessThanOrEqualTo(Integer value) {
            addCriterion("log_num4 <=", value, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4In(List<Integer> values) {
            addCriterion("log_num4 in", values, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4NotIn(List<Integer> values) {
            addCriterion("log_num4 not in", values, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4Between(Integer value1, Integer value2) {
            addCriterion("log_num4 between", value1, value2, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogNum4NotBetween(Integer value1, Integer value2) {
            addCriterion("log_num4 not between", value1, value2, "logNum4");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumIsNull() {
            addCriterion("log_toubi_num is null");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumIsNotNull() {
            addCriterion("log_toubi_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumEqualTo(Integer value) {
            addCriterion("log_toubi_num =", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumNotEqualTo(Integer value) {
            addCriterion("log_toubi_num <>", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumGreaterThan(Integer value) {
            addCriterion("log_toubi_num >", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_toubi_num >=", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumLessThan(Integer value) {
            addCriterion("log_toubi_num <", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumLessThanOrEqualTo(Integer value) {
            addCriterion("log_toubi_num <=", value, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumIn(List<Integer> values) {
            addCriterion("log_toubi_num in", values, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumNotIn(List<Integer> values) {
            addCriterion("log_toubi_num not in", values, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumBetween(Integer value1, Integer value2) {
            addCriterion("log_toubi_num between", value1, value2, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogToubiNumNotBetween(Integer value1, Integer value2) {
            addCriterion("log_toubi_num not between", value1, value2, "logToubiNum");
            return (Criteria) this;
        }

        public Criteria andLogImgInIsNull() {
            addCriterion("log_img_in is null");
            return (Criteria) this;
        }

        public Criteria andLogImgInIsNotNull() {
            addCriterion("log_img_in is not null");
            return (Criteria) this;
        }

        public Criteria andLogImgInEqualTo(String value) {
            addCriterion("log_img_in =", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInNotEqualTo(String value) {
            addCriterion("log_img_in <>", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInGreaterThan(String value) {
            addCriterion("log_img_in >", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInGreaterThanOrEqualTo(String value) {
            addCriterion("log_img_in >=", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInLessThan(String value) {
            addCriterion("log_img_in <", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInLessThanOrEqualTo(String value) {
            addCriterion("log_img_in <=", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInLike(String value) {
            addCriterion("log_img_in like", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInNotLike(String value) {
            addCriterion("log_img_in not like", value, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInIn(List<String> values) {
            addCriterion("log_img_in in", values, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInNotIn(List<String> values) {
            addCriterion("log_img_in not in", values, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInBetween(String value1, String value2) {
            addCriterion("log_img_in between", value1, value2, "logImgIn");
            return (Criteria) this;
        }

        public Criteria andLogImgInNotBetween(String value1, String value2) {
            addCriterion("log_img_in not between", value1, value2, "logImgIn");
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

        public Criteria andLogDownIsNull() {
            addCriterion("log_down is null");
            return (Criteria) this;
        }

        public Criteria andLogDownIsNotNull() {
            addCriterion("log_down is not null");
            return (Criteria) this;
        }

        public Criteria andLogDownEqualTo(Integer value) {
            addCriterion("log_down =", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownNotEqualTo(Integer value) {
            addCriterion("log_down <>", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownGreaterThan(Integer value) {
            addCriterion("log_down >", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_down >=", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownLessThan(Integer value) {
            addCriterion("log_down <", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownLessThanOrEqualTo(Integer value) {
            addCriterion("log_down <=", value, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownIn(List<Integer> values) {
            addCriterion("log_down in", values, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownNotIn(List<Integer> values) {
            addCriterion("log_down not in", values, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownBetween(Integer value1, Integer value2) {
            addCriterion("log_down between", value1, value2, "logDown");
            return (Criteria) this;
        }

        public Criteria andLogDownNotBetween(Integer value1, Integer value2) {
            addCriterion("log_down not between", value1, value2, "logDown");
            return (Criteria) this;
        }

        public Criteria andMachinePriceIsNull() {
            addCriterion("machine_price is null");
            return (Criteria) this;
        }

        public Criteria andMachinePriceIsNotNull() {
            addCriterion("machine_price is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePriceEqualTo(Integer value) {
            addCriterion("machine_price =", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceNotEqualTo(Integer value) {
            addCriterion("machine_price <>", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceGreaterThan(Integer value) {
            addCriterion("machine_price >", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_price >=", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceLessThan(Integer value) {
            addCriterion("machine_price <", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceLessThanOrEqualTo(Integer value) {
            addCriterion("machine_price <=", value, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceIn(List<Integer> values) {
            addCriterion("machine_price in", values, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceNotIn(List<Integer> values) {
            addCriterion("machine_price not in", values, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceBetween(Integer value1, Integer value2) {
            addCriterion("machine_price between", value1, value2, "machinePrice");
            return (Criteria) this;
        }

        public Criteria andMachinePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_price not between", value1, value2, "machinePrice");
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