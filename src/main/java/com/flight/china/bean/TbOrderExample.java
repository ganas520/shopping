package com.flight.china.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("order_source like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("order_source not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusIsNull() {
            addCriterion("system_order_status is null");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusIsNotNull() {
            addCriterion("system_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusEqualTo(String value) {
            addCriterion("system_order_status =", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusNotEqualTo(String value) {
            addCriterion("system_order_status <>", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusGreaterThan(String value) {
            addCriterion("system_order_status >", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("system_order_status >=", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusLessThan(String value) {
            addCriterion("system_order_status <", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("system_order_status <=", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusLike(String value) {
            addCriterion("system_order_status like", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusNotLike(String value) {
            addCriterion("system_order_status not like", value, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusIn(List<String> values) {
            addCriterion("system_order_status in", values, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusNotIn(List<String> values) {
            addCriterion("system_order_status not in", values, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusBetween(String value1, String value2) {
            addCriterion("system_order_status between", value1, value2, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSystemOrderStatusNotBetween(String value1, String value2) {
            addCriterion("system_order_status not between", value1, value2, "systemOrderStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusIsNull() {
            addCriterion("financial_status is null");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusIsNotNull() {
            addCriterion("financial_status is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusEqualTo(String value) {
            addCriterion("financial_status =", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusNotEqualTo(String value) {
            addCriterion("financial_status <>", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusGreaterThan(String value) {
            addCriterion("financial_status >", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusGreaterThanOrEqualTo(String value) {
            addCriterion("financial_status >=", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusLessThan(String value) {
            addCriterion("financial_status <", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusLessThanOrEqualTo(String value) {
            addCriterion("financial_status <=", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusLike(String value) {
            addCriterion("financial_status like", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusNotLike(String value) {
            addCriterion("financial_status not like", value, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusIn(List<String> values) {
            addCriterion("financial_status in", values, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusNotIn(List<String> values) {
            addCriterion("financial_status not in", values, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusBetween(String value1, String value2) {
            addCriterion("financial_status between", value1, value2, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andFinancialStatusNotBetween(String value1, String value2) {
            addCriterion("financial_status not between", value1, value2, "financialStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNull() {
            addCriterion("stock_status is null");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNotNull() {
            addCriterion("stock_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockStatusEqualTo(String value) {
            addCriterion("stock_status =", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotEqualTo(String value) {
            addCriterion("stock_status <>", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThan(String value) {
            addCriterion("stock_status >", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stock_status >=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThan(String value) {
            addCriterion("stock_status <", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThanOrEqualTo(String value) {
            addCriterion("stock_status <=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLike(String value) {
            addCriterion("stock_status like", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotLike(String value) {
            addCriterion("stock_status not like", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusIn(List<String> values) {
            addCriterion("stock_status in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotIn(List<String> values) {
            addCriterion("stock_status not in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusBetween(String value1, String value2) {
            addCriterion("stock_status between", value1, value2, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotBetween(String value1, String value2) {
            addCriterion("stock_status not between", value1, value2, "stockStatus");
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
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeIsNull() {
            addCriterion("source_order_code is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeIsNotNull() {
            addCriterion("source_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeEqualTo(String value) {
            addCriterion("source_order_code =", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeNotEqualTo(String value) {
            addCriterion("source_order_code <>", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeGreaterThan(String value) {
            addCriterion("source_order_code >", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("source_order_code >=", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeLessThan(String value) {
            addCriterion("source_order_code <", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("source_order_code <=", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeLike(String value) {
            addCriterion("source_order_code like", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeNotLike(String value) {
            addCriterion("source_order_code not like", value, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeIn(List<String> values) {
            addCriterion("source_order_code in", values, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeNotIn(List<String> values) {
            addCriterion("source_order_code not in", values, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeBetween(String value1, String value2) {
            addCriterion("source_order_code between", value1, value2, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderCodeNotBetween(String value1, String value2) {
            addCriterion("source_order_code not between", value1, value2, "sourceOrderCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeIsNull() {
            addCriterion("source_goods_code is null");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeIsNotNull() {
            addCriterion("source_goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeEqualTo(String value) {
            addCriterion("source_goods_code =", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeNotEqualTo(String value) {
            addCriterion("source_goods_code <>", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeGreaterThan(String value) {
            addCriterion("source_goods_code >", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("source_goods_code >=", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeLessThan(String value) {
            addCriterion("source_goods_code <", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("source_goods_code <=", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeLike(String value) {
            addCriterion("source_goods_code like", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeNotLike(String value) {
            addCriterion("source_goods_code not like", value, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeIn(List<String> values) {
            addCriterion("source_goods_code in", values, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeNotIn(List<String> values) {
            addCriterion("source_goods_code not in", values, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeBetween(String value1, String value2) {
            addCriterion("source_goods_code between", value1, value2, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andSourceGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("source_goods_code not between", value1, value2, "sourceGoodsCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNull() {
            addCriterion("purchase_count is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNotNull() {
            addCriterion("purchase_count is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountEqualTo(String value) {
            addCriterion("purchase_count =", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotEqualTo(String value) {
            addCriterion("purchase_count <>", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThan(String value) {
            addCriterion("purchase_count >", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_count >=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThan(String value) {
            addCriterion("purchase_count <", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThanOrEqualTo(String value) {
            addCriterion("purchase_count <=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLike(String value) {
            addCriterion("purchase_count like", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotLike(String value) {
            addCriterion("purchase_count not like", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIn(List<String> values) {
            addCriterion("purchase_count in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotIn(List<String> values) {
            addCriterion("purchase_count not in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountBetween(String value1, String value2) {
            addCriterion("purchase_count between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotBetween(String value1, String value2) {
            addCriterion("purchase_count not between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksIsNull() {
            addCriterion("order_goods_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksIsNotNull() {
            addCriterion("order_goods_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksEqualTo(String value) {
            addCriterion("order_goods_remarks =", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksNotEqualTo(String value) {
            addCriterion("order_goods_remarks <>", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksGreaterThan(String value) {
            addCriterion("order_goods_remarks >", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_remarks >=", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksLessThan(String value) {
            addCriterion("order_goods_remarks <", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksLessThanOrEqualTo(String value) {
            addCriterion("order_goods_remarks <=", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksLike(String value) {
            addCriterion("order_goods_remarks like", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksNotLike(String value) {
            addCriterion("order_goods_remarks not like", value, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksIn(List<String> values) {
            addCriterion("order_goods_remarks in", values, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksNotIn(List<String> values) {
            addCriterion("order_goods_remarks not in", values, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksBetween(String value1, String value2) {
            addCriterion("order_goods_remarks between", value1, value2, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsRemarksNotBetween(String value1, String value2) {
            addCriterion("order_goods_remarks not between", value1, value2, "orderGoodsRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksIsNull() {
            addCriterion("order_express_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksIsNotNull() {
            addCriterion("order_express_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksEqualTo(String value) {
            addCriterion("order_express_remarks =", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksNotEqualTo(String value) {
            addCriterion("order_express_remarks <>", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksGreaterThan(String value) {
            addCriterion("order_express_remarks >", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("order_express_remarks >=", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksLessThan(String value) {
            addCriterion("order_express_remarks <", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksLessThanOrEqualTo(String value) {
            addCriterion("order_express_remarks <=", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksLike(String value) {
            addCriterion("order_express_remarks like", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksNotLike(String value) {
            addCriterion("order_express_remarks not like", value, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksIn(List<String> values) {
            addCriterion("order_express_remarks in", values, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksNotIn(List<String> values) {
            addCriterion("order_express_remarks not in", values, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksBetween(String value1, String value2) {
            addCriterion("order_express_remarks between", value1, value2, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderExpressRemarksNotBetween(String value1, String value2) {
            addCriterion("order_express_remarks not between", value1, value2, "orderExpressRemarks");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNull() {
            addCriterion("buyer_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIsNotNull() {
            addCriterion("buyer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneEqualTo(String value) {
            addCriterion("buyer_phone =", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotEqualTo(String value) {
            addCriterion("buyer_phone <>", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThan(String value) {
            addCriterion("buyer_phone >", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_phone >=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThan(String value) {
            addCriterion("buyer_phone <", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_phone <=", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneLike(String value) {
            addCriterion("buyer_phone like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotLike(String value) {
            addCriterion("buyer_phone not like", value, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneIn(List<String> values) {
            addCriterion("buyer_phone in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotIn(List<String> values) {
            addCriterion("buyer_phone not in", values, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneBetween(String value1, String value2) {
            addCriterion("buyer_phone between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("buyer_phone not between", value1, value2, "buyerPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeIsNull() {
            addCriterion("buyer_clearance_code is null");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeIsNotNull() {
            addCriterion("buyer_clearance_code is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeEqualTo(String value) {
            addCriterion("buyer_clearance_code =", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeNotEqualTo(String value) {
            addCriterion("buyer_clearance_code <>", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeGreaterThan(String value) {
            addCriterion("buyer_clearance_code >", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_clearance_code >=", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeLessThan(String value) {
            addCriterion("buyer_clearance_code <", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeLessThanOrEqualTo(String value) {
            addCriterion("buyer_clearance_code <=", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeLike(String value) {
            addCriterion("buyer_clearance_code like", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeNotLike(String value) {
            addCriterion("buyer_clearance_code not like", value, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeIn(List<String> values) {
            addCriterion("buyer_clearance_code in", values, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeNotIn(List<String> values) {
            addCriterion("buyer_clearance_code not in", values, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeBetween(String value1, String value2) {
            addCriterion("buyer_clearance_code between", value1, value2, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andBuyerClearanceCodeNotBetween(String value1, String value2) {
            addCriterion("buyer_clearance_code not between", value1, value2, "buyerClearanceCode");
            return (Criteria) this;
        }

        public Criteria andLabersIsNull() {
            addCriterion("labers is null");
            return (Criteria) this;
        }

        public Criteria andLabersIsNotNull() {
            addCriterion("labers is not null");
            return (Criteria) this;
        }

        public Criteria andLabersEqualTo(String value) {
            addCriterion("labers =", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersNotEqualTo(String value) {
            addCriterion("labers <>", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersGreaterThan(String value) {
            addCriterion("labers >", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersGreaterThanOrEqualTo(String value) {
            addCriterion("labers >=", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersLessThan(String value) {
            addCriterion("labers <", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersLessThanOrEqualTo(String value) {
            addCriterion("labers <=", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersLike(String value) {
            addCriterion("labers like", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersNotLike(String value) {
            addCriterion("labers not like", value, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersIn(List<String> values) {
            addCriterion("labers in", values, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersNotIn(List<String> values) {
            addCriterion("labers not in", values, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersBetween(String value1, String value2) {
            addCriterion("labers between", value1, value2, "labers");
            return (Criteria) this;
        }

        public Criteria andLabersNotBetween(String value1, String value2) {
            addCriterion("labers not between", value1, value2, "labers");
            return (Criteria) this;
        }

        public Criteria andShippedCountIsNull() {
            addCriterion("shipped_count is null");
            return (Criteria) this;
        }

        public Criteria andShippedCountIsNotNull() {
            addCriterion("shipped_count is not null");
            return (Criteria) this;
        }

        public Criteria andShippedCountEqualTo(String value) {
            addCriterion("shipped_count =", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountNotEqualTo(String value) {
            addCriterion("shipped_count <>", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountGreaterThan(String value) {
            addCriterion("shipped_count >", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountGreaterThanOrEqualTo(String value) {
            addCriterion("shipped_count >=", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountLessThan(String value) {
            addCriterion("shipped_count <", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountLessThanOrEqualTo(String value) {
            addCriterion("shipped_count <=", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountLike(String value) {
            addCriterion("shipped_count like", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountNotLike(String value) {
            addCriterion("shipped_count not like", value, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountIn(List<String> values) {
            addCriterion("shipped_count in", values, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountNotIn(List<String> values) {
            addCriterion("shipped_count not in", values, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountBetween(String value1, String value2) {
            addCriterion("shipped_count between", value1, value2, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andShippedCountNotBetween(String value1, String value2) {
            addCriterion("shipped_count not between", value1, value2, "shippedCount");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNull() {
            addCriterion("consignee_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNotNull() {
            addCriterion("consignee_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameEqualTo(String value) {
            addCriterion("consignee_name =", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotEqualTo(String value) {
            addCriterion("consignee_name <>", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThan(String value) {
            addCriterion("consignee_name >", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_name >=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThan(String value) {
            addCriterion("consignee_name <", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_name <=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLike(String value) {
            addCriterion("consignee_name like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotLike(String value) {
            addCriterion("consignee_name not like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIn(List<String> values) {
            addCriterion("consignee_name in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotIn(List<String> values) {
            addCriterion("consignee_name not in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameBetween(String value1, String value2) {
            addCriterion("consignee_name between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("consignee_name not between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNull() {
            addCriterion("fixed_phone is null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNotNull() {
            addCriterion("fixed_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneEqualTo(String value) {
            addCriterion("fixed_phone =", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotEqualTo(String value) {
            addCriterion("fixed_phone <>", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThan(String value) {
            addCriterion("fixed_phone >", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_phone >=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThan(String value) {
            addCriterion("fixed_phone <", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThanOrEqualTo(String value) {
            addCriterion("fixed_phone <=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLike(String value) {
            addCriterion("fixed_phone like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotLike(String value) {
            addCriterion("fixed_phone not like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIn(List<String> values) {
            addCriterion("fixed_phone in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotIn(List<String> values) {
            addCriterion("fixed_phone not in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneBetween(String value1, String value2) {
            addCriterion("fixed_phone between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotBetween(String value1, String value2) {
            addCriterion("fixed_phone not between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("buyer_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("buyer_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("buyer_address =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("buyer_address <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("buyer_address >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_address >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("buyer_address <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("buyer_address <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("buyer_address like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("buyer_address not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("buyer_address in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("buyer_address not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("buyer_address between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("buyer_address not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andSurplusStockIsNull() {
            addCriterion("surplus_stock is null");
            return (Criteria) this;
        }

        public Criteria andSurplusStockIsNotNull() {
            addCriterion("surplus_stock is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusStockEqualTo(String value) {
            addCriterion("surplus_stock =", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockNotEqualTo(String value) {
            addCriterion("surplus_stock <>", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockGreaterThan(String value) {
            addCriterion("surplus_stock >", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockGreaterThanOrEqualTo(String value) {
            addCriterion("surplus_stock >=", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockLessThan(String value) {
            addCriterion("surplus_stock <", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockLessThanOrEqualTo(String value) {
            addCriterion("surplus_stock <=", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockLike(String value) {
            addCriterion("surplus_stock like", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockNotLike(String value) {
            addCriterion("surplus_stock not like", value, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockIn(List<String> values) {
            addCriterion("surplus_stock in", values, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockNotIn(List<String> values) {
            addCriterion("surplus_stock not in", values, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockBetween(String value1, String value2) {
            addCriterion("surplus_stock between", value1, value2, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andSurplusStockNotBetween(String value1, String value2) {
            addCriterion("surplus_stock not between", value1, value2, "surplusStock");
            return (Criteria) this;
        }

        public Criteria andBelongSaleIsNull() {
            addCriterion("belong_sale is null");
            return (Criteria) this;
        }

        public Criteria andBelongSaleIsNotNull() {
            addCriterion("belong_sale is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSaleEqualTo(String value) {
            addCriterion("belong_sale =", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleNotEqualTo(String value) {
            addCriterion("belong_sale <>", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleGreaterThan(String value) {
            addCriterion("belong_sale >", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleGreaterThanOrEqualTo(String value) {
            addCriterion("belong_sale >=", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleLessThan(String value) {
            addCriterion("belong_sale <", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleLessThanOrEqualTo(String value) {
            addCriterion("belong_sale <=", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleLike(String value) {
            addCriterion("belong_sale like", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleNotLike(String value) {
            addCriterion("belong_sale not like", value, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleIn(List<String> values) {
            addCriterion("belong_sale in", values, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleNotIn(List<String> values) {
            addCriterion("belong_sale not in", values, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleBetween(String value1, String value2) {
            addCriterion("belong_sale between", value1, value2, "belongSale");
            return (Criteria) this;
        }

        public Criteria andBelongSaleNotBetween(String value1, String value2) {
            addCriterion("belong_sale not between", value1, value2, "belongSale");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberIsNull() {
            addCriterion("domestic_logistics_number is null");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberIsNotNull() {
            addCriterion("domestic_logistics_number is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberEqualTo(String value) {
            addCriterion("domestic_logistics_number =", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberNotEqualTo(String value) {
            addCriterion("domestic_logistics_number <>", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberGreaterThan(String value) {
            addCriterion("domestic_logistics_number >", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("domestic_logistics_number >=", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberLessThan(String value) {
            addCriterion("domestic_logistics_number <", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberLessThanOrEqualTo(String value) {
            addCriterion("domestic_logistics_number <=", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberLike(String value) {
            addCriterion("domestic_logistics_number like", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberNotLike(String value) {
            addCriterion("domestic_logistics_number not like", value, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberIn(List<String> values) {
            addCriterion("domestic_logistics_number in", values, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberNotIn(List<String> values) {
            addCriterion("domestic_logistics_number not in", values, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberBetween(String value1, String value2) {
            addCriterion("domestic_logistics_number between", value1, value2, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andDomesticLogisticsNumberNotBetween(String value1, String value2) {
            addCriterion("domestic_logistics_number not between", value1, value2, "domesticLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberIsNull() {
            addCriterion("internatinnal_logistics_number is null");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberIsNotNull() {
            addCriterion("internatinnal_logistics_number is not null");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberEqualTo(String value) {
            addCriterion("internatinnal_logistics_number =", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberNotEqualTo(String value) {
            addCriterion("internatinnal_logistics_number <>", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberGreaterThan(String value) {
            addCriterion("internatinnal_logistics_number >", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("internatinnal_logistics_number >=", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberLessThan(String value) {
            addCriterion("internatinnal_logistics_number <", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberLessThanOrEqualTo(String value) {
            addCriterion("internatinnal_logistics_number <=", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberLike(String value) {
            addCriterion("internatinnal_logistics_number like", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberNotLike(String value) {
            addCriterion("internatinnal_logistics_number not like", value, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberIn(List<String> values) {
            addCriterion("internatinnal_logistics_number in", values, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberNotIn(List<String> values) {
            addCriterion("internatinnal_logistics_number not in", values, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberBetween(String value1, String value2) {
            addCriterion("internatinnal_logistics_number between", value1, value2, "internatinnalLogisticsNumber");
            return (Criteria) this;
        }

        public Criteria andInternatinnalLogisticsNumberNotBetween(String value1, String value2) {
            addCriterion("internatinnal_logistics_number not between", value1, value2, "internatinnalLogisticsNumber");
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