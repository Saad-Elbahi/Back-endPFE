package service.Impl;


import dao.EncadrantRepository;
import entities.Encadrant;
import service.EncadrantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncadrantServiceImpl implements EncadrantService {
    @Autowired
    private EncadrantRepository encadrantRepository;

    @Override
    public List<Encadrant> getAllEncadrants() {
        return encadrantRepository.findAll();
    }

    @Override
    public Encadrant getEncadrantById(int id) {
        return encadrantRepository.findById(id).orElse(null);
    }

    @Override
    public Encadrant createEncadrant(Encadrant encadrant) {
        return encadrantRepository.save(encadrant);
    }

    @Override
    public void updateEncadrant(int id, Encadrant encadrant) {
        Encadrant existingEncadrant = encadrantRepository.findById(id).orElse(null);
        if (existingEncadrant != null) {
            existingEncadrant.setNom(encadrant.getNom());
            existingEncadrant.setPrenom(encadrant.getPrenom());
            existingEncadrant.setSpecialite(encadrant.getSpecialite());
            existingEncadrant.setType(encadrant.getType());
            existingEncadrant.setTele(encadrant.getTele());

            encadrantRepository.save(existingEncadrant);
        }
    }

    @Override
    public void deleteEncadrant(int id) {
        encadrantRepository.deleteById(id);
    }
}