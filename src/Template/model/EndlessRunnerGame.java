package Template.model;

import Template.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("EndlessRunner initializing...");
    }

    @Override
    protected void startPlay() {
        System.out.println("EndlessRunner starting...");
        playerWantsNewCharacter();
    }

    @Override
    protected void endPlay() {
        System.out.println("EndlessRunner ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new Character to the game");
    }

    public boolean playerWantsNewCharacter() {
        String answer =getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to add a new character to the game? (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();

        } catch (IOException ioe) {
            System.out.println("IO Error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
    //Add more methods
}
