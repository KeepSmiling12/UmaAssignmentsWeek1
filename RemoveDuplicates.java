package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
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
		for (int j = 0; j < sC.length; j++) {			
			System.out.print(sC[j]+ " ");
			charSet.add(sC[j]);
		}
		System.out.println(" ");
		System.out.println("charSet with unique values from String:  "+charSet);
				
		// add  just duplicates to dupChrSet
		System.out.println("Only duplicates added to dupChrSet ");
		for (int i = 0; i < sC.length; i++) {
			if(!dupChrSet.add(sC[i])) {
						System.out.print(sC[i]+ " ");			
			}
				
		}
		System.out.println(" ");
		System.out.println("dupCharSet: "+dupChrSet);
				
		// Check the dupCharSet elements and remove those in the charSet
		for (Character c : dupChrSet) {
			if (charSet.contains(c)) {			
				charSet.remove(c);
			}
		}		
		System.out.println("charSet after removing those in dupChrSet:  "+charSet);		
		System.out.println("dupChrSet "+dupChrSet);
		System.out.println(" ");		
		
		// Iterate using charSet
		// Check the iterator variable isn't equals to an empty space
		// print each character for charSet		
		Iterator<Character> it = dupChrSet.iterator();
		while (it.hasNext()) {
			
			if(it.next().equals(' ')){						
				it.remove();
			}		
		}		
		System.out.println("Set after removing empty spaces:");
		System.out.println(dupChrSet);	
						
	}
}
	
	
