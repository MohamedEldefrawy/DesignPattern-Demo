package scoreboard.controller;

public class ScoreBoard {
    public ScoreBoardAlgorithmBase scoreBoardAlgorithmBase;

    public void showScore(int tabs, int multiplier) {
        System.out.println(scoreBoardAlgorithmBase.calculateScore(tabs, multiplier));
    }
}
