package dsa.problems;

public class Problem2 {
	public static int[][] arr = {{4, 5, 7}, {1, 6, 9}};
	public static void main(String[] args) {
		System.out.println("2D array sum: " + arr2DSum(arr));
	}
	public static int arr2DSum(int[][] arr2D) {
		int sum = 0;
		for (int[] arr1D : arr2D) for (int num : arr1D) sum += num;
		return sum;
	}
}
