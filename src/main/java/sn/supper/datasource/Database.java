package sn.supper.datasource;

import sn.supper.domain.Projet;
import java.util.Optional;
import java.util.List;


public interface Database {
    // Ajouter un projet
    public void insert(Projet projet);
    // recuperer un projet
    public Optional<Projet> findByCode(String code);
    // Voir un projet
    // Lister les projets
    public List<Projet> findAll();
}