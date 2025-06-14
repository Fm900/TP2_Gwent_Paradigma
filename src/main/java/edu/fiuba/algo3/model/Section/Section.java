package edu.fiuba.algo3.model.Section;
import edu.fiuba.algo3.model.Card.Modifier.Modifier;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Score;
import edu.fiuba.algo3.model.Section.State.*;
import edu.fiuba.algo3.model.Section.State.SectionState;

import java.util.ArrayList;
import java.util.List;

public abstract class Section {

    private List<Unit> unitCards;
    private SectionState state = new NormalState();
    private SectionState boostState = new NormalState();


    public Section() {
        this.unitCards = new ArrayList<>();
    }

    public void addCard(Unit newUnit) {
        unitCards.add(newUnit);
        Modifier modifier = newUnit.getModifier();
        unitCards = modifier.apply(unitCards, newUnit);
    }

    public List<Unit> getUnits() {
        return unitCards;
    }

    public void setState(SectionState newState) {
        this.state = newState;
        this.state.applyEffectToUnitCards(unitCards);
    }

    public void setBoost(SectionState newState) {
        this.boostState = newState;
        this.boostState.applyEffectToUnitCards(unitCards);
    }

    public void applyClimateEffect() { setState(new ClimateState()); }

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

    public void applyMoraleBoostEffect() {
        setBoost(new MoraleBoostState());
    }
    public void clearMoraleBoostEffect() {setBoost(new NormalState());}

    public List<Unit> cardsMaxScore() {
        List<Unit> toRemove  = new ArrayList<>();
        if(unitCards.isEmpty()) return toRemove;
        int max = unitCards.stream().mapToInt(Unit::getScore).filter(unit -> unit >= 0).max().orElse(0);

        for (Unit unit : unitCards) {
            if (unit.getScore() == max){
                toRemove.add(unit);
            }
        }
        return toRemove;
    }
    public void removeUnits(List<Unit> units) {
        unitCards.removeAll(units);
    }
}
