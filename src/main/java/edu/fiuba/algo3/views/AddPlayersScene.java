package edu.fiuba.algo3.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddPlayersScene {

    public Scene createScene(Stage primaryStage, Runnable onPlayersAdded, String[] playerNames) {
        VBox layout = new VBox(15);
        layout.setStyle("-fx-padding: 30; -fx-alignment: center; -fx-background-color: #282c34;");

        Label title = new Label("Enter Player Names");
        title.setStyle("-fx-text-fill: white; -fx-font-size: 20;");

        TextField player1Field = new TextField();
        player1Field.setPromptText("Player 1 Name");

        TextField player2Field = new TextField();
        player2Field.setPromptText("Player 2 Name");

        Label errorLabel = new Label();
        errorLabel.setStyle("-fx-text-fill: red;");

        Button confirmButton = new Button("Confirm");
        confirmButton.setOnAction(e -> {
            String name1 = player1Field.getText().trim();
            String name2 = player2Field.getText().trim();

            if (name1.isEmpty() || name2.isEmpty()) {
                errorLabel.setText("Both names must be filled in.");
            } else {
                playerNames[0] = name1;
                playerNames[1] = name2;
                onPlayersAdded.run(); // callback para continuar
            }
        });

        layout.getChildren().addAll(title, player1Field, player2Field, confirmButton, errorLabel);
        return new Scene(layout, 400, 300);
    }
}
