package com.ueberpruefung.buecherei.services;

import com.ueberpruefung.buecherei.models.Bibliothek;
import com.ueberpruefung.buecherei.models.Buch;
import com.ueberpruefung.buecherei.repositories.BibliothekRepository;
import com.ueberpruefung.buecherei.repositories.BuchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliothekService {

    BibliothekRepository bibliothekRepository;
    BuchRepository buchRepository;

    public BibliothekService(BibliothekRepository bibliothekRepository, BuchRepository buchRepository){
        this.bibliothekRepository = bibliothekRepository;
        this.buchRepository = buchRepository;
    }



    public Bibliothek getBibliothekById(Long id){
        Optional<Bibliothek> optionalBibliothek = bibliothekRepository.findById(id);
        if(optionalBibliothek.isPresent()){
            return optionalBibliothek.get();
        }else{
            throw new RuntimeException("Bibliothek ID ist nicht existent");
        }
    }

    public List<Buch> getBuecherByBibliothek(Long id){
        Optional<Bibliothek> optionalBibliothek = bibliothekRepository.findById(id);
        if(optionalBibliothek.isPresent()){
            return buchRepository.findByBibliothek(optionalBibliothek.get());
        }else{
            throw new RuntimeException("Bibliothek ID ist nicht existent");
        }
    }

    public Bibliothek addBibliothek(Bibliothek bibliothek) {
        return bibliothekRepository.save(bibliothek);
    }

    public List<Bibliothek> getAllBibliotheken() {
        return bibliothekRepository.findAll();
    }



}
