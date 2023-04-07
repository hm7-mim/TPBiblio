package com.app.biblio.services;

import com.app.biblio.models.ReadingStatus;
import com.app.biblio.repositories.ReadingStatusRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class ReadingStatusService {
    private final ReadingStatusRepository readingStatusRepository;

    public ReadingStatusService(ReadingStatusRepository readingStatusRepository) {
        this.readingStatusRepository = readingStatusRepository;
    }

    public List<ReadingStatus> getReadingList(Long userId) {
        return readingStatusRepository.findByUserId(userId);
    }

    public void updateReadingStatus(Long userId, Long bookId, ReadingStatus readingStatus) {
        Optional<ReadingStatus> existingReadingStatus = Optional.ofNullable(readingStatusRepository.findByUserIdAndBookId(userId, bookId));
        if (existingReadingStatus.isPresent()) {
            existingReadingStatus.get().setStatus(readingStatus.getStatus());
        }
    }

    public void removeBookFromReadingList(Long id, Long bookId) {
        readingStatusRepository.deleteByUserIdAndBookId(id, bookId);
    }

    public void addBookToReadingList(Long userId, Long bookId) {}
}
