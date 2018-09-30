package strategy.transportation;

/**
 * Autobus de Ciudad
 */
public class CityBus implements  TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: CityBus";
    }

}
