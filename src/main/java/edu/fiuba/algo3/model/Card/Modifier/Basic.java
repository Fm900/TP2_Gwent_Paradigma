package edu.fiuba.algo3.model.Card.Modifier;

import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.List;

public class Basic implements Modifier{
    @Override
    public List<Unit> apply(List<Unit> unitCards) {
        return unitCards;
    }
}
