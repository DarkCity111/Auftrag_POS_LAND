package com.ueberpruefung.buecherei;

import com.ueberpruefung.buecherei.models.Bibliothek;
import com.ueberpruefung.buecherei.models.Buch;
import com.ueberpruefung.buecherei.repositories.BibliothekRepository;
import com.ueberpruefung.buecherei.repositories.BuchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BuechereiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuechereiApplication.class, args);
    }


    @Bean
    public CommandLineRunner test(BibliothekRepository bibliothekRepository, BuchRepository buchRepository){
        return (args) -> {
            Bibliothek bib1 = new Bibliothek();
            bib1.setBibliothekname("BibliothekLandeck");
            bibliothekRepository.save(bib1);

            Bibliothek bib2 = new Bibliothek();
            bib2.setBibliothekname("BibliothekImst");
            bibliothekRepository.save(bib2);

            Buch b1 = new Buch();
            b1.setBuchname("Java - ist auch eine Insel");
            b1.setBibliothek(bib1);
            buchRepository.save(b1);

            Buch b2 = new Buch();
            b2.setBuchname("Easy Phyton");
            b2.setBibliothek(bib1);
            buchRepository.save(b2);

            Buch b3 = new Buch();
            b3.setBuchname("Hacking leicht gemacht");
            b3.setBibliothek(bib2);
            buchRepository.save(b3);

            Buch b4 = new Buch();
            b4.setBuchname("Abenteuer Geschmack");
            buchRepository.save(b4);

            Buch b5 = new Buch();
            b5.setBuchname("Die 4 Stunden Woche");
            buchRepository.save(b5);
        };
    }

}


