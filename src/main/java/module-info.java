module edu.miracosta.cs112.lab07 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens edu.miracosta.cs112.lab07 to javafx.fxml;
    exports edu.miracosta.cs112.lab07;
}