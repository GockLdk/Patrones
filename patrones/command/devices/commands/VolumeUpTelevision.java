package command.devices.commands;

import command.devices.devices.ElectronicDevice;

/**
 * Subir el volumen */
public class VolumeUpTelevision implements Command {

    private ElectronicDevice device;

    public VolumeUpTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumenDown();
    }


}
