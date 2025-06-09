package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.RangeField;
import edu.fiuba.algo3.model.Section.Section;

public class Snow extends Climate{

    public Snow(String name) {
        super(name);
    }

    @Override
    protected Section selectedSection(Board board) {
        return null;
    }

}
