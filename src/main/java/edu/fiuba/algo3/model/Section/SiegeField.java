package edu.fiuba.algo3.model.Section;


import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.Card.Unit.Unit;

public class SiegeField extends Section {
    @Override
    public void addCard(Unit newUnit) {
        if (!(newUnit instanceof Siege)) {
            throw new IllegalArgumentException("Solo se pueden agregar unidades de asedio");
        }
        super.addCard(newUnit);
    }

}
