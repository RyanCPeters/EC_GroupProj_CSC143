package Scribble.Model;

import javax.swing.*;
import java.awt.*;

/** I think we should initially define this basic tile object as an abstract class then define 26 unique subclasses.
 * One for each letter of the english alphabet.
 *
 * I don't know how we want to go about instantiating our tile objects yet, but after instantiation they will represent
 * a predefined kit of states that the space objects will be able to pass to the controller when we need to update the
 * view to graphically represent the current state of the board.
 * @author Ryan Peters
 * @date 2/12/2017
 */
public class Tile {
	private char letter;
	private int value;
	private FontMetrics fm;
	private JLabel ltrLabl;
	private JLabel valLabl;

	public Tile() {// the empty contructor is only here to act as a stubb for testing purposes.
		this('~', 99);

	}

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
		ltrLabl = new JLabel(String.valueOf(letter));
		valLabl = new JLabel(String.valueOf(value));
	}
}
/* tile distribution cheat sheet.
* letter    pts   count
* A         1       9
* B         3       2
* C         3       2
* D         2       4
* E         1       12
* F         4       2
* G         2       3
* H         4       2
* I         1       9
* J         8       1
* K         5       1
* L         1       4
* M         3       2
* N         1       6
* 0         1       8
* P         3       2
* Q         10      1
* R         1       6
* S         1       4
* T         1       6
* U         1       4
* V         4       2
* W         4       2
* X         8       1
* Y         4       2
* Z         10      1
* ?(BLANK)  0       2
*
*
*
*
*/
