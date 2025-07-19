package com.aluracursos.screenmatch.principal.dto;

import com.aluracursos.screenmatch.model.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(
        Long id,
        String titulo,
        Integer totalTemporadas,
        Double evaluacion,
        String poster,
        Categoria genero,
        String actores,
        String sinopsis

) {
}
