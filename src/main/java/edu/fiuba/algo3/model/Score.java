package edu.fiuba.algo3.model;

public class Score {
    private int dinamicValue;
    private int initialValue;

    public Score(int value) {
        this.dinamicValue = value;
    }

    public Score addScore(Score other) {
        return new Score(this.dinamicValue + other.dinamicValue);
    }

    public Score add(int score){
        dinamicValue += score;
        return new Score(dinamicValue);
    }

    public Score subtract(Score other) {
        return new Score(this.dinamicValue - other.dinamicValue);
    }

    public Score multiply(int factor) {
        return new Score(this.dinamicValue * factor);
    }

    public Score divide(int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return new Score(this.dinamicValue / divisor);
    }

    public void returnToInitialValue() {
        dinamicValue = initialValue;
    }

    public int getValue() {
        return this.dinamicValue;
    }

    public boolean equals(Score other) {
        return(dinamicValue == other.getValue());
    }
}
