package edu.fiuba.algo3.model.Section;


import edu.fiuba.algo3.model.Card.Unit.Range;
import edu.fiuba.algo3.model.Card.Unit.Unit;

public class RangeField extends Section{

    @Override
    public void addCard(Unit newUnit) {
        if (!(newUnit instanceof Range)) {
            throw new IllegalArgumentException("Solo se pueden agregar unidades a distancia");
        }
        super.addCard(newUnit);
    }


}
