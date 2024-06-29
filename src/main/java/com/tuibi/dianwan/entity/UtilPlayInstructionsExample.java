package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilPlayInstructionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilPlayInstructionsExample() {
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

        public Criteria andInstructionsIdIsNull() {
            addCriterion("instructions_id is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdIsNotNull() {
            addCriterion("instructions_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdEqualTo(Integer value) {
            addCriterion("instructions_id =", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdNotEqualTo(Integer value) {
            addCriterion("instructions_id <>", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdGreaterThan(Integer value) {
            addCriterion("instructions_id >", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructions_id >=", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdLessThan(Integer value) {
            addCriterion("instructions_id <", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("instructions_id <=", value, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdIn(List<Integer> values) {
            addCriterion("instructions_id in", values, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdNotIn(List<Integer> values) {
            addCriterion("instructions_id not in", values, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdBetween(Integer value1, Integer value2) {
            addCriterion("instructions_id between", value1, value2, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instructions_id not between", value1, value2, "instructionsId");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeIsNull() {
            addCriterion("instructions_type is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeIsNotNull() {
            addCriterion("instructions_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeEqualTo(Integer value) {
            addCriterion("instructions_type =", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeNotEqualTo(Integer value) {
            addCriterion("instructions_type <>", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeGreaterThan(Integer value) {
            addCriterion("instructions_type >", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructions_type >=", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeLessThan(Integer value) {
            addCriterion("instructions_type <", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("instructions_type <=", value, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeIn(List<Integer> values) {
            addCriterion("instructions_type in", values, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeNotIn(List<Integer> values) {
            addCriterion("instructions_type not in", values, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeBetween(Integer value1, Integer value2) {
            addCriterion("instructions_type between", value1, value2, "instructionsType");
            return (Criteria) this;
        }

        public Criteria andInstructionsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("instructions_type not between", value1, value2, "instructionsType");
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

        public Criteria andInstructionsNameIsNull() {
            addCriterion("instructions_name is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameIsNotNull() {
            addCriterion("instructions_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameEqualTo(String value) {
            addCriterion("instructions_name =", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameNotEqualTo(String value) {
            addCriterion("instructions_name <>", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameGreaterThan(String value) {
            addCriterion("instructions_name >", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameGreaterThanOrEqualTo(String value) {
            addCriterion("instructions_name >=", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameLessThan(String value) {
            addCriterion("instructions_name <", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameLessThanOrEqualTo(String value) {
            addCriterion("instructions_name <=", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameLike(String value) {
            addCriterion("instructions_name like", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameNotLike(String value) {
            addCriterion("instructions_name not like", value, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameIn(List<String> values) {
            addCriterion("instructions_name in", values, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameNotIn(List<String> values) {
            addCriterion("instructions_name not in", values, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameBetween(String value1, String value2) {
            addCriterion("instructions_name between", value1, value2, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsNameNotBetween(String value1, String value2) {
            addCriterion("instructions_name not between", value1, value2, "instructionsName");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentIsNull() {
            addCriterion("instructions_content is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentIsNotNull() {
            addCriterion("instructions_content is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentEqualTo(String value) {
            addCriterion("instructions_content =", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentNotEqualTo(String value) {
            addCriterion("instructions_content <>", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentGreaterThan(String value) {
            addCriterion("instructions_content >", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentGreaterThanOrEqualTo(String value) {
            addCriterion("instructions_content >=", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentLessThan(String value) {
            addCriterion("instructions_content <", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentLessThanOrEqualTo(String value) {
            addCriterion("instructions_content <=", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentLike(String value) {
            addCriterion("instructions_content like", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentNotLike(String value) {
            addCriterion("instructions_content not like", value, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentIn(List<String> values) {
            addCriterion("instructions_content in", values, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentNotIn(List<String> values) {
            addCriterion("instructions_content not in", values, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentBetween(String value1, String value2) {
            addCriterion("instructions_content between", value1, value2, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsContentNotBetween(String value1, String value2) {
            addCriterion("instructions_content not between", value1, value2, "instructionsContent");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortIsNull() {
            addCriterion("instructions_sort is null");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortIsNotNull() {
            addCriterion("instructions_sort is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortEqualTo(Integer value) {
            addCriterion("instructions_sort =", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortNotEqualTo(Integer value) {
            addCriterion("instructions_sort <>", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortGreaterThan(Integer value) {
            addCriterion("instructions_sort >", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("instructions_sort >=", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortLessThan(Integer value) {
            addCriterion("instructions_sort <", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortLessThanOrEqualTo(Integer value) {
            addCriterion("instructions_sort <=", value, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortIn(List<Integer> values) {
            addCriterion("instructions_sort in", values, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortNotIn(List<Integer> values) {
            addCriterion("instructions_sort not in", values, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortBetween(Integer value1, Integer value2) {
            addCriterion("instructions_sort between", value1, value2, "instructionsSort");
            return (Criteria) this;
        }

        public Criteria andInstructionsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("instructions_sort not between", value1, value2, "instructionsSort");
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

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
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