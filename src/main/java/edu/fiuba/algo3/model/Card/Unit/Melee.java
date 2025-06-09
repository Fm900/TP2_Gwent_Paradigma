package edu.fiuba.algo3.model.Card.Unit;


import edu.fiuba.algo3.model.Card.Modifier.Modifier;

public class Melee extends Unit {


    public Melee(String name, int points, String type, Modifier modifier) {
        super(name, points, SectionAvailable.MELEE, type, modifier);

    }
    
}
