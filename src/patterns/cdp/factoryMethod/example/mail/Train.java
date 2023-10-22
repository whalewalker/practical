package patterns.cdp.factoryMethod.example.mail;

public class Train implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver cargo by train");
    }
}
