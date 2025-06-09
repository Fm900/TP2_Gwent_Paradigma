package edu.fiuba.algo3.model.Card.Unit;

import edu.fiuba.algo3.model.Card.Modifier.Modifier;

public class Range extends Unit{


    public Range(String name, int points, String type, Modifier modifier) {
        super(name, points, SectionAvailable.RANGE, type, modifier);
    }


}
