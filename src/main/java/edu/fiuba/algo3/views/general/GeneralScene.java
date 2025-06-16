package edu.fiuba.algo3.views.general;

import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public abstract class GeneralScene {
    Scene scene;
    protected Pane root;

    public GeneralScene(Stage stage) {
        root = createLayout();
        createControllers(stage);
        createStyles();
        loadFont(root);
        loadBackgroundImage(root);

        // https://stackoverflow.com/a/44852856
        Scene oldScene = stage.getScene();
        if (oldScene != null) {
            scene = new Scene(root, stage.getScene().getWidth(), stage.getScene().getHeight());
        } else {
            scene = new Scene(root);
        }
    }

    protected abstract void createStyles();

    protected abstract void createControllers(Stage stage);

    protected abstract Pane createLayout();

    private void loadFont(Pane root) {}

    private void loadBackgroundImage(Pane root) {}

    public Scene getScene() {
        return scene;
    }
}
