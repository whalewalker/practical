package patterns.cdp.factoryMethod.example.database;

public class MongoDB implements Database {
    private boolean isConnected = false;

    @Override
    public void connect() {
        if (!isConnected){
            System.out.println("Connected to MongoDB");
            isConnected = true;
        }else System.out.println("Already disconnected from  MongoDB");

    }

    @Override
    public void disconnect() {
        if (isConnected){
            System.out.println("Disconnected from MongoDB");
            isConnected = false;
        }else System.out.println("Already disconnected from MongoDB");
    }

}
