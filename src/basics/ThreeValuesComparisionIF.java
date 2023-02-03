package basics;

public class ThreeValuesComparisionIF {

	
	public static void main(String[] args) {
		
		int a,b,c;
		
		a=5;
		b=2;
		c=7;
		
		
		if((a>b)&&(a>c)){
			System.out.println("a is big");
		}
		if((b>a)&&(b>c)){	
			System.out.println("b is big");
		}
			if((c>a)&&(c>b)){	
				System.out.println("c is big");	
		}
	}
}
