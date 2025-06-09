package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Deck.Deck;
import org.jetbrains.annotations.NotNull;

public class GameBuilder {
    private static DeckBuilder DeckBuilder;

    public static @NotNull Game buildGame(String namePlayer1, String selectedDeck1, String namePlayer2, String selectedDeck2) {
        Deck deck1 = DeckBuilder.buildDeck(selectedDeck1);
        Deck deck2 = DeckBuilder.buildDeck(selectedDeck2);

        Player player1 = new Player(deck1, new Hand(), new DiscardPile(),namePlayer1);
        Player player2 = new Player(deck2, new Hand(), new DiscardPile(),namePlayer2);

        return new Game(player1, player2,new Board());
    }
}
