package patterns.cdp.factoryMethod.example.database;

public class Couchbase implements Database{
    private boolean isConnected = false;

    @Override
    public void connect() {
        if (!isConnected){
            System.out.println("Connected to Couchbase");
            isConnected = true;
        }else System.out.println("Already disconnected from  Couchbase");

    }

    @Override
    public void disconnect() {
        if (isConnected){
            System.out.println("Disconnected from Couchbase");
            isConnected = false;
        }else System.out.println("Already disconnected from Couchbase");
    }

}
