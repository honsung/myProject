package com.honsung.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuDepartmentExample() {
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

        public Criteria andDeptNoIsNull() {
            addCriterion("DEPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("DEPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(String value) {
            addCriterion("DEPT_NO =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(String value) {
            addCriterion("DEPT_NO <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(String value) {
            addCriterion("DEPT_NO >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NO >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(String value) {
            addCriterion("DEPT_NO <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NO <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLike(String value) {
            addCriterion("DEPT_NO like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotLike(String value) {
            addCriterion("DEPT_NO not like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<String> values) {
            addCriterion("DEPT_NO in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<String> values) {
            addCriterion("DEPT_NO not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(String value1, String value2) {
            addCriterion("DEPT_NO between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(String value1, String value2) {
            addCriterion("DEPT_NO not between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIsNull() {
            addCriterion("DEPT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIsNotNull() {
            addCriterion("DEPT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeptFlagEqualTo(String value) {
            addCriterion("DEPT_FLAG =", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotEqualTo(String value) {
            addCriterion("DEPT_FLAG <>", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagGreaterThan(String value) {
            addCriterion("DEPT_FLAG >", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_FLAG >=", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagLessThan(String value) {
            addCriterion("DEPT_FLAG <", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagLessThanOrEqualTo(String value) {
            addCriterion("DEPT_FLAG <=", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagLike(String value) {
            addCriterion("DEPT_FLAG like", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotLike(String value) {
            addCriterion("DEPT_FLAG not like", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIn(List<String> values) {
            addCriterion("DEPT_FLAG in", values, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotIn(List<String> values) {
            addCriterion("DEPT_FLAG not in", values, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagBetween(String value1, String value2) {
            addCriterion("DEPT_FLAG between", value1, value2, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotBetween(String value1, String value2) {
            addCriterion("DEPT_FLAG not between", value1, value2, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNull() {
            addCriterion("DEPT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNotNull() {
            addCriterion("DEPT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelEqualTo(String value) {
            addCriterion("DEPT_LEVEL =", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotEqualTo(String value) {
            addCriterion("DEPT_LEVEL <>", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThan(String value) {
            addCriterion("DEPT_LEVEL >", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_LEVEL >=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThan(String value) {
            addCriterion("DEPT_LEVEL <", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThanOrEqualTo(String value) {
            addCriterion("DEPT_LEVEL <=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLike(String value) {
            addCriterion("DEPT_LEVEL like", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotLike(String value) {
            addCriterion("DEPT_LEVEL not like", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIn(List<String> values) {
            addCriterion("DEPT_LEVEL in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotIn(List<String> values) {
            addCriterion("DEPT_LEVEL not in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelBetween(String value1, String value2) {
            addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotBetween(String value1, String value2) {
            addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIsNull() {
            addCriterion("DEPT_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIsNotNull() {
            addCriterion("DEPT_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderEqualTo(String value) {
            addCriterion("DEPT_LEADER =", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotEqualTo(String value) {
            addCriterion("DEPT_LEADER <>", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderGreaterThan(String value) {
            addCriterion("DEPT_LEADER >", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_LEADER >=", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLessThan(String value) {
            addCriterion("DEPT_LEADER <", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLessThanOrEqualTo(String value) {
            addCriterion("DEPT_LEADER <=", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLike(String value) {
            addCriterion("DEPT_LEADER like", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotLike(String value) {
            addCriterion("DEPT_LEADER not like", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIn(List<String> values) {
            addCriterion("DEPT_LEADER in", values, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotIn(List<String> values) {
            addCriterion("DEPT_LEADER not in", values, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderBetween(String value1, String value2) {
            addCriterion("DEPT_LEADER between", value1, value2, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotBetween(String value1, String value2) {
            addCriterion("DEPT_LEADER not between", value1, value2, "deptLeader");
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

        public Criteria andColumn1IsNull() {
            addCriterion("COLUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("COLUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("COLUMN1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("COLUMN1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("COLUMN1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("COLUMN1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("COLUMN1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("COLUMN1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("COLUMN1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("COLUMN1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("COLUMN1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("COLUMN1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("COLUMN1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("COLUMN2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("COLUMN2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("COLUMN2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("COLUMN2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("COLUMN2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("COLUMN2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("COLUMN2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("COLUMN2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("COLUMN2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("COLUMN2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("COLUMN2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("COLUMN2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("COLUMN2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("COLUMN3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("COLUMN3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("COLUMN3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("COLUMN3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("COLUMN3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("COLUMN3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("COLUMN3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("COLUMN3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("COLUMN3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("COLUMN3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("COLUMN3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("COLUMN3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("COLUMN3 not between", value1, value2, "column3");
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