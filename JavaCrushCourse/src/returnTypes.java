
public class returnTypes {
// data
	int collectTheAMount=1000;
	
	public int collectAmount() { // method 
		
		System.out.println("The collectdd amount is :"+collectTheAMount);
		return collectTheAMount;
	}
	public static void main(String[] args) {
		
		returnTypes amount = new returnTypes();
		
		int amt = amount.collectAmount();
		
		System.out.println(" the mount recieved "+amt);
		

	}

}
