package SkillBuilder;

public class RP1Test {
	public static void main(String[] args) {

		
		RP1of5 box = new RP1of5();
		RP1of5 box2 = new RP1of5(5, 7);
		
		
		box.setLe(8);
		box.setWi(9);
		
	
		System.out.println("box length is " + box.getLe());
		
		System.out.println("box width is " + box.getWi());
		
		System.out.println("box2 length is " + box2.getLe());
		
		System.out.println("box2 width is " + box2.getWi());
		
		System.out.println("box area is " + box.A());
		
		System.out.println("box perimeter is " + box.P());
		
		System.out.println("box2 area is " + box2.A());
		
		System.out.println("box2 perimeter is " + box2.P());
	}
}