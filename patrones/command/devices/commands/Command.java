package command.devices.commands;

/**
 * Comandos de dispositivos
 */
public interface Command {
    public void execute();
    public void undo();
}
