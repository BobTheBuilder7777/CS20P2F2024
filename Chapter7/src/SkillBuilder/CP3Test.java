package SkillBuilder;

public class CP3Test {

	public static void main(String[] args) {
		
		
		CP3of4 point = new CP3of4();
		CP3of4 point1 = new CP3of4(3);
		
		
		point.setRad(6);
		
		
		System.out.println("Radius of circle: " + point.area());
		System.out.println("Curcumference of circle: " + point.circumference());
		
		System.out.println("Radius of circle: " + point1.area());
		System.out.println("Curcumference of circle: " + point1.circumference());
		
		
		CP3of4.AreaFormula();

	}
	
}