package game_of_life;

public class Monitor {
	
	
	
	
	
	

	
	static synchronized Boolean handleRunning(String action, Boolean value) {
		
		
		

		
		if (action.equals("set")) LifeEngine.running = value;
		
		
		
		return LifeEngine.running;
		
		
		
	}
	
	
	
	
	static synchronized int handleGeneration (String action, Integer value) {
		
		
		
		
		
		if (action.equals("set")) LifeEngine.generation = value;
		
		else if (action.equals("increment")) LifeEngine.generation++;
		
		
		return LifeEngine.generation;
		
		
		
	}
	
	
	
	
	
	
	
	

}
