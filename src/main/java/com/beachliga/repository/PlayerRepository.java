package com.beachliga.repository;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
