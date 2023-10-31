package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Pfe;

@Repository
public interface PfeRepository extends JpaRepository<Pfe, Integer> {
}