module com.example.guess_letter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guess_letter to javafx.fxml;
    exports com.example.guess_letter;
}