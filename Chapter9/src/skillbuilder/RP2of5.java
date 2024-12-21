package SkillBuilder;

public class RP2of5 {
	private double le, wi;
	
	public RP2of5(){
		le = 1;
		wi = 1;
	}

	public RP2of5(double l, double w){
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
	public static void AreaFormula(){
		System.out.println("The rectangle Area formula is A = L * W");
	}
}
