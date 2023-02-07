package basics;

public class SplitExample {
	
	
	public static void main(String[] args) {
		
		
		
		
		int[] arr = new int[5];
		arr[0] = 12;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 28;
		
		String[] fifthClass = new String[5];
		fifthClass[0] = "Swetha";
		fifthClass[1] = "Shyam";
		fifthClass[2] = "Oni";
		fifthClass[3] = "tami";
		
//		for(int i=0 ;i <=3 ; i++ ) {
//			System.out.println(fifthClass[i]);
//		}
		
		
		String sentence = "India is my country";
		String[] variableName = sentence.split(" ");
		for(int i=0 ;i < variableName.length ; i++ ) {
			System.out.println(variableName[i]);
		}
		
		
		
		
	}

}
