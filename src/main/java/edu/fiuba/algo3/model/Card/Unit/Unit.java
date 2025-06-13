package edu.fiuba.algo3.model.Card.Unit;


import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Score;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Unit extends Card {
    protected int baseScore;
    protected int score;
    protected String type;
    protected Modifier modifier;

    public Unit(String name, int score, String type, Modifier modifier) {
        super(name);
        this.baseScore = score;
        this.score = score;
        this.type = type;
        this.modifier = modifier;
    }

    public int getScore(){
        return score;
    }

    public void reduceScore(int scoreReduce) {
        score -= scoreReduce;
    }

    public void addScore(int scoreAdd) {
        score += scoreAdd;
    }

    public void duplicateScore(){
        score = score * 2;
    }

    public boolean compareType(Unit otherUnit){
        return otherUnit.sameType(type);
    }

    public boolean sameType(String otherType){
        return Objects.equals(otherType, type);
    }

    public abstract void playIn(PlayerField playerField);

    public Modifier getModifier() {
        return modifier;
    }

    public void reducePointsToOne(){
        score = 1;
    }

    public void applyBasePoints(){
        score = baseScore;
    }
}

