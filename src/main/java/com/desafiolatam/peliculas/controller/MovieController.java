package com.desafiolatam.peliculas.controller;

import com.desafiolatam.peliculas.converter.MovieConverter;
import com.desafiolatam.peliculas.dto.MovieDTO;
import com.desafiolatam.peliculas.service.MovieService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("pelicula")
@Data
public class MovieController {

    final MovieService movieService = null;
    final MovieConverter movieConverter = null;

    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody MovieDTO movieDTO) throws Exception {
        if (movieDTO == null)
            return ResponseEntity.badRequest().body("La pelicula suministrada no es valida");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(movieConverter.convertToDTO(movieService.save(movieConverter.convertToDM(movieDTO))));
    }

    @PutMapping("/")
    public ResponseEntity<?> update(@Valid @RequestBody MovieDTO movieDTO) throws Exception {
        if (movieDTO == null)
            return ResponseEntity.badRequest().body("La pelicula suministrada no es valida");
        return ResponseEntity
                .ok()
                .body(movieConverter.convertToDTO(movieService.update(movieConverter.convertToDM(movieDTO))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
        if (id == null)
            return ResponseEntity.badRequest().body("La pelicula suministrada no es valida");
        return ResponseEntity.ok().body("Pelicula [" + movieService.delete(id) + "] eliminada exitosamente.");
    }

    @GetMapping("/")
    public ResponseEntity<List<MovieDTO>> findAll() {
        return ResponseEntity.ok().body(movieConverter.convertToDTOs(movieService.findAll()));
    }

}
