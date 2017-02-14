package Scribble.Model;

/**Our model base will be where we handle the instantiation and access rights with regards to the arrays of space and
 * tile objects.
 * @author Ryan Peters
 * @date 2/12/2017
 */
public abstract class ModelBase {
	private Space[][] boardSpaces;
	Player[] playas; // constructed iteratively with the help of the view and controller.
	Space[] tileBag; // this array will be populated by the controller but it should be instantiated by ModelBase.
	Space[] activeTileTray; // a shallow clone of the acting player's tile tray.

	public ModelBase() {// we can use the empty contstructor to set up a stubb-version of the model.
		this.boardSpaces = new Space[10][10];
		playas = new Player[4];
		for (int i = 0; i < 4; i++) {
			this.playas[i] = new Player("Player" + (i + 1));
		}
		tileBag = new Space[100]; // i count 100 tiles according to hasbro's web sight, a cheat sheet is at bottom of this file
		/* note there are 27 index positions because the last position is reserved for the blank tiles represented as ?
		* Also note that the act of populating the tileBag array will not be handled by the model in any situation other
		* than this initial stubb configuration.
		*               ----THIS IS STRICTLY FOR TESTING PURPOSES----
		 */
		int[] letters = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1, 2};

	}

	public ModelBase(Space[][] boardSpaces, Player[] playas, Space[] tileBag, Space[] activeTileTray) {
		this.boardSpaces = boardSpaces;
		this.playas = playas;
		this.tileBag = tileBag;
		this.activeTileTray = activeTileTray;
	}

	/**
	 * The protected inner class Player is an organizational device for structuring score, name and tileTray
	 * data on a per player basis.
	 */
	protected class Player {
		int score;
		String name;
		Space[] tileTray;

		/**
		 * the default empty constructor call will set default values to the 3 fields associated with this player
		 * object.
		 * <p>
		 * score = 0;
		 * name = "a play'a";
		 * tileTray = new Space[7]
		 */
		public Player() {
			this.score = 0;
			this.name = "a play'a";
			this.tileTray = new Space[7];
		}

		/**
		 * the default empty constructor call will set default values to the 3 fields associated with this player
		 * object.
		 * <p>
		 * score = 0;
		 * name = "a play'a";
		 * tileTray = new Space[7]
		 */
		public Player(String name) {
			this.score = 0;
			this.name = name;
			this.tileTray = new Space[7];
		}

		/**
		 * sets the player object's fields to the given inputs, and the Player's starting score to 0.
		 *
		 * @param name     a name from user inputs handled by the view component.
		 * @param tileTray a prepopulated Space[] with a length of 7 and tiles already assigned to that tray.
		 */
		public Player(String name, Space[] tileTray) {

			this.score = 0;
			this.name = name;
			this.tileTray = tileTray;
		}


		public void setScore(int score) {
			this.score = score;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setTileTray(Space[] tileTray) {
			this.tileTray = tileTray;
		}

		public int getScore() {
			return score;
		}

		public String getName() {
			return name;
		}

		public Space[] getTileTray() {
			return tileTray;
		}
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