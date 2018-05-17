
public class Grenade {
	
	private String letPos;
	private int intPos;
	
	//Constructors 
	
	public Grenade(String lPos, int iPos)
	{
		letPos=lPos;
		intPos=iPos;
	}
	
	//Methods
	
	public String toString()
	{
		return("The position of this grenade is "+letPos+intPos);
	}
	
	
	public boolean equalsShips(Ships ship)
	{
		if(this.letPos==ship.getLetPos()  &&  this.intPos==ship.getIntPos())
		return true;
		
		return false;
	}
	
	
	public boolean equalsGrenade(Grenade grenade)
	{
		if((this.letPos==grenade.letPos)&&(this.intPos==grenade.intPos))
			return true;
		
		return false;
	}
	
	

}
