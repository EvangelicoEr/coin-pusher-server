package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TMarqueeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMarqueeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlaySceneIsNull() {
            addCriterion("play_scene is null");
            return (Criteria) this;
        }

        public Criteria andPlaySceneIsNotNull() {
            addCriterion("play_scene is not null");
            return (Criteria) this;
        }

        public Criteria andPlaySceneEqualTo(String value) {
            addCriterion("play_scene =", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneNotEqualTo(String value) {
            addCriterion("play_scene <>", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneGreaterThan(String value) {
            addCriterion("play_scene >", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneGreaterThanOrEqualTo(String value) {
            addCriterion("play_scene >=", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneLessThan(String value) {
            addCriterion("play_scene <", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneLessThanOrEqualTo(String value) {
            addCriterion("play_scene <=", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneLike(String value) {
            addCriterion("play_scene like", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneNotLike(String value) {
            addCriterion("play_scene not like", value, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneIn(List<String> values) {
            addCriterion("play_scene in", values, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneNotIn(List<String> values) {
            addCriterion("play_scene not in", values, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneBetween(String value1, String value2) {
            addCriterion("play_scene between", value1, value2, "playScene");
            return (Criteria) this;
        }

        public Criteria andPlaySceneNotBetween(String value1, String value2) {
            addCriterion("play_scene not between", value1, value2, "playScene");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformIsNull() {
            addCriterion("open_platform is null");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformIsNotNull() {
            addCriterion("open_platform is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformEqualTo(Integer value) {
            addCriterion("open_platform =", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformNotEqualTo(Integer value) {
            addCriterion("open_platform <>", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformGreaterThan(Integer value) {
            addCriterion("open_platform >", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_platform >=", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformLessThan(Integer value) {
            addCriterion("open_platform <", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("open_platform <=", value, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformIn(List<Integer> values) {
            addCriterion("open_platform in", values, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformNotIn(List<Integer> values) {
            addCriterion("open_platform not in", values, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformBetween(Integer value1, Integer value2) {
            addCriterion("open_platform between", value1, value2, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andOpenPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("open_platform not between", value1, value2, "openPlatform");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andOpAccountIsNull() {
            addCriterion("op_account is null");
            return (Criteria) this;
        }

        public Criteria andOpAccountIsNotNull() {
            addCriterion("op_account is not null");
            return (Criteria) this;
        }

        public Criteria andOpAccountEqualTo(String value) {
            addCriterion("op_account =", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountNotEqualTo(String value) {
            addCriterion("op_account <>", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountGreaterThan(String value) {
            addCriterion("op_account >", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountGreaterThanOrEqualTo(String value) {
            addCriterion("op_account >=", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountLessThan(String value) {
            addCriterion("op_account <", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountLessThanOrEqualTo(String value) {
            addCriterion("op_account <=", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountLike(String value) {
            addCriterion("op_account like", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountNotLike(String value) {
            addCriterion("op_account not like", value, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountIn(List<String> values) {
            addCriterion("op_account in", values, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountNotIn(List<String> values) {
            addCriterion("op_account not in", values, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountBetween(String value1, String value2) {
            addCriterion("op_account between", value1, value2, "opAccount");
            return (Criteria) this;
        }

        public Criteria andOpAccountNotBetween(String value1, String value2) {
            addCriterion("op_account not between", value1, value2, "opAccount");
            return (Criteria) this;
        }

        public Criteria andIntervalSecIsNull() {
            addCriterion("interval_sec is null");
            return (Criteria) this;
        }

        public Criteria andIntervalSecIsNotNull() {
            addCriterion("interval_sec is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalSecEqualTo(Integer value) {
            addCriterion("interval_sec =", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecNotEqualTo(Integer value) {
            addCriterion("interval_sec <>", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecGreaterThan(Integer value) {
            addCriterion("interval_sec >", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval_sec >=", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecLessThan(Integer value) {
            addCriterion("interval_sec <", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecLessThanOrEqualTo(Integer value) {
            addCriterion("interval_sec <=", value, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecIn(List<Integer> values) {
            addCriterion("interval_sec in", values, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecNotIn(List<Integer> values) {
            addCriterion("interval_sec not in", values, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecBetween(Integer value1, Integer value2) {
            addCriterion("interval_sec between", value1, value2, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andIntervalSecNotBetween(Integer value1, Integer value2) {
            addCriterion("interval_sec not between", value1, value2, "intervalSec");
            return (Criteria) this;
        }

        public Criteria andSendCntIsNull() {
            addCriterion("send_cnt is null");
            return (Criteria) this;
        }

        public Criteria andSendCntIsNotNull() {
            addCriterion("send_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andSendCntEqualTo(Integer value) {
            addCriterion("send_cnt =", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntNotEqualTo(Integer value) {
            addCriterion("send_cnt <>", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntGreaterThan(Integer value) {
            addCriterion("send_cnt >", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_cnt >=", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntLessThan(Integer value) {
            addCriterion("send_cnt <", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntLessThanOrEqualTo(Integer value) {
            addCriterion("send_cnt <=", value, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntIn(List<Integer> values) {
            addCriterion("send_cnt in", values, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntNotIn(List<Integer> values) {
            addCriterion("send_cnt not in", values, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntBetween(Integer value1, Integer value2) {
            addCriterion("send_cnt between", value1, value2, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andSendCntNotBetween(Integer value1, Integer value2) {
            addCriterion("send_cnt not between", value1, value2, "sendCnt");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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