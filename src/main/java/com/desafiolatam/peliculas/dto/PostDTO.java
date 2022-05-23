package com.desafiolatam.peliculas.dto;

import lombok.Builder;
import lombok.Data;


@Data
public class PostDTO {

    private Long id;
    private Long userId;
    private String title;
    private String body;



}
