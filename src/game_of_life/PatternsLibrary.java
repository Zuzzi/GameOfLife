package game_of_life;

public class PatternsLibrary {
	
	
	
	
	
	static void printPattern(String type) {
		
		
		if (type.equals("Line")) {
			
			
			
			for (int i = 0; i<100; i++) {
				
				
				for (int j = 0; j<100; j++) {
					
					if (i == 50) InputHandler.squares[i][j].isAlive = true;
					
					
					
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		else if (type.equals("Gliders")) {
			
			
			
            for (int i = 0; i<100; i++) {
				
				
				for (int j = 0; j<100; j++) {
					
					if ((i == 11 && j == 3) || (i == 11 && j == 4) || (i == 11 && j == 5) || (i == 10 && j == 5) || (i == 9 && j == 4)
							|| (i == 11 && j == 11) || (i == 11 && j == 12) || (i == 11 && j == 13) || (i == 10 && j == 13)
							|| (i == 9 && j == 12) || (i == 11 &&  j == 19) || (i == 11 && j == 20) || (i == 11 && j == 21)
							|| (i == 10 && j == 21) || (i == 9 && j == 20) || (i == 17 && j == 6) || (i == 17 && j == 7)
							|| (i == 17 && j == 8)  || (i == 16 && j == 8) || (i == 15 && j == 7) || (i == 17 && j == 14)
							|| (i == 17 && j == 15) || (i == 17 && j == 16) || (i == 16 && j == 16) || (i == 15 && j == 15)
							|| (i == 23 && j == 8) || (i == 23 && j == 9) || (i == 23 && j == 10) || (i == 22 && j == 10)
							|| (i == 21 && j == 9)) InputHandler.squares[i][j].isAlive = true;
					
					
				
					
					
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		else if (type.equals("Space ships")) {
			
			
			
			for (int i = 0; i<100; i++) {
				
				
				
				for (int j = 0; j<100; j++) {
					
					
					if ((i == 34 && j == 4) || (i == 36 && j == 4) || (i == 37 && j == 5)
							|| (i == 37 && j == 6) || (i == 37 && j == 7) || (i == 37 && j == 8 )
							|| (i == 36 && j == 8) ||(i == 35 && j == 8) || (i == 34 && j == 7)
							|| (i == 45 && j == 5) || (i == 45 && j == 6) || (i == 45 && j == 7)
							|| (i == 45 && j == 8) || (i == 44 && j == 8) || (i == 43 && j == 8)
							|| (i == 44 && j == 4) || (i == 42 && j == 4) || (i == 42 && j == 7)
							|| (i == 41 && j == 16) || (i == 41 && j == 17) || (i == 41 && j == 18)
							|| (i == 41 && j == 19) || (i == 40 && j == 19) || (i == 39 && j == 19)
							|| (i == 38 && j == 18) || (i == 40 && j == 15) || (i == 38 && j == 15)) 
						InputHandler.squares[i][j].isAlive = true;
	
					
				}

				
			}

		}
		
		
		
		
		else if (type.equals("Glider gun")) {
			
			
			
			for (int i = 0; i<100; i++) {
				
				
				
				for (int j = 0; j<100; j++) {
					
					
					   if ((i == 18 && j == 11) || (i == 18 && j == 12) || (i == 19 && j == 11)
							   || (i == 19 && j == 12) || (i == 18 && j == 21) || (i == 19 && j == 21)
							   || (i == 20 && j == 21) || (i == 17 && j == 22) || (i == 21 && j == 22)
							   || (i == 22 && j == 23) || (i == 22 && j == 24) || (i == 16 && j == 23)
							   || (i == 16 && j == 24) || (i == 21 && j == 26) || (i == 17 && j == 26)
							   || (i == 18 && j == 27) || (i == 20 && j == 27) || (i == 19 && j == 27)
							   || (i == 19 && j == 28) || (i == 19 && j == 25) || (i == 18 && j == 31)
							   || (i == 18 && j == 32) || (i == 17 && j == 31) || (i == 17 && j == 32)
							   || (i == 16 && j == 31) || (i == 16 && j == 32) || (i == 15 && j == 33)
							   || (i == 19 && j == 33) || (i == 15 && j == 35) || (i == 14 && j == 35)
							   || (i == 19 && j == 35) || (i == 20 && j == 35) || (i == 16 && j == 45)
							   || (i == 17 && j == 45) || (i == 17 && j == 46) || (i == 16 && j == 46))
							
						InputHandler.squares[i][j].isAlive = true;
					
					
					
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		else if (type.equals("Random")) {
			
			
			int random;
			
			for (int i = 0; i<100; i++) {
				
				for (int j = 0; j<100; j++) {
					
					
					random = (int)(Math.random()*10000)%3;
					
					if (random == 0) InputHandler.squares[i][j].isAlive = true;
					
				}
				
				
				
			}
			

			
			
			
		}
		
		
		
		
		
		
		
		
		InputHandler.matrix_gui.repaint();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
