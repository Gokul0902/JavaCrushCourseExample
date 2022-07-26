package stringDemo; // package name 

public class stringMethod 	extends stringBuffer {

	public static void main (String []args) {
		
		String s = " gokulachander";
		String s1 = "";
				int a = 5;
				String amt = "abc2000";
				 String b=amt.substring(3, 7);
				 Integer c = Integer.parseInt(b);
				 
				 System.out.println("sum of the a and c is :"+(a+c));
				 
				 System.out.println("The value of B :"+b);
				 
				System.out.println(s.charAt(4)); // character position identified by index value - u
				
				
		
				// overall character length or count of over all characters involved in this letter
				System.out.println(s.length()); 
				
				// checking equlaity of the string to the given object 
				System.out.println(s.equals("ragul"));
			
				// check equality of the string to the given object without case sensitivity
				System.out.println(s.equalsIgnoreCase("GOKULACHANDER"));
				
				// check whether sting empty or not 
				System.out.println(s1.isEmpty()); 
				
				// check the availability of character in the string 
				System.out.println(s.contains("a"));
				
				// take a particular segment of string
				System.out.println(s.substring(6));
				
				// take a particular portion of string by start end end value of index 
				System.out.println(s.substring(6, 13));
				
				// name concatenation 
				System.out.println(s.concat(" BalaKrishnan"));
				
				// repalce the letters;
				System.out.println(s.replace("g", "G"));
				
				System.out.println(s.replace("g", "G")+s.concat("Bala"));
				
				System.out.println(s.indexOf("c"));
				
				System.out.println(s.indexOf("a", 0));
				
				System.out.println(s.trim());
				
				System.out.println(s.valueOf(a));
				
				
				System.out.println(String.join("/","30","02"));
				System.out.println(String.join("-","i","am","super","man"));
				
				
				
				 
				
		
		
	}
}
