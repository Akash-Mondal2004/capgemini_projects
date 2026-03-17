package dsa;

public class Rotate {
	static void reverse(int arr[],int i ,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,5,30,6,8,20};
//		6 30 5 10 20 8
		int pos = 2;
		int n= arr.length;
		reverse(arr,0,n-pos-1);
		reverse(arr,n-pos,n-1);
		reverse(arr,0,n-1);
		for(int k:arr) {
			System.out.print(k+" ");
		}
		
	}
}
