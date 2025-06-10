package edu.fiuba.algo3.model.Deck;

import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Score;

public class MonstersDeck extends Deck {
    public MonstersDeck() {
        super("Monsters");
        addCard( new Melee("Warrior", new Score(10), "Warrior", new Basic()));
        addCard( new Fog("Fog"));
    }
}
