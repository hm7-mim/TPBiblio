package com.app.biblio.repositories;

import com.app.biblio.models.Editor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EditorRepository extends MongoRepository<Editor, Long> {
}
