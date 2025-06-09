package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;
import edu.fiuba.algo3.model.Card.Unit.Unit;
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
        Modifier modifier = new Basic();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.MELEE, "warrior", modifier) {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = null;

        for (Section s : board.getSections(id)) {
            if (s.getType() == SectionAvailable.MELEE) {
                section = s;
                break;
            }
        }

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
        Modifier modifier = new Basic();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.RANGE, "warrior", modifier) {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = null;

        for (Section s : board.getSections(id)) {
            if (s.getType() == SectionAvailable.RANGE) {
                section = s;
                break;
            }
        }

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
        Modifier modifier = new Basic();

        Unit soldier = new Unit("Juan", 5, SectionAvailable.SIEGE, "warrior", modifier) {};

        hand.addCard(soldier);

        player.playCard(0, board);

        Section section = null;

        for (Section s : board.getSections(id)) {
            if (s.getType() == SectionAvailable.SIEGE) {
                section = s;
                break;
            }
        }

        assertEquals(5, section.getScore());
    }


}
