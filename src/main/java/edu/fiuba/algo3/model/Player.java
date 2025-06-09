package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Deck.Deck;

public class Player {
    private Deck deck;
    private Hand hand;
    private DiscardPile discardPile;
    private String name;

    public Player(Deck deck, Hand hand, DiscardPile discardPile, String name) {
        this.deck = deck;
        this.hand = hand;
        this.discardPile = discardPile;
        this.name = name;
    }

    public void drawCard() {
        Card card = deck.draw();
        if (card != null) {
            hand.addCard(card);
        }
    }

    public Card playCard(int index, Board board) {
        Card playedCard = hand.playCard(index);
        discardPile.addCard(playedCard);

        if (playedCard instanceof Unit) {
            board.addCardToSection((Unit) playedCard, this);
        } else if (playedCard instanceof Special) {
            ((Special) playedCard).applyInBoard(board);
        }

        return playedCard;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }

}