package edu.fiuba.algo3.model.Section;

import edu.fiuba.algo3.model.Card.Unit.Unit;
import edu.fiuba.algo3.model.Score;

import java.util.ArrayList;
import java.util.List;

public class PlayerField {

    private MeleeField meleeField;
    private RangeField rangeField;
    private SiegeField siegeField;


    public PlayerField() {
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


    public void addCardInSection(Unit unit){
        unit.playIn(this);
    }




    public Score getSectionsScore(){

        List<Section> sections = getAllSections();
        Score totalScore = new Score(0);

        for (Section section : sections) {
            totalScore = totalScore.add(section.getScore());
        }


        return totalScore;
    }





}

