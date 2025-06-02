package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Card;

public abstract class Special extends Card {

    public Special(String name) {
        super(name, 0);
    }

    public abstract void applyInBoard(Board board);
}
