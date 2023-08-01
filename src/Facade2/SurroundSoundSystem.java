package Facade2;

public class SurroundSoundSystem {
    public void on() {
        System.out.println("Surround sound system is on");
    }

    public void setDVDPlayer(DVDPlayer dvdPlayer) {
        System.out.println("Setting surround sound system DVD player");
    }

    public void setVolume(int volume) {
        System.out.println("Setting surround sound system volume to: " + volume);
    }
    public void off() {
        System.out.println("Surround sound system is off");
    }
}
