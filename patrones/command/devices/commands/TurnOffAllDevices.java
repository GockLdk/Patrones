package command.devices.commands;

import command.devices.devices.ElectronicDevice;

import java.util.List;

/**
 * Apagar Dispositivos
 */
public class TurnOffAllDevices implements Command {

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices) {
        allDevices = newDevices;
    }

    public void execute() {
        for (ElectronicDevice device : allDevices) {
            device.off();
        }
    }

    public void undo() {
        for (ElectronicDevice device : allDevices) {
            device.on();
        }
    }
}