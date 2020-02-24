package chess2;

import java.util.*;
import java.io.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application  {
    public static void main (String [] args)  {
	Application.launch(args);
    }
    private Scene scene;
    @Override
    public void start(Stage stage) throws IOException  {
        // Create the Pane and all Details
	Parent mainMenu = FXMLLoader.load(getClass().getResource("fxml/menu.fxml"));
        scene = new Scene (mainMenu);
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("\u265F Chess 2 II : Chess Twoer \u2654");
	stage.setResizable(false);
	stage.sizeToScene();
        // Display the Stage
        stage.show();
	// Escape always brings you back to the main menu
    }
}
