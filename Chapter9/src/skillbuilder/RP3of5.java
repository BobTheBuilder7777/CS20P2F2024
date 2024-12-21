package SkillBuilder;

public class RP3of5 {
	private double le, wi;
	
	public RP3of5(){
		le = 1;
		wi = 1;
	}

	public RP3of5(double l, double w){
		le = l;
		wi = w;
	}
	
	public double getLe() {
		return(le);
	}
	
	public double getWi() {
		return(wi);
	}
	
	public void setLe(double l) {
		le = l;
	}
	
	public void setWi(double w) {
		wi = w;
	}
	
	public double A() {
		return(le * wi);
	}
	
	public double P() {
		return(2 * (le + wi));
	}
	public static void displayAreaFormula(){
		System.out.println("The rectangle formula is A = L * W");
	}
	
	public boolean equal(Object b) {
		RP3of5 rectangle = (RP3of5)b;
		
		if ((rectangle.getLe() == le) && (rectangle.getWi() == wi)) {
			return(true);
		}
		else {
			return(false);
		}
	}
	
	public String toString() {
		String rectangleString = "Rectangle length is " + le + " and the width is" + wi;
		return(rectangleString);
	}
}