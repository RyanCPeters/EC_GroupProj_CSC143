package Scribble.Controller.ViewHandlers;

import Scribble.JFXView.FXView;

/**
 * These methods are called by the controller when it wants to set/change player data
 * as it is displayed on the gui(s). These methods will tell all views to change the player data.
 * @author Peter Schinske
 */
public class PlayerHandler {

    /**
     Sets the player names and, if there are less than 4 people, hide the ones that aren't there.
     * @param names an array of the player names ({@code names[0]} is player1, {@code names[1]} is player2, etc.
     */
    public static void setPlayerNames(String[] names) {
        FXView.setPlayerNames(names);
    }

    /**
     * Sets {@code player1}'s score.
     * @param score the score of {@code player1}.
     */
    public static void setPlayer1Score(int score) {
        FXView.setPlayer1Score(score);
    }

    /**
     * Sets {@code player2}'s score.
     * @param score the score of {@code player2}.
     */
    public static void setPlayer2Score(int score) {
        FXView.setPlayer2Score(score);
    }

    /**
     * Sets {@code player3}'s score.
     * @param score the score of {@code player3}.
     */
    public static void setPlayer3Score(int score) {
        FXView.setPlayer3Score(score);
    }

    /**
     * Sets {@code player4}'s score.
     * @param score the score of {@code player4}.
     */
    public static void setPlayer4Score(int score) {
        FXView.setPlayer4Score(score);
    }
}
