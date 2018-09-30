package command.devices.commands;

import command.devices.devices.ElectronicDevice;

/**
 * Apagar televison */
public class TurnOffTelevision implements Command {

    private ElectronicDevice device;

    public TurnOffTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
