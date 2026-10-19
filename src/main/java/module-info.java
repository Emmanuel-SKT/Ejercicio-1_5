module com.main.ejercicio1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.main.ejercicio1_5 to javafx.fxml;
    exports com.main.ejercicio1_5;
}
