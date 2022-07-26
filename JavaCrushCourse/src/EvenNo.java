import javax.swing.Spring;

public class EvenNo {
	
	private static String OddOrEven(int num) {
	
		String str;
		if (num%2==0) 
			str = num+" is even no";
		else 
			str = num+"is odd no";
		
		return str;
		
	}
	
	public static void main (String[]args) {
		
	System.out.println(OddOrEven(79));
	System.out.println(OddOrEven(4));



		
	
		
	}
	

}
