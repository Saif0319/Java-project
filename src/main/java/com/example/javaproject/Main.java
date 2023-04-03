package com.example.javaproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("team-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Soccer Team");
        stage.getIcons().add(new Image(Player.class.getResourceAsStream("/com/example/javaproject/images/soccer.png")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        launch();
    }
}