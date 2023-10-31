package service;


import java.util.List;

import entities.Offre;

public interface OffreService {
    List<Offre> getAllOffres();
    Offre getOffreById(int id);
    Offre createOffre(Offre offre);
    void updateOffre(int id, Offre offre);
    void deleteOffre(int id);
}