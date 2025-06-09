package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.MeleeField;
import edu.fiuba.algo3.model.Section.Section;

public class Fog extends Climate{


    public Fog(String name) {
        super(name);
    }

    @Override
    protected Section selectedSection(Board board) {
        return null;
    }


}
