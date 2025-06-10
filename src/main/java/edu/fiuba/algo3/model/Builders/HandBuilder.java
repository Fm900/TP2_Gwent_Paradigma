package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Deck.Deck;
import edu.fiuba.algo3.model.CardsContainer.Hand;

public class HandBuilder {
    public static final int STARTINGCARDS = 10;
    Hand hand = new Hand();
    public Hand buildHand(Deck deck) {
        for (int i=0; i<STARTINGCARDS; i++) {
            hand.addCard(deck.draw());
        }
        return hand;
    }


}
