package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;

public class ScoiaTael extends Deck {
    public ScoiaTael() {
        super("Scoia tael");
        addCard( new Melee("Warrior", 10, "Warrior"));
        addCard( new Fog("Fog"));
    }
}
