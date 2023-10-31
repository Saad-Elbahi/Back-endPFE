package controller;

import entities.Offre;
import service.OffreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("offres")
public class OffreController {
    @Autowired
    private OffreService offreService;

    @GetMapping("findAll")
    public List<Offre> getAllOffres() {
        return offreService.getAllOffres();
    }

    @GetMapping("/{id}")
    public Offre getOffreById(@PathVariable int id) {
        return offreService.getOffreById(id);
    }

    @PostMapping("create")
    public Offre createOffre(@RequestBody Offre offre) {
        return offreService.createOffre(offre);
    }

    @PutMapping("update/{id}")
    public void updateOffre(@PathVariable int id, @RequestBody Offre offre) {
        offreService.updateOffre(id, offre);
    }

    @DeleteMapping("delete/{id}")
    public void deleteOffre(@PathVariable int id) {
        offreService.deleteOffre(id);
    }
}