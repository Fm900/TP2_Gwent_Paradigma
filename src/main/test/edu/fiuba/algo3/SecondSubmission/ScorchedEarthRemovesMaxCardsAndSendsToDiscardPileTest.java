package edu.fiuba.algo3.SecondSubmission;

import edu.fiuba.algo3.model.Board;
import edu.fiuba.algo3.model.Builders.GameBuilder;
import edu.fiuba.algo3.model.Game;
import edu.fiuba.algo3.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class ScorchedEarthRemovesMaxCardsAndSendsToDiscardPileTest {
    private Game game;
    @BeforeEach
    public void setUp() {
        String absolutePath = Paths.get("src/test/resources/json/gwent.json").toAbsolutePath().toString();
        GameBuilder builder = new GameBuilder(absolutePath);
        this.game = builder.buildGame("Alex", "mazo_jugador_uno", "Felix", "mazo_jugador_dos");
    }

    @Test
    public void testScorchedEarthRemovesMaxCardsAndSendsToDiscardPile() {
        Player player1 = this.game.getPlayer1();
        Player player2 = this.game.getPlayer2();
        Board board = this.game.getBoard();

        
    }
}
