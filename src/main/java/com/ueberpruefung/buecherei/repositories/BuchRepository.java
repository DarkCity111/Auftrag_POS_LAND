package com.ueberpruefung.buecherei.repositories;

import com.ueberpruefung.buecherei.models.Bibliothek;
import com.ueberpruefung.buecherei.models.Buch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuchRepository extends JpaRepository<Buch, Long> {

    List<Buch> findByBibliothek(Bibliothek bibliothek);

}
