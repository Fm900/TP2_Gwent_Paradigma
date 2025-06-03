package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;


public class CardPlayedInSectionOfBoardTest {

    @Test
    public void testPlayerCanPlaceMeleeUnitCardInCorrectSection() {

        Deck deck = new Deck();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();
        int id = 1;

        Player player = new Player(deck, hand, discardPile, id, "testing");
        Board board = new Board();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.MELEE, "warrior") {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = board.getSections(id).get(0);

        assertEquals(5, section.getScore());
    }
    @Test
    public void testPlayerCanPlaceRangeUnitCardInCorrectSection() {

        Deck deck = new Deck();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();
        int id = 1;

        Player player = new Player(deck, hand, discardPile, id, "testing");
        Board board = new Board();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.RANGE, "warrior") {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = board.getSections(id).get(1);

        assertEquals(5, section.getScore());
    }
    @Test
    public void testPlayerCanPlaceSiegeUnitCardInCorrectSection() {

        Deck deck = new Deck();
        Hand hand = new Hand();
        DiscardPile discardPile = new DiscardPile();
        int id = 1;

        Player player = new Player(deck, hand, discardPile, id, "testing");
        Board board = new Board();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.SIEGE, "warrior") {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = board.getSections(id).get(2);

        assertEquals(5, section.getScore());
    }


}
