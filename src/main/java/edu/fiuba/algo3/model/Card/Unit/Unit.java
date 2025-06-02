package edu.fiuba.algo3.model.Card.Unit;


import edu.fiuba.algo3.model.Card.Card;

public abstract class Unit extends Card {

    protected SectionAvailable section;

    public Unit(String name, int points, SectionAvailable section) {
        super(name, points);
        this.section = section;
    }

    public void reducePointsTo(int pointReduce) {
        setPoints(pointReduce);
    }

    public SectionAvailable getSection(){
        return section;
    }

}
