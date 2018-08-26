package com.cccctld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuPartyRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuPartyRelationExample() {
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

        public Criteria andRelationtypeIdIsNull() {
            addCriterion("RELATIONTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdIsNotNull() {
            addCriterion("RELATIONTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdEqualTo(String value) {
            addCriterion("RELATIONTYPE_ID =", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdNotEqualTo(String value) {
            addCriterion("RELATIONTYPE_ID <>", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdGreaterThan(String value) {
            addCriterion("RELATIONTYPE_ID >", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONTYPE_ID >=", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdLessThan(String value) {
            addCriterion("RELATIONTYPE_ID <", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdLessThanOrEqualTo(String value) {
            addCriterion("RELATIONTYPE_ID <=", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdLike(String value) {
            addCriterion("RELATIONTYPE_ID like", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdNotLike(String value) {
            addCriterion("RELATIONTYPE_ID not like", value, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdIn(List<String> values) {
            addCriterion("RELATIONTYPE_ID in", values, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdNotIn(List<String> values) {
            addCriterion("RELATIONTYPE_ID not in", values, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdBetween(String value1, String value2) {
            addCriterion("RELATIONTYPE_ID between", value1, value2, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIdNotBetween(String value1, String value2) {
            addCriterion("RELATIONTYPE_ID not between", value1, value2, "relationtypeId");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordIsNull() {
            addCriterion("RELATIONTYPE_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordIsNotNull() {
            addCriterion("RELATIONTYPE_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordEqualTo(String value) {
            addCriterion("RELATIONTYPE_KEYWORD =", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordNotEqualTo(String value) {
            addCriterion("RELATIONTYPE_KEYWORD <>", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordGreaterThan(String value) {
            addCriterion("RELATIONTYPE_KEYWORD >", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONTYPE_KEYWORD >=", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordLessThan(String value) {
            addCriterion("RELATIONTYPE_KEYWORD <", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordLessThanOrEqualTo(String value) {
            addCriterion("RELATIONTYPE_KEYWORD <=", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordLike(String value) {
            addCriterion("RELATIONTYPE_KEYWORD like", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordNotLike(String value) {
            addCriterion("RELATIONTYPE_KEYWORD not like", value, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordIn(List<String> values) {
            addCriterion("RELATIONTYPE_KEYWORD in", values, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordNotIn(List<String> values) {
            addCriterion("RELATIONTYPE_KEYWORD not in", values, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordBetween(String value1, String value2) {
            addCriterion("RELATIONTYPE_KEYWORD between", value1, value2, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andRelationtypeKeywordNotBetween(String value1, String value2) {
            addCriterion("RELATIONTYPE_KEYWORD not between", value1, value2, "relationtypeKeyword");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("PARENT_CODE like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("PARENT_CODE not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_CODE not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentPartyidIsNull() {
            addCriterion("PARENT_PARTYID is null");
            return (Criteria) this;
        }

        public Criteria andParentPartyidIsNotNull() {
            addCriterion("PARENT_PARTYID is not null");
            return (Criteria) this;
        }

        public Criteria andParentPartyidEqualTo(String value) {
            addCriterion("PARENT_PARTYID =", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidNotEqualTo(String value) {
            addCriterion("PARENT_PARTYID <>", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidGreaterThan(String value) {
            addCriterion("PARENT_PARTYID >", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_PARTYID >=", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidLessThan(String value) {
            addCriterion("PARENT_PARTYID <", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidLessThanOrEqualTo(String value) {
            addCriterion("PARENT_PARTYID <=", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidLike(String value) {
            addCriterion("PARENT_PARTYID like", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidNotLike(String value) {
            addCriterion("PARENT_PARTYID not like", value, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidIn(List<String> values) {
            addCriterion("PARENT_PARTYID in", values, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidNotIn(List<String> values) {
            addCriterion("PARENT_PARTYID not in", values, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidBetween(String value1, String value2) {
            addCriterion("PARENT_PARTYID between", value1, value2, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andParentPartyidNotBetween(String value1, String value2) {
            addCriterion("PARENT_PARTYID not between", value1, value2, "parentPartyid");
            return (Criteria) this;
        }

        public Criteria andPartyidIsNull() {
            addCriterion("PARTYID is null");
            return (Criteria) this;
        }

        public Criteria andPartyidIsNotNull() {
            addCriterion("PARTYID is not null");
            return (Criteria) this;
        }

        public Criteria andPartyidEqualTo(String value) {
            addCriterion("PARTYID =", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotEqualTo(String value) {
            addCriterion("PARTYID <>", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidGreaterThan(String value) {
            addCriterion("PARTYID >", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYID >=", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLessThan(String value) {
            addCriterion("PARTYID <", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLessThanOrEqualTo(String value) {
            addCriterion("PARTYID <=", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidLike(String value) {
            addCriterion("PARTYID like", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotLike(String value) {
            addCriterion("PARTYID not like", value, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidIn(List<String> values) {
            addCriterion("PARTYID in", values, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotIn(List<String> values) {
            addCriterion("PARTYID not in", values, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidBetween(String value1, String value2) {
            addCriterion("PARTYID between", value1, value2, "partyid");
            return (Criteria) this;
        }

        public Criteria andPartyidNotBetween(String value1, String value2) {
            addCriterion("PARTYID not between", value1, value2, "partyid");
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

        public Criteria andTypeLevelIsNull() {
            addCriterion("TYPE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNotNull() {
            addCriterion("TYPE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelEqualTo(Short value) {
            addCriterion("TYPE_LEVEL =", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotEqualTo(Short value) {
            addCriterion("TYPE_LEVEL <>", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThan(Short value) {
            addCriterion("TYPE_LEVEL >", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE_LEVEL >=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThan(Short value) {
            addCriterion("TYPE_LEVEL <", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThanOrEqualTo(Short value) {
            addCriterion("TYPE_LEVEL <=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIn(List<Short> values) {
            addCriterion("TYPE_LEVEL in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotIn(List<Short> values) {
            addCriterion("TYPE_LEVEL not in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelBetween(Short value1, Short value2) {
            addCriterion("TYPE_LEVEL between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotBetween(Short value1, Short value2) {
            addCriterion("TYPE_LEVEL not between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("ORDER_CODE <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("ORDER_CODE like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNull() {
            addCriterion("IS_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andIsLeafIsNotNull() {
            addCriterion("IS_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andIsLeafEqualTo(String value) {
            addCriterion("IS_LEAF =", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotEqualTo(String value) {
            addCriterion("IS_LEAF <>", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThan(String value) {
            addCriterion("IS_LEAF >", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LEAF >=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThan(String value) {
            addCriterion("IS_LEAF <", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLessThanOrEqualTo(String value) {
            addCriterion("IS_LEAF <=", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafLike(String value) {
            addCriterion("IS_LEAF like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotLike(String value) {
            addCriterion("IS_LEAF not like", value, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafIn(List<String> values) {
            addCriterion("IS_LEAF in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotIn(List<String> values) {
            addCriterion("IS_LEAF not in", values, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafBetween(String value1, String value2) {
            addCriterion("IS_LEAF between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andIsLeafNotBetween(String value1, String value2) {
            addCriterion("IS_LEAF not between", value1, value2, "isLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafIsNull() {
            addCriterion("TYPE_IS_LEAF is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafIsNotNull() {
            addCriterion("TYPE_IS_LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafEqualTo(String value) {
            addCriterion("TYPE_IS_LEAF =", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafNotEqualTo(String value) {
            addCriterion("TYPE_IS_LEAF <>", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafGreaterThan(String value) {
            addCriterion("TYPE_IS_LEAF >", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_IS_LEAF >=", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafLessThan(String value) {
            addCriterion("TYPE_IS_LEAF <", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafLessThanOrEqualTo(String value) {
            addCriterion("TYPE_IS_LEAF <=", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafLike(String value) {
            addCriterion("TYPE_IS_LEAF like", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafNotLike(String value) {
            addCriterion("TYPE_IS_LEAF not like", value, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafIn(List<String> values) {
            addCriterion("TYPE_IS_LEAF in", values, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafNotIn(List<String> values) {
            addCriterion("TYPE_IS_LEAF not in", values, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafBetween(String value1, String value2) {
            addCriterion("TYPE_IS_LEAF between", value1, value2, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andTypeIsLeafNotBetween(String value1, String value2) {
            addCriterion("TYPE_IS_LEAF not between", value1, value2, "typeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andIsInheritIsNull() {
            addCriterion("IS_INHERIT is null");
            return (Criteria) this;
        }

        public Criteria andIsInheritIsNotNull() {
            addCriterion("IS_INHERIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsInheritEqualTo(String value) {
            addCriterion("IS_INHERIT =", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritNotEqualTo(String value) {
            addCriterion("IS_INHERIT <>", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritGreaterThan(String value) {
            addCriterion("IS_INHERIT >", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INHERIT >=", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritLessThan(String value) {
            addCriterion("IS_INHERIT <", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritLessThanOrEqualTo(String value) {
            addCriterion("IS_INHERIT <=", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritLike(String value) {
            addCriterion("IS_INHERIT like", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritNotLike(String value) {
            addCriterion("IS_INHERIT not like", value, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritIn(List<String> values) {
            addCriterion("IS_INHERIT in", values, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritNotIn(List<String> values) {
            addCriterion("IS_INHERIT not in", values, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritBetween(String value1, String value2) {
            addCriterion("IS_INHERIT between", value1, value2, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsInheritNotBetween(String value1, String value2) {
            addCriterion("IS_INHERIT not between", value1, value2, "isInherit");
            return (Criteria) this;
        }

        public Criteria andIsChiefIsNull() {
            addCriterion("IS_CHIEF is null");
            return (Criteria) this;
        }

        public Criteria andIsChiefIsNotNull() {
            addCriterion("IS_CHIEF is not null");
            return (Criteria) this;
        }

        public Criteria andIsChiefEqualTo(String value) {
            addCriterion("IS_CHIEF =", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefNotEqualTo(String value) {
            addCriterion("IS_CHIEF <>", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefGreaterThan(String value) {
            addCriterion("IS_CHIEF >", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHIEF >=", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefLessThan(String value) {
            addCriterion("IS_CHIEF <", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefLessThanOrEqualTo(String value) {
            addCriterion("IS_CHIEF <=", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefLike(String value) {
            addCriterion("IS_CHIEF like", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefNotLike(String value) {
            addCriterion("IS_CHIEF not like", value, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefIn(List<String> values) {
            addCriterion("IS_CHIEF in", values, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefNotIn(List<String> values) {
            addCriterion("IS_CHIEF not in", values, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefBetween(String value1, String value2) {
            addCriterion("IS_CHIEF between", value1, value2, "isChief");
            return (Criteria) this;
        }

        public Criteria andIsChiefNotBetween(String value1, String value2) {
            addCriterion("IS_CHIEF not between", value1, value2, "isChief");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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