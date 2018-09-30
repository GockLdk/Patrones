package factory.examples.cars.factories;

import factory.cars.products.Camry;
import factory.cars.products.Car;
import factory.cars.products.Corolla;

/**
 * Creacion de Corollas
 */
public class ToyotaFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("CAMRY")){
            car = new Camry();
        }else if(productName.equalsIgnoreCase("COROLLA")){
            car = new Corolla();
        }

        return car;
    }
}
