package patterns.cdp.factoryMethod.example.database;

public abstract class Storage {
    public abstract Database createDatabase();

    private Database database;

    public void connect() {
        database = createDatabase();
        database.connect();
    }

    public void disconnect() {
        if (database != null) {
            database.disconnect();
        }
    }
}
