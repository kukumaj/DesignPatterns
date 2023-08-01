package Command.model;

import Command.interfaces.Command;

public class GameBoy {
    private Command UpCommand, DwonCommand, LeftCommand, RightCommand;

    public GameBoy(Command upCommand, Command dwonCommand,
                   Command leftCommand, Command rightCommand) {
        UpCommand = upCommand; //concrete commands
        DwonCommand = dwonCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public void arrowUp() {
        UpCommand.execute();
    }

    public void arrowDown() {
        DwonCommand.execute();
    }

    public void arrowLeft() {
        LeftCommand.execute();
    }

    public void arrowRight() {
        RightCommand.execute();
    }
}
