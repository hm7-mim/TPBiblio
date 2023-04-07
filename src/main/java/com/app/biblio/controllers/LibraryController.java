package com.app.biblio.controllers;

import com.app.biblio.models.Library;
import com.app.biblio.services.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library")
@RequiredArgsConstructor
public class LibraryController {
    private final LibraryService libraryService;

    @GetMapping
    public List<Library> findAll() {
        return libraryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Library> findiById(@PathVariable Long id) {
        return libraryService.findById(id);
    }

    @PostMapping()
    public void createLibrary(@RequestBody Library library) {
        libraryService.createLibrary(library);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryService.deleteById(id);
    }
}
