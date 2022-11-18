package com.ecommerce.ecommerceappapi.services;

import java.util.List;

import com.ecommerce.ecommerceappapi.model.User;

public interface UserService {
	User createUser(User user);

	List<User> getAllUsers();
}
