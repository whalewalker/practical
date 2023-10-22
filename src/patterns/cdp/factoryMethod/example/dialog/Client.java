package patterns.cdp.factoryMethod.example.dialog;

public class Client {

    public static void main(String[] args) {
        Dialog dialog = initialise("Web");
        dialog.render();
    }

    public static  Dialog initialise(String os) {
        if (os.equals("Windows")) {
             return new WindowsDialog();
        } else if (os.equals("Web")) {
            return new WebDialog();
        } else throw new RuntimeException("Error! Unknown operating system.");
    }
}
