package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;

public class Fog extends Special{

    public Fog(String name) {
        super(name);
    }

    @Override
    public void applyInBoard(Board board) {
        board.climateEffect(SectionAvailable.RANGE);
    }

}
