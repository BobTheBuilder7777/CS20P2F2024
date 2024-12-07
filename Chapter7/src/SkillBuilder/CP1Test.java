package SkillBuilder;

public class CP1Test {
	public static void main(String[] args) {
		
		CP1of4 spot = new CP1of4();
		
		spot.setRadius(6);
		
		System.out.println("The Circles Radius: " + spot.area());
		System.out.println("The Circles circumference: " + spot.circumference());
	}
}