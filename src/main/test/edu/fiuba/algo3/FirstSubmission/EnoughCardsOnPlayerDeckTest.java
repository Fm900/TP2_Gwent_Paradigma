

package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Builders.GameBuilder;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class EnoughCardsOnPlayerDeckTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        String absolutePath = Paths.get("src/test/resources/json/gwent.json").toAbsolutePath().toString();
        GameBuilder builder = new GameBuilder(absolutePath);
        this.game = builder.buildGame("Alex", "mazo_jugador_uno", "Felix", "mazo_jugador_dos");
    }
    @Test
    public void testBothPlayersHaveValidDecks() {
        verifyPlayerDeck(game.getPlayer1());
        verifyPlayerDeck(game.getPlayer2());
    }

    private void verifyPlayerDeck(@NotNull Player player) {
        Deck deck = player.getDeck();
        Hand hand = player.getHand();

        long unitCount1 = deck.getCards().stream()
                .filter(card -> card instanceof Unit)
                .count();
        long unitCount2 = hand.getCards().stream()
                .filter(card -> card instanceof Unit)
                .count();
        long totalUnits = unitCount1 + unitCount2;

        long specialCount = deck.getCards().stream()
                .filter(card -> card instanceof Special)
                .count();
        long especialCount2 = hand.getCards().stream()
                .filter(card -> card instanceof Special)
                .count();
        long totalSpecials = specialCount + especialCount2;

        assertTrue(totalUnits >= 15, new String("unidades faltantes"));

        assertTrue(totalSpecials >= 6);
    }
}


