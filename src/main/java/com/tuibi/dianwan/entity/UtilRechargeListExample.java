package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilRechargeListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilRechargeListExample() {
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

        public Criteria andListIdIsNull() {
            addCriterion("list_id is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("list_id is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(Integer value) {
            addCriterion("list_id =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(Integer value) {
            addCriterion("list_id <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(Integer value) {
            addCriterion("list_id >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_id >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(Integer value) {
            addCriterion("list_id <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(Integer value) {
            addCriterion("list_id <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<Integer> values) {
            addCriterion("list_id in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<Integer> values) {
            addCriterion("list_id not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(Integer value1, Integer value2) {
            addCriterion("list_id between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("list_id not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListTypeIsNull() {
            addCriterion("list_type is null");
            return (Criteria) this;
        }

        public Criteria andListTypeIsNotNull() {
            addCriterion("list_type is not null");
            return (Criteria) this;
        }

        public Criteria andListTypeEqualTo(String value) {
            addCriterion("list_type =", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeNotEqualTo(String value) {
            addCriterion("list_type <>", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeGreaterThan(String value) {
            addCriterion("list_type >", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeGreaterThanOrEqualTo(String value) {
            addCriterion("list_type >=", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeLessThan(String value) {
            addCriterion("list_type <", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeLessThanOrEqualTo(String value) {
            addCriterion("list_type <=", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeLike(String value) {
            addCriterion("list_type like", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeNotLike(String value) {
            addCriterion("list_type not like", value, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeIn(List<String> values) {
            addCriterion("list_type in", values, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeNotIn(List<String> values) {
            addCriterion("list_type not in", values, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeBetween(String value1, String value2) {
            addCriterion("list_type between", value1, value2, "listType");
            return (Criteria) this;
        }

        public Criteria andListTypeNotBetween(String value1, String value2) {
            addCriterion("list_type not between", value1, value2, "listType");
            return (Criteria) this;
        }

        public Criteria andListChannelIsNull() {
            addCriterion("list_channel is null");
            return (Criteria) this;
        }

        public Criteria andListChannelIsNotNull() {
            addCriterion("list_channel is not null");
            return (Criteria) this;
        }

        public Criteria andListChannelEqualTo(Integer value) {
            addCriterion("list_channel =", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelNotEqualTo(Integer value) {
            addCriterion("list_channel <>", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelGreaterThan(Integer value) {
            addCriterion("list_channel >", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_channel >=", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelLessThan(Integer value) {
            addCriterion("list_channel <", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelLessThanOrEqualTo(Integer value) {
            addCriterion("list_channel <=", value, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelIn(List<Integer> values) {
            addCriterion("list_channel in", values, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelNotIn(List<Integer> values) {
            addCriterion("list_channel not in", values, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelBetween(Integer value1, Integer value2) {
            addCriterion("list_channel between", value1, value2, "listChannel");
            return (Criteria) this;
        }

        public Criteria andListChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("list_channel not between", value1, value2, "listChannel");
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

        public Criteria andListLabelIsNull() {
            addCriterion("list_label is null");
            return (Criteria) this;
        }

        public Criteria andListLabelIsNotNull() {
            addCriterion("list_label is not null");
            return (Criteria) this;
        }

        public Criteria andListLabelEqualTo(String value) {
            addCriterion("list_label =", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelNotEqualTo(String value) {
            addCriterion("list_label <>", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelGreaterThan(String value) {
            addCriterion("list_label >", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelGreaterThanOrEqualTo(String value) {
            addCriterion("list_label >=", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelLessThan(String value) {
            addCriterion("list_label <", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelLessThanOrEqualTo(String value) {
            addCriterion("list_label <=", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelLike(String value) {
            addCriterion("list_label like", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelNotLike(String value) {
            addCriterion("list_label not like", value, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelIn(List<String> values) {
            addCriterion("list_label in", values, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelNotIn(List<String> values) {
            addCriterion("list_label not in", values, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelBetween(String value1, String value2) {
            addCriterion("list_label between", value1, value2, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListLabelNotBetween(String value1, String value2) {
            addCriterion("list_label not between", value1, value2, "listLabel");
            return (Criteria) this;
        }

        public Criteria andListNameIsNull() {
            addCriterion("list_name is null");
            return (Criteria) this;
        }

        public Criteria andListNameIsNotNull() {
            addCriterion("list_name is not null");
            return (Criteria) this;
        }

        public Criteria andListNameEqualTo(String value) {
            addCriterion("list_name =", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotEqualTo(String value) {
            addCriterion("list_name <>", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThan(String value) {
            addCriterion("list_name >", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameGreaterThanOrEqualTo(String value) {
            addCriterion("list_name >=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThan(String value) {
            addCriterion("list_name <", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLessThanOrEqualTo(String value) {
            addCriterion("list_name <=", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameLike(String value) {
            addCriterion("list_name like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotLike(String value) {
            addCriterion("list_name not like", value, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameIn(List<String> values) {
            addCriterion("list_name in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotIn(List<String> values) {
            addCriterion("list_name not in", values, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameBetween(String value1, String value2) {
            addCriterion("list_name between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andListNameNotBetween(String value1, String value2) {
            addCriterion("list_name not between", value1, value2, "listName");
            return (Criteria) this;
        }

        public Criteria andListMoneyIsNull() {
            addCriterion("list_money is null");
            return (Criteria) this;
        }

        public Criteria andListMoneyIsNotNull() {
            addCriterion("list_money is not null");
            return (Criteria) this;
        }

        public Criteria andListMoneyEqualTo(Double value) {
            addCriterion("list_money =", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyNotEqualTo(Double value) {
            addCriterion("list_money <>", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyGreaterThan(Double value) {
            addCriterion("list_money >", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("list_money >=", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyLessThan(Double value) {
            addCriterion("list_money <", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyLessThanOrEqualTo(Double value) {
            addCriterion("list_money <=", value, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyIn(List<Double> values) {
            addCriterion("list_money in", values, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyNotIn(List<Double> values) {
            addCriterion("list_money not in", values, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyBetween(Double value1, Double value2) {
            addCriterion("list_money between", value1, value2, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListMoneyNotBetween(Double value1, Double value2) {
            addCriterion("list_money not between", value1, value2, "listMoney");
            return (Criteria) this;
        }

        public Criteria andListGetNumIsNull() {
            addCriterion("list_get_num is null");
            return (Criteria) this;
        }

        public Criteria andListGetNumIsNotNull() {
            addCriterion("list_get_num is not null");
            return (Criteria) this;
        }

        public Criteria andListGetNumEqualTo(Integer value) {
            addCriterion("list_get_num =", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumNotEqualTo(Integer value) {
            addCriterion("list_get_num <>", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumGreaterThan(Integer value) {
            addCriterion("list_get_num >", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_get_num >=", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumLessThan(Integer value) {
            addCriterion("list_get_num <", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumLessThanOrEqualTo(Integer value) {
            addCriterion("list_get_num <=", value, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumIn(List<Integer> values) {
            addCriterion("list_get_num in", values, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumNotIn(List<Integer> values) {
            addCriterion("list_get_num not in", values, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumBetween(Integer value1, Integer value2) {
            addCriterion("list_get_num between", value1, value2, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("list_get_num not between", value1, value2, "listGetNum");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralIsNull() {
            addCriterion("list_get_integral is null");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralIsNotNull() {
            addCriterion("list_get_integral is not null");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralEqualTo(Integer value) {
            addCriterion("list_get_integral =", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralNotEqualTo(Integer value) {
            addCriterion("list_get_integral <>", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralGreaterThan(Integer value) {
            addCriterion("list_get_integral >", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_get_integral >=", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralLessThan(Integer value) {
            addCriterion("list_get_integral <", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("list_get_integral <=", value, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralIn(List<Integer> values) {
            addCriterion("list_get_integral in", values, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralNotIn(List<Integer> values) {
            addCriterion("list_get_integral not in", values, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralBetween(Integer value1, Integer value2) {
            addCriterion("list_get_integral between", value1, value2, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListGetIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("list_get_integral not between", value1, value2, "listGetIntegral");
            return (Criteria) this;
        }

        public Criteria andListSortIsNull() {
            addCriterion("list_sort is null");
            return (Criteria) this;
        }

        public Criteria andListSortIsNotNull() {
            addCriterion("list_sort is not null");
            return (Criteria) this;
        }

        public Criteria andListSortEqualTo(Integer value) {
            addCriterion("list_sort =", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortNotEqualTo(Integer value) {
            addCriterion("list_sort <>", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortGreaterThan(Integer value) {
            addCriterion("list_sort >", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_sort >=", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortLessThan(Integer value) {
            addCriterion("list_sort <", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortLessThanOrEqualTo(Integer value) {
            addCriterion("list_sort <=", value, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortIn(List<Integer> values) {
            addCriterion("list_sort in", values, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortNotIn(List<Integer> values) {
            addCriterion("list_sort not in", values, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortBetween(Integer value1, Integer value2) {
            addCriterion("list_sort between", value1, value2, "listSort");
            return (Criteria) this;
        }

        public Criteria andListSortNotBetween(Integer value1, Integer value2) {
            addCriterion("list_sort not between", value1, value2, "listSort");
            return (Criteria) this;
        }

        public Criteria andListDataNumIsNull() {
            addCriterion("list_data_num is null");
            return (Criteria) this;
        }

        public Criteria andListDataNumIsNotNull() {
            addCriterion("list_data_num is not null");
            return (Criteria) this;
        }

        public Criteria andListDataNumEqualTo(Integer value) {
            addCriterion("list_data_num =", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumNotEqualTo(Integer value) {
            addCriterion("list_data_num <>", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumGreaterThan(Integer value) {
            addCriterion("list_data_num >", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_data_num >=", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumLessThan(Integer value) {
            addCriterion("list_data_num <", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumLessThanOrEqualTo(Integer value) {
            addCriterion("list_data_num <=", value, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumIn(List<Integer> values) {
            addCriterion("list_data_num in", values, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumNotIn(List<Integer> values) {
            addCriterion("list_data_num not in", values, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumBetween(Integer value1, Integer value2) {
            addCriterion("list_data_num between", value1, value2, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListDataNumNotBetween(Integer value1, Integer value2) {
            addCriterion("list_data_num not between", value1, value2, "listDataNum");
            return (Criteria) this;
        }

        public Criteria andListImgIsNull() {
            addCriterion("list_img is null");
            return (Criteria) this;
        }

        public Criteria andListImgIsNotNull() {
            addCriterion("list_img is not null");
            return (Criteria) this;
        }

        public Criteria andListImgEqualTo(String value) {
            addCriterion("list_img =", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotEqualTo(String value) {
            addCriterion("list_img <>", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgGreaterThan(String value) {
            addCriterion("list_img >", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgGreaterThanOrEqualTo(String value) {
            addCriterion("list_img >=", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLessThan(String value) {
            addCriterion("list_img <", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLessThanOrEqualTo(String value) {
            addCriterion("list_img <=", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgLike(String value) {
            addCriterion("list_img like", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotLike(String value) {
            addCriterion("list_img not like", value, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgIn(List<String> values) {
            addCriterion("list_img in", values, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotIn(List<String> values) {
            addCriterion("list_img not in", values, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgBetween(String value1, String value2) {
            addCriterion("list_img between", value1, value2, "listImg");
            return (Criteria) this;
        }

        public Criteria andListImgNotBetween(String value1, String value2) {
            addCriterion("list_img not between", value1, value2, "listImg");
            return (Criteria) this;
        }

        public Criteria andIsMendedIsNull() {
            addCriterion("is_mended is null");
            return (Criteria) this;
        }

        public Criteria andIsMendedIsNotNull() {
            addCriterion("is_mended is not null");
            return (Criteria) this;
        }

        public Criteria andIsMendedEqualTo(Integer value) {
            addCriterion("is_mended =", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedNotEqualTo(Integer value) {
            addCriterion("is_mended <>", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedGreaterThan(Integer value) {
            addCriterion("is_mended >", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mended >=", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedLessThan(Integer value) {
            addCriterion("is_mended <", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedLessThanOrEqualTo(Integer value) {
            addCriterion("is_mended <=", value, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedIn(List<Integer> values) {
            addCriterion("is_mended in", values, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedNotIn(List<Integer> values) {
            addCriterion("is_mended not in", values, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedBetween(Integer value1, Integer value2) {
            addCriterion("is_mended between", value1, value2, "isMended");
            return (Criteria) this;
        }

        public Criteria andIsMendedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mended not between", value1, value2, "isMended");
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

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andIsLimitIsNull() {
            addCriterion("is_limit is null");
            return (Criteria) this;
        }

        public Criteria andIsLimitIsNotNull() {
            addCriterion("is_limit is not null");
            return (Criteria) this;
        }

        public Criteria andIsLimitEqualTo(Integer value) {
            addCriterion("is_limit =", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotEqualTo(Integer value) {
            addCriterion("is_limit <>", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitGreaterThan(Integer value) {
            addCriterion("is_limit >", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_limit >=", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitLessThan(Integer value) {
            addCriterion("is_limit <", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitLessThanOrEqualTo(Integer value) {
            addCriterion("is_limit <=", value, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitIn(List<Integer> values) {
            addCriterion("is_limit in", values, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotIn(List<Integer> values) {
            addCriterion("is_limit not in", values, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitBetween(Integer value1, Integer value2) {
            addCriterion("is_limit between", value1, value2, "isLimit");
            return (Criteria) this;
        }

        public Criteria andIsLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("is_limit not between", value1, value2, "isLimit");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyIsNull() {
            addCriterion("org_list_money is null");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyIsNotNull() {
            addCriterion("org_list_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyEqualTo(Integer value) {
            addCriterion("org_list_money =", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyNotEqualTo(Integer value) {
            addCriterion("org_list_money <>", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyGreaterThan(Integer value) {
            addCriterion("org_list_money >", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_list_money >=", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyLessThan(Integer value) {
            addCriterion("org_list_money <", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("org_list_money <=", value, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyIn(List<Integer> values) {
            addCriterion("org_list_money in", values, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyNotIn(List<Integer> values) {
            addCriterion("org_list_money not in", values, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyBetween(Integer value1, Integer value2) {
            addCriterion("org_list_money between", value1, value2, "orgListMoney");
            return (Criteria) this;
        }

        public Criteria andOrgListMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("org_list_money not between", value1, value2, "orgListMoney");
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