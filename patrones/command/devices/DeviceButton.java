package command.devices;

import command.devices.commands.Command;

/**

 * Boton del dispositivo
 */
public class DeviceButton {

    private Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
