package practicesetdsa.arrays;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 21, 32, 43, 54, 65};
		int evenCount = 0;
	    int oddCount = 0;
	    for (int num : arr) {
	        if (num % 2 == 0) {
	            evenCount++;
	         }else{
	            oddCount++;
	         }
	     }
	     System.out.println("Even numbers: " + evenCount);
	     System.out.println("Odd numbers: " + oddCount);
	}

}
