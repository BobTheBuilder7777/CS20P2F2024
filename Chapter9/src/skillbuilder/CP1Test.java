package SkillBuilder;

public class CP1Test {
	public static void main(String[] args) {
		
		CP1of4 point = new CP1of4();
		
		point.setRadius(6);
		
		System.out.println("The Circles Radius: " + point.area());
		System.out.println("The Circles circumference: " + point.circumference());
	}
}