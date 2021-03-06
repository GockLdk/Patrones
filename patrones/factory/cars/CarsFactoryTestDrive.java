package factory.cars;

import factory.cars.factories.CarsFactory;
import factory.cars.factories.NissanFactory;
import factory.cars.factories.ToyotaFactory;
import factory.cars.products.Car;

/**
 * Prueba de Carros
 */
public class CarsFactoryTestDrive {

    public static void main(String[] args) {

        CarsFactory factory;
        Car carCreated;

        factory = new NissanFactory();

        System.out.println("For Tsuru:");
        carCreated = factory.createProduct("tsuru");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        System.out.println("For Versa:");
        carCreated = factory.createProduct("versa");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        factory = new ToyotaFactory();

        System.out.println("For Corolla:");
        carCreated = factory.createProduct("corolla");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        System.out.println("For Camry:");
        carCreated = factory.createProduct("camry");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        System.out.println("For Spark:");
        carCreated = factory.createProduct("spark");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

    }

}
