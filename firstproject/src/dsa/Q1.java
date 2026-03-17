package dsa;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,6,8,20};
		int pos = 2;
		int x = 30;
		int[] res = new int[arr.length+1];
		for (int i = 0, j = 0; i < res.length; i++) {
			if (i == pos) { 
				res[i] = x; 
			}else{ 
				res[i] = arr[j++]; 
			} 
		}
		int[] res1 = new int[arr.length-1];
		for (int i = 0, j = 0; i < res1.length; i++) {
			if (i == pos) { 
				j++;
			} 
			res1[i] = arr[j++]; 
			
		}
		for(int i:res1) {
			System.out.print(i+" ");
		}
	}

}
