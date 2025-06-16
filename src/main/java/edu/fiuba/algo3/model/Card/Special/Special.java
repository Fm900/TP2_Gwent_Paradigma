package edu.fiuba.algo3.model.Card.Special;


import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Player;

public abstract class Special extends Card {
    protected Player owner;
    private String name;
    private String despcription;

    public Special(String name) {
        super(name);
    }

    public abstract void applyInBoard(Board board);
    public void addOwner(Player owner) { this.owner = owner;}

    //MVC
    public String getName() { return name; }
    public String getDespcription() { return despcription; }
}
