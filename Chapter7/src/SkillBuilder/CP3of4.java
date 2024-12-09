package SkillBuilder;

public class CP3of4 {
	private double rad;
	private static final double PI = 3.14;
	
		public CP3of4() { 
			rad = 1;
		}
		public CP3of4(double r) { 
			rad = r;
		}
		public void setRad(double newRad) { 
			rad = newRad;
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
		
		public static void AreaFormula() {
			System.out.println("The area formula of a circle is A = Pi*r*r");
		}
}