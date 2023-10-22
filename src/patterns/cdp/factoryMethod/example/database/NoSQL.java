package patterns.cdp.factoryMethod.example.database;

public class NoSQL extends Storage{
    private final Database database;

    public NoSQL(Database database) {
        this.database = database;
    }

    @Override
    public Database createDatabase() {
        return database;
    }
}
