package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineMainExample() {
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

        public Criteria andMachineLogoIsNull() {
            addCriterion("machine_logo is null");
            return (Criteria) this;
        }

        public Criteria andMachineLogoIsNotNull() {
            addCriterion("machine_logo is not null");
            return (Criteria) this;
        }

        public Criteria andMachineLogoEqualTo(String value) {
            addCriterion("machine_logo =", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoNotEqualTo(String value) {
            addCriterion("machine_logo <>", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoGreaterThan(String value) {
            addCriterion("machine_logo >", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoGreaterThanOrEqualTo(String value) {
            addCriterion("machine_logo >=", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoLessThan(String value) {
            addCriterion("machine_logo <", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoLessThanOrEqualTo(String value) {
            addCriterion("machine_logo <=", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoLike(String value) {
            addCriterion("machine_logo like", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoNotLike(String value) {
            addCriterion("machine_logo not like", value, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoIn(List<String> values) {
            addCriterion("machine_logo in", values, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoNotIn(List<String> values) {
            addCriterion("machine_logo not in", values, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoBetween(String value1, String value2) {
            addCriterion("machine_logo between", value1, value2, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineLogoNotBetween(String value1, String value2) {
            addCriterion("machine_logo not between", value1, value2, "machineLogo");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNull() {
            addCriterion("machine_number is null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNotNull() {
            addCriterion("machine_number is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberEqualTo(String value) {
            addCriterion("machine_number =", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotEqualTo(String value) {
            addCriterion("machine_number <>", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThan(String value) {
            addCriterion("machine_number >", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("machine_number >=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThan(String value) {
            addCriterion("machine_number <", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThanOrEqualTo(String value) {
            addCriterion("machine_number <=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLike(String value) {
            addCriterion("machine_number like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotLike(String value) {
            addCriterion("machine_number not like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIn(List<String> values) {
            addCriterion("machine_number in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotIn(List<String> values) {
            addCriterion("machine_number not in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberBetween(String value1, String value2) {
            addCriterion("machine_number between", value1, value2, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotBetween(String value1, String value2) {
            addCriterion("machine_number not between", value1, value2, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineMp3IsNull() {
            addCriterion("machine_mp3 is null");
            return (Criteria) this;
        }

        public Criteria andMachineMp3IsNotNull() {
            addCriterion("machine_mp3 is not null");
            return (Criteria) this;
        }

        public Criteria andMachineMp3EqualTo(String value) {
            addCriterion("machine_mp3 =", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3NotEqualTo(String value) {
            addCriterion("machine_mp3 <>", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3GreaterThan(String value) {
            addCriterion("machine_mp3 >", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3GreaterThanOrEqualTo(String value) {
            addCriterion("machine_mp3 >=", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3LessThan(String value) {
            addCriterion("machine_mp3 <", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3LessThanOrEqualTo(String value) {
            addCriterion("machine_mp3 <=", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3Like(String value) {
            addCriterion("machine_mp3 like", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3NotLike(String value) {
            addCriterion("machine_mp3 not like", value, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3In(List<String> values) {
            addCriterion("machine_mp3 in", values, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3NotIn(List<String> values) {
            addCriterion("machine_mp3 not in", values, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3Between(String value1, String value2) {
            addCriterion("machine_mp3 between", value1, value2, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineMp3NotBetween(String value1, String value2) {
            addCriterion("machine_mp3 not between", value1, value2, "machineMp3");
            return (Criteria) this;
        }

        public Criteria andMachineOrderIsNull() {
            addCriterion("machine_order is null");
            return (Criteria) this;
        }

        public Criteria andMachineOrderIsNotNull() {
            addCriterion("machine_order is not null");
            return (Criteria) this;
        }

        public Criteria andMachineOrderEqualTo(Integer value) {
            addCriterion("machine_order =", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderNotEqualTo(Integer value) {
            addCriterion("machine_order <>", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderGreaterThan(Integer value) {
            addCriterion("machine_order >", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_order >=", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderLessThan(Integer value) {
            addCriterion("machine_order <", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderLessThanOrEqualTo(Integer value) {
            addCriterion("machine_order <=", value, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderIn(List<Integer> values) {
            addCriterion("machine_order in", values, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderNotIn(List<Integer> values) {
            addCriterion("machine_order not in", values, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderBetween(Integer value1, Integer value2) {
            addCriterion("machine_order between", value1, value2, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_order not between", value1, value2, "machineOrder");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgIsNull() {
            addCriterion("machine_detail_img is null");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgIsNotNull() {
            addCriterion("machine_detail_img is not null");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgEqualTo(String value) {
            addCriterion("machine_detail_img =", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgNotEqualTo(String value) {
            addCriterion("machine_detail_img <>", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgGreaterThan(String value) {
            addCriterion("machine_detail_img >", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgGreaterThanOrEqualTo(String value) {
            addCriterion("machine_detail_img >=", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgLessThan(String value) {
            addCriterion("machine_detail_img <", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgLessThanOrEqualTo(String value) {
            addCriterion("machine_detail_img <=", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgLike(String value) {
            addCriterion("machine_detail_img like", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgNotLike(String value) {
            addCriterion("machine_detail_img not like", value, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgIn(List<String> values) {
            addCriterion("machine_detail_img in", values, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgNotIn(List<String> values) {
            addCriterion("machine_detail_img not in", values, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgBetween(String value1, String value2) {
            addCriterion("machine_detail_img between", value1, value2, "machineDetailImg");
            return (Criteria) this;
        }

        public Criteria andMachineDetailImgNotBetween(String value1, String value2) {
            addCriterion("machine_detail_img not between", value1, value2, "machineDetailImg");
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

        public Criteria andMachineAliasIsNull() {
            addCriterion("machine_alias is null");
            return (Criteria) this;
        }

        public Criteria andMachineAliasIsNotNull() {
            addCriterion("machine_alias is not null");
            return (Criteria) this;
        }

        public Criteria andMachineAliasEqualTo(String value) {
            addCriterion("machine_alias =", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasNotEqualTo(String value) {
            addCriterion("machine_alias <>", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasGreaterThan(String value) {
            addCriterion("machine_alias >", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasGreaterThanOrEqualTo(String value) {
            addCriterion("machine_alias >=", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasLessThan(String value) {
            addCriterion("machine_alias <", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasLessThanOrEqualTo(String value) {
            addCriterion("machine_alias <=", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasLike(String value) {
            addCriterion("machine_alias like", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasNotLike(String value) {
            addCriterion("machine_alias not like", value, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasIn(List<String> values) {
            addCriterion("machine_alias in", values, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasNotIn(List<String> values) {
            addCriterion("machine_alias not in", values, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasBetween(String value1, String value2) {
            addCriterion("machine_alias between", value1, value2, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineAliasNotBetween(String value1, String value2) {
            addCriterion("machine_alias not between", value1, value2, "machineAlias");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1IsNull() {
            addCriterion("machine_live_url1 is null");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1IsNotNull() {
            addCriterion("machine_live_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1EqualTo(String value) {
            addCriterion("machine_live_url1 =", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1NotEqualTo(String value) {
            addCriterion("machine_live_url1 <>", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1GreaterThan(String value) {
            addCriterion("machine_live_url1 >", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("machine_live_url1 >=", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1LessThan(String value) {
            addCriterion("machine_live_url1 <", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1LessThanOrEqualTo(String value) {
            addCriterion("machine_live_url1 <=", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1Like(String value) {
            addCriterion("machine_live_url1 like", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1NotLike(String value) {
            addCriterion("machine_live_url1 not like", value, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1In(List<String> values) {
            addCriterion("machine_live_url1 in", values, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1NotIn(List<String> values) {
            addCriterion("machine_live_url1 not in", values, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1Between(String value1, String value2) {
            addCriterion("machine_live_url1 between", value1, value2, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl1NotBetween(String value1, String value2) {
            addCriterion("machine_live_url1 not between", value1, value2, "machineLiveUrl1");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2IsNull() {
            addCriterion("machine_live_url2 is null");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2IsNotNull() {
            addCriterion("machine_live_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2EqualTo(String value) {
            addCriterion("machine_live_url2 =", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2NotEqualTo(String value) {
            addCriterion("machine_live_url2 <>", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2GreaterThan(String value) {
            addCriterion("machine_live_url2 >", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("machine_live_url2 >=", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2LessThan(String value) {
            addCriterion("machine_live_url2 <", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2LessThanOrEqualTo(String value) {
            addCriterion("machine_live_url2 <=", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2Like(String value) {
            addCriterion("machine_live_url2 like", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2NotLike(String value) {
            addCriterion("machine_live_url2 not like", value, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2In(List<String> values) {
            addCriterion("machine_live_url2 in", values, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2NotIn(List<String> values) {
            addCriterion("machine_live_url2 not in", values, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2Between(String value1, String value2) {
            addCriterion("machine_live_url2 between", value1, value2, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineLiveUrl2NotBetween(String value1, String value2) {
            addCriterion("machine_live_url2 not between", value1, value2, "machineLiveUrl2");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIsNull() {
            addCriterion("machine_type is null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIsNotNull() {
            addCriterion("machine_type is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeEqualTo(String value) {
            addCriterion("machine_type =", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotEqualTo(String value) {
            addCriterion("machine_type <>", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeGreaterThan(String value) {
            addCriterion("machine_type >", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_type >=", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLessThan(String value) {
            addCriterion("machine_type <", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLessThanOrEqualTo(String value) {
            addCriterion("machine_type <=", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeLike(String value) {
            addCriterion("machine_type like", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotLike(String value) {
            addCriterion("machine_type not like", value, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeIn(List<String> values) {
            addCriterion("machine_type in", values, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotIn(List<String> values) {
            addCriterion("machine_type not in", values, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeBetween(String value1, String value2) {
            addCriterion("machine_type between", value1, value2, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineTypeNotBetween(String value1, String value2) {
            addCriterion("machine_type not between", value1, value2, "machineType");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostIsNull() {
            addCriterion("machine_entry_cost is null");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostIsNotNull() {
            addCriterion("machine_entry_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostEqualTo(Integer value) {
            addCriterion("machine_entry_cost =", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostNotEqualTo(Integer value) {
            addCriterion("machine_entry_cost <>", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostGreaterThan(Integer value) {
            addCriterion("machine_entry_cost >", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_entry_cost >=", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostLessThan(Integer value) {
            addCriterion("machine_entry_cost <", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostLessThanOrEqualTo(Integer value) {
            addCriterion("machine_entry_cost <=", value, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostIn(List<Integer> values) {
            addCriterion("machine_entry_cost in", values, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostNotIn(List<Integer> values) {
            addCriterion("machine_entry_cost not in", values, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostBetween(Integer value1, Integer value2) {
            addCriterion("machine_entry_cost between", value1, value2, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachineEntryCostNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_entry_cost not between", value1, value2, "machineEntryCost");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetIsNull() {
            addCriterion("machine_push_get is null");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetIsNotNull() {
            addCriterion("machine_push_get is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetEqualTo(Integer value) {
            addCriterion("machine_push_get =", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetNotEqualTo(Integer value) {
            addCriterion("machine_push_get <>", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetGreaterThan(Integer value) {
            addCriterion("machine_push_get >", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_push_get >=", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetLessThan(Integer value) {
            addCriterion("machine_push_get <", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetLessThanOrEqualTo(Integer value) {
            addCriterion("machine_push_get <=", value, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetIn(List<Integer> values) {
            addCriterion("machine_push_get in", values, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetNotIn(List<Integer> values) {
            addCriterion("machine_push_get not in", values, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetBetween(Integer value1, Integer value2) {
            addCriterion("machine_push_get between", value1, value2, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushGetNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_push_get not between", value1, value2, "machinePushGet");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseIsNull() {
            addCriterion("machine_push_lose is null");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseIsNotNull() {
            addCriterion("machine_push_lose is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseEqualTo(Integer value) {
            addCriterion("machine_push_lose =", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseNotEqualTo(Integer value) {
            addCriterion("machine_push_lose <>", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseGreaterThan(Integer value) {
            addCriterion("machine_push_lose >", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_push_lose >=", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseLessThan(Integer value) {
            addCriterion("machine_push_lose <", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseLessThanOrEqualTo(Integer value) {
            addCriterion("machine_push_lose <=", value, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseIn(List<Integer> values) {
            addCriterion("machine_push_lose in", values, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseNotIn(List<Integer> values) {
            addCriterion("machine_push_lose not in", values, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseBetween(Integer value1, Integer value2) {
            addCriterion("machine_push_lose between", value1, value2, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andMachinePushLoseNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_push_lose not between", value1, value2, "machinePushLose");
            return (Criteria) this;
        }

        public Criteria andUserPriceIsNull() {
            addCriterion("user_price is null");
            return (Criteria) this;
        }

        public Criteria andUserPriceIsNotNull() {
            addCriterion("user_price is not null");
            return (Criteria) this;
        }

        public Criteria andUserPriceEqualTo(Integer value) {
            addCriterion("user_price =", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotEqualTo(Integer value) {
            addCriterion("user_price <>", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceGreaterThan(Integer value) {
            addCriterion("user_price >", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_price >=", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceLessThan(Integer value) {
            addCriterion("user_price <", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceLessThanOrEqualTo(Integer value) {
            addCriterion("user_price <=", value, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceIn(List<Integer> values) {
            addCriterion("user_price in", values, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotIn(List<Integer> values) {
            addCriterion("user_price not in", values, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceBetween(Integer value1, Integer value2) {
            addCriterion("user_price between", value1, value2, "userPrice");
            return (Criteria) this;
        }

        public Criteria andUserPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("user_price not between", value1, value2, "userPrice");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeIsNull() {
            addCriterion("machine_user_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeIsNotNull() {
            addCriterion("machine_user_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeEqualTo(String value) {
            addCriterion("machine_user_time =", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeNotEqualTo(String value) {
            addCriterion("machine_user_time <>", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeGreaterThan(String value) {
            addCriterion("machine_user_time >", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_user_time >=", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeLessThan(String value) {
            addCriterion("machine_user_time <", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeLessThanOrEqualTo(String value) {
            addCriterion("machine_user_time <=", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeLike(String value) {
            addCriterion("machine_user_time like", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeNotLike(String value) {
            addCriterion("machine_user_time not like", value, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeIn(List<String> values) {
            addCriterion("machine_user_time in", values, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeNotIn(List<String> values) {
            addCriterion("machine_user_time not in", values, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeBetween(String value1, String value2) {
            addCriterion("machine_user_time between", value1, value2, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserTimeNotBetween(String value1, String value2) {
            addCriterion("machine_user_time not between", value1, value2, "machineUserTime");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoIsNull() {
            addCriterion("machine_user_info is null");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoIsNotNull() {
            addCriterion("machine_user_info is not null");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoEqualTo(String value) {
            addCriterion("machine_user_info =", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoNotEqualTo(String value) {
            addCriterion("machine_user_info <>", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoGreaterThan(String value) {
            addCriterion("machine_user_info >", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("machine_user_info >=", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoLessThan(String value) {
            addCriterion("machine_user_info <", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoLessThanOrEqualTo(String value) {
            addCriterion("machine_user_info <=", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoLike(String value) {
            addCriterion("machine_user_info like", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoNotLike(String value) {
            addCriterion("machine_user_info not like", value, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoIn(List<String> values) {
            addCriterion("machine_user_info in", values, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoNotIn(List<String> values) {
            addCriterion("machine_user_info not in", values, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoBetween(String value1, String value2) {
            addCriterion("machine_user_info between", value1, value2, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineUserInfoNotBetween(String value1, String value2) {
            addCriterion("machine_user_info not between", value1, value2, "machineUserInfo");
            return (Criteria) this;
        }

        public Criteria andMachineTypesIsNull() {
            addCriterion("machine_types is null");
            return (Criteria) this;
        }

        public Criteria andMachineTypesIsNotNull() {
            addCriterion("machine_types is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTypesEqualTo(Integer value) {
            addCriterion("machine_types =", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesNotEqualTo(Integer value) {
            addCriterion("machine_types <>", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesGreaterThan(Integer value) {
            addCriterion("machine_types >", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_types >=", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesLessThan(Integer value) {
            addCriterion("machine_types <", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesLessThanOrEqualTo(Integer value) {
            addCriterion("machine_types <=", value, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesIn(List<Integer> values) {
            addCriterion("machine_types in", values, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesNotIn(List<Integer> values) {
            addCriterion("machine_types not in", values, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesBetween(Integer value1, Integer value2) {
            addCriterion("machine_types between", value1, value2, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachineTypesNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_types not between", value1, value2, "machineTypes");
            return (Criteria) this;
        }

        public Criteria andMachinePositionIsNull() {
            addCriterion("machine_position is null");
            return (Criteria) this;
        }

        public Criteria andMachinePositionIsNotNull() {
            addCriterion("machine_position is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePositionEqualTo(Integer value) {
            addCriterion("machine_position =", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionNotEqualTo(Integer value) {
            addCriterion("machine_position <>", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionGreaterThan(Integer value) {
            addCriterion("machine_position >", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_position >=", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionLessThan(Integer value) {
            addCriterion("machine_position <", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionLessThanOrEqualTo(Integer value) {
            addCriterion("machine_position <=", value, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionIn(List<Integer> values) {
            addCriterion("machine_position in", values, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionNotIn(List<Integer> values) {
            addCriterion("machine_position not in", values, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionBetween(Integer value1, Integer value2) {
            addCriterion("machine_position between", value1, value2, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachinePositionNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_position not between", value1, value2, "machinePosition");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIsNull() {
            addCriterion("machine_group_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIsNotNull() {
            addCriterion("machine_group_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumEqualTo(Integer value) {
            addCriterion("machine_group_num =", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotEqualTo(Integer value) {
            addCriterion("machine_group_num <>", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumGreaterThan(Integer value) {
            addCriterion("machine_group_num >", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_group_num >=", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumLessThan(Integer value) {
            addCriterion("machine_group_num <", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_group_num <=", value, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumIn(List<Integer> values) {
            addCriterion("machine_group_num in", values, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotIn(List<Integer> values) {
            addCriterion("machine_group_num not in", values, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_group_num between", value1, value2, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachineGroupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_group_num not between", value1, value2, "machineGroupNum");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeIsNull() {
            addCriterion("machine_prize_time is null");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeIsNotNull() {
            addCriterion("machine_prize_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeEqualTo(String value) {
            addCriterion("machine_prize_time =", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeNotEqualTo(String value) {
            addCriterion("machine_prize_time <>", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeGreaterThan(String value) {
            addCriterion("machine_prize_time >", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("machine_prize_time >=", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeLessThan(String value) {
            addCriterion("machine_prize_time <", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeLessThanOrEqualTo(String value) {
            addCriterion("machine_prize_time <=", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeLike(String value) {
            addCriterion("machine_prize_time like", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeNotLike(String value) {
            addCriterion("machine_prize_time not like", value, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeIn(List<String> values) {
            addCriterion("machine_prize_time in", values, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeNotIn(List<String> values) {
            addCriterion("machine_prize_time not in", values, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeBetween(String value1, String value2) {
            addCriterion("machine_prize_time between", value1, value2, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachinePrizeTimeNotBetween(String value1, String value2) {
            addCriterion("machine_prize_time not between", value1, value2, "machinePrizeTime");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesIsNull() {
            addCriterion("machine_bonus_times is null");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesIsNotNull() {
            addCriterion("machine_bonus_times is not null");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesEqualTo(Double value) {
            addCriterion("machine_bonus_times =", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesNotEqualTo(Double value) {
            addCriterion("machine_bonus_times <>", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesGreaterThan(Double value) {
            addCriterion("machine_bonus_times >", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesGreaterThanOrEqualTo(Double value) {
            addCriterion("machine_bonus_times >=", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesLessThan(Double value) {
            addCriterion("machine_bonus_times <", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesLessThanOrEqualTo(Double value) {
            addCriterion("machine_bonus_times <=", value, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesIn(List<Double> values) {
            addCriterion("machine_bonus_times in", values, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesNotIn(List<Double> values) {
            addCriterion("machine_bonus_times not in", values, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesBetween(Double value1, Double value2) {
            addCriterion("machine_bonus_times between", value1, value2, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusTimesNotBetween(Double value1, Double value2) {
            addCriterion("machine_bonus_times not between", value1, value2, "machineBonusTimes");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdIsNull() {
            addCriterion("machine_bonus_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdIsNotNull() {
            addCriterion("machine_bonus_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdEqualTo(String value) {
            addCriterion("machine_bonus_user_id =", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdNotEqualTo(String value) {
            addCriterion("machine_bonus_user_id <>", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdGreaterThan(String value) {
            addCriterion("machine_bonus_user_id >", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("machine_bonus_user_id >=", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdLessThan(String value) {
            addCriterion("machine_bonus_user_id <", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdLessThanOrEqualTo(String value) {
            addCriterion("machine_bonus_user_id <=", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdLike(String value) {
            addCriterion("machine_bonus_user_id like", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdNotLike(String value) {
            addCriterion("machine_bonus_user_id not like", value, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdIn(List<String> values) {
            addCriterion("machine_bonus_user_id in", values, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdNotIn(List<String> values) {
            addCriterion("machine_bonus_user_id not in", values, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdBetween(String value1, String value2) {
            addCriterion("machine_bonus_user_id between", value1, value2, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineBonusUserIdNotBetween(String value1, String value2) {
            addCriterion("machine_bonus_user_id not between", value1, value2, "machineBonusUserId");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeIsNull() {
            addCriterion("machine_watch_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeIsNotNull() {
            addCriterion("machine_watch_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeEqualTo(Double value) {
            addCriterion("machine_watch_time =", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeNotEqualTo(Double value) {
            addCriterion("machine_watch_time <>", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeGreaterThan(Double value) {
            addCriterion("machine_watch_time >", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("machine_watch_time >=", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeLessThan(Double value) {
            addCriterion("machine_watch_time <", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeLessThanOrEqualTo(Double value) {
            addCriterion("machine_watch_time <=", value, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeIn(List<Double> values) {
            addCriterion("machine_watch_time in", values, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeNotIn(List<Double> values) {
            addCriterion("machine_watch_time not in", values, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeBetween(Double value1, Double value2) {
            addCriterion("machine_watch_time between", value1, value2, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineWatchTimeNotBetween(Double value1, Double value2) {
            addCriterion("machine_watch_time not between", value1, value2, "machineWatchTime");
            return (Criteria) this;
        }

        public Criteria andMachineFlipIsNull() {
            addCriterion("machine_flip is null");
            return (Criteria) this;
        }

        public Criteria andMachineFlipIsNotNull() {
            addCriterion("machine_flip is not null");
            return (Criteria) this;
        }

        public Criteria andMachineFlipEqualTo(Integer value) {
            addCriterion("machine_flip =", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipNotEqualTo(Integer value) {
            addCriterion("machine_flip <>", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipGreaterThan(Integer value) {
            addCriterion("machine_flip >", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_flip >=", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipLessThan(Integer value) {
            addCriterion("machine_flip <", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipLessThanOrEqualTo(Integer value) {
            addCriterion("machine_flip <=", value, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipIn(List<Integer> values) {
            addCriterion("machine_flip in", values, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipNotIn(List<Integer> values) {
            addCriterion("machine_flip not in", values, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipBetween(Integer value1, Integer value2) {
            addCriterion("machine_flip between", value1, value2, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineFlipNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_flip not between", value1, value2, "machineFlip");
            return (Criteria) this;
        }

        public Criteria andMachineTimeIsNull() {
            addCriterion("machine_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineTimeIsNotNull() {
            addCriterion("machine_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTimeEqualTo(Integer value) {
            addCriterion("machine_time =", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeNotEqualTo(Integer value) {
            addCriterion("machine_time <>", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeGreaterThan(Integer value) {
            addCriterion("machine_time >", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_time >=", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeLessThan(Integer value) {
            addCriterion("machine_time <", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeLessThanOrEqualTo(Integer value) {
            addCriterion("machine_time <=", value, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeIn(List<Integer> values) {
            addCriterion("machine_time in", values, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeNotIn(List<Integer> values) {
            addCriterion("machine_time not in", values, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeBetween(Integer value1, Integer value2) {
            addCriterion("machine_time between", value1, value2, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_time not between", value1, value2, "machineTime");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostIsNull() {
            addCriterion("machine_type_cost is null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostIsNotNull() {
            addCriterion("machine_type_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostEqualTo(Integer value) {
            addCriterion("machine_type_cost =", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostNotEqualTo(Integer value) {
            addCriterion("machine_type_cost <>", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostGreaterThan(Integer value) {
            addCriterion("machine_type_cost >", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_type_cost >=", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostLessThan(Integer value) {
            addCriterion("machine_type_cost <", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostLessThanOrEqualTo(Integer value) {
            addCriterion("machine_type_cost <=", value, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostIn(List<Integer> values) {
            addCriterion("machine_type_cost in", values, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostNotIn(List<Integer> values) {
            addCriterion("machine_type_cost not in", values, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostBetween(Integer value1, Integer value2) {
            addCriterion("machine_type_cost between", value1, value2, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineTypeCostNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_type_cost not between", value1, value2, "machineTypeCost");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumIsNull() {
            addCriterion("machine_branch_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumIsNotNull() {
            addCriterion("machine_branch_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumEqualTo(Integer value) {
            addCriterion("machine_branch_num =", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumNotEqualTo(Integer value) {
            addCriterion("machine_branch_num <>", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumGreaterThan(Integer value) {
            addCriterion("machine_branch_num >", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_branch_num >=", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumLessThan(Integer value) {
            addCriterion("machine_branch_num <", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_branch_num <=", value, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumIn(List<Integer> values) {
            addCriterion("machine_branch_num in", values, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumNotIn(List<Integer> values) {
            addCriterion("machine_branch_num not in", values, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_branch_num between", value1, value2, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineBranchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_branch_num not between", value1, value2, "machineBranchNum");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpIsNull() {
            addCriterion("machine_fenliu_ip is null");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpIsNotNull() {
            addCriterion("machine_fenliu_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpEqualTo(String value) {
            addCriterion("machine_fenliu_ip =", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpNotEqualTo(String value) {
            addCriterion("machine_fenliu_ip <>", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpGreaterThan(String value) {
            addCriterion("machine_fenliu_ip >", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpGreaterThanOrEqualTo(String value) {
            addCriterion("machine_fenliu_ip >=", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpLessThan(String value) {
            addCriterion("machine_fenliu_ip <", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpLessThanOrEqualTo(String value) {
            addCriterion("machine_fenliu_ip <=", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpLike(String value) {
            addCriterion("machine_fenliu_ip like", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpNotLike(String value) {
            addCriterion("machine_fenliu_ip not like", value, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpIn(List<String> values) {
            addCriterion("machine_fenliu_ip in", values, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpNotIn(List<String> values) {
            addCriterion("machine_fenliu_ip not in", values, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpBetween(String value1, String value2) {
            addCriterion("machine_fenliu_ip between", value1, value2, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineFenliuIpNotBetween(String value1, String value2) {
            addCriterion("machine_fenliu_ip not between", value1, value2, "machineFenliuIp");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeIsNull() {
            addCriterion("machine_is_privilege is null");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeIsNotNull() {
            addCriterion("machine_is_privilege is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeEqualTo(Integer value) {
            addCriterion("machine_is_privilege =", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeNotEqualTo(Integer value) {
            addCriterion("machine_is_privilege <>", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeGreaterThan(Integer value) {
            addCriterion("machine_is_privilege >", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_is_privilege >=", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeLessThan(Integer value) {
            addCriterion("machine_is_privilege <", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeLessThanOrEqualTo(Integer value) {
            addCriterion("machine_is_privilege <=", value, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeIn(List<Integer> values) {
            addCriterion("machine_is_privilege in", values, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeNotIn(List<Integer> values) {
            addCriterion("machine_is_privilege not in", values, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeBetween(Integer value1, Integer value2) {
            addCriterion("machine_is_privilege between", value1, value2, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineIsPrivilegeNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_is_privilege not between", value1, value2, "machineIsPrivilege");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceIsNull() {
            addCriterion("machine_time_price is null");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceIsNotNull() {
            addCriterion("machine_time_price is not null");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceEqualTo(Integer value) {
            addCriterion("machine_time_price =", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceNotEqualTo(Integer value) {
            addCriterion("machine_time_price <>", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceGreaterThan(Integer value) {
            addCriterion("machine_time_price >", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_time_price >=", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceLessThan(Integer value) {
            addCriterion("machine_time_price <", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceLessThanOrEqualTo(Integer value) {
            addCriterion("machine_time_price <=", value, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceIn(List<Integer> values) {
            addCriterion("machine_time_price in", values, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceNotIn(List<Integer> values) {
            addCriterion("machine_time_price not in", values, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceBetween(Integer value1, Integer value2) {
            addCriterion("machine_time_price between", value1, value2, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineTimePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_time_price not between", value1, value2, "machineTimePrice");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumIsNull() {
            addCriterion("machine_reward_achieve_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumIsNotNull() {
            addCriterion("machine_reward_achieve_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumEqualTo(Integer value) {
            addCriterion("machine_reward_achieve_num =", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumNotEqualTo(Integer value) {
            addCriterion("machine_reward_achieve_num <>", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumGreaterThan(Integer value) {
            addCriterion("machine_reward_achieve_num >", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_reward_achieve_num >=", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumLessThan(Integer value) {
            addCriterion("machine_reward_achieve_num <", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_reward_achieve_num <=", value, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumIn(List<Integer> values) {
            addCriterion("machine_reward_achieve_num in", values, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumNotIn(List<Integer> values) {
            addCriterion("machine_reward_achieve_num not in", values, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_reward_achieve_num between", value1, value2, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardAchieveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_reward_achieve_num not between", value1, value2, "machineRewardAchieveNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumIsNull() {
            addCriterion("machine_reward_num is null");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumIsNotNull() {
            addCriterion("machine_reward_num is not null");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumEqualTo(Integer value) {
            addCriterion("machine_reward_num =", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumNotEqualTo(Integer value) {
            addCriterion("machine_reward_num <>", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumGreaterThan(Integer value) {
            addCriterion("machine_reward_num >", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_reward_num >=", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumLessThan(Integer value) {
            addCriterion("machine_reward_num <", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumLessThanOrEqualTo(Integer value) {
            addCriterion("machine_reward_num <=", value, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumIn(List<Integer> values) {
            addCriterion("machine_reward_num in", values, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumNotIn(List<Integer> values) {
            addCriterion("machine_reward_num not in", values, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumBetween(Integer value1, Integer value2) {
            addCriterion("machine_reward_num between", value1, value2, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMachineRewardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_reward_num not between", value1, value2, "machineRewardNum");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(Integer value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Integer value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Integer value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Integer value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Integer value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Integer> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Integer> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Integer value1, Integer value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
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

        public Criteria andMachineIntegralIsNull() {
            addCriterion("machine_integral is null");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralIsNotNull() {
            addCriterion("machine_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralEqualTo(Integer value) {
            addCriterion("machine_integral =", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralNotEqualTo(Integer value) {
            addCriterion("machine_integral <>", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralGreaterThan(Integer value) {
            addCriterion("machine_integral >", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_integral >=", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralLessThan(Integer value) {
            addCriterion("machine_integral <", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("machine_integral <=", value, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralIn(List<Integer> values) {
            addCriterion("machine_integral in", values, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralNotIn(List<Integer> values) {
            addCriterion("machine_integral not in", values, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralBetween(Integer value1, Integer value2) {
            addCriterion("machine_integral between", value1, value2, "machineIntegral");
            return (Criteria) this;
        }

        public Criteria andMachineIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_integral not between", value1, value2, "machineIntegral");
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

        public Criteria andJixiuAccountIsNull() {
            addCriterion("jixiu_account is null");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountIsNotNull() {
            addCriterion("jixiu_account is not null");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountEqualTo(String value) {
            addCriterion("jixiu_account =", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountNotEqualTo(String value) {
            addCriterion("jixiu_account <>", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountGreaterThan(String value) {
            addCriterion("jixiu_account >", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountGreaterThanOrEqualTo(String value) {
            addCriterion("jixiu_account >=", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountLessThan(String value) {
            addCriterion("jixiu_account <", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountLessThanOrEqualTo(String value) {
            addCriterion("jixiu_account <=", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountLike(String value) {
            addCriterion("jixiu_account like", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountNotLike(String value) {
            addCriterion("jixiu_account not like", value, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountIn(List<String> values) {
            addCriterion("jixiu_account in", values, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountNotIn(List<String> values) {
            addCriterion("jixiu_account not in", values, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountBetween(String value1, String value2) {
            addCriterion("jixiu_account between", value1, value2, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andJixiuAccountNotBetween(String value1, String value2) {
            addCriterion("jixiu_account not between", value1, value2, "jixiuAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerIsNull() {
            addCriterion("is_new_player is null");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerIsNotNull() {
            addCriterion("is_new_player is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerEqualTo(Integer value) {
            addCriterion("is_new_player =", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerNotEqualTo(Integer value) {
            addCriterion("is_new_player <>", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerGreaterThan(Integer value) {
            addCriterion("is_new_player >", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_new_player >=", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerLessThan(Integer value) {
            addCriterion("is_new_player <", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerLessThanOrEqualTo(Integer value) {
            addCriterion("is_new_player <=", value, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerIn(List<Integer> values) {
            addCriterion("is_new_player in", values, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerNotIn(List<Integer> values) {
            addCriterion("is_new_player not in", values, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerBetween(Integer value1, Integer value2) {
            addCriterion("is_new_player between", value1, value2, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andIsNewPlayerNotBetween(Integer value1, Integer value2) {
            addCriterion("is_new_player not between", value1, value2, "isNewPlayer");
            return (Criteria) this;
        }

        public Criteria andBlackIdsIsNull() {
            addCriterion("black_ids is null");
            return (Criteria) this;
        }

        public Criteria andBlackIdsIsNotNull() {
            addCriterion("black_ids is not null");
            return (Criteria) this;
        }

        public Criteria andBlackIdsEqualTo(String value) {
            addCriterion("black_ids =", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsNotEqualTo(String value) {
            addCriterion("black_ids <>", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsGreaterThan(String value) {
            addCriterion("black_ids >", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsGreaterThanOrEqualTo(String value) {
            addCriterion("black_ids >=", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsLessThan(String value) {
            addCriterion("black_ids <", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsLessThanOrEqualTo(String value) {
            addCriterion("black_ids <=", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsLike(String value) {
            addCriterion("black_ids like", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsNotLike(String value) {
            addCriterion("black_ids not like", value, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsIn(List<String> values) {
            addCriterion("black_ids in", values, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsNotIn(List<String> values) {
            addCriterion("black_ids not in", values, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsBetween(String value1, String value2) {
            addCriterion("black_ids between", value1, value2, "blackIds");
            return (Criteria) this;
        }

        public Criteria andBlackIdsNotBetween(String value1, String value2) {
            addCriterion("black_ids not between", value1, value2, "blackIds");
            return (Criteria) this;
        }

        public Criteria andNewMachineIsNull() {
            addCriterion("new_machine is null");
            return (Criteria) this;
        }

        public Criteria andNewMachineIsNotNull() {
            addCriterion("new_machine is not null");
            return (Criteria) this;
        }

        public Criteria andNewMachineEqualTo(Integer value) {
            addCriterion("new_machine =", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineNotEqualTo(Integer value) {
            addCriterion("new_machine <>", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineGreaterThan(Integer value) {
            addCriterion("new_machine >", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_machine >=", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineLessThan(Integer value) {
            addCriterion("new_machine <", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineLessThanOrEqualTo(Integer value) {
            addCriterion("new_machine <=", value, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineIn(List<Integer> values) {
            addCriterion("new_machine in", values, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineNotIn(List<Integer> values) {
            addCriterion("new_machine not in", values, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineBetween(Integer value1, Integer value2) {
            addCriterion("new_machine between", value1, value2, "newMachine");
            return (Criteria) this;
        }

        public Criteria andNewMachineNotBetween(Integer value1, Integer value2) {
            addCriterion("new_machine not between", value1, value2, "newMachine");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceIsNull() {
            addCriterion("multiple_price is null");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceIsNotNull() {
            addCriterion("multiple_price is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceEqualTo(String value) {
            addCriterion("multiple_price =", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceNotEqualTo(String value) {
            addCriterion("multiple_price <>", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceGreaterThan(String value) {
            addCriterion("multiple_price >", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceGreaterThanOrEqualTo(String value) {
            addCriterion("multiple_price >=", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceLessThan(String value) {
            addCriterion("multiple_price <", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceLessThanOrEqualTo(String value) {
            addCriterion("multiple_price <=", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceLike(String value) {
            addCriterion("multiple_price like", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceNotLike(String value) {
            addCriterion("multiple_price not like", value, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceIn(List<String> values) {
            addCriterion("multiple_price in", values, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceNotIn(List<String> values) {
            addCriterion("multiple_price not in", values, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceBetween(String value1, String value2) {
            addCriterion("multiple_price between", value1, value2, "multiplePrice");
            return (Criteria) this;
        }

        public Criteria andMultiplePriceNotBetween(String value1, String value2) {
            addCriterion("multiple_price not between", value1, value2, "multiplePrice");
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