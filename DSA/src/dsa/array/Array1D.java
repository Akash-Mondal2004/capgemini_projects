package dsa.array;

import java.util.Scanner;

public class Array1D {
	
	public static Scanner sc = new Scanner(System.in);
	public static int x = 6;
	
	public static void main(String[] args) {
		System.out.print("Enter 1D array size: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[size];
		System.out.print("Enter " + x + " elements: ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
}
