package com.desafiolatam.peliculas.advice;

import com.desafiolatam.peliculas.exception.MovieDuplicatedException;
import com.desafiolatam.peliculas.exception.MovieNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class MovieControllerExceptionHandler {


    @ExceptionHandler(MovieNotFoundException.class)
    private ResponseEntity<?> handleMovieNotFoundException(MovieNotFoundException exception){
        String responseMessage = "la pelicula ingresada ["+exception.getMid()+"] no fue encontrada.";
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(responseMessage);
    }

    @ExceptionHandler(MovieDuplicatedException.class)
    private ResponseEntity<?> handleMovieDuplicatedException(MovieDuplicatedException exception){
        String responseMessage = "la pelicula ingresada ["+exception.getMid()+"] ya existe.";
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(responseMessage);
    }
}
