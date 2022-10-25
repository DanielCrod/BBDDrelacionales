module com.mycompany.bbddrelacionales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bbddrelacionales to javafx.fxml;
    exports com.mycompany.bbddrelacionales;
}
