package sn.supper.datasource;

import sn.supper.domain.Projet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatasource implements Database {

    private static InMemoryDatasource instance;
    private InMemoryDatasource() {
    }

    public static InMemoryDatasource getInstance() {
        if (instance == null) {
            instance = new InMemoryDatasource();
        }
        return instance;
    }
    // Ajouter un projet
    List<Projet> projets = new ArrayList<>();
    public void insert(Projet projet) {
        projets.add(projet);
    };

    public Optional<Projet> findByCode(String code) {
        for (Projet p : projets) {
            if (p.getCode().equals(code)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    };
    // Voir un projet
    // Lister les projetss
    public List<Projet> findAll(){
        return List.copyOf(projets);
    }
}