package com.cccctld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuVisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuVisitorExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIsNull() {
            addCriterion("ORIGINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIsNotNull() {
            addCriterion("ORIGINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalIdEqualTo(String value) {
            addCriterion("ORIGINAL_ID =", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_ID <>", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdGreaterThan(String value) {
            addCriterion("ORIGINAL_ID >", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_ID >=", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLessThan(String value) {
            addCriterion("ORIGINAL_ID <", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_ID <=", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdLike(String value) {
            addCriterion("ORIGINAL_ID like", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotLike(String value) {
            addCriterion("ORIGINAL_ID not like", value, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdIn(List<String> values) {
            addCriterion("ORIGINAL_ID in", values, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_ID not in", values, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_ID between", value1, value2, "originalId");
            return (Criteria) this;
        }

        public Criteria andOriginalIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_ID not between", value1, value2, "originalId");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeIsNull() {
            addCriterion("VISITOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeIsNotNull() {
            addCriterion("VISITOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeEqualTo(String value) {
            addCriterion("VISITOR_TYPE =", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotEqualTo(String value) {
            addCriterion("VISITOR_TYPE <>", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeGreaterThan(String value) {
            addCriterion("VISITOR_TYPE >", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_TYPE >=", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLessThan(String value) {
            addCriterion("VISITOR_TYPE <", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_TYPE <=", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeLike(String value) {
            addCriterion("VISITOR_TYPE like", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotLike(String value) {
            addCriterion("VISITOR_TYPE not like", value, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeIn(List<String> values) {
            addCriterion("VISITOR_TYPE in", values, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotIn(List<String> values) {
            addCriterion("VISITOR_TYPE not in", values, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeBetween(String value1, String value2) {
            addCriterion("VISITOR_TYPE between", value1, value2, "visitorType");
            return (Criteria) this;
        }

        public Criteria andVisitorTypeNotBetween(String value1, String value2) {
            addCriterion("VISITOR_TYPE not between", value1, value2, "visitorType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdIsNull() {
            addCriterion("PARTYTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdIsNotNull() {
            addCriterion("PARTYTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdEqualTo(String value) {
            addCriterion("PARTYTYPE_ID =", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdNotEqualTo(String value) {
            addCriterion("PARTYTYPE_ID <>", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdGreaterThan(String value) {
            addCriterion("PARTYTYPE_ID >", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYTYPE_ID >=", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdLessThan(String value) {
            addCriterion("PARTYTYPE_ID <", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdLessThanOrEqualTo(String value) {
            addCriterion("PARTYTYPE_ID <=", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdLike(String value) {
            addCriterion("PARTYTYPE_ID like", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdNotLike(String value) {
            addCriterion("PARTYTYPE_ID not like", value, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdIn(List<String> values) {
            addCriterion("PARTYTYPE_ID in", values, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdNotIn(List<String> values) {
            addCriterion("PARTYTYPE_ID not in", values, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdBetween(String value1, String value2) {
            addCriterion("PARTYTYPE_ID between", value1, value2, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartytypeIdNotBetween(String value1, String value2) {
            addCriterion("PARTYTYPE_ID not between", value1, value2, "partytypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdIsNull() {
            addCriterion("PARTYRELATIONTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdIsNotNull() {
            addCriterion("PARTYRELATIONTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdEqualTo(String value) {
            addCriterion("PARTYRELATIONTYPE_ID =", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdNotEqualTo(String value) {
            addCriterion("PARTYRELATIONTYPE_ID <>", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdGreaterThan(String value) {
            addCriterion("PARTYRELATIONTYPE_ID >", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYRELATIONTYPE_ID >=", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdLessThan(String value) {
            addCriterion("PARTYRELATIONTYPE_ID <", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdLessThanOrEqualTo(String value) {
            addCriterion("PARTYRELATIONTYPE_ID <=", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdLike(String value) {
            addCriterion("PARTYRELATIONTYPE_ID like", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdNotLike(String value) {
            addCriterion("PARTYRELATIONTYPE_ID not like", value, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdIn(List<String> values) {
            addCriterion("PARTYRELATIONTYPE_ID in", values, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdNotIn(List<String> values) {
            addCriterion("PARTYRELATIONTYPE_ID not in", values, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdBetween(String value1, String value2) {
            addCriterion("PARTYRELATIONTYPE_ID between", value1, value2, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andPartyrelationtypeIdNotBetween(String value1, String value2) {
            addCriterion("PARTYRELATIONTYPE_ID not between", value1, value2, "partyrelationtypeId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATE not between", value1, value2, "modifyDate");
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