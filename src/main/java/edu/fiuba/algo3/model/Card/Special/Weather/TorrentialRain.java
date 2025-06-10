package edu.fiuba.algo3.model.Card.Special.Weather;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

public class TorrentialRain extends Climate {


    public TorrentialRain(String name) {
        super(name);
    }

    @Override
    protected void applyClimateEffectTo(PlayerField field) {
        field.getSiegeSection().applyClimateEffect();
    }


}
