package com.ddw.pojo;

import java.util.ArrayList;
import java.util.List;

public class AssertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssertExample() {
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

        public Criteria andCarpriceIsNull() {
            addCriterion("carprice is null");
            return (Criteria) this;
        }

        public Criteria andCarpriceIsNotNull() {
            addCriterion("carprice is not null");
            return (Criteria) this;
        }

        public Criteria andCarpriceEqualTo(Double value) {
            addCriterion("carprice =", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotEqualTo(Double value) {
            addCriterion("carprice <>", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThan(Double value) {
            addCriterion("carprice >", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("carprice >=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThan(Double value) {
            addCriterion("carprice <", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThanOrEqualTo(Double value) {
            addCriterion("carprice <=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceIn(List<Double> values) {
            addCriterion("carprice in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotIn(List<Double> values) {
            addCriterion("carprice not in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceBetween(Double value1, Double value2) {
            addCriterion("carprice between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotBetween(Double value1, Double value2) {
            addCriterion("carprice not between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNull() {
            addCriterion("houseprice is null");
            return (Criteria) this;
        }

        public Criteria andHousepriceIsNotNull() {
            addCriterion("houseprice is not null");
            return (Criteria) this;
        }

        public Criteria andHousepriceEqualTo(Double value) {
            addCriterion("houseprice =", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotEqualTo(Double value) {
            addCriterion("houseprice <>", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThan(Double value) {
            addCriterion("houseprice >", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("houseprice >=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThan(Double value) {
            addCriterion("houseprice <", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceLessThanOrEqualTo(Double value) {
            addCriterion("houseprice <=", value, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceIn(List<Double> values) {
            addCriterion("houseprice in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotIn(List<Double> values) {
            addCriterion("houseprice not in", values, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceBetween(Double value1, Double value2) {
            addCriterion("houseprice between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andHousepriceNotBetween(Double value1, Double value2) {
            addCriterion("houseprice not between", value1, value2, "houseprice");
            return (Criteria) this;
        }

        public Criteria andOtherassertsIsNull() {
            addCriterion("otherasserts is null");
            return (Criteria) this;
        }

        public Criteria andOtherassertsIsNotNull() {
            addCriterion("otherasserts is not null");
            return (Criteria) this;
        }

        public Criteria andOtherassertsEqualTo(Double value) {
            addCriterion("otherasserts =", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsNotEqualTo(Double value) {
            addCriterion("otherasserts <>", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsGreaterThan(Double value) {
            addCriterion("otherasserts >", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsGreaterThanOrEqualTo(Double value) {
            addCriterion("otherasserts >=", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsLessThan(Double value) {
            addCriterion("otherasserts <", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsLessThanOrEqualTo(Double value) {
            addCriterion("otherasserts <=", value, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsIn(List<Double> values) {
            addCriterion("otherasserts in", values, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsNotIn(List<Double> values) {
            addCriterion("otherasserts not in", values, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsBetween(Double value1, Double value2) {
            addCriterion("otherasserts between", value1, value2, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherassertsNotBetween(Double value1, Double value2) {
            addCriterion("otherasserts not between", value1, value2, "otherasserts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsIsNull() {
            addCriterion("otherdebts is null");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsIsNotNull() {
            addCriterion("otherdebts is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsEqualTo(Double value) {
            addCriterion("otherdebts =", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsNotEqualTo(Double value) {
            addCriterion("otherdebts <>", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsGreaterThan(Double value) {
            addCriterion("otherdebts >", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsGreaterThanOrEqualTo(Double value) {
            addCriterion("otherdebts >=", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsLessThan(Double value) {
            addCriterion("otherdebts <", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsLessThanOrEqualTo(Double value) {
            addCriterion("otherdebts <=", value, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsIn(List<Double> values) {
            addCriterion("otherdebts in", values, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsNotIn(List<Double> values) {
            addCriterion("otherdebts not in", values, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsBetween(Double value1, Double value2) {
            addCriterion("otherdebts between", value1, value2, "otherdebts");
            return (Criteria) this;
        }

        public Criteria andOtherdebtsNotBetween(Double value1, Double value2) {
            addCriterion("otherdebts not between", value1, value2, "otherdebts");
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