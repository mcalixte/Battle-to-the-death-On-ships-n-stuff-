import java.util.Scanner;

public class BattleShips {
	
	public static void main (String [] args)
	{
	
	//Title Introduction to the game
	
	System.out.println(" ------------------------------------------- ");
	System.out.println("|                                           |");
	System.out.println("|   Welcome to the Game of BattleShips      |");
	System.out.println("|                                           |");
    System.out.println(" ------------------------------------------- ");
    
    //Variables needed
    Scanner key = new Scanner(System.in);
    
    int numShips = 6;
    int numGrenades = 4;
    int gridSize = 8;
   
    
  //Prompting user to create their ships and assign positions
    
    Ships [] shipArray = new Ships [numShips];
    
    for(int i = 0; i<numShips; i++)
    {
    	System.out.print("Put in a position for the ship " +i);
    	
    	String letPos = key.next();
    	int intPos = key.nextInt();
    	
    	shipArray [i] = new Ships(letPos, intPos);
    	
    }
    
    
    
    // Prompting user to create the grenades and assign positions different from ships
    
    Grenade [] grenadeArray = new Grenade[numGrenades];
    
    for(int j =0; j<numGrenades; j++)
    {
    	System.out.print("Put in the position of grenade "+j);
    	
    	String letPos = key.next();
    	int intPos = key.nextInt();
    	
    	grenadeArray[j] = new Grenade(letPos, intPos);
    }
    
    
    
    
    
    
    
    
    
    
    
  
    
    
	}  
	
	
	//Method for testing if grenades and ships are at the same position
	
	public boolean positionTest()
	{
		if()
	}
}
