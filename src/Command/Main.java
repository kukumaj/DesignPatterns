package Command;

import Command.model.*;

public class Main {
    public static void main(String[] args) {
        //creates our receivers
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        //Create commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);


        //Invoker
        GameBoy gameBoy = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        GameBoy gameBoy2 = new GameBoy( kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
        gameBoy.arrowDown();
        gameBoy2.arrowDown();
        gameBoy.arrowUp();
        gameBoy2.arrowUp();
        gameBoy.arrowLeft();
        gameBoy2.arrowLeft();
        gameBoy.arrowRight();
        gameBoy2.arrowRight();
    }
}
