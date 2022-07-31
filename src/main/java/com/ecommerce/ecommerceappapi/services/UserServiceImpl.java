package com.ecommerce.ecommerceappapi.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommerceappapi.entity.UserEntity;
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
}
