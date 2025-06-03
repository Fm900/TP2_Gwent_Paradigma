package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;


public class Hand extends CardsContainer{
    private static final int MAX_CARDS = 10;

    public Card playCard(int index) {
        return cards.remove(index);
    }

    @Override
    public void validate() {
        if (cards.size() > MAX_CARDS) {
            removeCard(0);
            throw new ExcessCardsHand("Cannot add more than " + MAX_CARDS + " cards");
        }
    }
}
