package basics;

import java.util.Scanner;

public class Scannerpractice {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value:");
		a=s.nextInt();
		
		System.out.println("enter second value");
		b=s.nextInt();
		
		
		System.out.println("enter third value");
		c=s.nextInt();
		
		
	  d=a+b+c;
	  System.out.println(d);
	  s.close();
	}
}
