package assignment_Akash_31st;

public class Q1 {
//	Given a 1D array of integers, write a program to find the 3rd largest element in the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,2,9,0,1};
		if(arr.length <3) {
			System.out.println("Array must have atlest 3 element");
		}
		int largest = Integer.MIN_VALUE;
		int largest2 = Integer.MIN_VALUE;
		int largest3 = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest3 = largest2;
				largest2 = largest;
				largest = arr[i];
				
			}else if(arr[i]>largest2) {
				largest3 = largest2;
				largest2 = arr[i];
			}else if (arr[i]>largest3) {
				largest3 = arr[i];
			}
		}
		System.out.println(largest3);
	}

}
