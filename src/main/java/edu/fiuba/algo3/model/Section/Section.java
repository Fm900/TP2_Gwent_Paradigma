package edu.fiuba.algo3.model.Section;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Score;
import edu.fiuba.algo3.model.Section.State.ClimateState;
import edu.fiuba.algo3.model.Section.State.NormalState;
import edu.fiuba.algo3.model.Section.State.SectionState;

import java.util.ArrayList;
import java.util.List;

public abstract class Section {

    private List<Unit> unitCards;
    private List<Unit> bondedCards;
    private SectionState state = new NormalState();


    public Section() {
        this.unitCards = new ArrayList<>();
    }

    public void addCard(Unit newUnit) {
        unitCards.add(newUnit);
        Modifier modifier = newUnit.getModifier();
        unitCards = modifier.apply(unitCards, newUnit);
    }




    public void setState(SectionState newState) {
        this.state = newState;
        this.state.applyEffectToUnitCards(unitCards);
    }

    public void applyClimateEffect() {
        setState(new ClimateState());
    }

    public void clearClimateEffect() {
        setState(new NormalState());
    }

    public Score getScore() {
        Score score = new Score(0);
        for (Unit unit : unitCards) {
            score = score.add(unit.getScore());
        }
        return score;
    }

}
