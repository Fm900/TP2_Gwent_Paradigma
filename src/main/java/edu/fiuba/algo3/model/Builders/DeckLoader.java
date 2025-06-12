package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.CardsContainer.*;

import com.google.gson.*;

public class DeckLoader {

    public static Deck loadDeck(JsonObject deckJson, String name) {
        Deck deck = new Deck(name);

        JsonArray unidades = deckJson.getAsJsonArray("unidades");
        for (JsonElement elem : unidades) {
            JsonObject jsonCard = elem.getAsJsonObject();
            deck.addCard(CardFactory.createUnitCard(jsonCard));
        }

        JsonArray especiales = deckJson.getAsJsonArray("especiales");
        for (JsonElement elem : especiales) {
            JsonObject jsonCard = elem.getAsJsonObject();
            deck.addCard(CardFactory.createSpecialCard(jsonCard));
        }

        return deck;
    }
}
