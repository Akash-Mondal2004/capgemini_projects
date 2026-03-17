package practicesetdsa.arrays;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {10, 20, 30, 40, 50};
	     int[] arr2 = new int[arr1.length];
	     for (int i = 0; i < arr1.length; i++) {
	          arr2[i] = arr1[i];
	     }
	     for (int num : arr2) {
	         System.out.print(num + " ");
	      }

	}

}
