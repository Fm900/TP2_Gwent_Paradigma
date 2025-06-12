package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.Modifier.Legend;
import edu.fiuba.algo3.model.Card.Special.MoraleBoost;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import org.jetbrains.annotations.NotNull;

public class DeckBuilder {
    public Deck buildDeck(@NotNull String deckName) {
        Deck deck = new Deck(deckName);

        for(int i = 0; i < 15; i++) {
            deck.addCard(new Melee("Warrior", 5, "Warrior", new Legend()));
        }

        for(int i = 0; i < 6; i++) {
            deck.addCard(new MoraleBoost("MoraleBoost"));
        }

        return deck;
    }
}
