package edu.fiuba.algo3.model.Card.Unit;

import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Score;
import edu.fiuba.algo3.model.Section.PlayerField;

public class Melee extends Unit {


    public Melee(String name, Score score, String type, Modifier modifier) {
        super(name, score, type, modifier);
    }

    @Override
    public void playIn(PlayerField playerField) {
        playerField.getMeleeSection().addCard(this);
    }

}

