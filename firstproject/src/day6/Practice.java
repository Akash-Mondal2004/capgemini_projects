package day6;

class Coordinate{
	int x;
	int y;
}
public class Practice {
	
	public static void helper(int[][] arr,boolean[] horizontal , boolean[] vertical) {
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					horizontal[i]=true;
					vertical[j] = true;
				}
					
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,0,5},{0,8,8}};
		boolean[] horizontal = new boolean[arr.length];

		boolean[] vertical = new boolean[arr[0].length];
		helper(arr,horizontal,vertical);
		for(int i = 0;i<horizontal.length;i++) {
			if(horizontal[i]) {
				for(int j = 0;j<arr[0].length;j++) {
					arr[i][j]=0;
				}
			}
		}
		for(int i = 0;i<vertical.length;i++) {
			if(vertical[i]) {
				for(int j = 0;j<arr.length;j++) {
					arr[j][i]=0;
				}
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
			
	}

}
