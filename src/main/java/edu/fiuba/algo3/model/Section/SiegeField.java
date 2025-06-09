package edu.fiuba.algo3.model.Section;

import edu.fiuba.algo3.model.Card.Unit.Unit;

public class SiegeField extends Section {


    @Override
    public void accept(Unit unit) {
        unit.playInSection(this);
    }

}
