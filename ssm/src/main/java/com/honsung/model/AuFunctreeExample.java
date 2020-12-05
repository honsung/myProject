package com.honsung.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuFunctreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuFunctreeExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andHotKeyIsNull() {
            addCriterion("HOT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andHotKeyIsNotNull() {
            addCriterion("HOT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andHotKeyEqualTo(String value) {
            addCriterion("HOT_KEY =", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyNotEqualTo(String value) {
            addCriterion("HOT_KEY <>", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyGreaterThan(String value) {
            addCriterion("HOT_KEY >", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyGreaterThanOrEqualTo(String value) {
            addCriterion("HOT_KEY >=", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyLessThan(String value) {
            addCriterion("HOT_KEY <", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyLessThanOrEqualTo(String value) {
            addCriterion("HOT_KEY <=", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyLike(String value) {
            addCriterion("HOT_KEY like", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyNotLike(String value) {
            addCriterion("HOT_KEY not like", value, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyIn(List<String> values) {
            addCriterion("HOT_KEY in", values, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyNotIn(List<String> values) {
            addCriterion("HOT_KEY not in", values, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyBetween(String value1, String value2) {
            addCriterion("HOT_KEY between", value1, value2, "hotKey");
            return (Criteria) this;
        }

        public Criteria andHotKeyNotBetween(String value1, String value2) {
            addCriterion("HOT_KEY not between", value1, value2, "hotKey");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
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

        public Criteria andTotalCodeIsNull() {
            addCriterion("TOTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTotalCodeIsNotNull() {
            addCriterion("TOTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCodeEqualTo(String value) {
            addCriterion("TOTAL_CODE =", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeNotEqualTo(String value) {
            addCriterion("TOTAL_CODE <>", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeGreaterThan(String value) {
            addCriterion("TOTAL_CODE >", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_CODE >=", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeLessThan(String value) {
            addCriterion("TOTAL_CODE <", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_CODE <=", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeLike(String value) {
            addCriterion("TOTAL_CODE like", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeNotLike(String value) {
            addCriterion("TOTAL_CODE not like", value, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeIn(List<String> values) {
            addCriterion("TOTAL_CODE in", values, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeNotIn(List<String> values) {
            addCriterion("TOTAL_CODE not in", values, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeBetween(String value1, String value2) {
            addCriterion("TOTAL_CODE between", value1, value2, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTotalCodeNotBetween(String value1, String value2) {
            addCriterion("TOTAL_CODE not between", value1, value2, "totalCode");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIsNull() {
            addCriterion("TREE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIsNotNull() {
            addCriterion("TREE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTreeLevelEqualTo(Short value) {
            addCriterion("TREE_LEVEL =", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotEqualTo(Short value) {
            addCriterion("TREE_LEVEL <>", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelGreaterThan(Short value) {
            addCriterion("TREE_LEVEL >", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("TREE_LEVEL >=", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelLessThan(Short value) {
            addCriterion("TREE_LEVEL <", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelLessThanOrEqualTo(Short value) {
            addCriterion("TREE_LEVEL <=", value, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelIn(List<Short> values) {
            addCriterion("TREE_LEVEL in", values, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotIn(List<Short> values) {
            addCriterion("TREE_LEVEL not in", values, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelBetween(Short value1, Short value2) {
            addCriterion("TREE_LEVEL between", value1, value2, "treeLevel");
            return (Criteria) this;
        }

        public Criteria andTreeLevelNotBetween(Short value1, Short value2) {
            addCriterion("TREE_LEVEL not between", value1, value2, "treeLevel");
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

        public Criteria andHelpIsNull() {
            addCriterion("HELP is null");
            return (Criteria) this;
        }

        public Criteria andHelpIsNotNull() {
            addCriterion("HELP is not null");
            return (Criteria) this;
        }

        public Criteria andHelpEqualTo(String value) {
            addCriterion("HELP =", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotEqualTo(String value) {
            addCriterion("HELP <>", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpGreaterThan(String value) {
            addCriterion("HELP >", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpGreaterThanOrEqualTo(String value) {
            addCriterion("HELP >=", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLessThan(String value) {
            addCriterion("HELP <", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLessThanOrEqualTo(String value) {
            addCriterion("HELP <=", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpLike(String value) {
            addCriterion("HELP like", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotLike(String value) {
            addCriterion("HELP not like", value, "help");
            return (Criteria) this;
        }

        public Criteria andHelpIn(List<String> values) {
            addCriterion("HELP in", values, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotIn(List<String> values) {
            addCriterion("HELP not in", values, "help");
            return (Criteria) this;
        }

        public Criteria andHelpBetween(String value1, String value2) {
            addCriterion("HELP between", value1, value2, "help");
            return (Criteria) this;
        }

        public Criteria andHelpNotBetween(String value1, String value2) {
            addCriterion("HELP not between", value1, value2, "help");
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

        public Criteria andTreeIdIsNull() {
            addCriterion("TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeIdIsNotNull() {
            addCriterion("TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeIdEqualTo(String value) {
            addCriterion("TREE_ID =", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotEqualTo(String value) {
            addCriterion("TREE_ID <>", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThan(String value) {
            addCriterion("TREE_ID >", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_ID >=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThan(String value) {
            addCriterion("TREE_ID <", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLessThanOrEqualTo(String value) {
            addCriterion("TREE_ID <=", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdLike(String value) {
            addCriterion("TREE_ID like", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotLike(String value) {
            addCriterion("TREE_ID not like", value, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdIn(List<String> values) {
            addCriterion("TREE_ID in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotIn(List<String> values) {
            addCriterion("TREE_ID not in", values, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdBetween(String value1, String value2) {
            addCriterion("TREE_ID between", value1, value2, "treeId");
            return (Criteria) this;
        }

        public Criteria andTreeIdNotBetween(String value1, String value2) {
            addCriterion("TREE_ID not between", value1, value2, "treeId");
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

        public Criteria andIsSslIsNull() {
            addCriterion("IS_SSL is null");
            return (Criteria) this;
        }

        public Criteria andIsSslIsNotNull() {
            addCriterion("IS_SSL is not null");
            return (Criteria) this;
        }

        public Criteria andIsSslEqualTo(String value) {
            addCriterion("IS_SSL =", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslNotEqualTo(String value) {
            addCriterion("IS_SSL <>", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslGreaterThan(String value) {
            addCriterion("IS_SSL >", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SSL >=", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslLessThan(String value) {
            addCriterion("IS_SSL <", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslLessThanOrEqualTo(String value) {
            addCriterion("IS_SSL <=", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslLike(String value) {
            addCriterion("IS_SSL like", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslNotLike(String value) {
            addCriterion("IS_SSL not like", value, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslIn(List<String> values) {
            addCriterion("IS_SSL in", values, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslNotIn(List<String> values) {
            addCriterion("IS_SSL not in", values, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslBetween(String value1, String value2) {
            addCriterion("IS_SSL between", value1, value2, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsSslNotBetween(String value1, String value2) {
            addCriterion("IS_SSL not between", value1, value2, "isSsl");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNull() {
            addCriterion("IS_PUBLIC is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicIsNotNull() {
            addCriterion("IS_PUBLIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicEqualTo(String value) {
            addCriterion("IS_PUBLIC =", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotEqualTo(String value) {
            addCriterion("IS_PUBLIC <>", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThan(String value) {
            addCriterion("IS_PUBLIC >", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC >=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThan(String value) {
            addCriterion("IS_PUBLIC <", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLessThanOrEqualTo(String value) {
            addCriterion("IS_PUBLIC <=", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicLike(String value) {
            addCriterion("IS_PUBLIC like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotLike(String value) {
            addCriterion("IS_PUBLIC not like", value, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicIn(List<String> values) {
            addCriterion("IS_PUBLIC in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotIn(List<String> values) {
            addCriterion("IS_PUBLIC not in", values, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsPublicNotBetween(String value1, String value2) {
            addCriterion("IS_PUBLIC not between", value1, value2, "isPublic");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitIsNull() {
            addCriterion("IS_DATA_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitIsNotNull() {
            addCriterion("IS_DATA_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitEqualTo(String value) {
            addCriterion("IS_DATA_LIMIT =", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitNotEqualTo(String value) {
            addCriterion("IS_DATA_LIMIT <>", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitGreaterThan(String value) {
            addCriterion("IS_DATA_LIMIT >", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DATA_LIMIT >=", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitLessThan(String value) {
            addCriterion("IS_DATA_LIMIT <", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitLessThanOrEqualTo(String value) {
            addCriterion("IS_DATA_LIMIT <=", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitLike(String value) {
            addCriterion("IS_DATA_LIMIT like", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitNotLike(String value) {
            addCriterion("IS_DATA_LIMIT not like", value, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitIn(List<String> values) {
            addCriterion("IS_DATA_LIMIT in", values, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitNotIn(List<String> values) {
            addCriterion("IS_DATA_LIMIT not in", values, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitBetween(String value1, String value2) {
            addCriterion("IS_DATA_LIMIT between", value1, value2, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsDataLimitNotBetween(String value1, String value2) {
            addCriterion("IS_DATA_LIMIT not between", value1, value2, "isDataLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitIsNull() {
            addCriterion("IS_RECORD_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitIsNotNull() {
            addCriterion("IS_RECORD_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitEqualTo(String value) {
            addCriterion("IS_RECORD_LIMIT =", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitNotEqualTo(String value) {
            addCriterion("IS_RECORD_LIMIT <>", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitGreaterThan(String value) {
            addCriterion("IS_RECORD_LIMIT >", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RECORD_LIMIT >=", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitLessThan(String value) {
            addCriterion("IS_RECORD_LIMIT <", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitLessThanOrEqualTo(String value) {
            addCriterion("IS_RECORD_LIMIT <=", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitLike(String value) {
            addCriterion("IS_RECORD_LIMIT like", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitNotLike(String value) {
            addCriterion("IS_RECORD_LIMIT not like", value, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitIn(List<String> values) {
            addCriterion("IS_RECORD_LIMIT in", values, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitNotIn(List<String> values) {
            addCriterion("IS_RECORD_LIMIT not in", values, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitBetween(String value1, String value2) {
            addCriterion("IS_RECORD_LIMIT between", value1, value2, "isRecordLimit");
            return (Criteria) this;
        }

        public Criteria andIsRecordLimitNotBetween(String value1, String value2) {
            addCriterion("IS_RECORD_LIMIT not between", value1, value2, "isRecordLimit");
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