package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand extends CardsContainer{
    private static final int MAX_CARDS = 10;

    public Card playCard(int index) {
        return cards.remove(index);
    }

    @Override
    public void validate() {
        if(cards.size() >= MAX_CARDS) throw new ExcessCardsHand("10 cards maximum in hand");
    }
}
