package Command.commands;

import Command.Components.Light;

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}