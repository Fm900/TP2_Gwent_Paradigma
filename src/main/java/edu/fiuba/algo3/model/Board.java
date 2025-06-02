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

        List<Section> sections = new ArrayList<>();

        sections.add(new Section(SectionAvailable.MELEE));
        sections.add(new Section(SectionAvailable.RANGE));
        sections.add(new Section(SectionAvailable.SIEGE));
        return sections;

    }

    public void climateEffect(SectionAvailable sectionType) {
        for (List<Section> sections : playerSections) {
            for (Section sectionPlayer : sections) {
                if (sectionPlayer.getType() == sectionType){
                    sectionPlayer.applyClimateEffect();
                }
            }
        }
    }


    public void addCardToSection(Unit card, Player player) {

        int playerid = player.getId();
        List<Section> sections = playerSections.get(playerid);

        for (Section section : sections) {
            if (section.getType() == card.getSection()) {
                section.addCard(card);
                return;
            }
        }

    }


    public int getPlayerScore(int playerId) {
        int total = 0;
        for (Section section : playerSections.get(playerId)) {
            total += section.getScore();
        }
        return total;
    }



}
