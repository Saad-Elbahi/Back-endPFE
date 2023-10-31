package controller;


import entities.Pfe;
import service.PfeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pfe")
public class PfeController {
    @Autowired
    private PfeService pfeService;

    @GetMapping("findAll")
    public List<Pfe> getAllPFEs() {
        return pfeService.getAllPFEs();
    }

    @GetMapping("/{id}")
    public Pfe getPFEById(@PathVariable int id) {
        return pfeService.getPFEById(id);
    }

    @PostMapping("create")
    public Pfe createPFE(@RequestBody Pfe pfe) {
        return pfeService.createPFE(pfe);
    }

    @PutMapping("update/{id}")
    public void updatePFE(@PathVariable int id, @RequestBody Pfe pfe) {
        pfeService.updatePFE(id, pfe);
    }

    @DeleteMapping("delete/{id}")
    public void deletePFE(@PathVariable int id) {
        pfeService.deletePFE(id);
    }
}