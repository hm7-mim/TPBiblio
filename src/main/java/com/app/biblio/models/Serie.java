package com.app.biblio.models;

import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

@Table(name = "series")
@Data

public class Serie {
    @Id
    private String nom;
    private String title;
    private String editor;
}
