
public class IfElseIfLaddeer {

	public static void main(String[] args) {
		
		int mark = 101 ;
		
		if (mark<50) {
			System.out.println(" you are fail and work hard ");
		} else if (mark>= 50 && mark<60) {
			System.out.println(" Grade D and keep try for your best");
		}else if (mark>=61 && mark<75) {
			System.out.println("Grade C and good aim high");
		}else if (mark>=76 && mark<85) {
			System.out.println("Grade B and good");
		}else if (mark<100) {
				System.out.println("Grade A and execellent score ");
		} else {
			System.out.println(" Mark is invalid ");
		}
	

	}

}
