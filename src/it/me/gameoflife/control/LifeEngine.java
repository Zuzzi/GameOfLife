package it.me.gameoflife.control;

import it.me.gameoflife.matrix.Square;

public class LifeEngine implements Runnable {

	public static int population = 0;
	static int generation = 0;
	static Boolean running = false;

	static Square[][] temporarySquares = new Square[100][100];

	public void run() {

		while (Monitor.handleRunning("get", null)) {

			copySquares();

			for (int i = 0; i < 100; i++) {

				for (int j = 0; j < 100; j++) {

					if (temporarySquares[i][j].isAlive)
						tryToKill(temporarySquares[i][j], i, j);
					else
						tryToHeal(temporarySquares[i][j], i, j);

				}

			}

			InputHandler.options.labelGeneration.setText("Generation: " + Monitor.handleGeneration("increment", null));
			InputHandler.options.labelGeneration.repaint();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	static void copySquares() {

		for (int i = 0; i < 100; i++) {

			for (int j = 0; j < 100; j++) {

				temporarySquares[i][j] = new Square(0, 0, false);
				temporarySquares[i][j].copy(InputHandler.squares[i][j]);

			}

		}

	}

	static void tryToKill(Square square, int row, int column) {

		Square[] neighbors = findNeighbors(row, column);
		int livingNeighbors = 0;

		for (int i = 0; i < neighbors.length; i++)
			if (neighbors[i].isAlive)
				livingNeighbors++;

		if (livingNeighbors < 2 || livingNeighbors > 3) {

			InputHandler.squares[row][column].isAlive = false;

			InputHandler.matrix_gui.matrix.repaint();

		}

	}

	static void tryToHeal(Square square, int row, int column) {

		Square[] neighbors = findNeighbors(row, column);

		int livingNeighbors = 0;

		for (int i = 0; i < neighbors.length; i++)
			if (neighbors[i].isAlive)
				livingNeighbors++;

		if (livingNeighbors == 3) {

			InputHandler.squares[row][column].isAlive = true;

			InputHandler.matrix_gui.matrix.repaint();
		}

	}

	static Square[] findNeighbors(int row, int column) {

		Square[] neighbors;

		if (row == 0 && column == 0) {

			neighbors = new Square[3];

			for (int i = 0; i < 3; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row][column + 1]);
			neighbors[1].copy(temporarySquares[row + 1][column + 1]);
			neighbors[2].copy(temporarySquares[row + 1][column]);

		}

		else if (row == 99 && column == 0) {

			neighbors = new Square[3];

			for (int i = 0; i < 3; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row - 1][column]);
			neighbors[1].copy(temporarySquares[row - 1][column + 1]);
			neighbors[2].copy(temporarySquares[row][column + 1]);

		}

		else if (row == 99 && column == 99) {

			neighbors = new Square[3];

			for (int i = 0; i < 3; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row - 1][column]);
			neighbors[1].copy(temporarySquares[row - 1][column - 1]);
			neighbors[2].copy(temporarySquares[row][column - 1]);

		}

		else if (row == 0 && column == 99) {

			neighbors = new Square[3];

			for (int i = 0; i < 3; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row][column - 1]);
			neighbors[1].copy(temporarySquares[row + 1][column - 1]);
			neighbors[2].copy(temporarySquares[row + 1][column]);

		}

		else if (column == 0) {

			neighbors = new Square[5];

			for (int i = 0; i < 5; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row - 1][column]);
			neighbors[1].copy(temporarySquares[row - 1][column + 1]);
			neighbors[2].copy(temporarySquares[row][column + 1]);
			neighbors[3].copy(temporarySquares[row + 1][column + 1]);
			neighbors[4].copy(temporarySquares[row + 1][column]);

		}

		else if (row == 99) {

			neighbors = new Square[5];

			for (int i = 0; i < 5; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row][column - 1]);
			neighbors[1].copy(temporarySquares[row - 1][column - 1]);
			neighbors[2].copy(temporarySquares[row - 1][column]);
			neighbors[3].copy(temporarySquares[row - 1][column + 1]);
			neighbors[4].copy(temporarySquares[row][column + 1]);

		}

		else if (column == 99) {

			neighbors = new Square[5];

			for (int i = 0; i < 5; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row + 1][column]);
			neighbors[1].copy(temporarySquares[row + 1][column - 1]);
			neighbors[2].copy(temporarySquares[row][column - 1]);
			neighbors[3].copy(temporarySquares[row - 1][column - 1]);
			neighbors[4].copy(temporarySquares[row - 1][column]);

		}

		else if (row == 0) {

			neighbors = new Square[5];

			for (int i = 0; i < 5; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row][column - 1]);
			neighbors[1].copy(temporarySquares[row + 1][column - 1]);
			neighbors[2].copy(temporarySquares[row + 1][column]);
			neighbors[3].copy(temporarySquares[row + 1][column + 1]);
			neighbors[4].copy(temporarySquares[row][column + 1]);

		}

		else {

			neighbors = new Square[8];

			for (int i = 0; i < 8; i++)
				neighbors[i] = new Square(0, 0, false);

			neighbors[0].copy(temporarySquares[row - 1][column - 1]);
			neighbors[1].copy(temporarySquares[row - 1][column]);
			neighbors[2].copy(temporarySquares[row - 1][column + 1]);
			neighbors[3].copy(temporarySquares[row][column + 1]);
			neighbors[4].copy(temporarySquares[row + 1][column + 1]);
			neighbors[5].copy(temporarySquares[row + 1][column]);
			neighbors[6].copy(temporarySquares[row + 1][column - 1]);
			neighbors[7].copy(temporarySquares[row][column - 1]);

		}

		return neighbors;

	}

}
