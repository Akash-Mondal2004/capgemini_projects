package dsa.array;

import java.util.Scanner;

public class Array1DInsert {
	
	static int[] arr = {10, 5, 6, 8,20};
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Old array: ");
		printArr(arr);
		
		System.out.print("Enter index to insert: ");
		int idx = userInput.nextInt();
		userInput.nextLine();
		System.out.print("Enter element to insert: ");
		int ele = userInput.nextInt();
		userInput.nextLine();
		
		int[] newArr = insertElement(arr, idx, ele);
		
		System.out.print("New array: ");
		printArr(newArr);
	}
	public static int[] insertElement(int[] arr, int idx, int ele) {
		int[] newArr = new int[arr.length + 1];
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if (i == idx) newArr[j++] = ele;
			newArr[j++] = arr[i];
		}
		return newArr;
	}
	public static void printArr(int[] arr) {
		for (int num : arr) System.out.print(num + " ");
		System.out.println();
	}
}
