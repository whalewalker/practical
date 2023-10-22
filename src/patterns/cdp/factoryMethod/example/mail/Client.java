package patterns.cdp.factoryMethod.example.mail;

public class Client {
    public static void main(String[] args) {
        Mail airMail = new AirMail();
        airMail.send();

        Transport truck = new Truck();
        Mail groundMailByTruck = new GroundMail(truck);
        groundMailByTruck.send();

        Transport train = new Train();
        Mail groundMailByTrain = new GroundMail(train);
        groundMailByTrain.send();
    }
}
