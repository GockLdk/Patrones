package command.devices;

import command.devices.commands.TurnOffAllDevices;
import command.devices.commands.TurnOffTelevision;
import command.devices.commands.TurnOnTelevision;
import command.devices.commands.VolumeUpTelevision;
import command.devices.devices.ElectronicDevice;
import command.devices.devices.Radio;
import command.devices.devices.Television;

import java.util.ArrayList;
import java.util.List;

/**
 * Cliente.
 */
public class Client {

    public static void main(String[] args){

        ElectronicDevice televisionOne = new Television("SAMSUMG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();


        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television televisionTwo = new Television("SONY");
        Radio radioOne = new Radio("PIONEER");

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioOne);

        TurnOffAllDevices turnOffDevices = new TurnOffAllDevices(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }

}
