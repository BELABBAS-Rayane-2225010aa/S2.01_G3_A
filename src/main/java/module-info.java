module com.example.s201_g3_a {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.s201_g3_a to javafx.fxml;
    exports com.example.s201_g3_a;
}