package com.cccctld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuConnectRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuConnectRuleExample() {
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

        public Criteria andRelationTypeIdIsNull() {
            addCriterion("RELATION_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdIsNotNull() {
            addCriterion("RELATION_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdEqualTo(String value) {
            addCriterion("RELATION_TYPE_ID =", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotEqualTo(String value) {
            addCriterion("RELATION_TYPE_ID <>", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdGreaterThan(String value) {
            addCriterion("RELATION_TYPE_ID >", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION_TYPE_ID >=", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdLessThan(String value) {
            addCriterion("RELATION_TYPE_ID <", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdLessThanOrEqualTo(String value) {
            addCriterion("RELATION_TYPE_ID <=", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdLike(String value) {
            addCriterion("RELATION_TYPE_ID like", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotLike(String value) {
            addCriterion("RELATION_TYPE_ID not like", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdIn(List<String> values) {
            addCriterion("RELATION_TYPE_ID in", values, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotIn(List<String> values) {
            addCriterion("RELATION_TYPE_ID not in", values, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdBetween(String value1, String value2) {
            addCriterion("RELATION_TYPE_ID between", value1, value2, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotBetween(String value1, String value2) {
            addCriterion("RELATION_TYPE_ID not between", value1, value2, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdIsNull() {
            addCriterion("PARENT_PARTYTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdIsNotNull() {
            addCriterion("PARENT_PARTYTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdEqualTo(String value) {
            addCriterion("PARENT_PARTYTYPE_ID =", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdNotEqualTo(String value) {
            addCriterion("PARENT_PARTYTYPE_ID <>", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdGreaterThan(String value) {
            addCriterion("PARENT_PARTYTYPE_ID >", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_PARTYTYPE_ID >=", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdLessThan(String value) {
            addCriterion("PARENT_PARTYTYPE_ID <", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_PARTYTYPE_ID <=", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdLike(String value) {
            addCriterion("PARENT_PARTYTYPE_ID like", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdNotLike(String value) {
            addCriterion("PARENT_PARTYTYPE_ID not like", value, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdIn(List<String> values) {
            addCriterion("PARENT_PARTYTYPE_ID in", values, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdNotIn(List<String> values) {
            addCriterion("PARENT_PARTYTYPE_ID not in", values, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdBetween(String value1, String value2) {
            addCriterion("PARENT_PARTYTYPE_ID between", value1, value2, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andParentPartytypeIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_PARTYTYPE_ID not between", value1, value2, "parentPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdIsNull() {
            addCriterion("CHILD_PARTYTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdIsNotNull() {
            addCriterion("CHILD_PARTYTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdEqualTo(String value) {
            addCriterion("CHILD_PARTYTYPE_ID =", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdNotEqualTo(String value) {
            addCriterion("CHILD_PARTYTYPE_ID <>", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdGreaterThan(String value) {
            addCriterion("CHILD_PARTYTYPE_ID >", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHILD_PARTYTYPE_ID >=", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdLessThan(String value) {
            addCriterion("CHILD_PARTYTYPE_ID <", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdLessThanOrEqualTo(String value) {
            addCriterion("CHILD_PARTYTYPE_ID <=", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdLike(String value) {
            addCriterion("CHILD_PARTYTYPE_ID like", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdNotLike(String value) {
            addCriterion("CHILD_PARTYTYPE_ID not like", value, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdIn(List<String> values) {
            addCriterion("CHILD_PARTYTYPE_ID in", values, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdNotIn(List<String> values) {
            addCriterion("CHILD_PARTYTYPE_ID not in", values, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdBetween(String value1, String value2) {
            addCriterion("CHILD_PARTYTYPE_ID between", value1, value2, "childPartytypeId");
            return (Criteria) this;
        }

        public Criteria andChildPartytypeIdNotBetween(String value1, String value2) {
            addCriterion("CHILD_PARTYTYPE_ID not between", value1, value2, "childPartytypeId");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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