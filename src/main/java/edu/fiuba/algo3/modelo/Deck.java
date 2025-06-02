package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public List<Card> getCards() {
        return cards;
    }
}