package sn.supper.service;

import sn.supper.domain.Projet;
import java.util.Optional;
import java.util.List;
import sn.supper.Dto.ProjetCreateDto;


public interface IProjetService {
    // Ajouter un projet
    public void ajouterProjet(ProjetCreateDto projet);
    // recuperer un projet
    public Optional<Projet> getProjet(String code);
    // Voir un projet
    // Lister les projets
    public List<Projet> getAllProjets();
}