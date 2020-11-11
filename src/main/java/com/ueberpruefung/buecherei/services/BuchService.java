package com.ueberpruefung.buecherei.services;

import com.ueberpruefung.buecherei.models.Bibliothek;
import com.ueberpruefung.buecherei.models.Buch;
import com.ueberpruefung.buecherei.repositories.BibliothekRepository;
import com.ueberpruefung.buecherei.repositories.BuchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuchService {

    BibliothekRepository bibliothekRepository;
    BuchRepository buchRepository;

    public BuchService(BibliothekRepository bibliothekRepository, BuchRepository buchRepository){
        this.bibliothekRepository = bibliothekRepository;
        this.buchRepository = buchRepository;
    }

    public Buch getBuchById(Long id){
        Optional<Buch> optionalBuch = buchRepository.findById(id);
        if(optionalBuch.isPresent()){
            return optionalBuch.get();
        }else{
            throw new RuntimeException("Buch ID ist nicht existent");
        }
    }

    public Buch addBuch(Buch buch) {
        return buchRepository.save(buch);
    }

    public List<Buch> getAllBuecher(){
        return buchRepository.findAll();
    }

}
