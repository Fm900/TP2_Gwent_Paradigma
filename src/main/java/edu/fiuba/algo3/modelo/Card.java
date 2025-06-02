package edu.fiuba.algo3.modelo;

public class Card {
    private String name;
    private int points;

    public Card(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
}
