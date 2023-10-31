package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Integer> {
}