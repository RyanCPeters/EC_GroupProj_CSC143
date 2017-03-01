package Scribble.JFXView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This where we start the program from - this class starts up the GUI. It's also how we access anything in the controller
 * from other classes (like player names or scores).
 * @author Ryan Peters, Peter Schinske
 * @date 2/13/2017
 */
public class FXView extends Application {

    private static MainWindowController controller;

	public static void main(String[] args) {
		launch(args);
	}

    /**
     * This is the method JavaFX calls to start the program.
     * @param stage the equivalent to a JFrame in Swing, but created by JavaFX
     */
	@Override
	public void start(Stage stage) throws Exception {
	    //Tell javafx to use the main_window.fxml file
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("main_window.fxml"));
		Parent root = loader.load();

		controller = loader.getController();

		stage.setScene(new Scene(root, 1100, 985));
		stage.setTitle("Scribble");
		stage.setResizable(false);
		stage.show();

		//Test code
		String[] names = {"Billy", "Veronica", "José", "Trista"};
		setPlayerNames(names);
		setPlayer1Score(1);
		setPlayer2Score(10000);
		setPlayer3Score(9001);
		setPlayer4Score(1337);
	}

    /**
     Sets the player names and, if there are less than 4 people, hide the ones that aren't there.
     * @param names an array of the player names ({@code names[0]} is player1, {@code names[1]} is player2, etc.
     */
	public static void setPlayerNames(String[] names) {
	    controller.setPlayerNames(names);
    }

    /**
     * Sets {@code player1}'s score.
     * @param score the score of {@code player1}.
     */
    public static void setPlayer1Score(int score) {
	    controller.setPlayer1Score(score);
    }

    /**
     * Sets {@code player2}'s score.
     * @param score the score of {@code player2}.
     */
    public static void setPlayer2Score(int score) {
	    controller.setPlayer2Score(score);
    }

    /**
     * Sets {@code player3}'s score.
     * @param score the score of {@code player3}.
     */
    public static void setPlayer3Score(int score) {
	    controller.setPlayer3Score(score);
    }

    /**
     * Sets {@code player4}'s score.
     * @param score the score of {@code player4}.
     */
    public static void setPlayer4Score(int score) {
	    controller.setPlayer4Score(score);
    }
}
