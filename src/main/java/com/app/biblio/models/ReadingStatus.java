package com.app.biblio.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "readingStatus")
@Data

public class ReadingStatus {
    @Id
    private Long id;
    private String status; // "Lu", "Non lu" ou "En cours de lecture"

    @OneToOne
    private User user;
    @OneToOne
    private Book book;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nom;
    private String listSerie;

    public ReadingStatus() {}
    public ReadingStatus(Long userId, Long bookId) {}
}
