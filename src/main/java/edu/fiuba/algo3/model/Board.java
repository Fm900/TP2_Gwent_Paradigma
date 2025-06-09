package edu.fiuba.algo3.model;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Section.PlayerField;
import edu.fiuba.algo3.model.Section.Section;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {

    private PlayerField playerField1 = new PlayerField();
    private PlayerField playerField2 = new PlayerField();
    private HashMap<Player, PlayerField> playerFields;

    public Board(Player player1, Player player2) {


        playerFields = new HashMap<>();

        playerFields.put(player1, playerField1);
        playerFields.put(player2, playerField2);

    }



    public void addCardToPlayerField(Unit card, Player player) {
        PlayerField playerField = getPlayerField(player);
        playerField.addCardInSection(card);
    }


    public Score getPlayerScore(Player player) {
        PlayerField playerField = getPlayerField(player);
        return  playerField.getSectionsScore();
    }

    public List<Section> getSections(Player player) {
        PlayerField playerField = getPlayerField(player);
        return playerField.getAllSections();
    }

    private PlayerField getPlayerField(Player player) {
        return playerFields.get(player);
    }

}