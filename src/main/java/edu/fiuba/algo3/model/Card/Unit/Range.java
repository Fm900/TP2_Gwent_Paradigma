package edu.fiuba.algo3.model.Card.Unit;

import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Score;
import edu.fiuba.algo3.model.Section.PlayerField;

public class Range extends Unit{


    public Range(String name, int score, String type, Modifier modifier) {
        super(name, score, type, modifier);
    }

    @Override
    public void playIn(PlayerField playerField) {
        playerField.getRangeSection().addCard(this);
    }
}
