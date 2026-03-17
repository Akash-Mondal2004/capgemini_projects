package dsa;

public class Q2 {
	public static void main(String[] args) {
		int[] arr = {10,5,6,8,20};
		int pos = 2;
		for (int i = 0, j = 0; i < arr.length-1; i++) {
			if (i == pos) j++; 
			arr[i] = arr[j++]; 	
		}
		arr[arr.length-1]= 0;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
