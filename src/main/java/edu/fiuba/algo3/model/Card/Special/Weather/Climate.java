package edu.fiuba.algo3.model.Card.Special.Weather;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

public abstract class Climate extends Special {


    public Climate(String name){
        super(name);
    }

    @Override
    public void applyInBoard(Board board) {
        for (PlayerField field : board.getAllPlayerFields()) {
            applyClimateEffectTo(field);
        }

    }

    protected abstract void applyClimateEffectTo(PlayerField field);

}
