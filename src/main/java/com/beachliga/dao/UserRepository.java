package com.beachliga.dao;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
