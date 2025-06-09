package edu.fiuba.algo3.model.Card;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Score;

public abstract class Card {
    private String name;

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
