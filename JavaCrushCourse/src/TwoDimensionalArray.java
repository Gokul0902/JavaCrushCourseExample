

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [][] arr = {{2,5,7},
						{11,5,6,9,10},     // jagged array 
						{5,6,10,4}};
		System.out.println(arr.length);
		
		for(int r=0;r<arr.length;r++) {
			for (int c=0;c<arr[r].length;c++) {
				 System.out.println(arr[r][c]);
				 
			}
		}
		 int sum =0;
		 for(int r=0;r<arr.length;r++) {
				for (int c=0;c<arr[r].length;c++) {
					sum = sum + arr [r][c];
				}
				
		}
		 System.out.println("sum of 2D is "+ sum);

}
}
