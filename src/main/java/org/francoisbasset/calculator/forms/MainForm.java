package org.francoisbasset.calculator.forms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.getIcons().add(new Image(String.valueOf(getClass().getResource("/icon/icon.png"))));

        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
