package com.app.biblio.repositories;

import com.app.biblio.models.Editor;
import com.app.biblio.models.ReadingStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReadingStatusRepository extends MongoRepository<Editor, Long> {
    List<ReadingStatus> findByUserId(Long userId);

    ReadingStatus findByUserIdAndBookId(Long userId, Long bookId);

    void deleteByUserIdAndBookId(Long id, Long bookId);
}
