package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by samyboy89 on 19/05/15.
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/view.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        launch(args);
    }

}
