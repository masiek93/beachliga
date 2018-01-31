package com.beachliga.service;

import com.beachliga.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	public void saveUser(User user);
	
}
