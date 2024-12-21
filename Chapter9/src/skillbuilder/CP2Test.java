package SkillBuilder;

public class CP2Test {
	public static void main(String[] args) {

		
		CP2of4 point = new CP2of4();
		
		CP2of4 point1 = new CP2of4(3);
		
		
		point.setRadius(6);
		
		
		System.out.println("The radius of the circle is: " + point.area());
		System.out.println("The circumfrrence of the circle is: " + point.circumference());
		
		System.out.println("The radius of the circle is: " + point1.area());
		System.out.println("The circumference of the circle is: " + point1.circumference());
	}
}