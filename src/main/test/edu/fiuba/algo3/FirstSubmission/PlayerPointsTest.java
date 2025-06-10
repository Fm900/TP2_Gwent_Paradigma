
/*
package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerPointsTest {

    private Player player;
    private Melee card1;
    private Board board;

    @BeforeEach
    void setUp() {
        card1 = new Melee("Warrior", 5, "Warrior");
        Deck deck = new Deck();
        deck.addCard(card1);

        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        board = new Board();

        player = new Player(deck, hand, discardPile,0, "Nahuel");
        player.drawCard();
    }

    @Test
    void testPlayCardAddsPointsToPlayer() {
        assertEquals(0, player.getTotalPoints(board));

        Card playedCard = player.playCard(0, board);
        assertEquals(5, player.getTotalPoints(board));
        assertEquals("Warrior", playedCard.getName());
    }
}
*/