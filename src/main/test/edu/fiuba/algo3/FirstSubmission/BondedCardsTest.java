package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Modifier.Bonded;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import org.junit.jupiter.api.Test;

public class BondedCardsTest {

    @Test
    public void testBondedCardsDoublePointsDuringRound() {

        Deck deck = new Deck("Monsters");
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        DiscardPile discardPile = new DiscardPile();

        Player player1 = new Player(deck, hand1, discardPile, "testing two");
        Player player2 = new Player(deck, hand2, discardPile, "testing one");
        Board board = new Board(player1, player2);

        Unit trebuchet1 = new Siege("trebuchet long distance", 8, "catapult", new Basic());
        Unit trebuchet2 = new Siege("trebuchet fire thrower", 8, "catapult", new Bonded());

        hand1.addCard(trebuchet1);
        hand1.addCard(trebuchet2);

        player1.playCard(0, board);
        player1.playCard(0, board);

        Score finalScore = board.getPlayerScore(player1);

        assert(new Score(32).equals(finalScore));
    }

}