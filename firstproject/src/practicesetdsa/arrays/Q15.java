package practicesetdsa.arrays;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 25, 30, 45, 50};
        int key = 30;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index= i; 
                break;
            }
        }
        if(index != -1) {
        	System.out.println("Index found at "+(index+1) +"thposition");
        }else {
        	System.out.println("Element not found");
        	
        }

	}

}
