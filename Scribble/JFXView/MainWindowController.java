package Scribble.JFXView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.input.InputEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Peter Schinske
 */
public class MainWindowController implements Initializable {

    @FXML private MenuBar menuBar;
    /**
     * Handles keyboard input (in case we ever want to add keyboard shortcuts).
     * @param event the input event
     */
    @FXML
    public void handleKeyboardInput(final InputEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        menuBar.setFocusTraversable(true);
    }
}
