module com.example.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    requires java.scripting;

    opens com.example.calculadora to javafx.fxml;
    exports com.example.calculadora;
}