package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Special.Snow;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CardsSufficientInHandTest {
    private Hand hand;
    private DiscardPile discardPile;

    @BeforeEach
    public void setUp() {
        hand = new Hand();
        this.discardPile = new DiscardPile();
    }

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

    private void handBuilder(int numCards, Player player){
        for (int i = 0; i < numCards; i++) {
            player.drawCard();
        }
    }

    @Test
    public void testCardsSufficientInHand(){
        Deck deck = deckBuilder(15,5);
        Player player = new Player(deck, this.hand, this.discardPile, 0);
        handBuilder(10, player);
        player.validateHand();
        assertDoesNotThrow(player::validateHand);
    }

    @Test
    public void testCardsSufficientInHand2(){
        Deck deck = deckBuilder(15,5);
        Player player = new Player(deck, this.hand, this.discardPile, 0);
        handBuilder(11, player);
        assertThrows(ExcessCardsHand.class, player::validateHand);
    }
}
