package sn.supper.factory;

import sn.supper.datasource.Database;
import sn.supper.datasource.InMemoryDatasource;

public class DatabaseFactory {
    public static Database createDatabase() {
        return InMemoryDatasource.getInstance();
    }
}