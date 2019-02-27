package com.ddw.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderstateExample() {
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

        public Criteria andOrderstateidIsNull() {
            addCriterion("orderstateid is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateidIsNotNull() {
            addCriterion("orderstateid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateidEqualTo(Integer value) {
            addCriterion("orderstateid =", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotEqualTo(Integer value) {
            addCriterion("orderstateid <>", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidGreaterThan(Integer value) {
            addCriterion("orderstateid >", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderstateid >=", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidLessThan(Integer value) {
            addCriterion("orderstateid <", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidLessThanOrEqualTo(Integer value) {
            addCriterion("orderstateid <=", value, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidIn(List<Integer> values) {
            addCriterion("orderstateid in", values, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotIn(List<Integer> values) {
            addCriterion("orderstateid not in", values, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidBetween(Integer value1, Integer value2) {
            addCriterion("orderstateid between", value1, value2, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderstateid not between", value1, value2, "orderstateid");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameIsNull() {
            addCriterion("orderstatename is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameIsNotNull() {
            addCriterion("orderstatename is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameEqualTo(String value) {
            addCriterion("orderstatename =", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameNotEqualTo(String value) {
            addCriterion("orderstatename <>", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameGreaterThan(String value) {
            addCriterion("orderstatename >", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameGreaterThanOrEqualTo(String value) {
            addCriterion("orderstatename >=", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameLessThan(String value) {
            addCriterion("orderstatename <", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameLessThanOrEqualTo(String value) {
            addCriterion("orderstatename <=", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameLike(String value) {
            addCriterion("orderstatename like", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameNotLike(String value) {
            addCriterion("orderstatename not like", value, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameIn(List<String> values) {
            addCriterion("orderstatename in", values, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameNotIn(List<String> values) {
            addCriterion("orderstatename not in", values, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameBetween(String value1, String value2) {
            addCriterion("orderstatename between", value1, value2, "orderstatename");
            return (Criteria) this;
        }

        public Criteria andOrderstatenameNotBetween(String value1, String value2) {
            addCriterion("orderstatename not between", value1, value2, "orderstatename");
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