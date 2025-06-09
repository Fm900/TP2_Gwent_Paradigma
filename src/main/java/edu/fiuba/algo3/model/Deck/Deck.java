package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.CardsContainer;

public class Deck extends CardsContainer {
    private String name;

    public Deck(String name) {
        this.name = name;
    }
    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}