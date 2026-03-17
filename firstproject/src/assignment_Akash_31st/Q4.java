package assignment_Akash_31st;

public class Q4 {
	public static void checkpattern(String str,String pat) {
		if(str.length()<pat.length()) {
			System.out.println("Not possible");
			return;
		}
		int m = str.length();
		int n = pat.length();
		for(int i =0;i<m-n+1;i++) {
			if(str.substring(i, i+n) == pat) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "akdbb&$)";
		String pattern = "b&$";
		checkpattern(str,pattern);
	}

}
