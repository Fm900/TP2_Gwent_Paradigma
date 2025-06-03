package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsContainer {
    protected List<Card> cards;

    public CardsContainer(){
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card){cards.add(card);}
    public void removeCard(Card card){
        cards.remove(card);
    };
    public List<Card> getCards(){return cards;};
    public int size(){return cards.size();};
    public abstract void validate();


}
