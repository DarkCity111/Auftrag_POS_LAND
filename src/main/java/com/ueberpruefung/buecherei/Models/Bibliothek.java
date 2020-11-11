package com.ueberpruefung.buecherei.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bibliothek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String bibliothekname;

    @OneToMany
    private List<Buch> buecher;

}
