package basics;

import java.util.Scanner;

public class Scannerpractice1 {

	
	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value:");
		a=s.nextInt();
		
		System.out.println("enter the second value:");
		b=s.nextInt();
		
	    
	
	     System.out.println("enter 1 for add,2 for sub, 3 for mul");
	     
	     c=s.nextInt();
	     
	     int sum =0;
	     
	     if (c == 1) {
	    	 sum = a+b;
	     }
	     
	     if (c == 2) {
	    	 sum = a-b;
	     }
	     if(c==3) {
	    	 sum=a*b;
	    
	     }
	      System.out.println("the value is :"+ sum);
	    s.nextInt();
	        
	}
	
}
