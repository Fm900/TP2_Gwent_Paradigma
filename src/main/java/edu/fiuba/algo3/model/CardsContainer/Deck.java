package edu.fiuba.algo3.model.CardsContainer;

import edu.fiuba.algo3.model.Card.Card;

import java.util.Collections;

public class Deck extends CardsContainer {
    private String name;

    public Deck(String name) {
        this.name = name;
        shuffle();
    }
    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
}