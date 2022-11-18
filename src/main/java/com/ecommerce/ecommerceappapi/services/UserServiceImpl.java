package com.ecommerce.ecommerceappapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerceappapi.entity.ProductEntity;
import com.ecommerce.ecommerceappapi.entity.UserEntity;
import com.ecommerce.ecommerceappapi.model.Product;
import com.ecommerce.ecommerceappapi.model.User;
import com.ecommerce.ecommerceappapi.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userRepository.save(userEntity);
		return user;
	}
	
	public List<User> getAllUsers() {
List<UserEntity> userEntities =  userRepository.findAll();
		
		List<User> users= userEntities.stream().map(user -> new User(
				user.getEmailId(),
				user.getType(),
				user.getPassword()))
				.collect(Collectors.toList());
		
		return users;
	
	}
}
