package controller;

import javax.swing.text.html.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinksController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    IcedCoffee icedcoffee = new IcedCoffee();
    Absolute absolute = new Absolute();
    Redbull redbull = new Redbull();
    Coke coke = new Coke();
    Wintermelon wintermelon = new Wintermelon();


    public void initialize() {

        absolute.setDrink("Vodka");
        absolute.setTaste("Good for mental health");

        coke.setDrink("mmm Soft Drink");
        coke.setTaste("Refreshing");

        icedcoffee.setDrink("Coffee");
        icedcoffee.setTaste("Energizing");

        redbull.setDrink("Energy Drink");
        redbull.setTaste("CANT SLEEP WONT SLEEP");

        wintermelon.setDrink("Milk Tea");
        wintermelon.setTaste("Sweet");        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Drink: " + absolute.setDrink() + " TASTE: " + absolute.getTaste());
        }

        if (sourceButton.equals (btn2)) {
            alert.setContentText("Drink: " + coke.setDrink() + " TASTE: " + coke.getTaste());
        }
        
        if (sourceButton.equals (btn3)) {
            alert.setContentText("Drink: " + icedcoffee.setDrink() + " TASTE: " + icedcoffee.getTaste());
        }

        if (sourceButton.equals (btn4)) {
            alert.setContentText("Drink: " + redbull.setDrink() + " TASTE: " + redbull.getTaste());
        }

        if (sourceButton.equals (btn5)) {
            alert.setContentText("Drink: " + wintermelon.setDrink() + " TASTE: " + wintermelon.getTaste());
        }

        alert.showAndWait();

    }
}