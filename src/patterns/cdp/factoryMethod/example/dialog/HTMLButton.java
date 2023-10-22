package patterns.cdp.factoryMethod.example.dialog;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("A web dialog is rendered");
        // Return an HTML representation of a button.
    }

    @Override
    public void onClick() {
        System.out.println("Dialog is clicked on web");
        // Bind a web browser click event.
    }
}
