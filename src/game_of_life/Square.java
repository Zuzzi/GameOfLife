package game_of_life;

public class Square {
	
	
	int x;
	int y;
	
	Boolean isAlive;
	
	
	
	
	Square (int p_x, int p_y, Boolean p_isAlive) {
		
		
		
		x = p_x;
		y = p_y;
		isAlive = p_isAlive;
		
		
		
	}
	
	
	
	
	
	
	void copy (Square squareToCopy) {
		
		
		isAlive = squareToCopy.isAlive;
		x = squareToCopy.x;
		y = squareToCopy.y;
		
		
		
		
	}
	
	
	

}
