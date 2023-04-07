package com.app.biblio.controllers;

import com.app.biblio.models.Book;
import com.app.biblio.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor

public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findiById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping()
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBooks(@PathVariable Long id) {
        bookService.deleteById(id);
    }
}
