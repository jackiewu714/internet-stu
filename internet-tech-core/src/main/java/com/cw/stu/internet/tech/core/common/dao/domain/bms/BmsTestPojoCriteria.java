package com.cw.stu.internet.tech.core.common.dao.domain.bms;

import java.util.ArrayList;
import java.util.List;

public class BmsTestPojoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String name1;

    private String name1Range;

    private String name2;

    private String name2Range;

    private String name3;

    private String name3Range;

    private String name4;

    private String name4Range;

    private String name5;

    private String name5Range;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public BmsTestPojoCriteria() {
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

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public String getName1Range() {
        return name1Range;
    }

    public void setName1Range(String name1Range) {
        this.name1Range = name1Range == null ? null : name1Range.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getName2Range() {
        return name2Range;
    }

    public void setName2Range(String name2Range) {
        this.name2Range = name2Range == null ? null : name2Range.trim();
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3 == null ? null : name3.trim();
    }

    public String getName3Range() {
        return name3Range;
    }

    public void setName3Range(String name3Range) {
        this.name3Range = name3Range == null ? null : name3Range.trim();
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4 == null ? null : name4.trim();
    }

    public String getName4Range() {
        return name4Range;
    }

    public void setName4Range(String name4Range) {
        this.name4Range = name4Range == null ? null : name4Range.trim();
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5 == null ? null : name5.trim();
    }

    public String getName5Range() {
        return name5Range;
    }

    public void setName5Range(String name5Range) {
        this.name5Range = name5Range == null ? null : name5Range.trim();
    }

    public String getExtracClause() {
        return extracClause;
    }

    public void setExtracClause(String extracClause) {
        this.extracClause = extracClause == null ? null : extracClause.trim();
    }

    public String getExtracSelectColunm() {
        return extracSelectColunm;
    }

    public void setExtracSelectColunm(String extracSelectColunm) {
        this.extracSelectColunm = extracSelectColunm == null ? null : extracSelectColunm.trim();
    }

    public String getExtracTable() {
        return extracTable;
    }

    public void setExtracTable(String extracTable) {
        this.extracTable = extracTable == null ? null : extracTable.trim();
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

        public Criteria andName1IsNull() {
            addCriterion("NAME1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("NAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("NAME1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("NAME1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("NAME1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("NAME1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("NAME1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("NAME1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("NAME1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("NAME1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("NAME1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("NAME1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("NAME1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("NAME1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName2IsNull() {
            addCriterion("NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andName2IsNotNull() {
            addCriterion("NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andName2EqualTo(String value) {
            addCriterion("NAME2 =", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotEqualTo(String value) {
            addCriterion("NAME2 <>", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThan(String value) {
            addCriterion("NAME2 >", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThanOrEqualTo(String value) {
            addCriterion("NAME2 >=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThan(String value) {
            addCriterion("NAME2 <", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThanOrEqualTo(String value) {
            addCriterion("NAME2 <=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Like(String value) {
            addCriterion("NAME2 like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotLike(String value) {
            addCriterion("NAME2 not like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2In(List<String> values) {
            addCriterion("NAME2 in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotIn(List<String> values) {
            addCriterion("NAME2 not in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Between(String value1, String value2) {
            addCriterion("NAME2 between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotBetween(String value1, String value2) {
            addCriterion("NAME2 not between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName3IsNull() {
            addCriterion("NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andName3IsNotNull() {
            addCriterion("NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andName3EqualTo(String value) {
            addCriterion("NAME3 =", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotEqualTo(String value) {
            addCriterion("NAME3 <>", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3GreaterThan(String value) {
            addCriterion("NAME3 >", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3GreaterThanOrEqualTo(String value) {
            addCriterion("NAME3 >=", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3LessThan(String value) {
            addCriterion("NAME3 <", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3LessThanOrEqualTo(String value) {
            addCriterion("NAME3 <=", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3Like(String value) {
            addCriterion("NAME3 like", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotLike(String value) {
            addCriterion("NAME3 not like", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3In(List<String> values) {
            addCriterion("NAME3 in", values, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotIn(List<String> values) {
            addCriterion("NAME3 not in", values, "name3");
            return (Criteria) this;
        }

        public Criteria andName3Between(String value1, String value2) {
            addCriterion("NAME3 between", value1, value2, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotBetween(String value1, String value2) {
            addCriterion("NAME3 not between", value1, value2, "name3");
            return (Criteria) this;
        }

        public Criteria andName4IsNull() {
            addCriterion("NAME4 is null");
            return (Criteria) this;
        }

        public Criteria andName4IsNotNull() {
            addCriterion("NAME4 is not null");
            return (Criteria) this;
        }

        public Criteria andName4EqualTo(String value) {
            addCriterion("NAME4 =", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotEqualTo(String value) {
            addCriterion("NAME4 <>", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4GreaterThan(String value) {
            addCriterion("NAME4 >", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4GreaterThanOrEqualTo(String value) {
            addCriterion("NAME4 >=", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4LessThan(String value) {
            addCriterion("NAME4 <", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4LessThanOrEqualTo(String value) {
            addCriterion("NAME4 <=", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4Like(String value) {
            addCriterion("NAME4 like", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotLike(String value) {
            addCriterion("NAME4 not like", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4In(List<String> values) {
            addCriterion("NAME4 in", values, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotIn(List<String> values) {
            addCriterion("NAME4 not in", values, "name4");
            return (Criteria) this;
        }

        public Criteria andName4Between(String value1, String value2) {
            addCriterion("NAME4 between", value1, value2, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotBetween(String value1, String value2) {
            addCriterion("NAME4 not between", value1, value2, "name4");
            return (Criteria) this;
        }

        public Criteria andName5IsNull() {
            addCriterion("NAME5 is null");
            return (Criteria) this;
        }

        public Criteria andName5IsNotNull() {
            addCriterion("NAME5 is not null");
            return (Criteria) this;
        }

        public Criteria andName5EqualTo(String value) {
            addCriterion("NAME5 =", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotEqualTo(String value) {
            addCriterion("NAME5 <>", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5GreaterThan(String value) {
            addCriterion("NAME5 >", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5GreaterThanOrEqualTo(String value) {
            addCriterion("NAME5 >=", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5LessThan(String value) {
            addCriterion("NAME5 <", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5LessThanOrEqualTo(String value) {
            addCriterion("NAME5 <=", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5Like(String value) {
            addCriterion("NAME5 like", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotLike(String value) {
            addCriterion("NAME5 not like", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5In(List<String> values) {
            addCriterion("NAME5 in", values, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotIn(List<String> values) {
            addCriterion("NAME5 not in", values, "name5");
            return (Criteria) this;
        }

        public Criteria andName5Between(String value1, String value2) {
            addCriterion("NAME5 between", value1, value2, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotBetween(String value1, String value2) {
            addCriterion("NAME5 not between", value1, value2, "name5");
            return (Criteria) this;
        }

        public Criteria andName1LikeInsensitive(String value) {
            addCriterion("upper(NAME1) like", value.toUpperCase(), "name1");
            return (Criteria) this;
        }

        public Criteria andName2LikeInsensitive(String value) {
            addCriterion("upper(NAME2) like", value.toUpperCase(), "name2");
            return (Criteria) this;
        }

        public Criteria andName3LikeInsensitive(String value) {
            addCriterion("upper(NAME3) like", value.toUpperCase(), "name3");
            return (Criteria) this;
        }

        public Criteria andName4LikeInsensitive(String value) {
            addCriterion("upper(NAME4) like", value.toUpperCase(), "name4");
            return (Criteria) this;
        }

        public Criteria andName5LikeInsensitive(String value) {
            addCriterion("upper(NAME5) like", value.toUpperCase(), "name5");
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