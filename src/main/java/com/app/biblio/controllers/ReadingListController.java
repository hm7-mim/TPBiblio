package com.app.biblio.controllers;

import com.app.biblio.models.ReadingStatus;
import com.app.biblio.services.ReadingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users/{userId}/reading-list")

public class ReadingListController {
    @Autowired
    private ReadingStatusService readingStatusService;

    @GetMapping
    public List<ReadingStatus> getReadingList(@PathVariable Long userId) {
        return readingStatusService.getReadingList(userId);
    }

    @PostMapping("/{bookId}")
    public void addBookToReadingList(@PathVariable Long userId, @PathVariable Long bookId) {
        readingStatusService.addBookToReadingList(userId, bookId);
    }

    @PutMapping("/{bookId}")
    public void updateReadingStatus(@PathVariable Long userId, @PathVariable Long bookId, @RequestBody ReadingStatus readingStatus) {
        readingStatusService.updateReadingStatus(userId, bookId, readingStatus);
    }

    @DeleteMapping("/{bookId}")
    public void removeBookFromReadingList(@PathVariable Long userId, @PathVariable Long bookId) {
        readingStatusService.removeBookFromReadingList(userId, bookId);
    }
}
