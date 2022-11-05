import entity.ArcadeGame;
import entity.BasketBallGame;
import entity.FootBallGame;
import template.Game;

public class Main {
    public static void main(String[] args) {
        Game football = new FootBallGame();
        Game basketball = new BasketBallGame();
        Game arcadeGame = new ArcadeGame();
        football.play();
        System.out.println("==============");
        basketball.play();
        System.out.println("===============");
        arcadeGame.play();
    }
}