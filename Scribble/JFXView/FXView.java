package Scribble.JFXView;/**
 * @author Ryan Peters
 * @date 2/13/2017
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXView extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("main_window.fxml"));

		primaryStage.setScene(new Scene(root, 1100, 985));
		primaryStage.setTitle("Scribble");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
