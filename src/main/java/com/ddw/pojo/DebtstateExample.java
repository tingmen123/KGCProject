package com.ddw.pojo;

import java.util.ArrayList;
import java.util.List;

public class DebtstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DebtstateExample() {
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

        public Criteria andDebtstateidIsNull() {
            addCriterion("debtstateid is null");
            return (Criteria) this;
        }

        public Criteria andDebtstateidIsNotNull() {
            addCriterion("debtstateid is not null");
            return (Criteria) this;
        }

        public Criteria andDebtstateidEqualTo(Integer value) {
            addCriterion("debtstateid =", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidNotEqualTo(Integer value) {
            addCriterion("debtstateid <>", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidGreaterThan(Integer value) {
            addCriterion("debtstateid >", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("debtstateid >=", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidLessThan(Integer value) {
            addCriterion("debtstateid <", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidLessThanOrEqualTo(Integer value) {
            addCriterion("debtstateid <=", value, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidIn(List<Integer> values) {
            addCriterion("debtstateid in", values, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidNotIn(List<Integer> values) {
            addCriterion("debtstateid not in", values, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidBetween(Integer value1, Integer value2) {
            addCriterion("debtstateid between", value1, value2, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("debtstateid not between", value1, value2, "debtstateid");
            return (Criteria) this;
        }

        public Criteria andDebtstateIsNull() {
            addCriterion("debtstate is null");
            return (Criteria) this;
        }

        public Criteria andDebtstateIsNotNull() {
            addCriterion("debtstate is not null");
            return (Criteria) this;
        }

        public Criteria andDebtstateEqualTo(String value) {
            addCriterion("debtstate =", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateNotEqualTo(String value) {
            addCriterion("debtstate <>", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateGreaterThan(String value) {
            addCriterion("debtstate >", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateGreaterThanOrEqualTo(String value) {
            addCriterion("debtstate >=", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateLessThan(String value) {
            addCriterion("debtstate <", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateLessThanOrEqualTo(String value) {
            addCriterion("debtstate <=", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateLike(String value) {
            addCriterion("debtstate like", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateNotLike(String value) {
            addCriterion("debtstate not like", value, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateIn(List<String> values) {
            addCriterion("debtstate in", values, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateNotIn(List<String> values) {
            addCriterion("debtstate not in", values, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateBetween(String value1, String value2) {
            addCriterion("debtstate between", value1, value2, "debtstate");
            return (Criteria) this;
        }

        public Criteria andDebtstateNotBetween(String value1, String value2) {
            addCriterion("debtstate not between", value1, value2, "debtstate");
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