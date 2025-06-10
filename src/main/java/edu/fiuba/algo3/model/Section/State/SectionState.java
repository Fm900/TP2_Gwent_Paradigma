package edu.fiuba.algo3.model.Section.State;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import java.util.List;

public interface SectionState {
    void applyEffectToUnitCards(List<Unit> unitCards);
}
