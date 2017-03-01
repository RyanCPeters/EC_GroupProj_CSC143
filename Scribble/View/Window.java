package Scribble.View;

import javax.swing.*;
import java.awt.*;

/** A basic window that will extend either a JFrame or an Application class object, depending upon if we decide to use
 * java.swing or javafx.scene libraries.3
 * @author Ryan Peters
 * @date 2/12/2017
 */
public class Window extends JFrame{

	Board boardPanel;
	JPanel trayPanel;

	JLabel wordScore;
	JLabel p1Score;
	JLabel p2Score;
	JLabel p3Score;
	JLabel p4Score;
	JButton submit;
	JButton confirm;
	JButton challenge;

	/**
	 * Constructs a new frame that is initially invisible.
	 * <p>
	 * This constructor sets the component's locale property to the value
	 * returned by <code>JComponent.getDefaultLocale</code>.
	 *
	 * @throws HeadlessException if GraphicsEnvironment.isHeadless()
	 *                           returns true.
	 * @see GraphicsEnvironment#isHeadless
	 * @see Component#setSize
	 * @see Component#setVisible
	 * @see JComponent#getDefaultLocale
	 */
	public Window() throws HeadlessException {
		setTitle("Scribble is not Scrabble!!");
		// this will create a basic JOptionPane that asks the user to enter a string choosing the number
		// of players they want in the game.
		// ToDo: convert this JOptionPane to have 3 radio buttons that represent a choice of 2, 3, or 4 players.
		String playerCount = JOptionPane.showInputDialog
				("Enter the number of players from 2 to 4: ");
		int numPlayers = Integer.parseInt(playerCount);
		boardPanel = new Board();
	}
}
