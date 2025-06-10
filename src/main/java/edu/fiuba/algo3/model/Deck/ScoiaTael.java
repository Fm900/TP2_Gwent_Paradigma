package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Score;

public class ScoiaTael extends Deck {
    public ScoiaTael() {
        super("Scoia tael");
        addCard( new Melee("Warrior", new Score(10), "Warrior", new Basic()));
        addCard( new Fog("Fog"));
    }
}
