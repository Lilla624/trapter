// File: MainController.java
// Author: Varga Lilla
// Copyright: 2024, Varga Lilla
// Group: Szoft II/1/N
// Date: 2024-11-12
// Github: https://github.com/Lilla624/
// Licenc: GNU GPL

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField sideFieldA;

    @FXML
    private TextField sideFieldB;

    @FXML
    private TextField sideFieldC;

    @FXML
    private TextField sideFieldD;

    @FXML
    public void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    private void startCalc() {
        double a = Double.parseDouble(sideFieldA.getText());
        double b = Double.parseDouble(sideFieldB.getText());
        double c = Double.parseDouble(sideFieldC.getText());
        double d = Double.parseDouble(sideFieldD.getText());
        Double area = calcArea(a, b, c, d);
        System.out.println("Terület: " + area);
        areaField.setText(area.toString());
    }

    private double calcArea(double a, double b, double c, double d) {
        double height = Math.sqrt((a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d)) / (2 * Math.abs(a - b));
        Double area = (a + c) * height / 2 ;
        return area;
    }
    @FXML
    public void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("trapter");
        alert.setContentText("Varga Lilla\nII/1/N\n2024.11.10.");
        alert.showAndWait();
    }

}
