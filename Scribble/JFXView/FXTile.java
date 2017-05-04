package Scribble.JFXView;

import Scribble.Model.Tile;
import javafx.scene.control.Control;

/**
 * @author Peter Schinske
 */
public class FXTile extends Control {

    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;

    private Tile tile;

    public FXTile(Tile tile) {
        super();
        setMinHeight(HEIGHT);
        setPrefHeight(HEIGHT);
        setMaxHeight(HEIGHT);
        setMinWidth(WIDTH);
        setPrefWidth(WIDTH);
        setMaxWidth(WIDTH);
        this.tile = tile;

    }

    public FXTile() {
        this(null);
    }

}
