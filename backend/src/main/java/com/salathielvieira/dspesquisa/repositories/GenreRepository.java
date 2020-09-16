package com.salathielvieira.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salathielvieira.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
