package Scribble.JFXView;

import Scribble.Controller.ViewHandlers.ButtonHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.InputEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * This is where we handle things like pressing buttons, changing the score, etc. Basically any interaction with the GUI
 * (either with the user or with the Controller package) will be handled by this class.
 *
 * Note: any variable with the {@code @FXML} tag will have a corresponding node in the fxml file - JavaFX will automatically
 * "inject" the variable with its corresponding node. {@code player1}, for example, corresponds with the Text object that holds
 * player1's name.
 * @author Peter Schinske
 */
public class MainWindowController {

    @FXML private MenuItem resetBoard;
    @FXML private MenuItem exit;

    @FXML private Text player1;
    @FXML private Text player2;
    @FXML private Text player3;
    @FXML private Text player4;

    @FXML private Text player1Score;
    @FXML private Text player2Score;
    @FXML private Text player3Score;
    @FXML private Text player4Score;

    @FXML private GridPane board;
    @FXML private GridPane tileTray;

    /** The board is this many tiles accross */
    private int boardWidth = 15;

    /** The board is this many tiles high */
    private int boardHeight = 15;

    /** The tile tray is this many tiles wide */
    private int tileTrayWidth = 10;

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
     * This method gets called when the user chooses to exit via the file menu or by pressing Alt-F4
     */
    @FXML
    public void exit(ActionEvent event) {
        Platform.exit();
    }

    /**
     * This method gets called when the "Finish Turn" button is pressed.
     */
    @FXML
    public void finishTurnButtonAction(ActionEvent event) {
        ButtonHandler.finishTurnButtonAction();
    }

    /**
     * This method gets called when the "Reset Turn" button is pressed.
     */
    @FXML
    public void resetTurnButtonAction(ActionEvent event) {
        ButtonHandler.resetTurnButtonAction();
    }

    /**
     * This method gets called when the "Randomize Letters" button is pressed.
     */
    @FXML
    public void randomizeLettersButtonAction(ActionEvent event) {
        ButtonHandler.randomizeLettersButtonAction();
    }

    /**
     * This method gets called when the "Replace Letters" button is pressed.
     */
    @FXML
    public void replaceLettersButtonAction(ActionEvent event) {
        ButtonHandler.replaceLettersButtonAction();
    }

    /**
     * This method gets called when the "Replace Letters" button is pressed.
     */
    @FXML
    public void challengeButtonAction(ActionEvent event) {
        ButtonHandler.challengeButtonAction();
    }

    /**
     * This method gets called when the "Accept" button is pressed.
     */
    @FXML
    public void acceptButtonAction(ActionEvent event) {
        ButtonHandler.acceptButtonAction();
    }

    /**
     * If you want to use this, use the static version in FXView.
     * <p>
     * Sets the player names and, if there are less than 4 people, hide the ones that aren't there.
     * @param names an array of the player names ({@code names[0]} is player1, {@code names[1]} is player2, etc.
     * @throws IllegalArgumentException if names has length of 0 or greater than 4
     */
    void setPlayerNames(String[] names) throws IllegalArgumentException {
        if (names.length == 0 || names.length > 4)
            throw new IllegalArgumentException("There cannot be less than 1 or greater than 4 players");
        //If there are less than 4 people, hide the people that aren't there, as well as their scores
        switch (names.length) {
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
        //set the names for the players that exist
        switch (names.length) {
            case 4:
                player4.setText(names[3]);
            case 3:
                player3.setText(names[2]);
            case 2:
                player2.setText(names[1]);
            case 1:
                player1.setText(names[0]);
        }
    }

    /**
     * If you want to use this, use the static version in FXView.
     * <p>
     * Sets {@code player1}'s score.
     * @param score the score of {@code player1}.
     */
    void setPlayer1Score(int score) {
        player1Score.setText("" + score);
    }

    /**
     * If you want to use this, use the static version in FXView.
     * <p>
     * Sets {@code player2}'s score.
     * @param score the score of {@code player2}.
     */
    void setPlayer2Score(int score) {
        player2Score.setText("" + score);
    }

    /**
     * If you want to use this, use the static version in FXView.
     * <p>
     * Sets {@code player3}'s score.
     * @param score the score of {@code player3}.
     */
    void setPlayer3Score(int score) {
        player3Score.setText("" + score);
    }

    /**
     * If you want to use this, use the static version in FXView.
     * <p>
     * Sets {@code player4}'s score.
     * @param score the score of {@code player4}.
     */
    void setPlayer4Score(int score) {
        player4Score.setText("" + score);
    }

    void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    /**
     * Called when the GUI is created. If we need to do something special to anything in the GUI, we do it in here.
     */
    @FXML
    public void initialize() {
        //Gives the "reset board" menu option the shortcut of ctrl+r
        resetBoard.setAccelerator(new KeyCodeCombination(KeyCode.R,  KeyCombination.CONTROL_DOWN));
        exit.setAccelerator(new KeyCodeCombination(KeyCode.F4, KeyCombination.ALT_DOWN));
        for (int x = 0; x < boardWidth; x++) {
            for (int y = 0; y < boardHeight; y++) {
                board.add(new FXSpace(), x, y);
            }
        }
        board.setMaxWidth(FXSpace.WIDTH * boardWidth);
        board.setMaxHeight(FXSpace.HEIGHT * boardHeight);
        board.setBorder(new Border(new BorderStroke(Color.LIGHTGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));

        for (int x = 0; x < tileTrayWidth; x++) {
            tileTray.add(new FXSpace(), x, 0);
        }
        tileTray.setMaxWidth(FXSpace.WIDTH * tileTrayWidth);
        tileTray.setMaxHeight(FXSpace.HEIGHT * 1);
        tileTray.setBorder(new Border(new BorderStroke(Color.LIGHTGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
    }

}
