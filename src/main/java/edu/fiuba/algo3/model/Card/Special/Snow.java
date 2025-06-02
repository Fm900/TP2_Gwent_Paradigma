package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;

public class Snow extends Special{


    public Snow(String name) {
        super(name);
    }

    public void applyInBoard(Board board) {
        board.climateEffect(SectionAvailable.MELEE);
    }

}
