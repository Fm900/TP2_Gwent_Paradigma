package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Builders.GameBuilder;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardsSufficientInHandTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        this.game = GameBuilder.buildGame("Alex", "Monsters", "Felix", "Monsters");
    }

    @Test
    public void testInitialHandSize() {
        Player player1 = this.game.getPlayer1();
        Player player2 = this.game.getPlayer2();
        assertEquals(10, player1.getHand().getCards().size(),
                "El jugador 1 debería empezar con 10 cartas");
        assertEquals(10, player2.getHand().getCards().size(),
                "El jugador 2 debería empezar con 10 cartas");
    }
}
