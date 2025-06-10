package edu.fiuba.algo3.SecondSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Special.Weather.ClearClimate;
import edu.fiuba.algo3.model.Card.Special.Weather.Fog;
import edu.fiuba.algo3.model.Card.Special.Weather.Snow;
import edu.fiuba.algo3.model.Card.Special.Weather.TorrentialRain;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Range;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.Deck.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


        Snow snow = new Snow("Snow");
        Fog fog = new Fog("Fog");
        TorrentialRain torrentialRain = new TorrentialRain("TorrentialRain");
        ClearClimate clearClimate = new ClearClimate("clear climate");

        hand1.addCard(arachas);
        hand1.addCard(fog);
        hand1.addCard(torrentialRain);

        hand2.addCard(albrich);
        hand2.addCard(ballista);
        hand2.addCard(snow);


        player1.playCard(0, board); // play melee card "arachas"
        player2.playCard(0, board); // play range card "albrich"
        player1.playCard(0, board); // play fog
        player2.playCard(0, board); // play ballista
        player1.playCard(0, board); // play torrential rain
        player2.playCard(0, board); // play snow


        assertTrue(new Score(1).equals(board.getPlayerScore(player1)));
        assertTrue(new Score(2).equals(board.getPlayerScore(player2)));


        hand1.addCard(clearClimate);
        player1.playCard(0, board); // play clear effect


        assertTrue(new Score(4).equals(board.getPlayerScore(player1)));
        assertTrue(new Score(9).equals(board.getPlayerScore(player2)));




    }






}
