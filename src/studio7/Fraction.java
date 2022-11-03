package studio7;

public class Fraction {

	private int Numerator;
	private int Denominator;
	
	public Fraction(int initiNumerator, int initiDenominator)
	{
		setNumerator(initiNumerator);
		setDenominator(initiDenominator);
	}

	public int getDenominator() {
		return Denominator;
	}

	public void setDenominator(int denominator) {
		Denominator = denominator;
	}

	public int getNumerator() {
		return Numerator;
	}

	public void setNumerator(int numerator) {
		Numerator = numerator;
	}
	
	public String getFraction() 
	{
		return getNumerator() + "/" + getDenominator();
	}
	
	public String addFraction(Fraction x) 
	{
		int newDenominator = this.getDenominator() * x.getDenominator();
		int newNumerator = (this.getNumerator() * x.getDenominator()) + (x.getNumerator() * this.getDenominator());
		return (newNumerator + "/" + newDenominator);
	}
	
	public String MultiplyFraction(Fraction x) 
	{
		return (this.getNumerator() * x.getNumerator()) + "/" + (this.getDenominator() * x.getDenominator());
	}
	public String getRFraction() 
	{
		return getDenominator() + "/" + getNumerator();
	}
	public int GCD() 
	{
		if (getNumerator() == 0) {
			return 0;
		} else {
			return GCD(getNumerator(), getNumerator() % getDenominator());
		}
	}
	public static void main(String[] args)
	{
		Fraction x = new Fraction (3, 9);
		Fraction y = new Fraction (5, 7);
	    System.out.println(x.getFraction());
	    System.out.println(x.addFraction(y));
	    System.out.println(x.MultiplyFraction(y));
	    System.out.println(x.getRFraction());
	    System.out.println(x.simplifyFraction());
	    
	}
} 
