package com.ddw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterestExample() {
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

        public Criteria andInterestidIsNull() {
            addCriterion("interestid is null");
            return (Criteria) this;
        }

        public Criteria andInterestidIsNotNull() {
            addCriterion("interestid is not null");
            return (Criteria) this;
        }

        public Criteria andInterestidEqualTo(Integer value) {
            addCriterion("interestid =", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidNotEqualTo(Integer value) {
            addCriterion("interestid <>", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidGreaterThan(Integer value) {
            addCriterion("interestid >", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("interestid >=", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidLessThan(Integer value) {
            addCriterion("interestid <", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidLessThanOrEqualTo(Integer value) {
            addCriterion("interestid <=", value, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidIn(List<Integer> values) {
            addCriterion("interestid in", values, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidNotIn(List<Integer> values) {
            addCriterion("interestid not in", values, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidBetween(Integer value1, Integer value2) {
            addCriterion("interestid between", value1, value2, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestidNotBetween(Integer value1, Integer value2) {
            addCriterion("interestid not between", value1, value2, "interestid");
            return (Criteria) this;
        }

        public Criteria andInterestrateIsNull() {
            addCriterion("interestrate is null");
            return (Criteria) this;
        }

        public Criteria andInterestrateIsNotNull() {
            addCriterion("interestrate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestrateEqualTo(Double value) {
            addCriterion("interestrate =", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotEqualTo(Double value) {
            addCriterion("interestrate <>", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThan(Double value) {
            addCriterion("interestrate >", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThanOrEqualTo(Double value) {
            addCriterion("interestrate >=", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThan(Double value) {
            addCriterion("interestrate <", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThanOrEqualTo(Double value) {
            addCriterion("interestrate <=", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateIn(List<Double> values) {
            addCriterion("interestrate in", values, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotIn(List<Double> values) {
            addCriterion("interestrate not in", values, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateBetween(Double value1, Double value2) {
            addCriterion("interestrate between", value1, value2, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotBetween(Double value1, Double value2) {
            addCriterion("interestrate not between", value1, value2, "interestrate");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNull() {
            addCriterion("intodate is null");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNotNull() {
            addCriterion("intodate is not null");
            return (Criteria) this;
        }

        public Criteria andIntodateEqualTo(Date value) {
            addCriterion("intodate =", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotEqualTo(Date value) {
            addCriterion("intodate <>", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThan(Date value) {
            addCriterion("intodate >", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThanOrEqualTo(Date value) {
            addCriterion("intodate >=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThan(Date value) {
            addCriterion("intodate <", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThanOrEqualTo(Date value) {
            addCriterion("intodate <=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateIn(List<Date> values) {
            addCriterion("intodate in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotIn(List<Date> values) {
            addCriterion("intodate not in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateBetween(Date value1, Date value2) {
            addCriterion("intodate between", value1, value2, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotBetween(Date value1, Date value2) {
            addCriterion("intodate not between", value1, value2, "intodate");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNull() {
            addCriterion("outdate is null");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNotNull() {
            addCriterion("outdate is not null");
            return (Criteria) this;
        }

        public Criteria andOutdateEqualTo(Date value) {
            addCriterion("outdate =", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotEqualTo(Date value) {
            addCriterion("outdate <>", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThan(Date value) {
            addCriterion("outdate >", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("outdate >=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThan(Date value) {
            addCriterion("outdate <", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThanOrEqualTo(Date value) {
            addCriterion("outdate <=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateIn(List<Date> values) {
            addCriterion("outdate in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotIn(List<Date> values) {
            addCriterion("outdate not in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateBetween(Date value1, Date value2) {
            addCriterion("outdate between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotBetween(Date value1, Date value2) {
            addCriterion("outdate not between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andSetteridIsNull() {
            addCriterion("setterid is null");
            return (Criteria) this;
        }

        public Criteria andSetteridIsNotNull() {
            addCriterion("setterid is not null");
            return (Criteria) this;
        }

        public Criteria andSetteridEqualTo(String value) {
            addCriterion("setterid =", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridNotEqualTo(String value) {
            addCriterion("setterid <>", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridGreaterThan(String value) {
            addCriterion("setterid >", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridGreaterThanOrEqualTo(String value) {
            addCriterion("setterid >=", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridLessThan(String value) {
            addCriterion("setterid <", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridLessThanOrEqualTo(String value) {
            addCriterion("setterid <=", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridLike(String value) {
            addCriterion("setterid like", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridNotLike(String value) {
            addCriterion("setterid not like", value, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridIn(List<String> values) {
            addCriterion("setterid in", values, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridNotIn(List<String> values) {
            addCriterion("setterid not in", values, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridBetween(String value1, String value2) {
            addCriterion("setterid between", value1, value2, "setterid");
            return (Criteria) this;
        }

        public Criteria andSetteridNotBetween(String value1, String value2) {
            addCriterion("setterid not between", value1, value2, "setterid");
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