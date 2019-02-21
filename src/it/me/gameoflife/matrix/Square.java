package it.me.gameoflife.matrix;

public class Square {

	int x;
	int y;

	public Boolean isAlive;

	public Square(int p_x, int p_y, Boolean p_isAlive) {

		x = p_x;
		y = p_y;
		isAlive = p_isAlive;

	}

	public void copy(Square squareToCopy) {

		isAlive = squareToCopy.isAlive;
		x = squareToCopy.x;
		y = squareToCopy.y;

	}

}
