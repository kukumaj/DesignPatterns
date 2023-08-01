package Template;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    //Template method
    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if (addNewGameCharacter()) {
            addNewCharacterToTheGame();
        }
        endPlay();
    }
    //Hooked on Template Method
    protected void addNewCharacterToTheGame() {
    }

    void loadAssets() {
         System.out.println("Loading Game Assets!");
     }
     boolean addNewGameCharacter() {
         return true;
     }

    //Add more methods

}
