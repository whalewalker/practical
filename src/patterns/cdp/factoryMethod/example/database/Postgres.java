package patterns.cdp.factoryMethod.example.database;

public class Postgres implements Database{
    private boolean isConnected = false;

    @Override
    public void connect() {
        if (!isConnected){
            System.out.println("Connected to Postgres");
            isConnected = true;
        }else System.out.println("Already disconnected from  Postgres");

    }

    @Override
    public void disconnect() {
        if (isConnected){
            System.out.println("Disconnected from Postgres");
            isConnected = false;
        }else System.out.println("Already disconnected from Postgres");
    }
}
