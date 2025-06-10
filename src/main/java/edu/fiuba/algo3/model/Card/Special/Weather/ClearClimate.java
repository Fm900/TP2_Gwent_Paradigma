package edu.fiuba.algo3.model.Card.Special.Weather;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

public class ClearClimate extends Special {

    public ClearClimate(String name) {
        super("Clear Weather");
    }

    @Override
    public void applyInBoard(Board board) {

        for (PlayerField field : board.getAllPlayerFields()) {
            for (Section section : field.getAllSections()) {
                section.clearClimateEffect();
            }
        }
    }
}
