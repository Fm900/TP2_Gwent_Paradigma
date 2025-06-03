package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerDiscardPileTest {

    private Player player;
    private Melee card1;
    private Board board;

    @BeforeEach
    void setUp() throws ExcessCardsHand {
        card1 = new Melee("Warrior", 5, "Warrior");
        Deck deck = new Deck();
        deck.addCard(card1);
        board = new Board();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();

        player = new Player(deck, hand, discardPile,0, "Salva");
        player.drawCard();
    }

    @Test
    void testCardGoesToDiscardPile() {
        player.playCard(0, board);
        assertEquals(1, player.getDiscardPile().getCards().size());
        assertEquals("Warrior", player.getDiscardPile().getCards().get(0).getName());
    }
}
