package Command.model;

import Command.interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacterReceiver = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveRight();
    }
}
