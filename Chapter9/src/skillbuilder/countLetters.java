package skillbuilder;

import java.util.Scanner;

public class countLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter a phrase or word: ");
        String phrase = input.nextLine(); 

        phrase = phrase.toLowerCase();
        
        int[] letterscount = new int[26]; 
        char[] ArrayChar = phrase.toCharArray();
        
        for (char i : ArrayChar)
        {
        	if (i >= 'a' && i <= 'z')
        	{
        		letterscount[i  - 'a']++;
        	}
        }
        
        System.out.println("\nLetter counts:");
        for (int i = 0; i < letterscount.length; i++) {
            if (letterscount[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + letterscount[i]);
        

	}

        }
        
	}
	
}

