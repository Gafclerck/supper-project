package sn.supper.Factory;

public class RepositoryFactory {
    public static IProjetRepository createProjetRepository(Database database) {
        return new ProjetRepositoryImpl(database);
    }
}