module ni.edu.uam.practicajavafxpostgresql {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.practicajavafxpostgresql to javafx.fxml;
    exports ni.edu.uam.practicajavafxpostgresql;
}