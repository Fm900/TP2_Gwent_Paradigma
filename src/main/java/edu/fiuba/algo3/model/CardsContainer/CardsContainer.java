package edu.fiuba.algo3.model.CardsContainer;

import edu.fiuba.algo3.model.Card.Card;

import java.util.ArrayList;
import java.util.List;

public abstract class CardsContainer {
    protected List<Card> cards;

    public CardsContainer(){
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card){cards.add(card);}
    public void removeCard(int num){
        cards.remove(0);
    };

    public List<Card> getCards(){return cards;};
    public int size(){return cards.size();};

    public boolean removeSpecificCard(Card card) {
        return cards.remove(card);
    }


}
