package com.beachliga.dao;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>  {

}

