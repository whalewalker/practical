package patterns.cdp.factoryMethod;

public class ConcreteCreatorB extends Creator{
    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
