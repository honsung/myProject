package com.honsung.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuPartyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuPartyExample() {
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

        public Criteria andPartytypeKeywordIsNull() {
            addCriterion("PARTYTYPE_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordIsNotNull() {
            addCriterion("PARTYTYPE_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordEqualTo(String value) {
            addCriterion("PARTYTYPE_KEYWORD =", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordNotEqualTo(String value) {
            addCriterion("PARTYTYPE_KEYWORD <>", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordGreaterThan(String value) {
            addCriterion("PARTYTYPE_KEYWORD >", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("PARTYTYPE_KEYWORD >=", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordLessThan(String value) {
            addCriterion("PARTYTYPE_KEYWORD <", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordLessThanOrEqualTo(String value) {
            addCriterion("PARTYTYPE_KEYWORD <=", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordLike(String value) {
            addCriterion("PARTYTYPE_KEYWORD like", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordNotLike(String value) {
            addCriterion("PARTYTYPE_KEYWORD not like", value, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordIn(List<String> values) {
            addCriterion("PARTYTYPE_KEYWORD in", values, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordNotIn(List<String> values) {
            addCriterion("PARTYTYPE_KEYWORD not in", values, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordBetween(String value1, String value2) {
            addCriterion("PARTYTYPE_KEYWORD between", value1, value2, "partytypeKeyword");
            return (Criteria) this;
        }

        public Criteria andPartytypeKeywordNotBetween(String value1, String value2) {
            addCriterion("PARTYTYPE_KEYWORD not between", value1, value2, "partytypeKeyword");
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

        public Criteria andIsRealIsNull() {
            addCriterion("IS_REAL is null");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNotNull() {
            addCriterion("IS_REAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealEqualTo(String value) {
            addCriterion("IS_REAL =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(String value) {
            addCriterion("IS_REAL <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(String value) {
            addCriterion("IS_REAL >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REAL >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(String value) {
            addCriterion("IS_REAL <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(String value) {
            addCriterion("IS_REAL <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLike(String value) {
            addCriterion("IS_REAL like", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotLike(String value) {
            addCriterion("IS_REAL not like", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<String> values) {
            addCriterion("IS_REAL in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<String> values) {
            addCriterion("IS_REAL not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(String value1, String value2) {
            addCriterion("IS_REAL between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(String value1, String value2) {
            addCriterion("IS_REAL not between", value1, value2, "isReal");
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

        public Criteria andOwnerOrgIsNull() {
            addCriterion("OWNER_ORG is null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgIsNotNull() {
            addCriterion("OWNER_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgEqualTo(String value) {
            addCriterion("OWNER_ORG =", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgNotEqualTo(String value) {
            addCriterion("OWNER_ORG <>", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgGreaterThan(String value) {
            addCriterion("OWNER_ORG >", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_ORG >=", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgLessThan(String value) {
            addCriterion("OWNER_ORG <", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgLessThanOrEqualTo(String value) {
            addCriterion("OWNER_ORG <=", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgLike(String value) {
            addCriterion("OWNER_ORG like", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgNotLike(String value) {
            addCriterion("OWNER_ORG not like", value, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgIn(List<String> values) {
            addCriterion("OWNER_ORG in", values, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgNotIn(List<String> values) {
            addCriterion("OWNER_ORG not in", values, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgBetween(String value1, String value2) {
            addCriterion("OWNER_ORG between", value1, value2, "ownerOrg");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgNotBetween(String value1, String value2) {
            addCriterion("OWNER_ORG not between", value1, value2, "ownerOrg");
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

        public Criteria andEnableStatusIsNull() {
            addCriterion("ENABLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIsNotNull() {
            addCriterion("ENABLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStatusEqualTo(String value) {
            addCriterion("ENABLE_STATUS =", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotEqualTo(String value) {
            addCriterion("ENABLE_STATUS <>", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThan(String value) {
            addCriterion("ENABLE_STATUS >", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_STATUS >=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThan(String value) {
            addCriterion("ENABLE_STATUS <", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_STATUS <=", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusLike(String value) {
            addCriterion("ENABLE_STATUS like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotLike(String value) {
            addCriterion("ENABLE_STATUS not like", value, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusIn(List<String> values) {
            addCriterion("ENABLE_STATUS in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotIn(List<String> values) {
            addCriterion("ENABLE_STATUS not in", values, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusBetween(String value1, String value2) {
            addCriterion("ENABLE_STATUS between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableStatusNotBetween(String value1, String value2) {
            addCriterion("ENABLE_STATUS not between", value1, value2, "enableStatus");
            return (Criteria) this;
        }

        public Criteria andEnableDateIsNull() {
            addCriterion("ENABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEnableDateIsNotNull() {
            addCriterion("ENABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnableDateEqualTo(Date value) {
            addCriterion("ENABLE_DATE =", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateNotEqualTo(Date value) {
            addCriterion("ENABLE_DATE <>", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateGreaterThan(Date value) {
            addCriterion("ENABLE_DATE >", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENABLE_DATE >=", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateLessThan(Date value) {
            addCriterion("ENABLE_DATE <", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateLessThanOrEqualTo(Date value) {
            addCriterion("ENABLE_DATE <=", value, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateIn(List<Date> values) {
            addCriterion("ENABLE_DATE in", values, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateNotIn(List<Date> values) {
            addCriterion("ENABLE_DATE not in", values, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateBetween(Date value1, Date value2) {
            addCriterion("ENABLE_DATE between", value1, value2, "enableDate");
            return (Criteria) this;
        }

        public Criteria andEnableDateNotBetween(Date value1, Date value2) {
            addCriterion("ENABLE_DATE not between", value1, value2, "enableDate");
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