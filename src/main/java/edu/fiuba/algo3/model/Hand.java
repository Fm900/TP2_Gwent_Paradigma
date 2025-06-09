package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;


public class Hand extends CardsContainer{
    private static final int MAX_CARDS = 10;

    public Card playCard(int index) {
        return cards.remove(index);
    }
}
