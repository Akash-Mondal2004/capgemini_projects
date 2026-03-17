package practicesetdsa.arrays;

public class Q27 {
	public static void checkpattern(String str,String pat) {
		if(str.length()<pat.length()) {
			System.out.println("Not possible");
			return;
		}
		int m = str.length();
		int n = pat.length();
		for(int i =0;i<m-n+1;i++) {
			if(str.substring(i, i+n).equals(pat)) {
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
