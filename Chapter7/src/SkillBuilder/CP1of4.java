package SkillBuilder;

public class CP1of4
{
	private double rad;
	private static double PI = 3.14;
	
	
	public void Circle() 
	{
		rad = 1;
	}
	
	public void Circle(double r) 
	{
		rad = r;	
		
	}
	
	public void setRadius(double r)
	{
		rad = r;
		
	}
	
	public double getRadius()
	{
		return rad;
		
	}
	
	public double area()
	{
		double circArea;
		
		circArea = PI * rad * rad;
		
		return circArea;
		
	}
	
	public double circumference()
	{
		double circ;
		
		circ = 2 * PI * rad;
		
		return circ;
	}
	
	public boolean equals(Object c)
	{
		CP1of4 testObj = (CP1of4)c;
		
		if(testObj.getRadius() == rad)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString()
	{
		String circ;
		
		circ = "Circle radius is "+ rad;
		
		return(circ);
	}
}