package sn.supper.service;

import sn.supper.domain.Projet;
import sn.supper.repository.IProjetRepository;
import java.util.Optional;
import java.util.List;
import sn.supper.Dto.ProjetCreateDto;


public class ProjetServiceImpl implements IProjetService {
    // Ajouter un projet
    private IProjetRepository repository;
    public ProjetServiceImpl(IProjetRepository repo){
        this.repository = repo;
    }
    public void ajouterProjet(ProjetCreateDto projetDto) {
        Projet projet = new Projet(projetDto.code(), projetDto.nom(), projetDto.description());
        this.repository.add(projet);
    };
    // recuperer un projet
    public Optional<Projet> getProjet(String code) {
        return this.repository.getProjetByCode(code);
    }

    // Voir un projet
    // Lister les projets
     public List<Projet> getAllProjets(){
        return this.repository.selectAllProjets();
     };
}