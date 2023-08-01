package Facade2;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Inception");
        //Enjoy the movie...
        homeTheater.endMovie();
    }
}
//Get ready to watch a movie...
//DVD player is on
//Playing movie: Inception
//Projector  is on
//Setting projector input to DVD player
//Projector set to wide screen mode
//Surround sound system is on
//Setting surround sound system DVD player
//Setting surround sound system volume to: 10
//Shutting down the home theater...
//DVD player stopped
//DVD player is off
//Projector is off
//Surround sound system is off