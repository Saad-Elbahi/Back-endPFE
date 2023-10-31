package service.Impl;


import dao.EtudiantRepository;
import entities.Etudiant;
import service.EtudiantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void updateEtudiant(int id, Etudiant etudiant) {
        Etudiant existingEtudiant = etudiantRepository.findById(id).orElse(null);
        if (existingEtudiant != null) {
            existingEtudiant.setNom(etudiant.getNom());
            existingEtudiant.setPrenom(etudiant.getPrenom());
            existingEtudiant.setFiliere(etudiant.getFiliere());
            existingEtudiant.setTele(etudiant.getTele());
            existingEtudiant.setGroupe(etudiant.getGroupe());
            existingEtudiant.setMail(etudiant.getMail());
            etudiantRepository.save(existingEtudiant);
        }
    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }
}