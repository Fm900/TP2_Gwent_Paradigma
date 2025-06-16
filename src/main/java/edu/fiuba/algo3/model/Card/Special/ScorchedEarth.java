package edu.fiuba.algo3.model.Card.Special;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Section.PlayerField;
import org.jetbrains.annotations.NotNull;

public class ScorchedEarth extends Special {

    public ScorchedEarth(String name) {
        super(name);
    }

    @Override
    public void applyInBoard(@NotNull Board board) {
        board.aplyScorchedEarthEfect();
    }
}