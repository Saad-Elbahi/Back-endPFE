package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Encadrant;

@Repository
public interface EncadrantRepository extends JpaRepository<Encadrant, Integer> {
}