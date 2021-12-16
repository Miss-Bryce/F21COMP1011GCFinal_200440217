package com.example.f21comp1011gcfinala;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class InventoryTypeController {

    @FXML
    private Label numOfCarsLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label dealerLabel;

    @FXML
    private ListView<String> typeListView;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private RadioButton yearRadioButton;

    @FXML
    private RadioButton makeRadioButton;

    ToggleGroup group = new ToggleGroup();

    public Label getNumOfCarsLabel() {
        return numOfCarsLabel;
    }

    public void setNumOfCarsLabel(Label numOfCarsLabel) {
        this.numOfCarsLabel = numOfCarsLabel;
    }

    public Label getYearLabel() {
        return yearLabel;
    }

    public void setYearLabel(Label yearLabel) {
        this.yearLabel = yearLabel;
    }

    public Label getDealerLabel() {
        return dealerLabel;
    }

    public void setDealerLabel(Label dealerLabel) {
        this.dealerLabel = dealerLabel;
    }

    public ListView<String> getTypeListView() {
        return typeListView;
    }

    public void setTypeListView(ListView<String> typeListView) {
        this.typeListView = typeListView;
    }

    public ListView<Car> getCarListView() {
        return carListView;
    }

    public void setCarListView(ListView<Car> carListView) {
        this.carListView = carListView;
    }

    public RadioButton getYearRadioButton() {
        return yearRadioButton;
    }

    public void setYearRadioButton(RadioButton yearRadioButton) {
        this.yearRadioButton = yearRadioButton;
        yearRadioButton.setToggleGroup(group);
    }

    public RadioButton getMakeRadioButton() {
        return makeRadioButton;
    }

    public void setMakeRadioButton(RadioButton makeRadioButton) {
        this.makeRadioButton = makeRadioButton;
        makeRadioButton.setToggleGroup(group);
    }

    


}
