package com.ueberpruefung.buecherei.models;

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

    @OneToMany(mappedBy = "bibliothek")
    private List<Buch> buecher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBibliothekname() {
        return bibliothekname;
    }

    public void setBibliothekname(String bibliothekname) {
        this.bibliothekname = bibliothekname;
    }

    public List<Buch> getBuecher() {
        return buecher;
    }

    public void setBuecher(List<Buch> buecher) {
        this.buecher = buecher;
    }
}
