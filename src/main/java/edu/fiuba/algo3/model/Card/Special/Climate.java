package edu.fiuba.algo3.model.Card.Special;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Section.Section;

public abstract class Climate extends Special{


    public Climate(String name){
        super(name);
    }

    @Override
    public void applyInBoard(Board board) {
        Section section = selectedSection(board);
        board.climateEffect(section);
    }

    protected abstract Section selectedSection(Board board);


}
