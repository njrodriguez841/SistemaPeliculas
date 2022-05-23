package com.desafiolatam.peliculas.model;

import javax.persistence.Embeddable;
@Embeddable
public class Info {

    private String name;
    private String type;
    private Long duration;
    private Long releaseYear;
}
