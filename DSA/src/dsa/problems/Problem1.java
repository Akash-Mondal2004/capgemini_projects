package dsa.problems;

public class Problem1 {
	public static int[] arr = {3, 6, 1, 7, 9, 4, 8};
	public static void main(String[] args) {
		System.out.println("Third largest: " + largest3(arr));
	}
	public static Integer largest3(int[] arr) {
		if (arr.length < 3) {
			System.out.println("Array size less than 3");
			return null;
		}
		int[] largest = new int[3];
		largest[0] = arr[0];
		largest[1] = arr[1];
		largest[2] = Integer.MIN_VALUE;
		if (largest[1] > largest[0]) swap(largest, 0, 1);
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > largest[2]) {
				largest[2] = arr[i];
				if (largest[2] > largest[1]) {
					swap(largest, 1, 2);
					if (largest[1] > largest[0]) swap(largest, 0, 1);
				}
			}
		}
		return largest[2];
	}
	public static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
