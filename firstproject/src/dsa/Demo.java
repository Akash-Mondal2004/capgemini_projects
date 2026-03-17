package dsa;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<n;i++) {
		  System.out.println(arr[i]); 
		}
		int[][] twoDarray = {{1,2,3},{4,5,6}};
		
		
	}

}
