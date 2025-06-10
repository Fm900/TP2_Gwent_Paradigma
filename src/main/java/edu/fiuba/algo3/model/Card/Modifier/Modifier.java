package edu.fiuba.algo3.model.Card.Modifier;

import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.List;

public interface Modifier {
    public List<Unit> apply(List<Unit> unitCards);
}
