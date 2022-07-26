
public class Polymorphism1 {
	
	public static void add() {
		int sum = 10+4;
		System.out.println(sum);
	}
	//public static void add(int a,int b) {
		
		//int c = a+b;
		//System.out.println(c);
		
	//}
	public static void add(float a, float b) {
		
		float sum = a+b; 
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		add();
		add(4, 9);
	
		
		

	}

}
