package stringDemo;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StringBuffer s = new StringBuffer("Gokul");
		 
		StringBuffer name  = s.append("Chander");
		 
		 System.out.println("Full name :"+name);
		 
		 System.out.println(" Name :"+s);
		 
		 
		 String r= new String("gokul");
		String nom = r.concat("chander");
		System.out.println("Full name :"+nom);
		
		System.out.println("name "+r);
		
		System.out.println(s.reverse());
		System.out.println(s.capacity());
		System.out.println(s.replace(0, 2, "sha"));
		System.out.println(s.reverse());
		System.out.println(s.delete(10, 13));
		System.out.println(s.append("er"));
		System.err.println(s.length());
		 
	}

}
