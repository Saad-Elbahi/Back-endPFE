package service.Impl;


import dao.OffreRepository;
import entities.Offre;
import service.OffreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreServiceImpl implements OffreService {
    @Autowired
    private OffreRepository offreRepository;

    @Override
    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    @Override
    public Offre getOffreById(int id) {
        return offreRepository.findById(id).orElse(null);
    }

    @Override
    public Offre createOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    @Override
    public void updateOffre(int id, Offre offre) {
        Offre existingOffre = offreRepository.findById(id).orElse(null);
        if (existingOffre != null) {
            existingOffre.setEntreprise(offre.getEntreprise());
            existingOffre.setTechno(offre.getTechno());
            existingOffre.setStatus(offre.getStatus());
            offreRepository.save(existingOffre);
        }
    }

    @Override
    public void deleteOffre(int id) {
        offreRepository.deleteById(id);
    }
}
