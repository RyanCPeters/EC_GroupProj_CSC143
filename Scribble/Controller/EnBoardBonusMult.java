package Scribble.Controller;

/**
 * @author Ryan Peters
 * @date 2/13/2017
 */
public enum EnBoardBonusMult {
	/**
	 * What we have in order is:
	 * NOTHING for Space objects on the board that are sad and get no bonus multiplier.
	 * DBLWORD for double word multiplier.
	 * TRPLWORD for triple word multiplier.
	 * DBLTR for double letter multiplier.
	 * TRPLTR for triple letter multiplier.
	 * TILE_TRAY use this for tiles space objects in the various tileTrays, just as a good practice
	 * for ensuring that no nullpointer exceptions occur. Might be we need to make Space
	 * an abstract class that will be extended by two sub classes, a board version and a tray
	 * version.
	 * <p>
	 * these enums will be serve as markers the controller can pass to a space object that will mark the
	 * that space as having a special behavior on the first word score that successfully uses that space.
	 */
	NOTHING, DBLWORD, TRPLWORD, DBLTR, TRPLTR, TILE_TRAY
}

