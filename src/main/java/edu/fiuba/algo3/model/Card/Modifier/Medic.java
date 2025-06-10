package edu.fiuba.algo3.model.Card.Modifier;

import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.List;

public class Medic implements Modifier{
    @Override
    public List<Unit> apply(List<Unit> unitCards, Unit unit) {
        return List.of();
    }
}
