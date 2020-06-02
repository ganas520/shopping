package com.flight.china.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseIsNull() {
            addCriterion("goods_name_chinese is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseIsNotNull() {
            addCriterion("goods_name_chinese is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseEqualTo(String value) {
            addCriterion("goods_name_chinese =", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseNotEqualTo(String value) {
            addCriterion("goods_name_chinese <>", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseGreaterThan(String value) {
            addCriterion("goods_name_chinese >", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name_chinese >=", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseLessThan(String value) {
            addCriterion("goods_name_chinese <", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseLessThanOrEqualTo(String value) {
            addCriterion("goods_name_chinese <=", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseLike(String value) {
            addCriterion("goods_name_chinese like", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseNotLike(String value) {
            addCriterion("goods_name_chinese not like", value, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseIn(List<String> values) {
            addCriterion("goods_name_chinese in", values, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseNotIn(List<String> values) {
            addCriterion("goods_name_chinese not in", values, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseBetween(String value1, String value2) {
            addCriterion("goods_name_chinese between", value1, value2, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameChineseNotBetween(String value1, String value2) {
            addCriterion("goods_name_chinese not between", value1, value2, "goodsNameChinese");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanIsNull() {
            addCriterion("goods_name_korean is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanIsNotNull() {
            addCriterion("goods_name_korean is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanEqualTo(String value) {
            addCriterion("goods_name_korean =", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanNotEqualTo(String value) {
            addCriterion("goods_name_korean <>", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanGreaterThan(String value) {
            addCriterion("goods_name_korean >", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name_korean >=", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanLessThan(String value) {
            addCriterion("goods_name_korean <", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanLessThanOrEqualTo(String value) {
            addCriterion("goods_name_korean <=", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanLike(String value) {
            addCriterion("goods_name_korean like", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanNotLike(String value) {
            addCriterion("goods_name_korean not like", value, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanIn(List<String> values) {
            addCriterion("goods_name_korean in", values, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanNotIn(List<String> values) {
            addCriterion("goods_name_korean not in", values, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanBetween(String value1, String value2) {
            addCriterion("goods_name_korean between", value1, value2, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsNameKoreanNotBetween(String value1, String value2) {
            addCriterion("goods_name_korean not between", value1, value2, "goodsNameKorean");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelIsNull() {
            addCriterion("goods_label is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelIsNotNull() {
            addCriterion("goods_label is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelEqualTo(String value) {
            addCriterion("goods_label =", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelNotEqualTo(String value) {
            addCriterion("goods_label <>", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelGreaterThan(String value) {
            addCriterion("goods_label >", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_label >=", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelLessThan(String value) {
            addCriterion("goods_label <", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelLessThanOrEqualTo(String value) {
            addCriterion("goods_label <=", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelLike(String value) {
            addCriterion("goods_label like", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelNotLike(String value) {
            addCriterion("goods_label not like", value, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelIn(List<String> values) {
            addCriterion("goods_label in", values, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelNotIn(List<String> values) {
            addCriterion("goods_label not in", values, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelBetween(String value1, String value2) {
            addCriterion("goods_label between", value1, value2, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andGoodsLabelNotBetween(String value1, String value2) {
            addCriterion("goods_label not between", value1, value2, "goodsLabel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipIsNull() {
            addCriterion("product_ownership is null");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipIsNotNull() {
            addCriterion("product_ownership is not null");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipEqualTo(String value) {
            addCriterion("product_ownership =", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipNotEqualTo(String value) {
            addCriterion("product_ownership <>", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipGreaterThan(String value) {
            addCriterion("product_ownership >", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("product_ownership >=", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipLessThan(String value) {
            addCriterion("product_ownership <", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipLessThanOrEqualTo(String value) {
            addCriterion("product_ownership <=", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipLike(String value) {
            addCriterion("product_ownership like", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipNotLike(String value) {
            addCriterion("product_ownership not like", value, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipIn(List<String> values) {
            addCriterion("product_ownership in", values, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipNotIn(List<String> values) {
            addCriterion("product_ownership not in", values, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipBetween(String value1, String value2) {
            addCriterion("product_ownership between", value1, value2, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andProductOwnershipNotBetween(String value1, String value2) {
            addCriterion("product_ownership not between", value1, value2, "productOwnership");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNull() {
            addCriterion("logistics_cost is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNotNull() {
            addCriterion("logistics_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostEqualTo(BigDecimal value) {
            addCriterion("logistics_cost =", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotEqualTo(BigDecimal value) {
            addCriterion("logistics_cost <>", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThan(BigDecimal value) {
            addCriterion("logistics_cost >", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_cost >=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThan(BigDecimal value) {
            addCriterion("logistics_cost <", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("logistics_cost <=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIn(List<BigDecimal> values) {
            addCriterion("logistics_cost in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotIn(List<BigDecimal> values) {
            addCriterion("logistics_cost not in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_cost between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("logistics_cost not between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIsNull() {
            addCriterion("wholesale_price is null");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIsNotNull() {
            addCriterion("wholesale_price is not null");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceEqualTo(BigDecimal value) {
            addCriterion("wholesale_price =", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotEqualTo(BigDecimal value) {
            addCriterion("wholesale_price <>", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceGreaterThan(BigDecimal value) {
            addCriterion("wholesale_price >", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wholesale_price >=", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceLessThan(BigDecimal value) {
            addCriterion("wholesale_price <", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wholesale_price <=", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIn(List<BigDecimal> values) {
            addCriterion("wholesale_price in", values, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotIn(List<BigDecimal> values) {
            addCriterion("wholesale_price not in", values, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wholesale_price between", value1, value2, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wholesale_price not between", value1, value2, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andImageAdressIsNull() {
            addCriterion("image_adress is null");
            return (Criteria) this;
        }

        public Criteria andImageAdressIsNotNull() {
            addCriterion("image_adress is not null");
            return (Criteria) this;
        }

        public Criteria andImageAdressEqualTo(String value) {
            addCriterion("image_adress =", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressNotEqualTo(String value) {
            addCriterion("image_adress <>", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressGreaterThan(String value) {
            addCriterion("image_adress >", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressGreaterThanOrEqualTo(String value) {
            addCriterion("image_adress >=", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressLessThan(String value) {
            addCriterion("image_adress <", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressLessThanOrEqualTo(String value) {
            addCriterion("image_adress <=", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressLike(String value) {
            addCriterion("image_adress like", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressNotLike(String value) {
            addCriterion("image_adress not like", value, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressIn(List<String> values) {
            addCriterion("image_adress in", values, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressNotIn(List<String> values) {
            addCriterion("image_adress not in", values, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressBetween(String value1, String value2) {
            addCriterion("image_adress between", value1, value2, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andImageAdressNotBetween(String value1, String value2) {
            addCriterion("image_adress not between", value1, value2, "imageAdress");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkIsNull() {
            addCriterion("goods_link is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkIsNotNull() {
            addCriterion("goods_link is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkEqualTo(String value) {
            addCriterion("goods_link =", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkNotEqualTo(String value) {
            addCriterion("goods_link <>", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkGreaterThan(String value) {
            addCriterion("goods_link >", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_link >=", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkLessThan(String value) {
            addCriterion("goods_link <", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkLessThanOrEqualTo(String value) {
            addCriterion("goods_link <=", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkLike(String value) {
            addCriterion("goods_link like", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkNotLike(String value) {
            addCriterion("goods_link not like", value, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkIn(List<String> values) {
            addCriterion("goods_link in", values, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkNotIn(List<String> values) {
            addCriterion("goods_link not in", values, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkBetween(String value1, String value2) {
            addCriterion("goods_link between", value1, value2, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andGoodsLinkNotBetween(String value1, String value2) {
            addCriterion("goods_link not between", value1, value2, "goodsLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkIsNull() {
            addCriterion("image_link is null");
            return (Criteria) this;
        }

        public Criteria andImageLinkIsNotNull() {
            addCriterion("image_link is not null");
            return (Criteria) this;
        }

        public Criteria andImageLinkEqualTo(String value) {
            addCriterion("image_link =", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotEqualTo(String value) {
            addCriterion("image_link <>", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkGreaterThan(String value) {
            addCriterion("image_link >", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkGreaterThanOrEqualTo(String value) {
            addCriterion("image_link >=", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLessThan(String value) {
            addCriterion("image_link <", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLessThanOrEqualTo(String value) {
            addCriterion("image_link <=", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLike(String value) {
            addCriterion("image_link like", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotLike(String value) {
            addCriterion("image_link not like", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkIn(List<String> values) {
            addCriterion("image_link in", values, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotIn(List<String> values) {
            addCriterion("image_link not in", values, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkBetween(String value1, String value2) {
            addCriterion("image_link between", value1, value2, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotBetween(String value1, String value2) {
            addCriterion("image_link not between", value1, value2, "imageLink");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingIsNull() {
            addCriterion("abroad_shopping is null");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingIsNotNull() {
            addCriterion("abroad_shopping is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingEqualTo(String value) {
            addCriterion("abroad_shopping =", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingNotEqualTo(String value) {
            addCriterion("abroad_shopping <>", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingGreaterThan(String value) {
            addCriterion("abroad_shopping >", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingGreaterThanOrEqualTo(String value) {
            addCriterion("abroad_shopping >=", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingLessThan(String value) {
            addCriterion("abroad_shopping <", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingLessThanOrEqualTo(String value) {
            addCriterion("abroad_shopping <=", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingLike(String value) {
            addCriterion("abroad_shopping like", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingNotLike(String value) {
            addCriterion("abroad_shopping not like", value, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingIn(List<String> values) {
            addCriterion("abroad_shopping in", values, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingNotIn(List<String> values) {
            addCriterion("abroad_shopping not in", values, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingBetween(String value1, String value2) {
            addCriterion("abroad_shopping between", value1, value2, "abroadShopping");
            return (Criteria) this;
        }

        public Criteria andAbroadShoppingNotBetween(String value1, String value2) {
            addCriterion("abroad_shopping not between", value1, value2, "abroadShopping");
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