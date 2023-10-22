package patterns.cdp.factoryMethod.example.mail;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver cargo by truck");
    }
}
