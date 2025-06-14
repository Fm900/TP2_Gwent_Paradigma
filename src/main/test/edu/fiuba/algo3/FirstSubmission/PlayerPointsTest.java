package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerPointsTest {

    private Player player1;
    private Player player2;
    private Melee card1;
    private Board board;

    @BeforeEach
    void setUp() {
        card1 = new Melee("Warrior", 5, "Warrior", new Basic());
        Deck deck = new Deck("Monsters");
        deck.addCard(card1);

        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        player1 = new Player(deck, hand, discardPile, "Nahuel");
        player2 = new Player(new Deck("Nilfgaard"), new Hand(), new DiscardPile(), "Bot");
        board = new Board(player1, player2);

        player1.drawCard();
    }


    @Test
    void testPlayCardAddsPointsToPlayer() {
        assertTrue(new Score(0).equals(board.getPlayerScore(player1)));

        Card playedCard = player1.playCard(0, board, "");
        assertTrue(new Score(5).equals(board.getPlayerScore(player1)));
        assertEquals("Warrior", playedCard.getName());
    }
}