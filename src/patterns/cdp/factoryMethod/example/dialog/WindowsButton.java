package patterns.cdp.factoryMethod.example.dialog;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("A windows dialog is rendered");
        // Render a button in Windows style.
    }

    @Override
    public void onClick() {
        System.out.println("Dialog is clicked on windows");
        // Bind a native OS click event.
    }
}
