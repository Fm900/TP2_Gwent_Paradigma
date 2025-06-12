package edu.fiuba.algo3.model.Builders;

import com.google.gson.*;
import java.io.FileReader;
import java.io.IOException;

import edu.fiuba.algo3.model.CardsContainer.Deck;

public class DeckBuilder {

    private final JsonObject deckJson;

    public DeckBuilder(String filePath) {
        try {
            JsonObject json = JsonParser.parseReader(new FileReader(filePath)).getAsJsonObject();
            this.deckJson = json;
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar JSON: " + filePath, e);
        }
    }

    public Deck buildDeck(String deckKey) {
        if (!deckJson.has(deckKey)) {
            throw new IllegalArgumentException("No existe el mazo: " + deckKey);
        }
        return DeckLoader.loadDeck(deckJson.getAsJsonObject(deckKey), deckKey);
    }
}
