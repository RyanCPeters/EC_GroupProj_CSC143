package Scribble.JFXView;

import Scribble.Model.Space;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

/**
 * This class is our javafx representation of a space. If there is no tile within, it will display the multiplier text
 * ("double word score", etc). If there is a tile, the tile will be rendered. This class also takes care of interations
 * with the user (clicking spaces, etc).
 *
 * @author Peter Schinske
 */
public class FXSpace extends Control {

    public static final int WIDTH = 52;
    public static final int HEIGHT = 52;

    private Space space;

    public FXSpace(Space space) {
        super();
        setMinHeight(HEIGHT);
        setPrefHeight(HEIGHT);
        setMaxHeight(HEIGHT);
        setMinWidth(WIDTH);
        setPrefWidth(WIDTH);
        setMaxWidth(WIDTH);
        setBorder(new Border(new BorderStroke(Color.LIGHTGREY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
        this.space = space;
    }

    public FXSpace() {
        this(null);
    }

    /**
     * Don't worry about this, it's necessary but useless.
     */
    @Override
    protected Skin<FXSpace> createDefaultSkin() {
        return new FXSpaceSkin(this);
    }
}
