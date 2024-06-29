package com.tuibi.dianwan.entity;

import java.util.ArrayList;
import java.util.List;

public class UtilCarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UtilCarouselExample() {
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

        public Criteria andCarouselIdIsNull() {
            addCriterion("carousel_id is null");
            return (Criteria) this;
        }

        public Criteria andCarouselIdIsNotNull() {
            addCriterion("carousel_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselIdEqualTo(Integer value) {
            addCriterion("carousel_id =", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotEqualTo(Integer value) {
            addCriterion("carousel_id <>", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdGreaterThan(Integer value) {
            addCriterion("carousel_id >", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carousel_id >=", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdLessThan(Integer value) {
            addCriterion("carousel_id <", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdLessThanOrEqualTo(Integer value) {
            addCriterion("carousel_id <=", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdIn(List<Integer> values) {
            addCriterion("carousel_id in", values, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotIn(List<Integer> values) {
            addCriterion("carousel_id not in", values, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdBetween(Integer value1, Integer value2) {
            addCriterion("carousel_id between", value1, value2, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carousel_id not between", value1, value2, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselNameIsNull() {
            addCriterion("carousel_name is null");
            return (Criteria) this;
        }

        public Criteria andCarouselNameIsNotNull() {
            addCriterion("carousel_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselNameEqualTo(String value) {
            addCriterion("carousel_name =", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameNotEqualTo(String value) {
            addCriterion("carousel_name <>", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameGreaterThan(String value) {
            addCriterion("carousel_name >", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_name >=", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameLessThan(String value) {
            addCriterion("carousel_name <", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameLessThanOrEqualTo(String value) {
            addCriterion("carousel_name <=", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameLike(String value) {
            addCriterion("carousel_name like", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameNotLike(String value) {
            addCriterion("carousel_name not like", value, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameIn(List<String> values) {
            addCriterion("carousel_name in", values, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameNotIn(List<String> values) {
            addCriterion("carousel_name not in", values, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameBetween(String value1, String value2) {
            addCriterion("carousel_name between", value1, value2, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselNameNotBetween(String value1, String value2) {
            addCriterion("carousel_name not between", value1, value2, "carouselName");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIsNull() {
            addCriterion("carousel_img is null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIsNotNull() {
            addCriterion("carousel_img is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgEqualTo(String value) {
            addCriterion("carousel_img =", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotEqualTo(String value) {
            addCriterion("carousel_img <>", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgGreaterThan(String value) {
            addCriterion("carousel_img >", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_img >=", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLessThan(String value) {
            addCriterion("carousel_img <", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLessThanOrEqualTo(String value) {
            addCriterion("carousel_img <=", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLike(String value) {
            addCriterion("carousel_img like", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotLike(String value) {
            addCriterion("carousel_img not like", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIn(List<String> values) {
            addCriterion("carousel_img in", values, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotIn(List<String> values) {
            addCriterion("carousel_img not in", values, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgBetween(String value1, String value2) {
            addCriterion("carousel_img between", value1, value2, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotBetween(String value1, String value2) {
            addCriterion("carousel_img not between", value1, value2, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselSortIsNull() {
            addCriterion("carousel_sort is null");
            return (Criteria) this;
        }

        public Criteria andCarouselSortIsNotNull() {
            addCriterion("carousel_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselSortEqualTo(Integer value) {
            addCriterion("carousel_sort =", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortNotEqualTo(Integer value) {
            addCriterion("carousel_sort <>", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortGreaterThan(Integer value) {
            addCriterion("carousel_sort >", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("carousel_sort >=", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortLessThan(Integer value) {
            addCriterion("carousel_sort <", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortLessThanOrEqualTo(Integer value) {
            addCriterion("carousel_sort <=", value, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortIn(List<Integer> values) {
            addCriterion("carousel_sort in", values, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortNotIn(List<Integer> values) {
            addCriterion("carousel_sort not in", values, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortBetween(Integer value1, Integer value2) {
            addCriterion("carousel_sort between", value1, value2, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselSortNotBetween(Integer value1, Integer value2) {
            addCriterion("carousel_sort not between", value1, value2, "carouselSort");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionIsNull() {
            addCriterion("carousel_position is null");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionIsNotNull() {
            addCriterion("carousel_position is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionEqualTo(String value) {
            addCriterion("carousel_position =", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionNotEqualTo(String value) {
            addCriterion("carousel_position <>", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionGreaterThan(String value) {
            addCriterion("carousel_position >", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_position >=", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionLessThan(String value) {
            addCriterion("carousel_position <", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionLessThanOrEqualTo(String value) {
            addCriterion("carousel_position <=", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionLike(String value) {
            addCriterion("carousel_position like", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionNotLike(String value) {
            addCriterion("carousel_position not like", value, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionIn(List<String> values) {
            addCriterion("carousel_position in", values, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionNotIn(List<String> values) {
            addCriterion("carousel_position not in", values, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionBetween(String value1, String value2) {
            addCriterion("carousel_position between", value1, value2, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselPositionNotBetween(String value1, String value2) {
            addCriterion("carousel_position not between", value1, value2, "carouselPosition");
            return (Criteria) this;
        }

        public Criteria andCarouselWayIsNull() {
            addCriterion("carousel_way is null");
            return (Criteria) this;
        }

        public Criteria andCarouselWayIsNotNull() {
            addCriterion("carousel_way is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselWayEqualTo(String value) {
            addCriterion("carousel_way =", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayNotEqualTo(String value) {
            addCriterion("carousel_way <>", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayGreaterThan(String value) {
            addCriterion("carousel_way >", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_way >=", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayLessThan(String value) {
            addCriterion("carousel_way <", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayLessThanOrEqualTo(String value) {
            addCriterion("carousel_way <=", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayLike(String value) {
            addCriterion("carousel_way like", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayNotLike(String value) {
            addCriterion("carousel_way not like", value, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayIn(List<String> values) {
            addCriterion("carousel_way in", values, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayNotIn(List<String> values) {
            addCriterion("carousel_way not in", values, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayBetween(String value1, String value2) {
            addCriterion("carousel_way between", value1, value2, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselWayNotBetween(String value1, String value2) {
            addCriterion("carousel_way not between", value1, value2, "carouselWay");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlIsNull() {
            addCriterion("carousel_url is null");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlIsNotNull() {
            addCriterion("carousel_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlEqualTo(String value) {
            addCriterion("carousel_url =", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlNotEqualTo(String value) {
            addCriterion("carousel_url <>", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlGreaterThan(String value) {
            addCriterion("carousel_url >", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_url >=", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlLessThan(String value) {
            addCriterion("carousel_url <", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlLessThanOrEqualTo(String value) {
            addCriterion("carousel_url <=", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlLike(String value) {
            addCriterion("carousel_url like", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlNotLike(String value) {
            addCriterion("carousel_url not like", value, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlIn(List<String> values) {
            addCriterion("carousel_url in", values, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlNotIn(List<String> values) {
            addCriterion("carousel_url not in", values, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlBetween(String value1, String value2) {
            addCriterion("carousel_url between", value1, value2, "carouselUrl");
            return (Criteria) this;
        }

        public Criteria andCarouselUrlNotBetween(String value1, String value2) {
            addCriterion("carousel_url not between", value1, value2, "carouselUrl");
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