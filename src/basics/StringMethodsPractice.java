package basics;

import java.util.Arrays;

public class StringMethodsPractice {
	public static void main(String[] args) {
		
		
		String s1="shyam";
		String s2=" I love you";
		System.out.println(s1+s2);
		
		//address checking ==//
		String s3="helo";
		String s4="helo";
		System.out.println(s3==s4);
		
		//equals-text//
		String s5="helo";
		String s6="helo";
		System.out.println(s5.equals(s6));
		
		//equalsIgnorecase-aither upper r lowerCase//
		String s7="hello";
		String s8="Hello";
		System.out.println(s7.equalsIgnoreCase(s8));
		
		//contains-letter be there r not//
		String s9="helo";
		String s10="how";
		System.out.println(s9.contains("z"));
		System.out.println(s9.contains("e"));
		
		//StartsWith & endsWith//
		String s11="  how are you shyaam  ";
		System.out.println(s11.startsWith("you"));
		String s13="how are you shyaam";
		String s14="I aam Fine swetha";
		System.out.println(s13.startsWith("how"));
		System.out.println(s14.endsWith("swetha"));
		
		//text length//
		String s12="I aam Fine swetha";
		System.out.println(s12.length());
		System.out.println(s12.trim().length());
		
		//trim with length//
		System.out.println(s11.trim().length());
		
		
		//Text Upper & Lower Case//
		String s15= "HELLO SWETHA";
		System.out.println(s11.toUpperCase());
		System.out.println(s15.toLowerCase());
		
		
		//toCharArray-String Strore like a c,h,i,n,n,i//
		System.out.println(s15.toCharArray());
		
		
		//substring //
		String p="chinni";
		System.out.println(p.substring(2));
		
		//split- words split in array//
		String s17="I aam Fine swetha";
		System.out.println(Arrays.toString(s12.split(" ")));
		
		//charAt- letter address//
		System.out.println(s17.charAt(7));
		
		//replace -letter r word//
		System.out.println(s17.replace("a", "z"));
		System.out.println(s17.replace("Fine", "good"));
		
		//valueOf-converting string into integer//
		int i=10284;
		System.out.println(Integer.valueOf(i));
		
		//isEmpty&isBlank//
		String a;
		String b="  ";
		String c="";
		System.out.println(b.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
 