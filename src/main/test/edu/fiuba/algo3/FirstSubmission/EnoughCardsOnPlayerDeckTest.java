

package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Builders.GameBuilder;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Deck.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnoughCardsOnPlayerDeckTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        this.game = GameBuilder.buildGame("Alex", "Monsters", "Felix", "Monsters");
    }

    @Test
    public void testDeckHasMinimumRequiredCards() {
        Player player = this.game.getPlayer1();
        Deck deck = player.getDeck();

        long unitCount = deck.getCards().stream()
                .filter(card -> card instanceof Unit)
                .count();

        long specialCount = deck.getCards().stream()
                .filter(card -> card instanceof Special)
                .count();

        assertTrue(unitCount >= 15, "El mazo debe tener al menos 15 cartas de unidad");
        assertTrue(specialCount >= 6, "El mazo debe tener al menos 6 cartas especiales");
    }
}


