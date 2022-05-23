package com.desafiolatam.peliculas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class MovieDuplicatedException extends Exception{

    public MovieDuplicatedException(Long id) {
		// TODO Auto-generated constructor stub
	}

	/**
     * peliculas con id duplicada
     */
    private Long mid;

	public String getMid() {
		// TODO Auto-generated method stub
		return null;
	}

}
