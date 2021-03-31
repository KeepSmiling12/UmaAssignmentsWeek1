package week3.day1.assignments;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)				
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//get the length of the array			
		System.out.println(input.length);
		
		//sort the array	
		Arrays.sort(input);
		String s = Arrays.toString(input);		
		System.out.println(s);
		
		//Iterate it in the reverse order		
		for (int i = input.length-1; i >= 0 ; i--) {
			System.out.println(input[i]);
			
		}
		
	}

}
