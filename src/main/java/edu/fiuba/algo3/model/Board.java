package edu.fiuba.algo3.model;

import edu.fiuba.algo3.model.Card.Unit.SectionAvailable;
import edu.fiuba.algo3.model.Card.Unit.Unit;



import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Section>> playerSections;

    public Board() {

        this.playerSections = new ArrayList<>();
        playerSections.add(createSections());
        playerSections.add(createSections());

    }


    private List<Section> createSections() {



    }

    public void climateEffect(SectionAvailable sectionType) {

    }


    public void addCardToSection(Unit card, Player player) {



    }


    public int getPlayerScore(int playerId) {

    }

    public List<Section> getSections(int id){
        return playerSections.get(id);
    }

}