package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;

public class Deck extends CardsContainer{
    public static final int MINIMUMNUMBERUNITS = 15;
    public static final int MINIMUMNUMBERSPECIAL = 5;

    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    @Override
    public void validate(){
        int unitCounter = 0;
        int specialCounter = 0;

        for (Card card : cards) {
            if( card instanceof Special) specialCounter++;
            if( card instanceof Unit) unitCounter++;
        }
        meetsMinimumNumberCards(unitCounter, specialCounter);
    }
    public void meetsMinimumNumberCards (int unitCounter ,int specialCounter){

        if(unitCounter < MINIMUMNUMBERUNITS){
            throw new InvalidDeck("insufficient number of cards of the unit type");
        }
        if(specialCounter < MINIMUMNUMBERSPECIAL){
            throw new InvalidDeck("insufficient number of special type cards");
        }
    }
}