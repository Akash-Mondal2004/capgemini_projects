package day6;

import java.util.Scanner;

public class P2 {
	public static int size(int[][] arr) {
		return arr.length * arr[0].length;
	}
	public static boolean iscolumnmatrix(int[][] arr) {

		try {
			for(int[] a:arr) {
				if(a.length !=1	) {
					return false;
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		
		return true;
	}
	public static boolean isColumnMatrix(int[][] arr) {
	    if (arr == null || arr.length == 0) return false;

	    for (int[] row : arr) {
	        if (row == null || row.length != 1) {
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean isRowMatrix(int[][] arr) {
	    if (arr == null) return false;
	    return arr.length == 1;
	}

	public static boolean isSquareMatrix(int[][] arr) {
	    if (arr == null || arr.length == 0) return false;

	    int rows = arr.length;
	    for (int[] row : arr) {
	        if (row == null || row.length != rows) {
	            return false;
	        }
	    }
	    return true;
	}

	public static boolean isRectangularMatrix(int[][] arr) {
	    if (arr == null || arr.length == 0) return false;

	    int cols = arr[0].length;
	    for (int[] row : arr) {
	        if (row == null || row.length != cols) {
	            return false;
	        }
	    }
	    return arr.length != cols;
	}

	public static boolean isIdentityMatrix(int[][] arr) {
	    if (!isSquareMatrix(arr)) return false;

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr.length; j++) {
	            if (i == j && arr[i][j] != 1) return false;
	            if (i != j && arr[i][j] != 0) return false;
	        }
	    }
	    return true;
	}

	public static boolean isDiagonalMatrix(int[][] arr) {
	    if (!isSquareMatrix(arr)) return false;

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr.length; j++) {
	            if (i != j && arr[i][j] != 0) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	public static boolean isNullMatrix(int[][] arr) {
	    if (arr == null || arr.length == 0) return false;

	    for (int[] row : arr) {
	        for (int val : row) {
	            if (val != 0) {
	                return false;
	            }
	        }
	    }
	    return true;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[2][2];
//		System.out.println("size of the array is: "+size(arr));
//		int[][] arr2 = {{1,2},{2,4,5},{1}};
////		System.out.println(arr[0][2]);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		int[][] array = new int[m][n];
//		for(int i =0;i<m;i++) {
//			for(int j =0;j<n;j++) {
//				array[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i =0;i<m;i++) {
//			for(int j =0;j<n;j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		int[][] temp = new int[0][0];
		
		
		System.out.println(iscolumnmatrix(temp));
		
	}

}
