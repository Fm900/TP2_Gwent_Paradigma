package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.CardsContainer.Hand;

public class HandBuilder {
    public static final int STARTINGCARDS = 10;

    public Hand buildHand(Deck deck) {
        Hand hand = new Hand();
        for (int i=0; i < STARTINGCARDS; i++) {
            hand.addCard(deck.draw());
        }
        return hand;
    }



}
