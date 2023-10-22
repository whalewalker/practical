package patterns.cdp.factoryMethod.example.mail;

public class GroundMail extends Mail{
    private final Transport transport;

    public GroundMail(Transport transport) {
        this.transport = transport;
    }

    @Override
    public Transport createTransport() {
        return transport;
    }
}
