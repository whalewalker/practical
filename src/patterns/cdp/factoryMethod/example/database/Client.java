package patterns.cdp.factoryMethod.example.database;

public class Client {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();

        // Add different types of storage
        Storage MySQL = new SQL(new MySQL());
        Storage Postgres = new SQL(new Postgres());

        Storage MongoDB = new NoSQL(new MongoDB());
        Storage Couchbase = new NoSQL(new Couchbase());

        connectionPool.addStorage(MySQL, Postgres, MongoDB, Couchbase);

        // Connect to all storages
        connectionPool.connectAll();

        // Disconnect a specific storage
        connectionPool.disconnectStorage(MongoDB);

        // Disconnect all storages
        connectionPool.disconnectAll();

        // Release connection from a specific storage
        connectionPool.releaseConnection(MongoDB);

        connectionPool.connectStorage(MongoDB);

    }
}
