package stringDemo;

public class SwitchCase {


public static void main(String[]args) {
	
	
	
	char grade = 'B';   // input data 
	
	switch (grade) {
	
	case 'A':
		 System.out.println(" First Class ");
		 break;
	case 'B':
		System.out.println("Second Class");
		break;
	case 'c':
		System.out.println("Third Class");
		break;
	case 'D':
		System.out.println("Below Third Class");
		break;
		default :
			System.out.println(" Fail need to work haerd ");
	
	}
}

}