package edu.fiuba.algo3.model.Card.Special;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;
import org.jetbrains.annotations.NotNull;

public class MoraleBoost extends Special {

    public MoraleBoost(String name) {
        super(name);
    }

    public void applyInBoard(@NotNull Board board, String sectionName){
        for (PlayerField field : board.getAllPlayerFields()){
            if(field.isThePlayerField(owner)){
                field.applyMoraleBoostToSection(sectionName);
            }
        }
    }

    @Override
    public void applyInBoard(Board board) {
        throw new UnsupportedOperationException("MoraleBoost requiere una sección para aplicarse.");
    }

}