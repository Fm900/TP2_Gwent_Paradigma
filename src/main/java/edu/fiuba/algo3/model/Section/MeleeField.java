package edu.fiuba.algo3.model.Section;


import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Unit;

public class MeleeField extends Section {
    @Override
    public void addCard(Unit newUnit) {
        if (!(newUnit instanceof Melee)) {
            throw new IllegalArgumentException("Solo se pueden agregar unidades cuerpo a cuerpo");
        }
        super.addCard(newUnit);
    }
}

