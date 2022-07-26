import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
	
		int [] arr= { 12,4,1,9};
		
		int [] b = new int [4];
	      b[0]=2;
	      b[1]=5;
	      b[2]=10;
	      b[3]=8;
	      
	      
	   // sum of arrays 
	    		  int sum=0;
				for (int i =0;i<b.length;i++) {
	    			  sum = sum + b [i];   
	    		  }
	    			  System.out.println(sum);
	    			  
	    				// copy of arrays 	  
	    					  
		int [] arr1 = java.util.Arrays.copyOf(arr, arr.length);
	      arr1[0]= 14;
	      
	      for (int j : b) {
	    	  System.out.println(j);
			
		}
	      // assign value to arrays 
	      
	      for (int i=0;i<arr1.length;i++) {
	    	  System.out.println(arr[i]);
	      }
	      
	      System.out.println("..............................");
	      for (int j : b) {
	    	  
	    	  System.out.println(j);
	    	  
			
		}
	     
	      
	}

}
