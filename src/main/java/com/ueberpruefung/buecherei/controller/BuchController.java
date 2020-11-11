package com.ueberpruefung.buecherei.controller;

import com.ueberpruefung.buecherei.models.Buch;
import com.ueberpruefung.buecherei.services.BuchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuchController {

    private BuchService buchService;

    public BuchController(BuchService buchService){
        this.buchService = buchService;
    }

    @GetMapping("/allebuecher")
    public ResponseEntity<List<Buch>> getAllBuecher() {
        return ResponseEntity.ok(buchService.getAllBuecher());
    }

    @PostMapping("/buch")
    public ResponseEntity<Buch> addBuch(@RequestBody Buch buch){
        return ResponseEntity.ok(buchService.addBuch(buch));
    }

    @GetMapping("/buch/{id}")
    public ResponseEntity<Buch> getBuchById(@PathVariable Long id){
        return ResponseEntity.ok(buchService.getBuchById(id));
    }

}
