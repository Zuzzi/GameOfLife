package it.me.gameoflife.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.me.gameoflife.control.InputHandler;

public class GUIoptions extends JFrame {

	public static JButton run_stop;
	public static JButton clear;
	public static JButton load_pattern;
	public static JButton exit;
	public static JLabel labelPopulation;
	public static JLabel labelGeneration;

	JPanel container;

	InputHandler listener;

	public GUIoptions() {

		run_stop = new JButton("Run/Stop");
		clear = new JButton("Clear");
		load_pattern = new JButton("Load pattern");
		exit = new JButton("Exit");

		labelPopulation = new JLabel("Population: " + 0);
		labelGeneration = new JLabel("Generation: " + 0);

		container = new JPanel();
		listener = new InputHandler("options gui");

		container.setPreferredSize(new Dimension(240, 90));

		container.setLayout(null);

		Dimension dimFinestra = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimFinestra.width - getWidth()) / 2 - 550, (dimFinestra.height - getHeight()) / 2 - 200);

		setSize(240, 90);
		setTitle(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setContentPane(container);
		pack();

		container.add(run_stop);
		container.add(clear);
		container.add(load_pattern);
		container.add(exit);
		container.add(labelPopulation);
		container.add(labelGeneration);

		run_stop.setBounds(0, 0, 120, 30);
		clear.setBounds(120, 0, 120, 30);
		load_pattern.setBounds(0, 30, 120, 30);
		exit.setBounds(120, 30, 120, 30);
		labelGeneration.setBounds(20, 60, 120, 30);
		labelPopulation.setBounds(140, 60, 100, 30);

		listener.addListener(run_stop);
		listener.addListener(clear);
		listener.addListener(load_pattern);
		listener.addListener(exit);

		container.setBackground(Color.BLACK);

		run_stop.setBackground(Color.BLACK);
		run_stop.setForeground(Color.CYAN);

		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.CYAN);

		load_pattern.setBackground(Color.BLACK);
		load_pattern.setForeground(Color.CYAN);

		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.CYAN);

		labelGeneration.setForeground(Color.WHITE);
		labelPopulation.setForeground(Color.WHITE);

	}

}
