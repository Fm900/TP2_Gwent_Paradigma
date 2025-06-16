package edu.fiuba.algo3.views.game;

import edu.fiuba.algo3.views.general.ButtonView;
import edu.fiuba.algo3.views.general.GeneralScene;
import edu.fiuba.algo3.views.menu.MenuScene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InfoScene extends GeneralScene {
    ButtonView exitButton;
    Label rulesTitle;
    Label rulesText;
    Label infoTitle;
    Label infoText;
    VBox mainVBox;
    HBox mainHBox;
    Region spacerRegion;

    Region leftMargin;
    Region rightMargin;

    public InfoScene(Stage stage) {
        super(stage);
    }

    @Override
    protected void createControllers(Stage stage) {
        exitButton.setOnMouseClicked(e -> stage.setScene(new MenuScene(stage).getScene()));
    }

    @Override
    protected Pane createLayout() {
        AnchorPane root = new AnchorPane();

        rulesTitle = new Label("Rules");
        rulesText = new Label(
                "Gwent is a strategic card game played over three rounds.\n\n"
                        + "- Each player starts with a hand of cards and must use them wisely across all rounds.\n"
                        + "- To win a round, a player must have a higher total strength on the board when both players pass.\n"
                        + "- Most cards belong to a row (melee, ranged, siege) and have a base strength value.\n"
                        + "- Some cards have special abilities: Medics revive discarded cards, Spies are played on the opponent's board to draw more cards, Agile cards can be played in more than one row, and Legendary cards are immune to modifiers.\n"
                        + "- Weather cards and special effects can weaken rows or disrupt strategies.\n"
                        + "- The player who wins two of the three rounds wins the game.\n\n"
                        + "Tip: Card advantage and timing are crucial. Don't waste your best cards too early!"
        );

        spacerRegion = new Region();

        infoTitle = new Label("Information");
        infoText = new Label(
                "This Gwent clone is a student project developed for the subject Programming Paradigms at ITBA.\n"
                        + "It was built using Java and JavaFX, applying OOP and SOLID principles.\n\n"
                        + "Credits: Atuel Fullana, Salvador Mendoza, Brian Conde, Francisco Russo.\n"
                        + "Card design and game inspiration based on CD Projekt RED’s Gwent.\n\n"
                        + "Enjoy the game and may the best strategist win!"
        );

        leftMargin = new Region();
        mainVBox = new VBox(rulesTitle, rulesText, spacerRegion, infoTitle, infoText);
        rightMargin = new Region();

        mainHBox = new HBox(leftMargin, mainVBox, rightMargin);

        exitButton = new ButtonView("X");

        root.getChildren().addAll(mainHBox, exitButton);

        return root;
    }


    @Override
    protected void createStyles() {
        AnchorPane.setTopAnchor(exitButton, 10.0);
        AnchorPane.setRightAnchor(exitButton, 10.0);

        AnchorPane.setTopAnchor(mainHBox, 0.0);
        AnchorPane.setRightAnchor(mainHBox, 0.0);
        AnchorPane.setBottomAnchor(mainHBox, 0.0);
        AnchorPane.setLeftAnchor(mainHBox, 0.0);
        HBox.setHgrow(leftMargin, Priority.ALWAYS);
        HBox.setHgrow(rightMargin, Priority.ALWAYS);

        spacerRegion.setMinHeight(30);
        spacerRegion.setMaxHeight(30);

        infoTitle.setStyle("-fx-text-fill: cyan; -fx-font-size: 25");
        rulesTitle.setStyle("-fx-text-fill: cyan; -fx-font-size: 25");

        infoText.setWrapText(true);
        rulesText.setWrapText(true);
        infoText.setStyle("-fx-text-fill: black; -fx-font-size: 15;");
        rulesText.setStyle("-fx-text-fill: black; -fx-font-size: 15;");
        infoText.setLineSpacing(7);
        rulesText.setLineSpacing(7);

        mainVBox.setSpacing(30);
        mainVBox.setMaxWidth(800);
        mainVBox.setAlignment(Pos.CENTER);

        exitButton.setStyle("-fx-background-color: #4aba91; -fx-font-size: 16; -fx-padding: 10;");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setRadius(5);

        infoTitle.setEffect(dropShadow);
        rulesTitle.setEffect(dropShadow);
    }
}
