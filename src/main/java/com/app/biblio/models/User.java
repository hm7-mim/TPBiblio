package com.app.biblio.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    private Long id;
    private String username;
    private String password;

    @ManyToMany
    private List<Book> readingList;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String login;
    private String role;
    private String library;
}
