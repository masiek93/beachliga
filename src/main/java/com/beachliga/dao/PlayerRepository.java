package com.beachliga.dao;

import org.springframework.data.repository.CrudRepository;

import com.beachliga.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
