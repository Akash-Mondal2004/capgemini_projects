package practicesetdsa.arrays;
//Find the average of array elements.
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,6,18};
		int n = arr.length;
		int sum  =0;
		for(int i :arr) {
			sum += i;
		}
		System.out.println("Average of all number is "+(double)sum/n);
	}

}
