package patterns.cdp.factoryMethod.example.dialog;

public abstract class Dialog {
    public abstract Button createButton();

    void render() {
        Button button = createButton();
        button.onClick();
        button.render();
    }
}
