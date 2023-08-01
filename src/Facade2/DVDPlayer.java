package Facade2;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD player is on");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD player stopped");
    }
    public void off() {
        System.out.println("DVD player is off");
    }
}

