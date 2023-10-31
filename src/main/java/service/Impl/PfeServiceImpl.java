package service.Impl;


import dao.PfeRepository;
import entities.Pfe;
import service.PfeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PfeServiceImpl implements PfeService {
    @Autowired
    private PfeRepository pfeRepository;

    @Override
    public List<Pfe> getAllPFEs() {
        return pfeRepository.findAll();
    }

    @Override
    public Pfe getPFEById(int id) {
        return pfeRepository.findById(id).orElse(null);
    }

    @Override
    public Pfe createPFE(Pfe pfe) {
        return pfeRepository.save(pfe);
    }

    @Override
    public void updatePFE(int id, Pfe pfe) {
        Pfe existingPFE = pfeRepository.findById(id).orElse(null);
        if (existingPFE != null) {
            existingPFE.setEntreprise(pfe.getEntreprise());
            existingPFE.setSujet(pfe.getSujet());
            existingPFE.setEncadrant(pfe.getEncadrant());
            existingPFE.setEtudiant(pfe.getEtudiant());
            existingPFE.setDate_debut(pfe.getDate_debut());
            existingPFE.setDate_fin(pfe.getDate_fin());
            pfeRepository.save(existingPFE);
        }
    }

    @Override
    public void deletePFE(int id) {
        pfeRepository.deleteById(id);
    }
}
