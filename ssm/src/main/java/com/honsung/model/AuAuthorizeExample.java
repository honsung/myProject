package com.honsung.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuAuthorizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuAuthorizeExample() {
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

        public Criteria andVisitorIdIsNull() {
            addCriterion("VISITOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdIsNotNull() {
            addCriterion("VISITOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdEqualTo(String value) {
            addCriterion("VISITOR_ID =", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotEqualTo(String value) {
            addCriterion("VISITOR_ID <>", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdGreaterThan(String value) {
            addCriterion("VISITOR_ID >", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_ID >=", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdLessThan(String value) {
            addCriterion("VISITOR_ID <", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_ID <=", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdLike(String value) {
            addCriterion("VISITOR_ID like", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotLike(String value) {
            addCriterion("VISITOR_ID not like", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdIn(List<String> values) {
            addCriterion("VISITOR_ID in", values, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotIn(List<String> values) {
            addCriterion("VISITOR_ID not in", values, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdBetween(String value1, String value2) {
            addCriterion("VISITOR_ID between", value1, value2, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotBetween(String value1, String value2) {
            addCriterion("VISITOR_ID not between", value1, value2, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeIsNull() {
            addCriterion("VISITOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeIsNotNull() {
            addCriterion("VISITOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeEqualTo(String value) {
            addCriterion("VISITOR_CODE =", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeNotEqualTo(String value) {
            addCriterion("VISITOR_CODE <>", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeGreaterThan(String value) {
            addCriterion("VISITOR_CODE >", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VISITOR_CODE >=", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeLessThan(String value) {
            addCriterion("VISITOR_CODE <", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeLessThanOrEqualTo(String value) {
            addCriterion("VISITOR_CODE <=", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeLike(String value) {
            addCriterion("VISITOR_CODE like", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeNotLike(String value) {
            addCriterion("VISITOR_CODE not like", value, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeIn(List<String> values) {
            addCriterion("VISITOR_CODE in", values, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeNotIn(List<String> values) {
            addCriterion("VISITOR_CODE not in", values, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeBetween(String value1, String value2) {
            addCriterion("VISITOR_CODE between", value1, value2, "visitorCode");
            return (Criteria) this;
        }

        public Criteria andVisitorCodeNotBetween(String value1, String value2) {
            addCriterion("VISITOR_CODE not between", value1, value2, "visitorCode");
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

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("RESOURCE_ID like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("RESOURCE_ID not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("RESOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("RESOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(String value) {
            addCriterion("RESOURCE_CODE =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(String value) {
            addCriterion("RESOURCE_CODE <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(String value) {
            addCriterion("RESOURCE_CODE >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_CODE >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(String value) {
            addCriterion("RESOURCE_CODE <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_CODE <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLike(String value) {
            addCriterion("RESOURCE_CODE like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotLike(String value) {
            addCriterion("RESOURCE_CODE not like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<String> values) {
            addCriterion("RESOURCE_CODE in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<String> values) {
            addCriterion("RESOURCE_CODE not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(String value1, String value2) {
            addCriterion("RESOURCE_CODE between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_CODE not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIsNull() {
            addCriterion("AUTHORIZE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIsNotNull() {
            addCriterion("AUTHORIZE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS =", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS <>", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusGreaterThan(String value) {
            addCriterion("AUTHORIZE_STATUS >", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS >=", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLessThan(String value) {
            addCriterion("AUTHORIZE_STATUS <", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE_STATUS <=", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusLike(String value) {
            addCriterion("AUTHORIZE_STATUS like", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotLike(String value) {
            addCriterion("AUTHORIZE_STATUS not like", value, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusIn(List<String> values) {
            addCriterion("AUTHORIZE_STATUS in", values, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotIn(List<String> values) {
            addCriterion("AUTHORIZE_STATUS not in", values, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_STATUS between", value1, value2, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAuthorizeStatusNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE_STATUS not between", value1, value2, "authorizeStatus");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNull() {
            addCriterion("ACCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIsNotNull() {
            addCriterion("ACCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTypeEqualTo(Integer value) {
            addCriterion("ACCESS_TYPE =", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotEqualTo(Integer value) {
            addCriterion("ACCESS_TYPE <>", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThan(Integer value) {
            addCriterion("ACCESS_TYPE >", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_TYPE >=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThan(Integer value) {
            addCriterion("ACCESS_TYPE <", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ACCESS_TYPE <=", value, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeIn(List<Integer> values) {
            addCriterion("ACCESS_TYPE in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotIn(List<Integer> values) {
            addCriterion("ACCESS_TYPE not in", values, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_TYPE between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andAccessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCESS_TYPE not between", value1, value2, "accessType");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNull() {
            addCriterion("IS_APPEND is null");
            return (Criteria) this;
        }

        public Criteria andIsAppendIsNotNull() {
            addCriterion("IS_APPEND is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppendEqualTo(String value) {
            addCriterion("IS_APPEND =", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotEqualTo(String value) {
            addCriterion("IS_APPEND <>", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThan(String value) {
            addCriterion("IS_APPEND >", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendGreaterThanOrEqualTo(String value) {
            addCriterion("IS_APPEND >=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThan(String value) {
            addCriterion("IS_APPEND <", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLessThanOrEqualTo(String value) {
            addCriterion("IS_APPEND <=", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendLike(String value) {
            addCriterion("IS_APPEND like", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotLike(String value) {
            addCriterion("IS_APPEND not like", value, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendIn(List<String> values) {
            addCriterion("IS_APPEND in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotIn(List<String> values) {
            addCriterion("IS_APPEND not in", values, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendBetween(String value1, String value2) {
            addCriterion("IS_APPEND between", value1, value2, "isAppend");
            return (Criteria) this;
        }

        public Criteria andIsAppendNotBetween(String value1, String value2) {
            addCriterion("IS_APPEND not between", value1, value2, "isAppend");
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

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("SYSTEM_ID like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("SYSTEM_ID not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
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