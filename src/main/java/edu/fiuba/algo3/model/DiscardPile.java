package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
