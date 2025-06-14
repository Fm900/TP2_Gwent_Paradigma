package edu.fiuba.algo3.SecondSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Special.Weather.ClearClimate;
import edu.fiuba.algo3.model.Card.Special.Weather.Climate;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Range;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.Section.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsingClearWeatherCard {

private Hand hand1;
private Hand hand2;
private Deck deck;
private Player player1;
private Player player2;
private Board board;


@BeforeEach
void setUp() {

    deck = new Deck("Monsters");
    hand1 = new Hand();
    hand2 = new Hand();
    DiscardPile discardPile = new DiscardPile();
    player1 = new Player(deck, hand1, discardPile, "Juan");
    player2 = new Player(deck, hand2, discardPile, "Valentin");
    board = new Board(player1, player2);

}


    @Test
    public void clearAllSections(){


        Melee arachas = new Melee("Arachas", 4, "Warrior", new Basic());
        Range albrich = new Range("Albrich", 3, "Warrior", new Basic());
        Siege ballista = new Siege("Ballista", 6, "Warrior", new Basic());
        List<Class<? extends Section>> secciones = new ArrayList<>();
        secciones.add(MeleeField.class);
        secciones.add(RangeField.class);
        secciones.add(SiegeField.class);
        Climate climate = new Climate("rain", secciones);

        ClearClimate clearClimate = new ClearClimate("clear climate");

        hand1.addCard(arachas);
        hand1.addCard(climate);

        hand2.addCard(albrich);
        hand2.addCard(ballista);


        player1.playCard(0, board,""); // play melee card "arachas"
        player2.playCard(0, board,""); // play range card "albrich"
        player2.playCard(0, board,""); // play ballista
        player1.playCard(0, board,""); // play Climate
        //problema, si jugas una carta despues del clima no le aplica el efecto al mismo

        assertTrue(new Score(1).equals(board.getPlayerScore(player1)));
        assertTrue(new Score(2).equals(board.getPlayerScore(player2)));//da 7


        hand1.addCard(clearClimate);
        player1.playCard(0, board,""); // play clear effect


        assertTrue(new Score(4).equals(board.getPlayerScore(player1)));
        assertTrue(new Score(9).equals(board.getPlayerScore(player2)));

    }
}
