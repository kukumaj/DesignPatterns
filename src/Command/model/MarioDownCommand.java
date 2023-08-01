package Command.model;

import Command.interfaces.Command;

public class MarioDownCommand implements Command {
    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioDownCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacterReceiver = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveDown();
    }
}

