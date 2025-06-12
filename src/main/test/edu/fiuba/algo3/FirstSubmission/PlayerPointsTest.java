/*
package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerPointsTest {

    private Player player1;
    private Player player2;
    private Melee card1;
    private Board board;
    private Modifier Legend;

    @BeforeEach
    void setUp() {
        card1 = new Melee("Warrior", 5, "Warrior", Legend);
        Deck deck = new Deck("Monsters");
        deck.addCard(card1);

        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        board = new Board(player1, player2);

        player1 = new Player(deck, hand, discardPile, "Nahuel");
        player1.drawCard();
    }

    //falta refactor
    @Test
    void testPlayCardAddsPointsToPlayer() {
        assertEquals(0, player.getTotalPoints(board));

        Card playedCard = player.playCard(0, board);
        assertEquals(5, player.getTotalPoints(board));
        assertEquals("Warrior", playedCard.getName());
    }
}
*/