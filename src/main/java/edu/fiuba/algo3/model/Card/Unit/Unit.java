package edu.fiuba.algo3.model.Card.Unit;


import edu.fiuba.algo3.model.Card.Card;

import java.util.Objects;

public abstract class Unit extends Card {

    protected SectionAvailable section;
    private String type;

    public Unit(String name, int points, SectionAvailable section, String type) {
        super(name, points);
        this.section = section;
        this.type = type;
    }

    public void reducePointsTo(int pointReduce) {
        setPoints(pointReduce);
    }

    public SectionAvailable getSection(){
        return section;
    }

    public boolean compareType(Unit otherUnit){
        return otherUnit.sameType(type);
    }

    public boolean sameType(String otherType){
        return Objects.equals(otherType, type);
    }

    public void bondedPoints(){ setPoints(getPoints()*2); }

}
