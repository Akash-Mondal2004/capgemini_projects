package dsa;

public class Palindrome {

	static boolean ispalindrome(String s1) {
		int l = 0,r=s1.length()-1;
		while(l<r) {
			if(s1.charAt(l++)!=s1.charAt(r--)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "akbka";
		System.out.println(ispalindrome(s1));

	}

}
