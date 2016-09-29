package game_of_life;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUIpatterns extends JFrame {
	

	
	static ArrayList <JRadioButton> list;

	static JButton load;
	static JPanel container;
	static InputHandler listener;
	

	
	
	public GUIpatterns () {
		
		
		list = new ArrayList <JRadioButton>();
		container = new JPanel();
		load = new JButton("Add");
		listener = new InputHandler("patterns gui");
		
		
		
		
		container.setLayout(null);
		container.setPreferredSize(new Dimension(130,210));
		
		
		
		buildList();
		
		
		
		
		
		container.add(load);
		
	
		load.setBounds(10, 170, 120, 30);
		
		
		
		container.setBackground(Color.BLACK);
		
		load.setBackground(Color.BLACK);
		load.setForeground(Color.CYAN);
		
		
		setContentPane(container);
		pack();
		
		
	
		
		

		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation( (dimWindow.width - getWidth())/2 + 400,(dimWindow.height - getHeight())/2 - 80 );
		setResizable(false);  
		setVisible(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle(null);
		
		
		listener.addListener(load);
		
		

	}
	
	
	
	
	
	public void buildList() {
		
	
		
		
		ButtonGroup group = new ButtonGroup();
		
		
		
		list.add(new JRadioButton("Line", true));
		list.add(new JRadioButton("Gliders", false));
		list.add(new JRadioButton("Space ships", false));
		list.add(new JRadioButton("Glider gun", false));
		list.add(new JRadioButton("Random", false));
		
		
		container.add(list.get(0));
		container.add(list.get(1));
		container.add(list.get(2));
		container.add(list.get(3));
		container.add(list.get(4));
		
		
		group.add(list.get(0));
		group.add(list.get(1));
		group.add(list.get(2));
		group.add(list.get(3));
		group.add(list.get(4));
		
		
		
		
		list.get(0).setBounds(10, 10, 120, 20);
		list.get(1).setBounds(10, 40, 120, 20);
		list.get(2).setBounds(10, 70, 120, 20);
		list.get(3).setBounds(10, 100, 120, 20);
		list.get(4).setBounds(10, 130, 120, 20);
		
		
		list.get(0).setBackground(Color.BLACK);
		list.get(1).setBackground(Color.BLACK);
		list.get(2).setBackground(Color.BLACK);
		list.get(3).setBackground(Color.BLACK);
		list.get(4).setBackground(Color.BLACK);
		
		
		list.get(0).setForeground(Color.CYAN);
		list.get(1).setForeground(Color.CYAN);
		list.get(2).setForeground(Color.CYAN);
		list.get(3).setForeground(Color.CYAN);
		list.get(4).setForeground(Color.CYAN);
	
		
		
		
		
	
	
	
	
	}
	
	
	
	
	

}
