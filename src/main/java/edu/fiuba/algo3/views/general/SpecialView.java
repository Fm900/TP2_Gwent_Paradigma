package edu.fiuba.algo3.views.general;

import edu.fiuba.algo3.model.Card.Special.Special;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SpecialView extends CartaView {
    Special special;

    public SpecialView(Special special) {
        this.special = special;

        offsetX=-20;
        offsetY=40;

        Label titulo = new Label(special.getName());
        Label descripcion = new Label(special.getDespcription());
        VBox vbox = new VBox(titulo, descripcion);
        vbox.setSpacing(5);

        descripcion.setStyle("-fx-font-size: 8;");
        titulo.setWrapText(true);
        descripcion.setWrapText(true);


        getChildren().addAll(vbox);
    }

    public boolean esComodinVista(Special special) {
        return special.equals(this.special);
    }
}
