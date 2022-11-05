package template;

public abstract class Game {

    public abstract void initialize();

    public abstract void start();

    public abstract void end();

    public final void play() {
        loadingGameAssets();
        initialize();
        start();
        addingNewCharacter();
        end();
    }

    private void loadingGameAssets() {
        System.out.println("Loading Game Assets");
    }

    public abstract void addingNewCharacter();
}
