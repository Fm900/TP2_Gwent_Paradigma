package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;

public class Player {
    private Deck deck;
    private Hand hand;
    private DiscardPile discardPile;
    private int totalPoints;
    private int id;

    public Player(Deck deck, Hand hand, DiscardPile discardPile,int id) {
        this.deck = deck;
        this.hand = hand;
        this.discardPile = discardPile;
        this.totalPoints = 0;
        this.id = id;
    }

    public void drawCard() {
        Card card = deck.draw();
        if (card != null) {
            hand.addCard(card);
        }
    }

    public Card playCard(int index,Board board) {
        Card playedCard = hand.playCard(index);
        totalPoints += playedCard.getPoints();
        discardPile.addCard(playedCard);


        if (playedCard instanceof Unit) {
            board.addCardToSection((Unit)playedCard, this);
        } else if (playedCard instanceof Special) {
            ((Special)playedCard).applyInBoard(board);
        }



        return playedCard;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }


    public int getId() {return id; }
}
