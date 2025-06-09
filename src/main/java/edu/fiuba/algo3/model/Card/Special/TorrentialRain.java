package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.Section;
import edu.fiuba.algo3.model.Section.SiegeField;

public class TorrentialRain extends Climate{


    public TorrentialRain(String name) {
        super(name);
    }

    @Override
    protected Section selectedSection(Board board) {
        return null;
    }


}
