package com.aluracursos.screenmatch.controller;

import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.principal.dto.EpisodioDTO;
import com.aluracursos.screenmatch.principal.dto.SerieDTO;
import com.aluracursos.screenmatch.service.SerieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.http.GET;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService){
        this.serieService=serieService;
    }

    @GetMapping()
    public List<SerieDTO> obtenerTodasLasSeries(){
        return serieService.servicioObtenerTodasLasSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5(){
        return serieService.servicioTop5();
    }

    @GetMapping("/lanzamientos")
    public List<SerieDTO> obtenerLanzamientosMasRecientes(){
        return serieService.obtenerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id){
        return serieService.obtenerPorId(id);
    }

    @GetMapping("/{id}/temporadas/todas")
    public List<EpisodioDTO> obtenerTodasLasTemporadas(@PathVariable Long id){
        return serieService.obtenerTodasLasTemporadas(id);
    }

    @GetMapping("/{id}/temporadas/{numeroTemporada}")
    public List<EpisodioDTO> obtenerTemporadasPorNumero(@PathVariable Long id, @PathVariable Long numeroTemporada){
        return  serieService.obtenerTemporadasPorNumero(id, numeroTemporada);
    }

    @GetMapping("/categoria/{nombreGenero}")
    public List<SerieDTO> obtenerSeriesPorCategoria(@PathVariable String nombreGenero){
        return serieService.obtenerSeriesPorCategoria(nombreGenero);
    }

}
