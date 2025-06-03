package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Special.Snow;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EnoughCardsOnPlayerDeckTest {
    private Hand hand;
    private DiscardPile discardPile;

    private Deck deckBuilder(int units, int special){
        Deck deck = new Deck();
        for (int i = 0; i < units; i++) {
            Melee card = new Melee("Warrior", 10);
            deck.addCard(card);
        }
        for (int i = 0; i < special; i++) {
            Snow snow = new Snow("Snow");
            deck.addCard(snow);
        }
        return deck;
    }

    @BeforeEach
    public void setUp(){
        this.hand = new Hand();
        this.discardPile = new DiscardPile();
    }

    @Test
    public void testEnoughCardsOnPlayerDeck() {
        Deck deck = deckBuilder(15, 5);
        Player player = new Player(deck, this.hand, this.discardPile, 0, "Valen");

        player.validateDeck();
        assertDoesNotThrow(player::validateDeck);
    }

    @Test
    public void testEnoughCardsOnPlayerDeck2() {
        Deck deck = deckBuilder(10, 5);
        Player player = new Player(deck, this.hand, this.discardPile, 0, "Valen");

        assertThrows(InvalidDeck.class, player::validateDeck);
    }

}
