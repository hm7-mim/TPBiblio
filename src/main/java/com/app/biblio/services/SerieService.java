package com.app.biblio.services;

import com.app.biblio.models.Serie;
import com.app.biblio.repositories.SerieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class SerieService {
    private final SerieRepository serieRepository;

    public void createSerie(Serie serie) {
        serieRepository.save(serie);
    }

    public void deleteById(Long id) {
        serieRepository.deleteById(id);
    }

    public Optional<Serie> findById(Long id) {
        return serieRepository.findById(id);
    }
}
