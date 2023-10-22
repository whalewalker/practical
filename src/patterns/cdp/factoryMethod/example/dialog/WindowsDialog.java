package patterns.cdp.factoryMethod.example.dialog;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
