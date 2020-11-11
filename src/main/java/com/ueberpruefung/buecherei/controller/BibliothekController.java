package com.ueberpruefung.buecherei.controller;

import com.ueberpruefung.buecherei.models.Bibliothek;
import com.ueberpruefung.buecherei.models.Buch;
import com.ueberpruefung.buecherei.repositories.BibliothekRepository;
import com.ueberpruefung.buecherei.repositories.BuchRepository;
import com.ueberpruefung.buecherei.services.BibliothekService;
import com.ueberpruefung.buecherei.services.BuchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BibliothekController {

    BibliothekRepository bibliothekRepository;
    BuchRepository buchRepository;
    BibliothekService bibliothekService;
    BuchService buchService;

    public BibliothekController(BibliothekRepository bibliothekRepository, BuchRepository buchRepository, BibliothekService bibliothekService, BuchService buchService){
        this.bibliothekRepository = bibliothekRepository;
        this.buchRepository = buchRepository;
        this.bibliothekService = bibliothekService;
        this.buchService = buchService;
    }

    @GetMapping("/bibliotheken")
    public ResponseEntity<List<Bibliothek>> getAllBibliotheken(){
        return ResponseEntity.ok(bibliothekService.getAllBibliotheken());
    }

    @PostMapping("/bibliothek")
    public ResponseEntity<Bibliothek> addBibliothek(@RequestBody Bibliothek bibliothek){
        return ResponseEntity.ok(bibliothekService.addBibliothek(bibliothek));
    }

    @GetMapping("/bibliothek/{id}")
    public ResponseEntity<Bibliothek> getBibliothekById(@PathVariable Long id){
        return ResponseEntity.ok(bibliothekService.getBibliothekById(id));
    }

    @GetMapping("/bibliothek/allebuecher/{id}")
    public ResponseEntity<List<Buch>> getAllBuecherInBibliothek(@PathVariable Long id){
        return ResponseEntity.ok(bibliothekService.getBuecherByBibliothek(id));
    }
}
