package sn.supper;
import java.util.Scanner;
import sn.supper.domain.Projet;
import sn.supper.service.IProjetService;
import sn.supper.service.ProjetServiceImpl;
import sn.supper.repository.IProjetRepository;
import sn.supper.repository.ProjetRepositoryImpl;
import sn.supper.datasource.Database;
import sn.supper.datasource.InMemoryDatasource;
import java.util.Optional;
import java.util.List;
import sn.supper.Dto.ProjetCreateDto;


public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        Database database = new InMemoryDatasource();
        IProjetRepository repository = new ProjetRepositoryImpl(database);
        IProjetService ps = new ProjetServiceImpl(repository);
        String choix;
        do {
            choix = menu();
            switch (choix) {
                case "1":
                    {
                        System.out.print("Code : ");
                        String code = scanner.nextLine().trim();
                        System.out.print("Nom : ");
                        String nom = scanner.nextLine().trim();
                        System.out.print("Description : ");
                        String description = scanner.nextLine().trim();
                        ProjetCreateDto projetDto = new ProjetCreateDto(code, nom, description);
                        ps.ajouterProjet(projetDto);
                        System.out.println("Projet ajouté avec succès !");
                    }
                    break;
                case "2":
                    {
                        System.out.print("Code : ");
                        String code = scanner.nextLine().trim();
                        Optional<Projet> projet = ps.getProjet(code);
                        if (projet.isPresent()) {
                            System.out.println("===================");
                            afficherProjet(projet.get());
                            System.out.println("===================");

                        } else {
                            System.out.println("Projet non trouvé");
                        }
                    }
                    break;
                case "3":
                    {
                        System.out.println("Liste des projets :");
                        System.out.println("===================");
                        for (Projet projet : ps.getAllProjets()) {
                            afficherProjet(projet);
                            System.out.println("-------------------");
                        }
                        System.out.println("===================");
                    }
                    break;
                case "0" :
                    System.out.print("Au revoir !");
            }
        } while (choix !=  "0");
    }

    private static void afficherProjet(Projet projet) {
        System.out.println("Code : " + projet.getCode());
        System.out.println("Nom : " + projet.getNom());
        System.out.println("Description : " + projet.getDescription());
    }

    private static String menu(){
        String choix;
        do {
            System.out.println("1 - Creer un projet");
            System.out.println("2 - voir un projet");
            System.out.println("3 - Lister les projet");
            System.out.println("0 - Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextLine().trim();
            System.out.println(choix);
        } while( choix == "");
        return choix;
    }
}
 
// ceer un projet 
// Voir un projet
// Lister les projets