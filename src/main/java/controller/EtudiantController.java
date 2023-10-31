package controller;

import entities.Etudiant;
import service.EtudiantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("findAll")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable int id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("create")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }

    @PutMapping("update/{id}")
    public void updateEtudiant(@PathVariable int id, @RequestBody Etudiant etudiant) {
        etudiantService.updateEtudiant(id, etudiant);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEtudiant(@PathVariable int id) {
        etudiantService.deleteEtudiant(id);
    }
}