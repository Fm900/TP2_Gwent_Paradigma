package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.Deck.Deck;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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

    public void replaceCards(@NotNull List<Card> cardsToReplace) {
        for (Card card : cardsToReplace)
            if (hand.removeSpecificCard(card)) deck.addCard(card);
        deck.shuffle();

        for (int i = 0; i < cardsToReplace.size(); i++) {
            Card newCard = deck.draw();
            if (newCard != null) {
                hand.addCard(newCard);
            }
        }
    }
    public Card playCard(int index, Board board) {
        Card playedCard = hand.playCard(index);
        discardPile.addCard(playedCard);

        if (playedCard instanceof Unit) {
            board.addCardToPlayerField((Unit) playedCard, this);
        } else if (playedCard instanceof Special) {
            ((Special) playedCard).applyInBoard(board);
        }

        return playedCard;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }
}