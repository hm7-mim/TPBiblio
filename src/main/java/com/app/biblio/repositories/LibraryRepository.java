package com.app.biblio.repositories;

import com.app.biblio.models.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepository extends MongoRepository<Library, Long> {
}
