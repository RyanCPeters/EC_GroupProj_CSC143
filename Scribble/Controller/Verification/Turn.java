package Scribble.Controller.Verification;

import Scribble.Model.Space;
import Scribble.Model.Tile;

/**
 * @author Peter Schinske
 */
public class Turn {

    private Space[][] board;
    private TilePlacement[] tiles;
    int tileNum;
    /** True if x is same, false if y is same */
    private boolean sharedX;

    public Turn(Space[][] board) {
        this.board = board;
        tiles = new TilePlacement[6];
    }

    /**
     * TODO: return false if it can't be placed at this location
     * Adds the specified tile to the current word at the specified location on the board.
     * @param tile the tile to add to the word
     * @param x the x-coordinate of the tile to add
     * @param y the y-coordinate of the tile to add
     * @return true if the tile was successfully added, false otherwise
     */
    public boolean addTile(Tile tile, int x, int y) {
        TilePlacement newTile = new TilePlacement(tile, x, y);

        if (tileNum == 1) {
            if (newTile.x == tiles[0].x) {
                sharedX = true;
            } else if (newTile.y == tiles[0].y) {
                sharedX = false;
            } else {
                return false;
            }
        } else if (tileNum > 1) {
            if (sharedX) {
                if (newTile.x != tiles[0].x) {
                    return false;
                }
            } else {
                if (newTile.y != tiles[0].y) {
                    return false;
                }
            }
        }
        tiles[tileNum] = newTile;

        tileNum++;

        return true;
    }

    /**
     * Removes the specified tile from the current word.
     * @param x the x-coordinate of the tile to remove
     * @param y the y-coordinate of the tile to remove
     * @return true if the tile was removed, false if there was no tile at the specified location.
     */
    public boolean removeTile(int x, int y) {
        for (int i = 0; i < tileNum; i++) {
            if (tiles[i].x == x && tiles[i].y == y) {
                tileNum--;
                if (i == tileNum) {     //if the tile to be removed is the last one, just set it to null
                    tiles[i] = null;
                } else {                    //else, override this tile with the last tile in tiles
                    tiles[i] = tiles[tileNum];
                    tiles[tileNum] = null;
                }

                return true;
            }
        }
        return false;
    }

    public Space[][] verifyTurn() {
        return board;
    }

    private class TilePlacement {

        public Tile tile;
        public int x, y;

        public TilePlacement(Tile tile, int x, int y) {
            this.tile = tile;
            this.x = x;
            this.y = y;
        }
    }
}
