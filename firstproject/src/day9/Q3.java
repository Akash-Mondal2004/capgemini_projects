package day9;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,8,8,20};
		int ele = 8;
		int i =0,j=0;
		while (j < arr.length) {
		    if (arr[j] == ele) {
		        j++;  
		    } else {
		        arr[i++] = arr[j++];
		    }
		}

		while (i < arr.length) {
			arr[i++] =0;
		}
		for(int k:arr) {
			System.out.print(k+" ");
		}

	}

}
