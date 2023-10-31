package service;


import java.util.List;

import entities.Pfe;

public interface PfeService {
    List<Pfe> getAllPFEs();
    Pfe getPFEById(int id);
    Pfe createPFE(Pfe pfe);
    void updatePFE(int id, Pfe pfe);
    void deletePFE(int id);
}