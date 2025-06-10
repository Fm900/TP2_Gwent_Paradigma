package edu.fiuba.algo3.model.Section;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Score;

import java.util.ArrayList;
import java.util.List;

public abstract class Section {

    private List<Unit> unitCards;
    private List<Unit> bondedCards;

    public Section() {
        this.unitCards = new ArrayList<>();
    }

    public void addCard(Unit newUnit) {
        unitCards.add(newUnit);
        Modifier modifier = newUnit.getModifier();
        unitCards = modifier.apply(unitCards);
    }

    public void applyClimateEffect(){
        for (Unit unit : unitCards) {
            unit.reduceScore(1);
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
