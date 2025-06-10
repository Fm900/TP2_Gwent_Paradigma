package edu.fiuba.algo3.model.Section.State;


import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.List;

public class NormalState implements SectionState {
    @Override
    public void applyEffectToUnitCards(List<Unit> unitCards) {
        for (Unit unit : unitCards) {
            unit.applyBasePoints();
        }
    }
}
