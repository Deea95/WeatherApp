package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // incarcam fisierul FXML
        primaryStage.setTitle("Weather App"); // setam titlul
        primaryStage.setScene(new Scene(root, 800, 550)); // alegem dimensiunea
        primaryStage.show(); // afisam pe ecran
    }


    public static void main(String[] args) {
        launch(args);
    }
}
