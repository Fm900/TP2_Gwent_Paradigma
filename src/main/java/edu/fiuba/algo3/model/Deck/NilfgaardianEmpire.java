package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;

public class NilfgaardianEmpire extends Deck {
    public NilfgaardianEmpire() {
        super("Nilfgaardian Empire");
        addCard( new Melee("Warrior", 10, "Warrior"));
        addCard( new Fog("Fog"));
    }
}
