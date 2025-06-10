package edu.fiuba.algo3.model.Card.Special.Weather;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

public class Snow extends Climate {

    public Snow(String name) {
        super(name);
    }

    @Override
    protected void applyClimateEffectTo(PlayerField field) {
        field.getMeleeSection().applyClimateEffect();
    }


}
