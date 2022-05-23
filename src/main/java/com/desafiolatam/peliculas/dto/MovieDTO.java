package com.desafiolatam.peliculas.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class MovieDTO {

    @NotNull(message = "el ID no puede ser nulo")
    private Long id;

    @NotBlank(message = "El nombre no puede estar en blanco")
    private String infoName;
    @NotBlank(message = "El tipo no puede estar en blanco")
    private String infoType;
    @Min(value = 1, message = "Peliculas generalmente de mas de un minuto")
    @Max(value = 300, message = "Peliculas de menos de 5 horas")
    private Long infoDuration;
    @NotNull(message = "Año de lanzamiento no puede ser nulo")
    private Long infoReleaseYear;

}
