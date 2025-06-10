package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Builders.GameBuilder;
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
    public void testCardsSufficientInHand() {
        Player player = this.game.getPlayer1();
        Hand hand = player.getHand();
        int expectedCardsInHand = 10;
        int cardsObtained = hand.getCards().size();

        assertTrue(expectedCardsInHand == cardsObtained);


    }
}
