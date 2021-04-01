package week3.day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)				
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//get the length of the array			
		System.out.println(input.length);
				
		//sort using collections: 1)create an empty List 2) add string[] to List 3) use sort()
		List<String> cLst = new ArrayList<String>();
		for (String s1 : input) {
			cLst.add(s1);
		}
				
		System.out.println("String[] added to List:  "+cLst);
		System.out.println(" ");
	
		Collections.sort(cLst);
		System.out.println("Sorted using using Collection.sort():  "+cLst);
		System.out.println(" ");
		
		Collections.reverse(cLst);
		System.out.println("reversed using Collection.reverse():  "+cLst);
		
	}

}
