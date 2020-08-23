package com.flight.china.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrder {
    private Integer id;

    private String orderCode;

    private String currency;

    private String orderSource;

    private String systemOrderStatus;

    private String financialStatus;

    private String stockStatus;

    private Date createTime;
    
    private Date updateTime;

    private String goodsAmount;

    private Integer goodsId;

    private String country;

    private String sourceOrderCode;

    private String sourceGoodsCode;

    private String purchaseCount;

    private String orderGoodsRemarks;

    private String orderExpressRemarks;

    private String buyerName;

    private String buyerPhone;

    private String buyerClearanceCode;

    private String labers;

    private String shippedCount;

    private String consigneeName;

    private String fixedPhone;

    private String buyerAddress;

    private String surplusStock;

    private String belongSale;

    private String domesticLogisticsNumber;

    private String internatinnalLogisticsNumber;
    
    private int startWith;
    
    private int rows;
    
    private String supplierName;
    
    private String goodsNameChinese;
    

    public String getGoodsNameChinese() {
		return goodsNameChinese;
	}

	public void setGoodsNameChinese(String goodsNameChinese) {
		this.goodsNameChinese = goodsNameChinese;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getStartWith() {
		return startWith;
	}

	public void setStartWith(int startWith) {
		this.startWith = startWith;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource == null ? null : orderSource.trim();
    }

    public String getSystemOrderStatus() {
        return systemOrderStatus;
    }

    /***
     * 系统订单状态
     * @param systemOrderStatus
     */
    public void setSystemOrderStatus(String systemOrderStatus) {
        this.systemOrderStatus = systemOrderStatus == null ? null : systemOrderStatus.trim();
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus == null ? null : financialStatus.trim();
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus == null ? null : stockStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGoodsAmount() {
        return goodsAmount;
    }

    /***
     * 商品金额
     * @param goodsAmount
     */
    public void setGoodsAmount(String goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getSourceOrderCode() {
        return sourceOrderCode;
    }

    /***
     * 来源订单编号
     * @param sourceOrderCode
     */
    public void setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode == null ? null : sourceOrderCode.trim();
    }

    public String getSourceGoodsCode() {
        return sourceGoodsCode;
    }

    /***
     * 来源商品编号
     * @param sourceGoodsCode
     */
    public void setSourceGoodsCode(String sourceGoodsCode) {
        this.sourceGoodsCode = sourceGoodsCode == null ? null : sourceGoodsCode.trim();
    }

    public String getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(String purchaseCount) {
        this.purchaseCount = purchaseCount == null ? null : purchaseCount.trim();
    }

    public String getOrderGoodsRemarks() {
        return orderGoodsRemarks;
    }

    public void setOrderGoodsRemarks(String orderGoodsRemarks) {
        this.orderGoodsRemarks = orderGoodsRemarks == null ? null : orderGoodsRemarks.trim();
    }

    public String getOrderExpressRemarks() {
        return orderExpressRemarks;
    }

    public void setOrderExpressRemarks(String orderExpressRemarks) {
        this.orderExpressRemarks = orderExpressRemarks == null ? null : orderExpressRemarks.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    /***
     * 买家姓名
     * @param buyerName
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public String getBuyerClearanceCode() {
        return buyerClearanceCode;
    }

    public void setBuyerClearanceCode(String buyerClearanceCode) {
        this.buyerClearanceCode = buyerClearanceCode == null ? null : buyerClearanceCode.trim();
    }

    public String getLabers() {
        return labers;
    }

    public void setLabers(String labers) {
        this.labers = labers == null ? null : labers.trim();
    }

    public String getShippedCount() {
        return shippedCount;
    }

    public void setShippedCount(String shippedCount) {
        this.shippedCount = shippedCount == null ? null : shippedCount.trim();
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone == null ? null : fixedPhone.trim();
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public String getSurplusStock() {
        return surplusStock;
    }

    public void setSurplusStock(String surplusStock) {
        this.surplusStock = surplusStock == null ? null : surplusStock.trim();
    }

    public String getBelongSale() {
        return belongSale;
    }

    public void setBelongSale(String belongSale) {
        this.belongSale = belongSale == null ? null : belongSale.trim();
    }

    public String getDomesticLogisticsNumber() {
        return domesticLogisticsNumber;
    }

    public void setDomesticLogisticsNumber(String domesticLogisticsNumber) {
        this.domesticLogisticsNumber = domesticLogisticsNumber == null ? null : domesticLogisticsNumber.trim();
    }

    public String getInternatinnalLogisticsNumber() {
        return internatinnalLogisticsNumber;
    }

    public void setInternatinnalLogisticsNumber(String internatinnalLogisticsNumber) {
        this.internatinnalLogisticsNumber = internatinnalLogisticsNumber == null ? null : internatinnalLogisticsNumber.trim();
    }
}