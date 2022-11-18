package com.ecommerce.ecommerceappapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//import java.util.List;
import lombok.Data;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private long prodId;
	private String productName;
	private int productPrice;
	private String productDesc;
	private String productData;
	

	
	public Product(Long prodId2, String productName2, int productPrice2, String productDesc2) {
		// TODO Auto-generated constructor stub;
		return; 
	}
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
