package edu.fiuba.algo3.modelo;

public class Player {
    private Deck deck;
    private Hand hand;
    private DiscardPile discardPile;
    private int totalPoints;

    public Player(Deck deck, Hand hand, DiscardPile discardPile) {
        this.deck = deck;
        this.hand = hand;
        this.discardPile = discardPile;
        this.totalPoints = 0;
    }

    public void drawCard() {
        Card card = deck.draw();
        if (card != null) {
            hand.addCard(card);
        }
    }

    public Card playCard(int index) {
        Card playedCard = hand.playCard(index);
        totalPoints += playedCard.getPoints();
        discardPile.addCard(playedCard);
        return playedCard;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }
}
