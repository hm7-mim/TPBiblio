package com.app.biblio.services;

import com.app.biblio.models.Library;
import com.app.biblio.repositories.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class LibraryService {
    private final LibraryRepository libraryRepository;

    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    public void createLibrary(Library library) {
        libraryRepository.save(library);
    }

    public void deleteById(Long id) {
        libraryRepository.deleteById(id);
    }

    public Optional<Library> findById(Long id) {
        return libraryRepository.findById(id);
    }
}
