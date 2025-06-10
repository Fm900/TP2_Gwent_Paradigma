package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.*;
import edu.fiuba.algo3.model.Card.Unit.*;
import edu.fiuba.algo3.model.Card.Special.*;
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
        String deck = json.get("deck").getAsString();
        int score = json.get("score").getAsInt();
        String sectionStr = json.get("section").getAsString();

        Unit unit;
        switch (sectionStr.toUpperCase()) {
            case "MELEE": unit = new Melee(name, score, deck, sectionStr); break;
            case "RANGE": unit = new Range(name, score, deck, sectionStr); break;
            case "SIEGE": unit = new Siege(name, score, deck, sectionStr); break;
            default:
                throw new IllegalArgumentException("Sección inválida: " + sectionStr);
        }

        //suponiendo que el json no tiene siempre el atributo modifier.

        if (json.has("modifier")) {
            String modifierType = json.get("modifier").getAsString();
            Modifier modifier = createModifier(modifierType);
            unit.setModifier(modifier);
        }

        return unit;
    }

    private static Special createSpecial(JsonObject json) {
        String name = json.get("name").getAsString();
        switch (name) {
            case "Scorched Earth":
                return new ScorchedEarth(name);
            case "Morale Boost":
                return new MoraleBoost(name);
            case "Climate":
                return new Climate(name);
            default:
                throw new IllegalArgumentException("Special no reconocida: " + name);
        }
    }

    private static Modifier createModifier(String modifierType) {
        switch (modifierType) {
            case "Legendary": return new Legendary();
            case "Doctor": return new Doctor();
            case "Agile": return new Agile();
            default: throw new IllegalArgumentException("Modifier desconocido: " + modifierType);
        }
    }
}
