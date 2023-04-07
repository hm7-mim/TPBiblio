package com.app.biblio.repositories;

import com.app.biblio.models.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieRepository extends MongoRepository<Serie, Long> {
}
