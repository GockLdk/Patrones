package factory.cars.factories;

import factory.cars.products.Car;

/**
 * Factoria de carros
 */
public abstract class CarsFactory {
    public abstract Car createProduct(String productName);
}
