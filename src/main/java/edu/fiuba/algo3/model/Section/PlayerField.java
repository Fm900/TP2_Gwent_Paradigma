package edu.fiuba.algo3.model.Section;

import edu.fiuba.algo3.model.Card.Card;
import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Player;
import edu.fiuba.algo3.model.Score;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PlayerField {
    private Player player;
    private MeleeField meleeField;
    private RangeField rangeField;
    private SiegeField siegeField;


    public PlayerField(Player player) {
        this.player = player;
        this.meleeField = new MeleeField();
        this.rangeField = new RangeField();
        this.siegeField = new SiegeField();

    }

    public List<Section>  getAllSections(){
        List<Section> allSections = new ArrayList<>();
        allSections.add(this.meleeField);
        allSections.add(this.rangeField);
        allSections.add(this.siegeField);

        return allSections;
    }

    public MeleeField getMeleeSection() {
        return meleeField;
    }

    public RangeField getRangeSection() {
        return rangeField;
    }

    public SiegeField getSiegeSection() {
        return siegeField;
    }

    public void addCardInSection(@NotNull Unit unit){
        unit.playIn(this);
    }

    public Score getSectionsScore(){

        List<Section> sections = getAllSections();
        Score totalScore = new Score(0);

        for (Section section : sections) {
            totalScore = totalScore.addScore(section.getScore());
        }


        return totalScore;
    }









    public void applyMoraleBoostToSection(@NotNull String sectionName) {
        Section section;
        if (sectionName.equalsIgnoreCase("melee")) {
            section = meleeField;
        } else if (sectionName.equalsIgnoreCase("range")) {
            section = rangeField;
        } else if (sectionName.equalsIgnoreCase("siege")) {
            section = siegeField;
        } else {
            throw new IllegalArgumentException("Sección inválida: " + sectionName);
        }
        section.applyMoraleBoostEffect();
    }
    public Boolean isThePlayerField(Player player) {return player == this.player;}

    public void discardCards(@NotNull List<Card> cards) {
        cards.forEach(card -> this.player.addToDiscardPile(card));
    }


}

