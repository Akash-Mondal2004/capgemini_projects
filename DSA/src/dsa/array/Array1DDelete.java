package dsa.array;

import java.util.Scanner;

public class Array1DDelete {
	
	static int[] arr = {10, 5, 6, 8, 20, 5, 7, 5, 29};
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Old array: ");
		printArr(arr);
		
		System.out.print("Enter element to delete: ");
		int idx = userInput.nextInt();
		userInput.nextLine();
		int[] newArr = deleteElement(arr, idx);
//		System.out.print("Enter index to delete: ");
//		int idx = userInput.nextInt();
//		userInput.nextLine();
//		int[] newArr = deleteElement(arr, ele);
		
		System.out.print("New array: ");
		printArr(newArr);
	}
	public static int[] deleteElementIdx(int[] arr, int idx) {
		while (idx < arr.length) arr[idx++] = (idx != arr.length) ? arr[idx] : 0; 	// Skip idx index
		return arr;
	}
	
	public static int[] deleteElement(int[] arr, int ele) {
		int j = 0;
		for (int num : arr) if (num!=ele) arr[j++] = num;
		while (j < arr.length) arr[j++] = 0;
		return arr;
	}
	
	public static void printArr(int[] arr) {
		for (int num : arr) System.out.print(num + " ");
		System.out.println();
	}
}
