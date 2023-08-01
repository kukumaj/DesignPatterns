package Facade2;

public class Projector {
    public void on() {
        System.out.println("Projector  is on");
    }

    public void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Setting projector input to DVD player");
    }

    public void wideScreenMode() {
        System.out.println("Projector set to wide screen mode");
    }
    public void off() {
        System.out.println("Projector is off");
    }
}
