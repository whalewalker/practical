package patterns.cdp.factoryMethod.example.mail;

public abstract class Mail {
    public abstract Transport createTransport();

    public void send() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
