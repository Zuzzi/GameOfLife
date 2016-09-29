package game_of_life;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class InputHandler implements MouseListener {
	
	
	
	String type;
	
	static LifeEngine lifeEngine;
	static Thread threadLifeEngine;
	
	static GUImatrix matrix_gui;
	static GUIoptions options;
	static GUIpatterns patterns_gui = new GUIpatterns();
	
	static Square [] [] squares = new Square[100][100];
	
	
	
	InputHandler(String p_type) {
		
		
		
		type = p_type;
		
		if (type.equals("matrix gui")) {
			
			
			
			
			int x;
			int y;
			
			
			for (int i = 0; i<100; i++) {
				
				
				
				for (int j = 0; j<100; j++) {
					
					x = j*5;
							
					y = i*5;
					
					
					squares[i][j] = new Square (x,y,false);
					
					
			
			
			
			
			
		}
		
		
			}
			
			
			
		}
		
		
		
	}



	public void mouseClicked(MouseEvent e) {
		
		
		Object source = e.getSource();
		
		
		
		
		if (type.equals("menu gui")) {
			
			
			if (source == GUImenu.play) {
				

				matrix_gui = new GUImatrix();
				options = new GUIoptions();
				
				
				Main.menu.setVisible(false);
				
				
			}
			
			
			
			else if (source == GUImenu.exit) {
				
				
				System.exit(0);
				
				
			}
			

			
			
		}
		
		
		
		
		else if (type.equals("matrix gui")) {
			
			
			int x = e.getX() - 3;
			int y = e.getY() - 26;
			

			
			while (x%5 != 0) x--;
			
			while (y%5 != 0) y--;
			
			
			int row = y/5;
			int column = x/5;
			
			
			
			if (squares[row][column].isAlive) squares[row][column].isAlive = false;
			else squares[row][column].isAlive = true;
			
			
			
			matrix_gui.repaint();
			
			
			
			

			
			
		}
		
		
		
		
		else if (type.equals("options gui")) {
			
			
			
			
			if (source == GUIoptions.run_stop) {
				
				
				lifeEngine = new LifeEngine();
				
				threadLifeEngine = new Thread(lifeEngine);
				
				if (Monitor.handleRunning("get", null) != true) {
					
					Monitor.handleRunning("set", true);
					
					threadLifeEngine.start();
					
					
					
				}
				
				else {
					
					Monitor.handleRunning("set", false);
					
					
					
				}
				
				
				
				
				
			}
			
			
			else if (source == GUIoptions.clear){
				
				
				Monitor.handleRunning("set", false);
				
				
				
			    clearMatrix();
				
				
				
			}
			
			
			else if (source == GUIoptions.load_pattern) {
				
				if (!patterns_gui.isVisible()) {
					
					
					Monitor.handleRunning("set", false);				
					
				    clearMatrix();
					

					patterns_gui.setVisible(true);
					
					
				}
				
				
				
				
				
				
				
				
				
			}
			
			
			else if (source == GUIoptions.exit) {
				
				System.exit(0);
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		else if (type.equals("patterns gui")) {
			
			
			
			if (source == GUIpatterns.load) {
				
				Boolean found = false;
				int k = 0;
				
				
				for (int i = 0; i<5 && !found; i++){
					
					
					if (InputHandler.patterns_gui.list.get(i).isSelected()){
						
					
						found = true;
						k = i;
					}

					
					
				}
					
				
				
				PatternsLibrary.printPattern(patterns_gui.list.get(k).getText());
				
				
				
				patterns_gui.setVisible(false);
				
				
				
				
				
				
			}
			

			
			
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	protected void clearMatrix() {
		
		
		
		
		for (int i = 0; i<100; i++) {
			
			
			
			for (int j = 0; j<100; j++) {
				
				
				InputHandler.squares[i][j].isAlive = false;
				
				
			}

		}
		
		
		
		InputHandler.options.labelGeneration.setText("Generation: " + 	Monitor.handleGeneration("set", 0));
		InputHandler.options.labelGeneration.repaint();
		
		
		
		InputHandler.matrix_gui.matrix.repaint();
		
		
		
		
		
		
		
		
		
	}



	
	public void mouseEntered(MouseEvent e) {
	
		
	}



	public void mouseExited(MouseEvent e) {
	
		
	}




	public void mousePressed(MouseEvent e) {
		
		
	}




	public void mouseReleased(MouseEvent e) {
		
		
	}
	
	
	
	
	
	
	
	
	
	


	void addListener(JButton c){
		c.addMouseListener(this);
	}

	
	
	
	
	

}
