package com.beachliga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.dao.UserRepository;
import com.beachliga.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
	
	public User getUserById(Integer id){
		return userRepository.findOne(id);
	}
	
	public void addUser(User user){
		userRepository.save(user);
	}
	
	public void updateUser(Integer id, User user){
		userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		userRepository.delete(id);
	}
	

}
