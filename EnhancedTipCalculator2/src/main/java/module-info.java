module com.example.enhancedtipcalculator2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.enhancedtipcalculator2 to javafx.fxml;
    exports com.example.enhancedtipcalculator2;
}