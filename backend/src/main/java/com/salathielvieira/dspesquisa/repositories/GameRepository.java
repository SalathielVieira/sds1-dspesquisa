package com.salathielvieira.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salathielvieira.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
