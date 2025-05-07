package Command;

import Command.Components.FloorLamp;
import Command.Components.Room;
import Command.commands.OpenCloseCurtainsCommand;
import Command.commands.SwitchLightsCommand;

public class MainApp {


    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }

}