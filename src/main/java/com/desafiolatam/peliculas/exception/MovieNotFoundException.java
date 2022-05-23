package com.desafiolatam.peliculas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class MovieNotFoundException extends Exception{

    public MovieNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
	}

	/**
     * peliculas con id no encontrado
     */
    private Long mid;

	public String getMid() {
		// TODO Auto-generated method stub
		return null;
	}

}
