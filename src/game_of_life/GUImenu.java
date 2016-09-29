package game_of_life;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUImenu extends JFrame {
	
	
	static Picture logo;
	static JButton play;
	static JButton exit;
	
	
	static JPanel container;
	
	static InputHandler listener;
	
	
	
	
	GUImenu() {
		
		
		
		
		logo = new Picture("logoLIFE.png");
		play = new JButton("Play");
		exit = new JButton("Exit");
		container = new JPanel();
		listener = new InputHandler("menu gui");
		
		
		
		

		container.setLayout(null);
		container.setPreferredSize(new Dimension(460,240));
		
		setSize(460,260);
		setTitle ("Menu");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setContentPane(container);
		pack();
		
		
		
		container.add(logo);
		container.add(play);
		container.add(exit);
		
		
		
		logo.setBounds(0,0,457,160);
		play.setBounds(80, 180, 120, 30);
		exit.setBounds(260, 180, 120, 30);
		
		

		listener.addListener(play);
		listener.addListener(exit);
		
		
		
		
		
		container.setBackground(Color.BLACK);
		
		
		play.setBackground(Color.BLACK);
		play.setForeground(Color.CYAN);
		
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.CYAN);
		
		

		
		
	}
	
	
	
	
	
	
	
	
	

}
