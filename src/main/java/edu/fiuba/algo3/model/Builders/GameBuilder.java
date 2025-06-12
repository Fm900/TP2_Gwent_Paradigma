package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import org.jetbrains.annotations.NotNull;

public class GameBuilder {

    private final DeckBuilder deckBuilder;
    private final HandBuilder handBuilder = new HandBuilder();

    public GameBuilder(String jsonPath) {
        this.deckBuilder = new DeckBuilder(jsonPath);
    }

    public @NotNull Game buildGame(String namePlayer1, String keyDeck1, String namePlayer2, String keyDeck2) {
        Deck deck1 = deckBuilder.buildDeck(keyDeck1);
        Deck deck2 = deckBuilder.buildDeck(keyDeck2);

        Hand hand1 = handBuilder.buildHand(deck1);
        Hand hand2 = handBuilder.buildHand(deck2);

        Player player1 = new Player(deck1, hand1, new DiscardPile(), namePlayer1);
        Player player2 = new Player(deck2, hand2, new DiscardPile(), namePlayer2);

        return new Game(player1, player2, new Board(player1, player2));
    }
}

