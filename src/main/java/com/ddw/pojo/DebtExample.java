package com.ddw.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DebtExample() {
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

        public Criteria andTotaldebtIsNull() {
            addCriterion("totaldebt is null");
            return (Criteria) this;
        }

        public Criteria andTotaldebtIsNotNull() {
            addCriterion("totaldebt is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldebtEqualTo(Double value) {
            addCriterion("totaldebt =", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtNotEqualTo(Double value) {
            addCriterion("totaldebt <>", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtGreaterThan(Double value) {
            addCriterion("totaldebt >", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtGreaterThanOrEqualTo(Double value) {
            addCriterion("totaldebt >=", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtLessThan(Double value) {
            addCriterion("totaldebt <", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtLessThanOrEqualTo(Double value) {
            addCriterion("totaldebt <=", value, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtIn(List<Double> values) {
            addCriterion("totaldebt in", values, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtNotIn(List<Double> values) {
            addCriterion("totaldebt not in", values, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtBetween(Double value1, Double value2) {
            addCriterion("totaldebt between", value1, value2, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andTotaldebtNotBetween(Double value1, Double value2) {
            addCriterion("totaldebt not between", value1, value2, "totaldebt");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeIsNull() {
            addCriterion("debtdatetime is null");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeIsNotNull() {
            addCriterion("debtdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeEqualTo(Date value) {
            addCriterion("debtdatetime =", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeNotEqualTo(Date value) {
            addCriterion("debtdatetime <>", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeGreaterThan(Date value) {
            addCriterion("debtdatetime >", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("debtdatetime >=", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeLessThan(Date value) {
            addCriterion("debtdatetime <", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("debtdatetime <=", value, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeIn(List<Date> values) {
            addCriterion("debtdatetime in", values, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeNotIn(List<Date> values) {
            addCriterion("debtdatetime not in", values, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeBetween(Date value1, Date value2) {
            addCriterion("debtdatetime between", value1, value2, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("debtdatetime not between", value1, value2, "debtdatetime");
            return (Criteria) this;
        }

        public Criteria andDebtperiodIsNull() {
            addCriterion("debtperiod is null");
            return (Criteria) this;
        }

        public Criteria andDebtperiodIsNotNull() {
            addCriterion("debtperiod is not null");
            return (Criteria) this;
        }

        public Criteria andDebtperiodEqualTo(Integer value) {
            addCriterion("debtperiod =", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodNotEqualTo(Integer value) {
            addCriterion("debtperiod <>", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodGreaterThan(Integer value) {
            addCriterion("debtperiod >", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("debtperiod >=", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodLessThan(Integer value) {
            addCriterion("debtperiod <", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodLessThanOrEqualTo(Integer value) {
            addCriterion("debtperiod <=", value, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodIn(List<Integer> values) {
            addCriterion("debtperiod in", values, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodNotIn(List<Integer> values) {
            addCriterion("debtperiod not in", values, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodBetween(Integer value1, Integer value2) {
            addCriterion("debtperiod between", value1, value2, "debtperiod");
            return (Criteria) this;
        }

        public Criteria andDebtperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("debtperiod not between", value1, value2, "debtperiod");
            return (Criteria) this;
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

        public Criteria andConfirmeridIsNull() {
            addCriterion("confirmerid is null");
            return (Criteria) this;
        }

        public Criteria andConfirmeridIsNotNull() {
            addCriterion("confirmerid is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmeridEqualTo(String value) {
            addCriterion("confirmerid =", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridNotEqualTo(String value) {
            addCriterion("confirmerid <>", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridGreaterThan(String value) {
            addCriterion("confirmerid >", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridGreaterThanOrEqualTo(String value) {
            addCriterion("confirmerid >=", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridLessThan(String value) {
            addCriterion("confirmerid <", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridLessThanOrEqualTo(String value) {
            addCriterion("confirmerid <=", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridLike(String value) {
            addCriterion("confirmerid like", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridNotLike(String value) {
            addCriterion("confirmerid not like", value, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridIn(List<String> values) {
            addCriterion("confirmerid in", values, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridNotIn(List<String> values) {
            addCriterion("confirmerid not in", values, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridBetween(String value1, String value2) {
            addCriterion("confirmerid between", value1, value2, "confirmerid");
            return (Criteria) this;
        }

        public Criteria andConfirmeridNotBetween(String value1, String value2) {
            addCriterion("confirmerid not between", value1, value2, "confirmerid");
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