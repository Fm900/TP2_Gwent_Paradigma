package edu.fiuba.algo3.model.Card.Special.Weather;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Special.Special;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;

import java.util.List;

public class Climate extends Special {

    private List<Class<? extends Section>> affectedSections;

    public Climate(String name, List<Class<? extends Section>> affectedSections) {
        super(name);
        this.affectedSections = affectedSections;
    }

    @Override
    public void applyInBoard(Board board) {
        for (PlayerField field : board.getAllPlayerFields()) {
            applyClimateEffectTo(field);
        }
    }

    protected void applyClimateEffectTo(PlayerField field) {
        for (Section section : field.getAllSections()) {
            if (isAffectedSection(section)) {
                section.applyClimateEffect();
            }
        }
    }

    private boolean isAffectedSection(Section section) {
        for (Class<? extends Section> cls : affectedSections) {
            if (cls.isInstance(section)) {
                return true;
            }
        }
        return false;
    }
}
