package edu.fiuba.algo3.model;



import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;
import edu.fiuba.algo3.model.Card.Unit.Unit;

import java.util.ArrayList;
import java.util.List;





public class Section {
    private SectionAvailable sectionAvailable;
    private List<Unit> unitCards;


    public Section(SectionAvailable sectionAvailable) {
        this.sectionAvailable = sectionAvailable;
        this.unitCards = new ArrayList<>();
    }


    public void addCard(Unit card) {
        unitCards.add(card);
    }


    public SectionAvailable getType(){
        return sectionAvailable;
    }

    public void applyClimateEffect(){
        for (Unit unit : unitCards) {
            unit.reducePointsTo(1);
        }
    }


    public int getScore() {
        int points = 0;
        for (Unit unit : unitCards) {
            points = unit.getPoints();
        }
        return points;
    }
}
