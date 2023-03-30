package com.example.javaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("team-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Soccer Team");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Team club = new Team();
        Player player = new Player("cristiano", 38, "Portuguesse");
        Player player2 = new Player("Modric", 37, "Croatian");
        club.addPlayer(player);
        club.addPlayer(player2);
        System.out.println(club.numOfPlayers());

        //launch();
    }
}