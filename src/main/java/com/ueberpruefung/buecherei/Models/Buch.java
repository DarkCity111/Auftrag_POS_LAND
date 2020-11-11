package com.ueberpruefung.buecherei.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String buchname;

    @ManyToOne
    @JsonIgnore
    private Bibliothek bibliothek;
}
