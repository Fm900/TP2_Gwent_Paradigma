package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Special.Fog;
import edu.fiuba.algo3.model.Card.Special.Snow;
import edu.fiuba.algo3.model.Card.Special.TorrentialRain;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Range;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class test07VerifyingWeatherCardAfecctsCorrespondingCardScore {

    private Deck deck;
    private Player player1;
    private Player player2;
    private Board board;

@BeforeEach
void setUp() {
     board = new Board();
     deck = new Deck();
     Hand hand = new Hand();
     DiscardPile discardPile = new DiscardPile();
     player1 = new Player(deck, hand, discardPile, 0, "Juan");
     player2 = new Player(deck, hand, discardPile, 1, "Valentin");
}



@Test
public void usingSnowSpecialCard(){

    Melee arachas = new Melee("Arachas", 4);
    Melee cyclops = new Melee("Cyclops", 11);
    Snow snow = new Snow("Snow");

    deck.addCard(arachas);
    deck.addCard(cyclops);
    deck.addCard(snow);


    player1.drawCard();
    player1.playCard(0, board);

    player2.drawCard();
    player2.playCard(0, board);

    player1.drawCard();
    player1.playCard(0, board);




    assertEquals(1, board.getPlayerScore(0));
    assertEquals(1, board.getPlayerScore(1));

}



@Test
public void usingFogSpecialCard(){

    Range albrich = new Range("Albrich", 4);
    Range dethmold = new Range("Dethmold", 11);
    Fog fog = new Fog("Fog");

    deck.addCard(albrich);
    deck.addCard(dethmold);
    deck.addCard(fog);


    player1.drawCard();
    player1.playCard(0, board);

    player2.drawCard();
    player2.playCard(0, board);

    player1.drawCard();
    player1.playCard(0, board);


    assertEquals(1, board.getPlayerScore(0));
    assertEquals(1, board.getPlayerScore(1));

}



@Test
public void usingTorrentialRainSpecialCard(){

    Siege ballista = new Siege("Ballista", 6);
    Siege catapult = new Siege("Catapult", 8);
    TorrentialRain torrentialRain = new TorrentialRain("TorrentialRain");


    deck.addCard(ballista);
    deck.addCard(catapult);
    deck.addCard(torrentialRain);


    player1.drawCard();
    player1.playCard(0, board);

    player2.drawCard();
    player2.playCard(0, board);

    player1.drawCard();
    player1.playCard(0, board);


    assertEquals(1, board.getPlayerScore(0));
    assertEquals(1, board.getPlayerScore(1));

}

}
