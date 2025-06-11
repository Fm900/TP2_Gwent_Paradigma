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
            JsonArray array = JsonParser.parseReader(new FileReader(filePath)).getAsJsonArray();
            for (JsonElement elem : array) {
                JsonObject json = elem.getAsJsonObject();
                Card card = CardFactory.createCard(json);
                cards.add(card);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cards;
    }
}