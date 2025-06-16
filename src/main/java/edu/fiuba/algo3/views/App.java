package edu.fiuba.algo3.views;
import edu.fiuba.algo3.views.menu.MenuScene;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    Stage stage;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setScene(new MenuScene(stage).getScene());
        stage.setTitle("Gwent");
        stage.setMaximized(true);
        stage.show();

    }
}
