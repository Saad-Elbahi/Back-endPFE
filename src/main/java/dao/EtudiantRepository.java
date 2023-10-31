package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}