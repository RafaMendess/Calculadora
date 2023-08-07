package com.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calculadora.fxml"));
        Image icon= new Image(new File("src/main/java/com/example/calculadora/Styles/calcIcon.png").toURI().toString());
        Scene scene = new Scene(fxmlLoader.load(), 611, 550);
        scene.getStylesheets().add(new File("src/main/java/com/example/calculadora/Styles/styles.css").toURI().toString());
        stage.setTitle("Hello!");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }
}