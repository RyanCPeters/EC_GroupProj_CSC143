package Scribble.Controller.ViewControllers;

import Scribble.JFXView.FXView;

/**
 * These methods are called by the controller when it wants to change the size of the board.
 * The default size is 15x15.
 * @author Peter Schinske
 */
public class BoardController {

    /**
     * Sets the width, in cells, of the playing board - default is 15.
     * @param width the new width of the board
     */
    public static void setBoardWidth(int width) {
        FXView.setBoardWidth(width);
    }

    /**
     * Sets the height, in cells, of the playing board - default is 15.
     * @param height the new height of the board.
     */
    public static void setBoardHeight(int height) {
        FXView.setBoardHeight(height);
    }
}
