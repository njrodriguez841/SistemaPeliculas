package com.desafiolatam.peliculas.service;

import com.desafiolatam.peliculas.exception.MovieDuplicatedException;
import com.desafiolatam.peliculas.exception.MovieNotFoundException;
import com.desafiolatam.peliculas.model.Movie;

import java.util.List;

public interface MovieService {

    Movie save(Movie movie) throws MovieDuplicatedException;
    Movie update(Movie movie) throws MovieNotFoundException;
    Long delete(Long id) throws MovieNotFoundException;
    List<Movie> findAll();

}
