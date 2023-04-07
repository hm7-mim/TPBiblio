package com.app.biblio.controllers;

import com.app.biblio.models.Serie;
import com.app.biblio.services.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serie")
@RequiredArgsConstructor
public class SerieController {
    private final SerieService serieService;

    //@GetMapping
    //public List<Serie> findAll() {
    //    return serieService.findAll();
    //}

    @GetMapping("/{id}")
    public Optional<Serie> findiById(@PathVariable Long id) {
        return serieService.findById(id);
    }

    @PostMapping()
    public void createSerie(@RequestBody Serie serie) {
        serieService.createSerie(serie);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable Long id) {
        serieService.deleteById(id);
    }
}
