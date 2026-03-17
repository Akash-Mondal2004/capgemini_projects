package dsa.array;

import java.util.Scanner;

public class Array2D {

	public static Scanner sc = new Scanner(System.in);
	public static int x = 6;
	
	public static void main(String[] args) {
		System.out.print("Enter 2D array row size: ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter 2D array column size: ");
		int col = sc.nextInt();
		sc.nextLine();
		
		int[][] arr2D = new int[row][col];
		System.out.println("Enter elements:");
		for (int[] arr1D : arr2D) for (int i = 0; i<arr1D.length; i++) arr1D[i] = sc.nextInt();
		System.out.println("Given 2D array:");
		for (int[] arr1D : arr2D) {
			for (int num : arr1D) System.out.print(num + " ");
			System.out.println();
		}
	}
	
}
