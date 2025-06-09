package edu.fiuba.algo3.model.Section;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import java.util.ArrayList;
import java.util.List;

public abstract class Section implements acceptCard{

    private List<Unit> unitCards;

    public Section() {
        this.unitCards = new ArrayList<>();
    }

    public void addCard(Unit newUnit) {

        for (Unit u : unitCards) {
            if (u.compareType(newUnit)) {
                newUnit.bondCard(u);
                u.bondCard(newUnit);
                break;
            }
        }

        unitCards.add(newUnit);
    }


    public void applyClimateEffect(){
        for (Unit unit : unitCards) {
            unit.reducePointsTo(1);
        }
    }

    public int getScore() {
        int points = 0;
        for (Unit unit : unitCards) {
            points = points + unit.getPoints();
        }
        return points;
    }

}
