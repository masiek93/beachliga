package com.beachliga.repository;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.Tournament;

public interface TournamentRepository extends CrudRepository<Tournament, Integer> {

}
