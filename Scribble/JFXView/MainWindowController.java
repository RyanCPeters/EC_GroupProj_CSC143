package Scribble.JFXView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This is where we handle things like pressing buttons, changing the score, etc. Basically any interaction with the GUI
 * (either with the user or with the Controller package) will be handled by this class.
 * @author Peter Schinske
 */
public class MainWindowController implements Initializable {

    @FXML private MenuBar menuBar;
    @FXML private MenuItem resetBoard;

    private int numOfPlayers = -1;

    @FXML private Text player1;
    @FXML private Text player2;
    @FXML private Text player3;
    @FXML private Text player4;

    @FXML private Text player1Score;
    @FXML private Text player2Score;
    @FXML private Text player3Score;
    @FXML private Text player4Score;

    @FXML private Button randomizeLetters;
    @FXML private Button replaceLetters;

    /**
     * Handles keyboard input (in case we ever want to add keyboard shortcuts).
     */
    @FXML
    public void handleKeyboardInput(InputEvent event) {

    }

    /**
     * This method gets called when someone either selects "reset board" in the file menu, or presses ctrl+r.
     */
    @FXML
    public void resetBoard(ActionEvent event) {

    }

    /**
     * This method gets called when the "Finish turn" button is pressed.
     */
    @FXML
    public void finishTurnButtonAction(ActionEvent event) {

    }

    /**
     * This method gets called when the "Reset Turn" button is pressed.
     */
    @FXML
    public void resetTurnButtonAction(ActionEvent event) {

    }

    @FXML
    public void randomizeLettersButtonAction(ActionEvent event) {
        System.out.println(randomizeLetters.getWidth());
    }

    @FXML
    public void replaceLettersButtonAction(ActionEvent event) {
        System.out.println(replaceLetters.getWidth());
    }

    /**
     * This method gets called when the "Challenge!" button is pressed.
     */
    @FXML
    public void challengeButtonAction(ActionEvent event) {

    }

    /**
     * This method gets called when the "Accept" button is pressed.
     */
    @FXML
    public void acceptButtonAction(ActionEvent event) {

    }

    public void setNumOfPlayers(int numOfPlayers) throws IllegalArgumentException {
        if (numOfPlayers < 1 || numOfPlayers > 4)
            throw new IllegalArgumentException("There cannot be less than 1 or greater than 4 players");
        switch (numOfPlayers) {
            case 1:
                player2.setVisible(false);
                player2Score.setVisible(false);
            case 2:
                player3.setVisible(false);
                player3Score.setVisible(false);
            case 3:
                player4.setVisible(false);
                player4Score.setVisible(false);
        }

    }

    public void setPlayer1Name(String name) {
        player1.setText(name);
    }

    public void setPlayer2Name(String name) {
        player2.setText(name);
    }

    public void setPlayer3Name(String name) {
        player3.setText(name);
    }

    public void setPlayer4Name(String name) {
        player4.setText(name);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        menuBar.setFocusTraversable(true);
        resetBoard.setAccelerator(new KeyCodeCombination(KeyCode.R,  KeyCombination.CONTROL_DOWN));
    }

}
