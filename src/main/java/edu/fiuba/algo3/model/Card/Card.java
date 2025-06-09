package edu.fiuba.algo3.model.Card;

import edu.fiuba.algo3.model.Board;

public abstract class Card {
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

    public abstract void playCard(Board board);

}
