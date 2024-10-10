package com.desktopapp;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class CalculatorController {

    protected String opperation;

    public static Scene CreateScene() throws Exception
    {

        URL sceneUrl = CalculatorController.class.getResource("Calculator.fxml");
        FXMLLoader loader = new FXMLLoader(sceneUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        return scene;
    }

    // scene components declaration

    @FXML
    protected Button btn1;

    @FXML
    protected Button btn2;

    @FXML
    protected Button btn3;

    @FXML
    protected Button btn4;

    @FXML
    protected Button btn5;

    @FXML
    protected Button btn6;

    @FXML
    protected Button btn7;

    @FXML
    protected Button btn8;

    @FXML
    protected Button btn9;

    @FXML
    protected Label mainScreen;

    @FXML
    protected Label secondScreen;

    @FXML
    protected void numberValueInput(MouseEvent e)
    {
        Button button = (Button) e.getSource();

        this.mainScreen.setText(this.mainScreen.getText().concat(button.getText()));
    }

    @FXML
    protected void setOpperation(MouseEvent e)
    {
        Button button = (Button) e.getSource();
        this.opperation = button.getText();

        this.secondScreen.setText(this.mainScreen.getText().concat("  " + opperation));
        this.mainScreen.setText("");
    }

}
