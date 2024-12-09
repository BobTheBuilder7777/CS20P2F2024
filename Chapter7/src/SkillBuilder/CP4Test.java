package SkillBuilder;

public class CP4Test {
	public static void main(String[] args) {
		
		
		CP4of4 point = new CP4of4();
		CP4of4 point1 = new CP4of4(3);
		
		
		point.setRad(6);
		
		
		System.out.println("Radius of circle: " + point.area());
		System.out.println("Curcumference of circle: " + point.circumference());
		
		System.out.println("Radius of circle: " + point1.area());
		System.out.println("Curcumference of circle: " + point1.circumference());
		
		
		CP4of4.AreaFormula();
		
		
		if (point.equals(point1)) {
			 System.out.println("Objects are the equal/the same.");
			 } else {
			 System.out.println("Objects are not equal/the same.");
			 }
		
		
		System.out.println(point);
		System.out.println(point1);
	}
}