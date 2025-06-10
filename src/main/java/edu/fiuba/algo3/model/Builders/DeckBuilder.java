package edu.fiuba.algo3.model.Builders;


import edu.fiuba.algo3.model.Deck.*;
import org.jetbrains.annotations.NotNull;

public class DeckBuilder {
    public Deck buildDeck(@NotNull String deckName){
        Deck deck = null;
        if(deckName.equals("Monsters")){
           deck = new MonstersDeck();
        }
        if(deckName.equals("Nilfgaardian Empire")){
            deck = new NilfgaardianEmpire();
        }
        if(deckName.equals("Northern Realms")){
            deck = new NorthernRealms();
        }
        if(deckName.equals("Scoia tael")){
            deck = new ScoiaTael();
        }
        return deck;
    }

}
