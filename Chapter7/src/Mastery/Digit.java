package Mastery;

public class Digit {
	
	private int number;
	
	public Digit(int digit){
		number = digit;
		
	}
	
	public int Whole() {
		return number;
	}
	
	public int Hundreds() {
		return (number / 100) %10;
	}
	
	public int tens() {
		return (number / 10)%10;
	}
	
	public int ones() {
		return number % 10;
	}
	
	
	

}
