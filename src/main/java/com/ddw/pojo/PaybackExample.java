package com.ddw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaybackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaybackExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPbamountIsNull() {
            addCriterion("pbamount is null");
            return (Criteria) this;
        }

        public Criteria andPbamountIsNotNull() {
            addCriterion("pbamount is not null");
            return (Criteria) this;
        }

        public Criteria andPbamountEqualTo(String value) {
            addCriterion("pbamount =", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountNotEqualTo(String value) {
            addCriterion("pbamount <>", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountGreaterThan(String value) {
            addCriterion("pbamount >", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountGreaterThanOrEqualTo(String value) {
            addCriterion("pbamount >=", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountLessThan(String value) {
            addCriterion("pbamount <", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountLessThanOrEqualTo(String value) {
            addCriterion("pbamount <=", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountLike(String value) {
            addCriterion("pbamount like", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountNotLike(String value) {
            addCriterion("pbamount not like", value, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountIn(List<String> values) {
            addCriterion("pbamount in", values, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountNotIn(List<String> values) {
            addCriterion("pbamount not in", values, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountBetween(String value1, String value2) {
            addCriterion("pbamount between", value1, value2, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbamountNotBetween(String value1, String value2) {
            addCriterion("pbamount not between", value1, value2, "pbamount");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeIsNull() {
            addCriterion("pbdatetime is null");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeIsNotNull() {
            addCriterion("pbdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeEqualTo(Date value) {
            addCriterion("pbdatetime =", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeNotEqualTo(Date value) {
            addCriterion("pbdatetime <>", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeGreaterThan(Date value) {
            addCriterion("pbdatetime >", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pbdatetime >=", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeLessThan(Date value) {
            addCriterion("pbdatetime <", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("pbdatetime <=", value, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeIn(List<Date> values) {
            addCriterion("pbdatetime in", values, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeNotIn(List<Date> values) {
            addCriterion("pbdatetime not in", values, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeBetween(Date value1, Date value2) {
            addCriterion("pbdatetime between", value1, value2, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andPbdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("pbdatetime not between", value1, value2, "pbdatetime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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