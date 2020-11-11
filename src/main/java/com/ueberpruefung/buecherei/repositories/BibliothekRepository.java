package com.ueberpruefung.buecherei.repositories;

import com.ueberpruefung.buecherei.models.Bibliothek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliothekRepository extends JpaRepository<Bibliothek, Long> {

}
