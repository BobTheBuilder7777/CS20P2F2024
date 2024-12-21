package skillbuilder;

public class Reverse {

	public static void main(String[] args) {
		
		int[] reverse = new int[10];
		
		for( int i = 0; i < 9; i++) {
			reverse[i] = i;
		}
		
		int countdown = reverse.length;
		System.out.println("COUNT DOWN");
		while (countdown > 0) {
			
			System.out.print((countdown - 1) + " ");
			countdown -= 1;
			
		}
	}

}
