package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Special.Weather.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Score;

public class NorthernRealms extends Deck {
    public NorthernRealms() {
        super("Northern Realms");
        addCard( new Melee("Warrior",10, "Warrior", null));
        addCard( new Fog("Fog"));
    }
}
