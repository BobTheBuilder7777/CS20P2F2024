package SkillBuilder;

public class CP2of4 {

	public double rad;
	public static final double PI = 3.14;
	
	public CP2of4() {
		rad = 1;
	}
	
	public CP2of4(double r) {
		rad = r;
	}
	
	public void setRadius(double newRadius) {
		rad = newRadius;
	}
	
	public double area(){ 
		return(rad * rad * PI);
	}
	
	public double getRadius() { 
		 return(rad);
	}
	
	public double circumference(){ 
		return(rad * 2 * PI);
	}
	
	
}