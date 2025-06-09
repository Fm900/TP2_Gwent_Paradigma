package edu.fiuba.algo3.model;

public class Score {
    private int value;

    public Score(int value) {
        this.value = value;
    }

    public Score add(Score other) {
        return new Score(this.value + other.value);
    }

    public Score subtract(Score other) {
        return new Score(this.value - other.value);
    }

    public Score multiply(int factor) {
        return new Score(this.value * factor);
    }

    public Score divide(int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return new Score(this.value / divisor);
    }

    public int getValue() {
        return this.value;
    }

}
