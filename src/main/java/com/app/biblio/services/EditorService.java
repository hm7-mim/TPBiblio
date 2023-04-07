package com.app.biblio.services;

import com.app.biblio.models.Editor;
import com.app.biblio.repositories.EditorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EditorService {
    private final EditorRepository editorRepository;

    public List<Editor> findAll() {
        return editorRepository.findAll();
    }

    public void createEditor(Editor editor) {
        editorRepository.save(editor);
    }

    public void deleteById(Long id) {
        editorRepository.deleteById(id);
    }

    public Optional<Editor> findById(Long id) {
        return editorRepository.findById(id);
    }
}
