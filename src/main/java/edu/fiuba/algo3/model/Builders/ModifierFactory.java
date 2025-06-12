package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.Modifier.*;

public class ModifierFactory {
    public static Modifier create(String type) {
        switch (type) {
            case "Legendaria": return new Legend();
            case "Medico": return new Medic();
            case "Agil": return new Agile();
            case "Carta Unida": return new Bonded();
            case "Espia": return new Spy();
            case "Suma base": return new AddBaseValue();
            default: throw new IllegalArgumentException("Modifier desconocido: " + type);
        }
    }
}
