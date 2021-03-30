package week3.day1.assignments;

import java.util.ArrayList;
import java.util.HashMap;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt = "welcome to Selenium automation";
		char[] strArray = srt.toCharArray(); 			
		
		//Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCntMap = new HashMap<Character, Integer>();				
		
		//If char 'eachChar' is present in charCountMap, 
		//incrementing count by 1 
		//If char 'eachChar' is not present in charCountMap,
		//put 'eachChar' into charCntMap with 1 as it's value 		
		for (char eachChar : strArray) {
			if(charCntMap.containsKey(eachChar))
            {
				charCntMap.put(eachChar, charCntMap.get(eachChar)+1);
            }
            else
            {             
            	charCntMap.put(eachChar, 1);
            }
		}		
		System.out.println(charCntMap);
	}
		
}
