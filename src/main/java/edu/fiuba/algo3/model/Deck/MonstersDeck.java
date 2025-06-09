package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;

public class MonstersDeck extends Deck {
    public MonstersDeck() {
        super("Monsters");
        addCard( new Melee("Warrior", 10, "Warrior"));
        addCard( new Fog("Fog"));
    }
}
