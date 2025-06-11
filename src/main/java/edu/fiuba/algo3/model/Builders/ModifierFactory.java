package edu.fiuba.algo3.model.Builders;

import edu.fiuba.algo3.model.Card.Modifier.*;

public class ModifierFactory {
    public static Modifier create(String type) {
        switch (type) {
            case "Legend": return new Legend();
            case "Medic": return new Medic();
            case "Agile": return new Agile();
            case "Bonded": return new Bonded();
            case "Spy": return new Spy();
            case "AddBaseValue": return new AddBaseValue();
            default: throw new IllegalArgumentException("Modifier desconocido: " + type);
        }
    }
}
