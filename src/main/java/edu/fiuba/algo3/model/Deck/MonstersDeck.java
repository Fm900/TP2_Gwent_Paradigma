package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Score;

public class MonstersDeck extends Deck {
    public MonstersDeck() {
        super("Monsters");
        addCard( new Melee("Warrior",10, "Warrior", null));
        addCard( new Fog("Fog"));
    }
}
