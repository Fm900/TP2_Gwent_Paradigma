package edu.fiuba.algo3.SecondSubmission;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.Card.Special.*;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.Player;
import edu.fiuba.algo3.model.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScorchedEarthRemovesMaxCardsAndSendsToDiscardPileTest {

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
        player1 = new Player(deck, hand1, new DiscardPile(), "Franco");
        player2 = new Player(deck, hand2, new DiscardPile(), "Valentin");
        board = new Board(player1, player2);
    }


    @Test
    public void testScorchedEarthRemovesMaxCardsAndSendsToDiscardPile() {
        Melee arachas = new Melee("Arachas", 4, "Melee", new Basic());
        Melee prince = new Melee("Prince", 10, "Melee", new Basic());
        Siege cyclops = new Siege("Cyclops", 11, "Siege", new Basic());
        ScorchedEarth scorchedEarth = new ScorchedEarth("fuego");

        hand1.addCard(arachas);
        hand1.addCard(prince);
        hand1.addCard(scorchedEarth);
        hand2.addCard(cyclops);

        player1.playCard(0, board,"");
        player1.playCard(0, board,"");
        player2.playCard(0, board,"");

        Score scorePlayer1 = board.getPlayerScore(player1);
        Score scorePlayer2 = board.getPlayerScore(player2);

        assertTrue(new Score(14).equals(scorePlayer1), new String("El score del jugador uno debe ser 14"));
        assertTrue(new Score(11).equals(scorePlayer2), new String("El score del jugador uno de 11"));

        player1.playCard(0, board,"");

        scorePlayer1 = board.getPlayerScore(player1);
        scorePlayer2 = board.getPlayerScore(player2);

        assertTrue(new Score(14).equals(scorePlayer1), new String("El socore debe ser 14 y es " + scorePlayer1.getValue()));//deberia dar 14 pero da 0
        assertTrue(new Score(0).equals(scorePlayer2), new String("El socore debe ser 0"));
    }
}
