package edu.fiuba.algo3.model.Card.Modifier;

import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.List;

public class Bonded implements Modifier{


    @Override
    public List<Unit> apply(List<Unit> unitCards, Unit unit) {
        for (Unit u: unitCards){
            if (u.compareType(unit)){
                u.duplicateScore();
                unit.duplicateScore();
            }
        }
        return unitCards;
    }
}
