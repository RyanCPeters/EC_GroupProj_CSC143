package Scribble.Model;

import Scribble.Controller.EnBoardBonusMult;

/**
 * @author Ryan Peters
 * @date 2/13/2017
 */
public class BoardSpace extends Space {
	private EnBoardBonusMult bonus = EnBoardBonusMult.NOTHING;

	/**
	 * @param tile
	 */
	public BoardSpace(Tile tile) {
		super(tile);

	}

}
