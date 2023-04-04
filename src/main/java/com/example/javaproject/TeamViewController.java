package com.example.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class TeamViewController implements Initializable {
    @FXML
    private TextField age;
    @FXML
    private TextField name;
    @FXML
    private TextField nationality;
    @FXML
    private Text nameErr;

    @FXML
    private Text nationalityErr;
    @FXML
    private Text ageErr;
    @FXML
    private Text addError;
    @FXML
    private ListView<String> listOfPls;

    @FXML
    private Text plAge;

    @FXML
    private Text plName;

    @FXML
    private Text plNationality;
    private Team club;
    private Player player;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Player player = new Player("cristiano", "38", "Portuguesse");
        Player player2 = new Player("Modric", "37", "Croatian");
        club = new Team();
            club.addPlayer(player);
            club.addPlayer(player2);
            listOfPls.getItems().add(player.toString());
            listOfPls.getItems().add(player2.toString());

        plName.setVisible(false);
        plAge.setVisible(false);
        plNationality.setVisible(false);
    }

    @FXML
    void addPlBtn(ActionEvent event) {
        if(name.getText().isEmpty()) {
            nameErr.setText("Please enter a name");
            nameErr.setVisible(true);
        } else {
            nameErr.setVisible(false);
        }

        if(age.getText().isEmpty()) {
            ageErr.setText("Please enter the player's age");
            ageErr.setVisible(true);
        } else {
            ageErr.setVisible(false);
        }

        if(nationality.getText().isEmpty()) {
            nationalityErr.setText("Please enter the players nationality");
            nationalityErr.setVisible(true);
        } else {
            nationalityErr.setVisible(false);
        }

        try {
             player = new Player(name.getText(), age.getText(), nationality.getText());

            for (Player pl : club.getPlayers()) {
                if(pl.getName().toUpperCase().equals(player.getName().toUpperCase())){
                    addError.setText("Player is already registered");
                    addError.setVisible(true);
                    return;
                }
            }


                addError.setVisible(false);
                listOfPls.getItems().add(player.toString());
                club.addPlayer(player);
                name.setText("");
                age.setText("");
                nationality.setText("");


        }
        catch (Exception e) {
            addError.setText(e.getMessage());
            addError.setVisible(true);
        }



    }

    @FXML
    void removeBtn(ActionEvent event) {
        club.getPlayers().remove(listOfPls.getSelectionModel().getSelectedIndex());
        listOfPls.getItems().remove(listOfPls.getSelectionModel().getSelectedIndex());
    }

    @FXML
    void displayPlayerInfo(MouseEvent event) {
        if(listOfPls.getSelectionModel().getSelectedIndex() != -1) {
            plName.setVisible(true);
            plAge.setVisible(true);
            plNationality.setVisible(true);
            plName.setText(club.getPlayers().get(listOfPls.getSelectionModel().getSelectedIndex()).getName());
            plAge.setText(Integer.toString(club.getPlayers().get(listOfPls.getSelectionModel().getSelectedIndex()).getAge()));
            plNationality.setText(club.getPlayers().get(listOfPls.getSelectionModel().getSelectedIndex()).getNationality());
        }
    }


}
