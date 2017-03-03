package com.beachliga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.dao.OrganiserRepository;
import com.beachliga.model.Organiser;

@Service
public class OrganiserService {
	
	@Autowired
	private OrganiserRepository organiserRepository;
	
	public Organiser getOrganiserById(Integer id){
		return organiserRepository.findOne(id);
	}
	
	public void addOrganiser(Organiser organiser){
		organiserRepository.save(organiser);
	}
	
	public void updateOrganiser(Integer id, Organiser organiser){
		organiserRepository.save(organiser);
	}

	public void deleteOrganiser(Integer id) {
		organiserRepository.delete(id);
	}
}