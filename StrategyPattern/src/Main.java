import scoreboard.controller.ScoreBoard;
import scoreboard.model.Balloon;
import scoreboard.model.Clown;
import scoreboard.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        // Clown shoot
        scoreBoard.scoreBoardAlgorithmBase = new Clown();
        scoreBoard.showScore(10, 2);

        // Balloon Shoot
        scoreBoard.scoreBoardAlgorithmBase = new Balloon();
        scoreBoard.showScore(20, 3);

        // Square Balloon shoot
        scoreBoard.scoreBoardAlgorithmBase = new SquareBalloon();
        scoreBoard.showScore(20, 2);
    }
}