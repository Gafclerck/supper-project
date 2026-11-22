package sn.supper.repository;

import sn.supper.datasource.Database;
import sn.supper.domain.Projet;
import sn.supper.repository.IProjetRepository;
import java.util.Optional;
import java.util.List;


public class ProjetRepositoryImpl implements IProjetRepository {
    // Ajouter un projet
    private Database datasource;
    public ProjetRepositoryImpl(Database datasource) {
        this.datasource = datasource;
    };

    public void add(Projet projet) {
        this.datasource.insert(projet);
    };

    // recuperer un projet
    public Optional<Projet> getProjetByCode(String code) {
        return this.datasource.findByCode(code);
    }
    // Voir un projet
    // Lister les projets
    public List<Projet> selectAllProjets() {
        return this.datasource.findAll();
    };
}