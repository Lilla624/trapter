// File: module-info.java
// Author: Varga Lilla
// Copyright: 2024, Varga Lilla
// Group: Szoft II/1/N
// Date: 2024-11-12
// Github: https://github.com/Lilla624/
// Licenc: GNU GPL

module com.example {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;
}
