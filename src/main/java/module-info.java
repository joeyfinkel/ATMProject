module com.mycompany.atmproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.atmproject to javafx.fxml;
    exports com.mycompany.atmproject;
}
