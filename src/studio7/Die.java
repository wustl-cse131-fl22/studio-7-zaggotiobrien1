package studio7;

public class Die {
   
	private int numberOfSides;

	
	public Die (int initinumberofSides) 
	{ 
		numberOfSides = initinumberofSides;
		
	}
	public int rollDie()
	{
		return (int) (Math.random() * getNumberOfSides()) + 1;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

   public static void main(String[] args)
   {
	  Die x = new Die(10);
	  System.out.println(x.rollDie());
   }
	
}
