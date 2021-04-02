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
		Set<Character> charSet = new LinkedHashSet<Character>();	
		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupChrSet = new LinkedHashSet<Character>();

		// add char array into CharSet & add charSet duplicate values into DupChrSet
		  for (Character eachChar : sC) {
	            if (!charSet.add(eachChar)) {
	            	dupChrSet.add(eachChar);
	            }
	        }

		System.out.println("character Array values in CharSet: "+charSet);
		
		// remove all values present in dupChrSet from CharSet
		charSet.removeAll(dupChrSet);
		
		System.out.println("dupChrSet" + dupChrSet);
		System.out.println("CharSet after removing dupChrSet values from it: "+charSet);
		
		//remove spaces in CharSet and print each value
		System.out.print("charSet with unique values from PayPal India String: ");
		for (Character eachCh : charSet) {
			if (eachCh != ' ') {
				System.out.print(eachCh+ " ");
			}
		}
		
	}
}
	
	
