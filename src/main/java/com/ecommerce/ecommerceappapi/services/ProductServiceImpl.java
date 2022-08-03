package com.ecommerce.ecommerceappapi.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerceappapi.entity.ProductEntity;
import com.ecommerce.ecommerceappapi.model.Product;
import com.ecommerce.ecommerceappapi.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		productRepository.save(productEntity);
		return product;
	}
}
