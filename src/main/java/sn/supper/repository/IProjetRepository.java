package sn.supper.repository;

import sn.supper.domain.Projet;
import java.util.Optional;
import java.util.List;


public interface IProjetRepository {
    // Ajouter un projet
    public void add(Projet projet);
    // recuperer un projet
    public Optional<Projet> getProjetByCode(String code);
    // Voir un projet
    // Lister les projets
    public List<Projet> selectAllProjets();
}