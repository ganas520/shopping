package com.flight.china.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TbGoods {
    private Integer id;

    private String goodsNameChinese;

    private String goodsNameKorean;

    private String goodsCode;

    private String goodsLabel;

    private Date createTime;

    private Date updateTime;

    private String goodsStatus;

    private String supplierName;

    private String productOwnership;

    private BigDecimal purchasePrice;

    private BigDecimal logisticsCost;

    private BigDecimal wholesalePrice;

    private String imageAddress;

    private String goodsLink;

    private String imageLink;

    private String abroadShopping;
    
    private Integer startWith;

    private Integer rows;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsNameChinese() {
        return goodsNameChinese;
    }

    public void setGoodsNameChinese(String goodsNameChinese) {
        this.goodsNameChinese = goodsNameChinese == null ? null : goodsNameChinese.trim();
    }

    public String getGoodsNameKorean() {
        return goodsNameKorean;
    }

    public void setGoodsNameKorean(String goodsNameKorean) {
        this.goodsNameKorean = goodsNameKorean == null ? null : goodsNameKorean.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsLabel() {
        return goodsLabel;
    }

    public void setGoodsLabel(String goodsLabel) {
        this.goodsLabel = goodsLabel == null ? null : goodsLabel.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getProductOwnership() {
        return productOwnership;
    }

    public void setProductOwnership(String productOwnership) {
        this.productOwnership = productOwnership == null ? null : productOwnership.trim();
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(BigDecimal logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress == null ? null : imageAddress.trim();
    }

    public String getGoodsLink() {
        return goodsLink;
    }

    public void setGoodsLink(String goodsLink) {
        this.goodsLink = goodsLink == null ? null : goodsLink.trim();
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink == null ? null : imageLink.trim();
    }

    public String getAbroadShopping() {
        return abroadShopping;
    }

    public void setAbroadShopping(String abroadShopping) {
        this.abroadShopping = abroadShopping == null ? null : abroadShopping.trim();
    }

	public Integer getStartWith() {
		return startWith;
	}

	public void setStartWith(Integer startWith) {
		this.startWith = startWith;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
    
    
}