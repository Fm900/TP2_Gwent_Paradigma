module edu.fiuba.algo3 {
    requires javafx.controls;
    requires json.simple;
    requires org.jetbrains.annotations;
    requires java.desktop;
    requires com.google.gson;
    exports edu.fiuba.algo3;
    exports edu.fiuba.algo3.vistas;

    exports edu.fiuba.algo3.model;
    exports edu.fiuba.algo3.model.Card;
    exports edu.fiuba.algo3.model.Deck;
    exports edu.fiuba.algo3.model.Builders;
    exports edu.fiuba.algo3.model.CardsContainer;
}