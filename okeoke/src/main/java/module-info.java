module com.mycompany.okeoke {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.okeoke to javafx.fxml;
    exports com.mycompany.okeoke;
}
