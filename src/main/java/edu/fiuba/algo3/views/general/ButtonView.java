package edu.fiuba.algo3.views.general;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class ButtonView extends Button {
    ScaleTransition transition;

    public ButtonView() {
        initialize();
    }

    public ButtonView(String content) {
        super(content);
        initialize();
    }

    private void initialize() {

        transition = new ScaleTransition(Duration.millis(70), this);
        transition.setInterpolator(Interpolator.EASE_OUT);
        setOnMouseEntered(e -> {
            transition.setToX(1.1);
            transition.setToY(1.1);
            transition.stop();
            transition.play();
        });
        setOnMouseExited(e -> {
            transition.setToX(1);
            transition.setToY(1);
            transition.stop();
            transition.play();
        });

        // Style and layout
        setStyle("-fx-background-color: #4aba91; -fx-font-size: 20; -fx-padding: 20;");
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.BLACK);
        dropShadow.setRadius(10);
        setEffect(dropShadow);
    }
}
