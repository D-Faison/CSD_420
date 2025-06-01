module faison_cards {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens faison_cards to javafx.fxml;
    exports faison_cards;
}
