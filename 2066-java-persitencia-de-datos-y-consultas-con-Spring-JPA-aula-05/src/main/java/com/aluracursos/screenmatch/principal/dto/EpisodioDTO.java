package com.aluracursos.screenmatch.principal.dto;

import com.aluracursos.screenmatch.model.Serie;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public record EpisodioDTO(
        Integer temporada,
        String titulo,
        Integer numeroEpisodio
) {
}
