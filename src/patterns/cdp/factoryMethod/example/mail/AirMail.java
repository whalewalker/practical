package patterns.cdp.factoryMethod.example.mail;

public class AirMail extends Mail{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
