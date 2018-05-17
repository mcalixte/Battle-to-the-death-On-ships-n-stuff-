
public class Ships {
	
	private String letPos;
	private int intPos;
	static private int counter=0;
	
	
	public Ships(String lPos, int iPos)
	{
		letPos=lPos;
		intPos=iPos;
	}
	
	
	// Destroy method
	
	public int destroy(String l, int i)
	{
		if((letPos==l)&&(intPos==i))
			counter++;
		
		return counter;
	}
	
	
	
	//Get Methods
	
	public String getLetPos()
	{
		return letPos;
	}
	
	
	
	public int getIntPos()
	{
		return intPos;
	}
	
	
	//Other methods
	
	public String toString()
	{
		return("the position of the ship is "+letPos+intPos);
	}
	
	
	public boolean equals(Ships ship)
	{
		if((this.letPos==ship.letPos)&&(this.intPos==ship.intPos))
			return true;
		else
		{
		return false;
		}
	}
	

}
