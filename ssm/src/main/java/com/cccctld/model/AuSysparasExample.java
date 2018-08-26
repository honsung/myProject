package com.cccctld.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuSysparasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuSysparasExample() {
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

        public Criteria andPropertykeyIsNull() {
            addCriterion("PROPERTYKEY is null");
            return (Criteria) this;
        }

        public Criteria andPropertykeyIsNotNull() {
            addCriterion("PROPERTYKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPropertykeyEqualTo(String value) {
            addCriterion("PROPERTYKEY =", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotEqualTo(String value) {
            addCriterion("PROPERTYKEY <>", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyGreaterThan(String value) {
            addCriterion("PROPERTYKEY >", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTYKEY >=", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyLessThan(String value) {
            addCriterion("PROPERTYKEY <", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyLessThanOrEqualTo(String value) {
            addCriterion("PROPERTYKEY <=", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyLike(String value) {
            addCriterion("PROPERTYKEY like", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotLike(String value) {
            addCriterion("PROPERTYKEY not like", value, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyIn(List<String> values) {
            addCriterion("PROPERTYKEY in", values, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotIn(List<String> values) {
            addCriterion("PROPERTYKEY not in", values, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyBetween(String value1, String value2) {
            addCriterion("PROPERTYKEY between", value1, value2, "propertykey");
            return (Criteria) this;
        }

        public Criteria andPropertykeyNotBetween(String value1, String value2) {
            addCriterion("PROPERTYKEY not between", value1, value2, "propertykey");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andInittimeIsNull() {
            addCriterion("INITTIME is null");
            return (Criteria) this;
        }

        public Criteria andInittimeIsNotNull() {
            addCriterion("INITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInittimeEqualTo(Date value) {
            addCriterion("INITTIME =", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeNotEqualTo(Date value) {
            addCriterion("INITTIME <>", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeGreaterThan(Date value) {
            addCriterion("INITTIME >", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INITTIME >=", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeLessThan(Date value) {
            addCriterion("INITTIME <", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeLessThanOrEqualTo(Date value) {
            addCriterion("INITTIME <=", value, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeIn(List<Date> values) {
            addCriterion("INITTIME in", values, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeNotIn(List<Date> values) {
            addCriterion("INITTIME not in", values, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeBetween(Date value1, Date value2) {
            addCriterion("INITTIME between", value1, value2, "inittime");
            return (Criteria) this;
        }

        public Criteria andInittimeNotBetween(Date value1, Date value2) {
            addCriterion("INITTIME not between", value1, value2, "inittime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(String value) {
            addCriterion("CREATORID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(String value) {
            addCriterion("CREATORID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(String value) {
            addCriterion("CREATORID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(String value) {
            addCriterion("CREATORID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(String value) {
            addCriterion("CREATORID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLike(String value) {
            addCriterion("CREATORID like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotLike(String value) {
            addCriterion("CREATORID not like", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<String> values) {
            addCriterion("CREATORID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<String> values) {
            addCriterion("CREATORID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(String value1, String value2) {
            addCriterion("CREATORID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(String value1, String value2) {
            addCriterion("CREATORID not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNull() {
            addCriterion("CREATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNotNull() {
            addCriterion("CREATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornameEqualTo(String value) {
            addCriterion("CREATORNAME =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotEqualTo(String value) {
            addCriterion("CREATORNAME <>", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThan(String value) {
            addCriterion("CREATORNAME >", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORNAME >=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThan(String value) {
            addCriterion("CREATORNAME <", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThanOrEqualTo(String value) {
            addCriterion("CREATORNAME <=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLike(String value) {
            addCriterion("CREATORNAME like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotLike(String value) {
            addCriterion("CREATORNAME not like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameIn(List<String> values) {
            addCriterion("CREATORNAME in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotIn(List<String> values) {
            addCriterion("CREATORNAME not in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameBetween(String value1, String value2) {
            addCriterion("CREATORNAME between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotBetween(String value1, String value2) {
            addCriterion("CREATORNAME not between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("ENABLE =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("ENABLE <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("ENABLE >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("ENABLE <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("ENABLE <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("ENABLE like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("ENABLE not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("ENABLE in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("ENABLE not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("ENABLE between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("ENABLE not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("PROPERTYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("PROPERTYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("PROPERTYTYPE =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("PROPERTYTYPE <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("PROPERTYTYPE >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("PROPERTYTYPE <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("PROPERTYTYPE <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("PROPERTYTYPE like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("PROPERTYTYPE not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("PROPERTYTYPE in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("PROPERTYTYPE not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("PROPERTYTYPE not between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andCloumn1IsNull() {
            addCriterion("CLOUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andCloumn1IsNotNull() {
            addCriterion("CLOUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andCloumn1EqualTo(String value) {
            addCriterion("CLOUMN1 =", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1NotEqualTo(String value) {
            addCriterion("CLOUMN1 <>", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1GreaterThan(String value) {
            addCriterion("CLOUMN1 >", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1GreaterThanOrEqualTo(String value) {
            addCriterion("CLOUMN1 >=", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1LessThan(String value) {
            addCriterion("CLOUMN1 <", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1LessThanOrEqualTo(String value) {
            addCriterion("CLOUMN1 <=", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1Like(String value) {
            addCriterion("CLOUMN1 like", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1NotLike(String value) {
            addCriterion("CLOUMN1 not like", value, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1In(List<String> values) {
            addCriterion("CLOUMN1 in", values, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1NotIn(List<String> values) {
            addCriterion("CLOUMN1 not in", values, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1Between(String value1, String value2) {
            addCriterion("CLOUMN1 between", value1, value2, "cloumn1");
            return (Criteria) this;
        }

        public Criteria andCloumn1NotBetween(String value1, String value2) {
            addCriterion("CLOUMN1 not between", value1, value2, "cloumn1");
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