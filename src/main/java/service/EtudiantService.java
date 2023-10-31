package service;


import java.util.List;

import entities.Etudiant;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(int id);
    Etudiant createEtudiant(Etudiant etudiant);
    void updateEtudiant(int id, Etudiant etudiant);
    void deleteEtudiant(int id);
}