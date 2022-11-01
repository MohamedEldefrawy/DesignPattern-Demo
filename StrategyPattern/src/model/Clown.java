package model;

import controller.ScoreBoardAlgorithmBase;

public class Clown implements ScoreBoardAlgorithmBase {
    @Override
    public int calculateScore(int tabs, int multiplier) {
        return (tabs * multiplier) - 10;
    }
}
