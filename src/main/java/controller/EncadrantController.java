package controller;


import entities.Encadrant;
import service.EncadrantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encadrants")
public class EncadrantController {
    @Autowired
    private EncadrantService encadrantService;

    @GetMapping("findAll")
    public List<Encadrant> getAllEncadrants() {
        return encadrantService.getAllEncadrants();
    }

    @GetMapping("/{id}")
    public Encadrant getEncadrantById(@PathVariable int id) {
        return encadrantService.getEncadrantById(id);
    }

    @PostMapping("create")
    public Encadrant createEncadrant(@RequestBody Encadrant encadrant) {
        return encadrantService.createEncadrant(encadrant);
    }

    @PutMapping("/{id}")
    public void updateEncadrant(@PathVariable int id, @RequestBody Encadrant encadrant) {
        encadrantService.updateEncadrant(id, encadrant);
    }

    @DeleteMapping("/{id}")
    public void deleteEncadrant(@PathVariable int id) {
        encadrantService.deleteEncadrant(id);
    }
}