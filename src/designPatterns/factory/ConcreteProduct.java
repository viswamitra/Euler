package designPatterns.factory;

/**
 * Created by abhiramk on 06/04/16.
 */
public class ConcreteProduct implements Product {
    @Override
    public void productSpec() {
        System.out.println("This is a concrete product");
    }
}
