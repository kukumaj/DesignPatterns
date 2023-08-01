package Template.model;

import Template.Game;

public class FootballGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football initializing...");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football begining...");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football ending...");
    }
}
