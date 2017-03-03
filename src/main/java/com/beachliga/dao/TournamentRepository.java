package com.beachliga.dao;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.Tournament;

public interface TournamentRepository extends CrudRepository<Tournament, Integer> {

}
