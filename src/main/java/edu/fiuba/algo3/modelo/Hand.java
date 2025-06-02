package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card playCard(int index) {
        return cards.remove(index);
    }

    public List<Card> getCards() {
        return cards;
    }
}
