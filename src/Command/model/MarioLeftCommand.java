package Command.model;

import Command.interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacterReceiver = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveLeft();
    }
}
