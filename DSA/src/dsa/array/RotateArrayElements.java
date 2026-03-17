package dsa.array;

public class RotateArrayElements {

	public static int[] arr = {10, 5, 30, 6, 8, 20};
	
	public static void main(String[] args) {

		int shiftPos = 2;
		System.out.print("Old array: ");
		printArr(arr);
		
		arr = rotatePosLeft(arr, 3);
		
		System.out.print("New array: ");
		printArr(arr);
		
		arr = rotatePosRight(arr, 2);
		
		System.out.print("New array: ");
		printArr(arr);
		
		
	}
	
	public static int[] rotatePosLeft(int[] arr, int idx) {
		arr = rotate(arr, 0, idx);
		arr = rotate(arr, idx, arr.length);
		arr = rotate (arr, 0, arr.length);
		return arr;
	}
	
	public static int[] rotatePosRight(int[] arr, int idx) {
		arr = rotate (arr, 0, arr.length);
		arr = rotate(arr, 0, idx);
		arr = rotate(arr, idx, arr.length);
		return arr;
	}
	
	public static int[] rotate(int[] arr, int l, int r) {
		while (l<r) {
			int temp = arr[l];
			arr[l++] = arr[r-1];
			arr[--r] = temp;
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int num : arr) System.out.print(num + " ");
		System.out.println();
	}
}
