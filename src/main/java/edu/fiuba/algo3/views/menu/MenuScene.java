package edu.fiuba.algo3.views.menu;

import edu.fiuba.algo3.views.game.GameScene;
import edu.fiuba.algo3.views.game.InfoScene;
import edu.fiuba.algo3.views.general.ButtonView;
import edu.fiuba.algo3.views.general.GeneralScene;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuScene extends GeneralScene {
    HBox title;
    Button exitButton;
    Button playButton;
    Button rulesButton;
    HBox buttonContainer;
    VBox centerColumn;
    Region leftMargin;
    Region rightMargin;
    HBox mainHBox;
    VBox mainVBox;

    public MenuScene(Stage stage) {
        super(stage);
    }

    @Override
    protected void createControllers(Stage stage) {
        playButton.setOnMouseClicked(e -> stage.setScene(new GameScene(stage).getScene()));
        exitButton.setOnMouseClicked(e -> stage.close());
        rulesButton.setOnMouseClicked(e -> stage.setScene(new InfoScene(stage).getScene()));
    }

    @Override
    protected Pane createLayout() {
        root = new AnchorPane();

        title = new TitleView("Gwent - The Whitcher");

        rulesButton = new ButtonView("Info");
        playButton = new ButtonView("Play");
        exitButton = new ButtonView("Exit");
        buttonContainer = new HBox(rulesButton, playButton, exitButton);

        centerColumn = new VBox(title, buttonContainer);

        leftMargin = new Region();
        rightMargin = new Region();
        mainHBox = new HBox(leftMargin, centerColumn, rightMargin);

        mainVBox = new VBox( mainHBox);

        root.getChildren().addAll(mainVBox);

        return root;
    }

    @Override
    protected void createStyles() {

        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setSpacing(50);

        centerColumn.setAlignment(Pos.CENTER);
        centerColumn.getChildren().addAll();
        centerColumn.prefHeightProperty().bind(root.heightProperty());
        centerColumn.setMaxWidth(600);
        centerColumn.setSpacing(100);

        mainHBox.prefWidthProperty().bind(root.widthProperty());
        mainVBox.prefHeightProperty().bind(root.heightProperty());

        HBox.setHgrow(leftMargin, Priority.ALWAYS);
        HBox.setHgrow(rightMargin, Priority.ALWAYS);

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.BLACK);
        shadow.setRadius(5);
        root.setEffect(shadow);
    }
}