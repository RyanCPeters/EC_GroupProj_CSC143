package Scribble.JFXView;

import javafx.scene.control.SkinBase;

/**
 * I've no idea why we need this class (I don't think we'll need to actually use it for anything) but javafx throws an
 * error if I don't implement it.
 *
 * This class specifies how every FXSpace will look. Ordinarily, this is implemented by javafx already, but we need
 * to make this class because we're using a custom control.
 *
 * @author Peter Schinske
 */
public class FXSpaceSkin extends SkinBase<FXSpace> {

    public FXSpaceSkin(FXSpace space) {
        super(space);
    }
}
