package edu.fiuba.algo3.FirstSubmission;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.model.Card.Modifier.Basic;
import edu.fiuba.algo3.model.Card.Special.Weather.Climate;
import edu.fiuba.algo3.model.Card.Unit.Melee;
import edu.fiuba.algo3.model.Card.Unit.Siege;
import edu.fiuba.algo3.model.CardsContainer.DiscardPile;
import edu.fiuba.algo3.model.CardsContainer.Hand;
import edu.fiuba.algo3.model.CardsContainer.Deck;
import edu.fiuba.algo3.model.Section.MeleeField;

import java.util.ArrayList;
import java.util.List;
import edu.fiuba.algo3.model.Section.RangeField;
import edu.fiuba.algo3.model.Section.Section;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UsingWeatherCards {

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
    public void usingClimateSpecialCard() {

        Melee arachas = new Melee("Arachas", 4, "Warrior", new Basic());
        Siege cyclops = new Siege("Cyclops", 11, "Warrr", new Basic());
        List<Class<? extends Section>> secciones = new ArrayList<>();
        secciones.add(MeleeField.class);
        secciones.add(RangeField.class);
        Climate climate = new Climate("rain", secciones);

        hand1.addCard(arachas);
        hand2.addCard(cyclops);

        player1.playCard(0, board,"");
        player2.playCard(0, board,"");


        hand1.addCard(climate);
        player1.playCard(0, board,"");


        Score scorePlayer1 = board.getPlayerScore(player1);
        Score scorePlayer2 = board.getPlayerScore(player2);

        assertTrue(new Score(1).equals(scorePlayer1));
        assertTrue(new Score(11).equals(scorePlayer2));

    }

}