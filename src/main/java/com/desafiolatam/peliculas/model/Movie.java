package com.desafiolatam.peliculas.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private Info info;

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getId1() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

}
