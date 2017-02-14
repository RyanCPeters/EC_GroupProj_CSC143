package Scribble.Model;

import java.awt.*;

/**The space objects are where we describe the means to access and set the state of each tile space on the board.
 * @author Ryan Peters
 * @date 2/12/2017
 */
public abstract class Space {

	private Color bg;
	private Tile tile;

	/**
	 * @param tile
	 */
	public Space(Tile tile) {
		this.tile = tile;
	}

	/**
	 * @param bg
	 */
	public void setBg(Color bg) {
		this.bg = bg;
	}

	/**
	 * @param tile
	 */
	public void setTile(Tile tile) {
		this.tile = tile;
	}

	/**
	 * @return
	 */
	public Color getBg() {
		return bg;
	}

	/**
	 * @return
	 */
	public Tile getTile() {
		return tile;
	}
}
