package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String as PayPal India
		
		String s = "PayPal India";
		
		// Convert it into a character array
		char[] sC = s.toCharArray();
		
		// Declare a Set as charSet for Character		
		Set<Character> charSet = new HashSet();
	
		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupChrSet = new HashSet();

		// Iterate character array and add it into charSet	
		System.out.println("character Array values:");
		for (int i = 0; i < sC.length; i++) {			
			System.out.print(sC[i]+ " ");
			charSet.add(sC[i]);
		}
		
		System.out.println("charSet with all the unique values from String s "+charSet);
		

		// if the character is already in the charSet then, add it to the dupCharSet
		dupChrSet.addAll(charSet);
		System.out.println("charSet values in dupChrSet: "+charSet);

		// Check the dupCharSet elements and remove those in the charSet
		dupChrSet.removeAll(charSet);
		System.out.println("dupChrSet after removeAll(charSet):  "+dupChrSet);
		System.out.println(" ");
		
		
		// Iterate using charSet
		// Check the iterator variable isn't equals to an empty space
		// print each character for charSet
		
		Iterator<Character> it = charSet.iterator();
		while (it.hasNext()) {
			
			if(it.next().equals(' ')){						
				it.remove();
			}
		
		}
		
		System.out.println("charSet after removing empty spaces:");
		System.out.println(charSet);	
	}
}
	
	
