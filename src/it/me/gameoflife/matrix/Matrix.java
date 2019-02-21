package it.me.gameoflife.matrix;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import it.me.gameoflife.control.InputHandler;
import it.me.gameoflife.control.LifeEngine;

public class Matrix extends JPanel {

	int demographyCount;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.GRAY);

		for (int i = 0; i < 500; i += 5) {

			g.drawLine(0, i, 500, i);

		}

		for (int i = 0; i < 500; i += 5) {

			g.drawLine(i, 0, i, 500);

		}

		demographyCount = 0;

		for (int i = 0; i < 100; i++) {

			for (int j = 0; j < 100; j++) {

				paintSquare(InputHandler.squares[i][j], g);

			}

		}

		LifeEngine.population = demographyCount;
		InputHandler.options.labelPopulation.setText("Population: " + LifeEngine.population);
		InputHandler.options.labelPopulation.repaint();

	}

	private void paintSquare(Square square, Graphics g) {

		if (square.isAlive) {

			g.setColor(Color.BLUE);

			g.drawRect(square.x, square.y, 5, 5);

			g.fillRect(square.x, square.y, 5, 5);

			demographyCount++;

		}

	}

}
