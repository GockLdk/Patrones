package strategy.transportation;

/**
 * Carro Personal */
public class PersonalCar implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: PersonalCar";
    }

}
