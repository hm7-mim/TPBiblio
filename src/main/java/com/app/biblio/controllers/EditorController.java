package com.app.biblio.controllers;

import com.app.biblio.models.Editor;
import com.app.biblio.services.EditorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/editors")
@RequiredArgsConstructor

public class EditorController {
    private final EditorService editorService;

    @GetMapping
    public List<Editor> findAll() {

        return editorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Editor> findiById(@PathVariable Long id) {
        return editorService.findById(id);
    }

    @PostMapping()
    public void createBook(@RequestBody Editor editor) {
        editorService.createEditor(editor);
    }

    @DeleteMapping("/{id}")
    public void deleteEditors(@PathVariable Long id) {
        editorService.deleteById(id);
    }
}
