package com.ueberpruefung.buecherei.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String buchname;

    @ManyToOne
    @JoinColumn(name = "bibliothek_id")
    @JsonIgnore
    private Bibliothek bibliothek;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuchname() {
        return buchname;
    }

    public void setBuchname(String buchname) {
        this.buchname = buchname;
    }

    public Bibliothek getBibliothek() {
        return bibliothek;
    }

    public void setBibliothek(Bibliothek bibliothek) {
        this.bibliothek = bibliothek;
    }
}
