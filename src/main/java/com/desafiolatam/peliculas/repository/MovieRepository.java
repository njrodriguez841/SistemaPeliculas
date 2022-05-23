package com.desafiolatam.peliculas.repository;

import com.desafiolatam.peliculas.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByInfo_name(String name);

}
