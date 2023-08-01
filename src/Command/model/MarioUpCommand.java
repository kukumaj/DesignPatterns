package Command.model;

import Command.interfaces.Command;

public class MarioUpCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioUpCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacterReceiver = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveUp();
    }
}
