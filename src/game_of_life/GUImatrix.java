package game_of_life;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUImatrix extends JFrame {
	
	
	Matrix matrix;
	InputHandler listener;
	JPanel container;
	
	
	
	GUImatrix () {
		
		
		matrix = new Matrix();
		container = new JPanel();
		listener = new InputHandler("matrix gui");
	
		
		

		container.setLayout(null);
		container.setPreferredSize(new Dimension(500,500));
		
		setSize(500,500);
		setTitle ("The Game of Life");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setContentPane(container);
		pack();
		
        
        
		
		
		
		
		
		
		
		container.add(matrix);
		
		
		matrix.setBounds(0, 0, 500, 500);
		
		
		
		addMouseListener(listener);
	
		
		
	}
	
	
	
	
	
	
	
	

}
