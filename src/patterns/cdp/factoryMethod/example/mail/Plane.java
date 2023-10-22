package patterns.cdp.factoryMethod.example.mail;

public class Plane implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver cargo by plane");
    }
}
