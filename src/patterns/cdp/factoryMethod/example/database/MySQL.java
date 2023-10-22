package patterns.cdp.factoryMethod.example.database;

public class MySQL implements Database{
    private boolean isConnected = false;

    @Override
    public void connect() {
        if (!isConnected){
            System.out.println("Connected to MySQL");
            isConnected = true;
        }else System.out.println("Already disconnected from  MySQL");

    }

    @Override
    public void disconnect() {
        if (isConnected){
            System.out.println("Disconnected from MySQL");
            isConnected = false;
        }else System.out.println("Already disconnected from MySQL");
    }
}
