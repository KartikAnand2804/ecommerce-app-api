package com.ecommerce.ecommerceappapi.services;

import java.util.List;

import com.ecommerce.ecommerceappapi.model.Product;

public interface ProductService {
	Product createProduct(Product product);
	List<Product> getAllProducts();
}
