package scoreboard.model;

import scoreboard.controller.ScoreBoardAlgorithmBase;

public class SquareBalloon implements ScoreBoardAlgorithmBase {
    @Override
    public int calculateScore(int tabs, int multiplier) {
        return (tabs * multiplier) - 5;
    }
}
