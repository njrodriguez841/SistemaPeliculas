package com.desafiolatam.peliculas.service.impl;

import com.desafiolatam.peliculas.exception.MovieDuplicatedException;
import com.desafiolatam.peliculas.exception.MovieNotFoundException;
import com.desafiolatam.peliculas.model.Movie;
import com.desafiolatam.peliculas.repository.MovieRepository;
import com.desafiolatam.peliculas.service.MovieService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class MovieServiceImpl implements MovieService {

    final MovieRepository movieRepository = null;

    @Override
    public Movie save(Movie movie) throws MovieDuplicatedException {
        Movie movieFromDB = movieRepository.findById(movie.getId()).orElse(null);
        if (movieFromDB != null)
            throw new MovieDuplicatedException(movie.getId());
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie) throws MovieNotFoundException {
        Movie movieFromDB = movieRepository.findById(movie.getId()).orElse(null);
        if (movieFromDB == null)
            throw new MovieNotFoundException(movie.getId());
        movie.setId(movieFromDB.getId());
        return movieRepository.save(movie);
    }

    @Override
    public Long delete(Long id) throws MovieNotFoundException {
        Movie movieFromDB = movieRepository.findById(id).orElse(null);
        if (movieFromDB == null)
            throw new MovieNotFoundException(id);
        movieRepository.delete(movieFromDB);
        return id;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

}
