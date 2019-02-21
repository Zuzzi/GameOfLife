package it.me.gameoflife.util;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Picture extends JPanel {

	String path;

	public Picture(String p_path) {

		path = "/" + p_path;

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Image picture = new ImageIcon(this.getClass().getResource(path)).getImage();

		g.drawImage(picture, 0, 0, this);

	}

}
