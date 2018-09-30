package proxy.atm;

/**
 * Cajero
 */
public class ATMMachine implements GetATMData {

    private int cashInMachine;

    public ATMMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }
    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
