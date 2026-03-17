package practicesetdsa.arrays;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 35, 1, 10, 34, 1};	
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: "+ secondLargest);

	}

}
