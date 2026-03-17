package practicesetdsa.arrays;
//Write a program to find the sum of all elements in a 2D array
public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2d= {{1,2,3},{4,5,6},{7,8,9}};
		int sum  =0;
		for(int i  =0;i<arr2d.length;i++) {
			for(int j =0;j<arr2d[i].length;j++) {
				sum += arr2d[i][j];
			}
		}
		System.out.println("Sum of all element in 2d array is "+ sum);

	}

}
