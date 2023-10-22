package patterns.cdp.factoryMethod.example.database;

public class SQL extends Storage{
    private final Database database;

    public SQL(Database database) {
        this.database = database;
    }

    @Override
    public Database createDatabase() {
        return database;
    }
}
