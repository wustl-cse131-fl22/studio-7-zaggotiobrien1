package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle (double initLength, double initWidth)
	{
		length = initLength;
		width = initWidth;
		area = length * width;
		perimeter = (2 * length) + (2 * width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	public boolean isLargerThan(Rectangle x)
	{
		if (this.getArea() > x.getArea())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isASquare()
	{
		if (this.getLength() == this.getWidth())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void drawRectangle()
	{
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setXscale(0, width * 2);
		StdDraw.setYscale(0, length * 2);
		StdDraw.filledRectangle(width, length, width / 2, length / 2);
	}
	
	public static void main(String[] args)
	{
		Rectangle one = new Rectangle(10, 10);
		Rectangle two = new Rectangle(5, 5);
		System.out.println(one.isLargerThan(two));
		System.out.println(one.isASquare());
		one.drawRectangle();
		System.out.println(two.isLargerThan(one));
		
	}
}
