package com.example.Paiement.Controllers;

import com.example.Paiement.Model.Paiement;
import com.example.Paiement.Repositories.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paiements")
public class PaiementController {
    @Autowired
    private PaiementRepository paiementRepository;

    @GetMapping
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paiement> getPaiementById(@PathVariable Long id) {
        Optional<Paiement> paiement = paiementRepository.findById(id);
        if (paiement.isPresent()) {
            return ResponseEntity.ok(paiement.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Paiement> updatePaiement(@PathVariable Long id, @RequestBody Paiement updatedPaiement) {
        Optional<Paiement> paiement = paiementRepository.findById(id);
        if (paiement.isPresent()) {
            updatedPaiement.setId(id);
            return ResponseEntity.ok(paiementRepository.save(updatedPaiement));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaiement(@PathVariable Long id) {
        paiementRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
