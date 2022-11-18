package com.ecommerce.ecommerceappapi.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
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
	
	@Override
	public List<Product> getAllProducts(){
		
		List<ProductEntity> productEntities =  productRepository.findAll();
		
		List<Product> products = productEntities.stream().map(product -> new Product(
				product.getProdId(), 
				product.getProductName(), 
				product.getProductPrice(),
				product.getProductDesc()))
				.collect(Collectors.toList());
		
		return products;
		}


}
