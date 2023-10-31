package service;


import java.util.List;

import entities.Encadrant;

public interface EncadrantService {
    List<Encadrant> getAllEncadrants();
    Encadrant getEncadrantById(int id);
    Encadrant createEncadrant(Encadrant encadrant);
    void updateEncadrant(int id, Encadrant encadrant);
    void deleteEncadrant(int id);
}