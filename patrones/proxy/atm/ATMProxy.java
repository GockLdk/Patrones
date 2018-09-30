package proxy.atm;

/**
 * Proxy del cajero */
public class ATMProxy implements GetATMData {

    private GetATMData atmMachine;

    public ATMProxy(GetATMData atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public int getCashInMachine() {
        return atmMachine.getCashInMachine();
    }
}
