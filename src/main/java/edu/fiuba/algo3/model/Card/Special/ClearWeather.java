package edu.fiuba.algo3.model.Card.Special;

import edu.fiuba.algo3.model.Board;

public class ClearWeather extends Special {

    public ClearWeather(String name) {
        super("Clear Weather");
    }

    @Override
    public void applyInBoard(Board board) {
        // clear climate in all sections
    }
}
