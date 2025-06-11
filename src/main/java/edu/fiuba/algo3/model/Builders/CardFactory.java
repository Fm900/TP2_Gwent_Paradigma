package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.*;
import edu.fiuba.algo3.model.Card.Modifier.*;
import edu.fiuba.algo3.model.Card.Special.*;
import edu.fiuba.algo3.model.Card.Special.Weather.*;
import edu.fiuba.algo3.model.Card.Unit.*;
import com.google.gson.JsonObject;

public class CardFactory {

    public static Card createCard(JsonObject json) {
        String type = json.get("type").getAsString();

        switch (type) {
            case "Unit":
                return createUnit(json);
            case "Special":
                return createSpecial(json);
            default:
                throw new IllegalArgumentException("Tipo de carta desconocido: " + type);
        }
    }

    private static Unit createUnit(JsonObject json) {
        String name = json.get("name").getAsString();
        int score = json.get("score").getAsInt();
        String subtype = json.get("subtype").getAsString(); // Melee, Range, Siege

        Modifier modifier = null;
        if (json.has("modifier")) {
            String modifierType = json.get("modifier").getAsString();
            modifier = ModifierFactory.create(modifierType);
        }

        switch (subtype.toUpperCase()) {
            case "MELEE": return new Melee(name, score, subtype, modifier);
            case "RANGE": return new Range(name, score, subtype, modifier);
            case "SIEGE": return new Siege(name, score, subtype, modifier);
            default:
                throw new IllegalArgumentException("Subtipo de unidad inválido: " + subtype);
        }
    }

    private static Special createSpecial(JsonObject json) {
        String name = json.get("name").getAsString();
        switch (name) {
            case "Scorched Earth":
                return new ScorchedEarth(name);
            case "Morale Boost":
                return new MoraleBoost(name);
            case "Climate":
                String subtype = json.get("subtype").getAsString(); // Por ejemplo: "Fog"
                switch (subtype) {
                    case "Fog": return new Fog(name);
                    case "Snow": return new Snow(name);
                    case "TorrentialRain": return new TorrentialRain(name);
                    default: throw new IllegalArgumentException("Subtipo de Climate desconocido: " + subtype);
                }
             case "Clear Climate":
                 return new ClearClimate(name);
            default:
                throw new IllegalArgumentException("Special no reconocida: " + name);
        }
    }
}
