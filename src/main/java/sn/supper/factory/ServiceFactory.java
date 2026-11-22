package sn.supper.Factory;

public class ServiceFactory {
    public static IProjetService createProjetService(IProjetRepository repository) {
        return new ProjetServiceImpl(repository);
    }
}