package edu.fiuba.algo3.model.Card.Unit;


import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Unit extends Card {

    private String type;
    private Score score;
    private Modifier modifier;

    public Unit(String name, Score score, String type, Modifier modifier) {
        super(name);
        this.type = type;
        this.score = score;
        this.modifier = modifier;
    }
    public Score getScore(){
        return score;
    }

    public void reducePointsTo(Score scoreReduce) {
        score.subtract(scoreReduce);
    }

    public boolean compareType(Unit otherUnit){
        return otherUnit.sameType(type);
    }

    public boolean sameType(String otherType){
        return Objects.equals(otherType, type);
    }

}
