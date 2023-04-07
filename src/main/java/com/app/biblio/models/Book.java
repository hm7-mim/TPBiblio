package com.app.biblio.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "books")
@Data

public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String description;

    @ManyToMany(mappedBy = "readingList")
    private List<User> users;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tome;
}
