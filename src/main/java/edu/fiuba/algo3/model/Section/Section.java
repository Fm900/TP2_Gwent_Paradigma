package edu.fiuba.algo3.model.Section;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Score;

import java.util.ArrayList;
import java.util.List;

public abstract class Section implements acceptCard{

    private List<Unit> unitCards;

    public Section() {
        this.unitCards = new ArrayList<>();
    }

    public void addCard(Unit newUnit) {
        unitCards.add(newUnit);
    }


    public void applyClimateEffect(){
        for (Unit unit : unitCards) {
            unit.reducePointsTo(new Score(1));
        }
    }

    public Score getScore() {
        Score score = new Score(0);
        for (Unit unit : unitCards) {
            score = score.add(unit.getScore());
        }
        return score;
    }

}
