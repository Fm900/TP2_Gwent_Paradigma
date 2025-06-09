package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class BondedCardsTest {

    @Test
    public void testBondedCardsDoublePointsDuringRound() {

        Deck deck = new Deck();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();
        int id = 1;

        Player player = new Player(deck, hand, discardPile, id, "testing");
        Board board = new Board();

        Unit trebuchet1 = new Siege("trebuchet", 8, "catapult", new Basic());
        Unit trebuchet2 = new Siege("trebuchete", 8, "catapult", new Basic());

        hand.addCard(trebuchet1);
        hand.addCard(trebuchet2);

        player.playCard(0, board);
        player.playCard(0, board);

        assertEquals(32, player.getTotalPoints(board));
    }

    @Test
    public void testBondedCardsReduceOneReduceBoth() {

        Deck deck = new Deck();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();
        int id = 1;

        Player player = new Player(deck, hand, discardPile, id, "testing");
        Board board = new Board();

        Unit trebuchet1 = new Siege("trebuchet", 8, "catapult", new Basic());
        Unit trebuchet2 = new Siege("trebuchete", 8, "catapult", new Basic());

        hand.addCard(trebuchet1);
        hand.addCard(trebuchet2);

        player.playCard(0, board);
        player.playCard(0, board);

        trebuchet1.modifyPoints(1);

        assertEquals(30, player.getTotalPoints(board));
    }
}