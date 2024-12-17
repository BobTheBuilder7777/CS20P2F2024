package SkillBuilder;

public class CP4of4 {
	private double rad;
	private static final double PI = 3.14;
	
		public CP4of4() { 
			rad = 1;
		}
		public CP4of4(double r) { 
			rad = r;
		}
		public void setRad(double newRadius) { 
			rad = newRadius;
		}
		
		public double area(){ 
			return(rad * rad * PI);
		}
		
		public double getRad() { 
			 return(rad);
		}
		
		public double circumference(){ 
			return(rad * 2 * PI);
		}
		
		public static void AreaFormula() {
			System.out.println("The area formula of a circle is A = Pi*r*r");
		}
		
		
		public boolean equals(Object c) {
			CP4of4 circle = (CP4of4)c;
			
			if (circle.getRad() == rad) {
				return(true);
			} else {
				return(false);
			}
		}
		
		//method to output current radius of circle
		public String toString() {
			String circleString = "Circle's radius is " + rad;
			return(circleString);
		}
}