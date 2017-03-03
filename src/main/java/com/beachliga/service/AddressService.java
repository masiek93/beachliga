package com.beachliga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.dao.AddressRepository;
import com.beachliga.model.Address;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address getAddressById(Integer id){
		return addressRepository.findOne(id);
	}
	
	public void addAddress(Address address){
		addressRepository.save(address);
	}
	
	public void updateAddress(Integer id, Address address){
		addressRepository.save(address);
	}

	public void deleteAddress(Integer id) {
		addressRepository.delete(id);
	}
}