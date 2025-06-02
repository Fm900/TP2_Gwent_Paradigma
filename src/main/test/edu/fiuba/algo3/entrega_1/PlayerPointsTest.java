package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerPointsTest {

    private Player player;
    private Card card1;

    @BeforeEach
    void setUp() {
        card1 = new Card("Warrior", 5);
        Deck deck = new Deck();
        deck.addCard(card1);

        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        player = new Player(deck, hand, discardPile);
        player.drawCard();
    }

    @Test
    void testPlayCardAddsPointsToPlayer() {
        assertEquals(0, player.getTotalPoints());

        Card playedCard = player.playCard(0);
        assertEquals(5, player.getTotalPoints());
        assertEquals("Warrior", playedCard.getName());
    }
}
