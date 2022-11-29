module com.example.mainmusic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mainmusic to javafx.fxml;
    exports com.example.mainmusic;
}