package edu.fiuba.algo3.views.game;

import edu.fiuba.algo3.model.*;
import edu.fiuba.algo3.views.general.ButtonView;
import edu.fiuba.algo3.views.general.GeneralScene;
import edu.fiuba.algo3.views.menu.MenuScene;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class GameScene extends GeneralScene implements Observer {

    private HBox mainHBox;
    private ButtonView exitButton;

    public GameScene(Stage stage) {
        super(stage);
    }

    @Override
    protected Pane createLayout() {
        AnchorPane root = new AnchorPane();

        mainHBox = new HBox();
        exitButton =  new ButtonView("X");

        root.getChildren().addAll(mainHBox, exitButton);
        return root;
    }

    @Override
    protected void createStyles() {

    }

    @Override
    protected void createControllers(Stage stage) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }

    private void updateDealButton() {

    }

    private void updateDiscardButton() {

    }

}
