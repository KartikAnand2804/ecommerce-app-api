package com.ecommerce.ecommerceappapi.model;

import lombok.Data;

@Data
public class Product {
	private long prodId;
	private String productName;
	private int productPrice;
	private String productDesc;
	private String productData;
	
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductData() {
		return productData;
	}
	public void setProductData(String productData) {
		this.productData = productData;
	}
	

}
