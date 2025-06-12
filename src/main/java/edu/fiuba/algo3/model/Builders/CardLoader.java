package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.*;

import com.google.gson.*;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class CardLoader {

    public static List<Card> loadCards(String filePath) {
        List<Card> cards = new ArrayList<>();
        try {
            JsonObject root = JsonParser.parseReader(new FileReader(filePath)).getAsJsonObject();

            JsonObject deckOne = root.getAsJsonObject("mazo_jugador_uno");
            cards.addAll(loadDeck(deckOne));

            JsonObject deckTwo = root.getAsJsonObject("mazo_jugador_dos");
            cards.addAll(loadDeck(deckTwo));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cards;
    }

    private static List<Card> loadDeck(JsonObject deckJson) {
        List<Card> cards = new ArrayList<>();

        if (deckJson.has("unidades")) {
            JsonArray units = deckJson.getAsJsonArray("unidades");
            for (JsonElement elem : units) {
                JsonObject json = elem.getAsJsonObject();
                cards.add(CardFactory.createUnitCard(json));
            }
        }

        if (deckJson.has("especiales")) {
            JsonArray specials = deckJson.getAsJsonArray("especiales");
            for (JsonElement elem : specials) {
                JsonObject json = elem.getAsJsonObject();
                cards.add(CardFactory.createSpecialCard(json));
            }
        }

        return cards;
    }
}
