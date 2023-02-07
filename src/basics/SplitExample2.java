package basics;

import java.util.Arrays;

public class SplitExample2 {
	
	
	
	public static void main(String[] args) {
		
		
		String name = "Swetha Vechalapu";
		
		

		String[] s = name.split(" ");
		System.out.println(name.split(" ")[0]);
		System.out.println(s[1]);
		
		
		String dummy = "My name is India";
		String[]  myarr = dummy.split(" ");
		System.out.println( myarr[3]);
	    
	
		
	}

}
