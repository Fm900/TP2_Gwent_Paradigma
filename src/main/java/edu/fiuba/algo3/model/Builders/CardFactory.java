package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.*;
import edu.fiuba.algo3.model.Card.Modifier.*;
import edu.fiuba.algo3.model.Card.Special.*;
import edu.fiuba.algo3.model.Card.Special.Weather.*;
import edu.fiuba.algo3.model.Card.Unit.*;
import com.google.gson.JsonObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;

public class CardFactory {

    public static Unit createUnitCard(JsonObject json) {
        String name = json.get("nombre").getAsString();
        int score = json.get("puntos").getAsInt();
        String seccion = json.get("seccion").getAsString();

        String subtype = mapSeccionToSubtype(seccion);

        Modifier modifier = null;
        if (json.has("modificador") && json.get("modificador").isJsonArray()) {
            JsonArray modifiers = json.getAsJsonArray("modificador");
            if (!modifiers.isEmpty()) {
                modifier = ModifierFactory.create(modifiers.get(0).getAsString());
            }
        }

        switch (subtype.toUpperCase()) {
            case "MELEE":
                return new Melee(name, score, subtype, modifier);
            case "RANGE":
                return new Range(name, score, subtype, modifier);
            case "SIEGE":
                return new Siege(name, score, subtype, modifier);
            default:
                throw new IllegalArgumentException("Sección inválida: " + seccion);
        }
    }

    public static Special createSpecialCard(JsonObject json) {
        String name = json.get("nombre").getAsString();
        String tipo = json.get("tipo").getAsString();

        switch (tipo.toLowerCase()) {
            case "morale boost":
                return new MoraleBoost(name);
            case "tierra arrasada":
                return new ScorchedEarth(name);
            case "clima":
                return createClimateCard(name, json.getAsJsonArray("afectado"));
            default:
                throw new IllegalArgumentException("Tipo especial desconocido: " + tipo);
        }
    }

    private static Special createClimateCard(String name, JsonArray affected) {
        List<String> secciones = new ArrayList<>();
        for (JsonElement e : affected) {
            secciones.add(e.getAsString());
        }
        return new Fog(name);
        //Falta comportamiento segun diferentes climas, se deja asi para el compilado
    }

    private static String mapSeccionToSubtype(String seccion) {
        if (seccion.toLowerCase().contains("cuerpo")) return "MELEE";
        if (seccion.toLowerCase().contains("rango")) return "RANGE";
        if (seccion.toLowerCase().contains("asedio")) return "SIEGE";
        throw new IllegalArgumentException("Sección no reconocida: " + seccion);
    }
}

