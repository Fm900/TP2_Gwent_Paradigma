package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Legend;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerDiscardPileTest {

    private Player player1;
    private Player player2;
    private Melee card1;
    private Board board;
    private Modifier legend;

    @BeforeEach
    void setUp() throws ExcessCardsHand {
        legend = new Legend();
        card1 = new Melee("Warrior", 5, "Warrior", legend);
        Deck deck = new Deck("Monsters");
        deck.addCard(card1);
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        player1 = new Player(deck, hand, discardPile, "Salva");
        player2 = new Player(deck, hand, discardPile,"Franco");

        board = new Board(player1, player2);

        player1.drawCard();
    }

    @Test
    void testCardGoesToDiscardPile() {
        player1.playCard(0, board, "");
        assertEquals(1, player1.getDiscardPile().getCards().size());
        assertEquals("Warrior", player1.getDiscardPile().getCards().get(0).getName());
    }
}