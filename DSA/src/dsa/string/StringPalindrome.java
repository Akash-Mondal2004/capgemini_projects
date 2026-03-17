package dsa.string;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("racecar " + (isStringPalindrome("racecar") ? "is" : "isn't") + " a palindrome");
		System.out.println("cow " + (isStringPalindrome("cow") ? "is" : "isn't") + " a palindrome");
		System.out.println("racecar " + (checkStringPalindrome("racecar") ? "is" : "isn't") + " a palindrome");
		System.out.println("cow " + (checkStringPalindrome("cow") ? "is" : "isn't") + " a palindrome");
	}

	public static boolean checkStringPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	public static boolean isStringPalindrome(String str) {
		int len = str.length();
		for (int i=0; i<len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) return false;
		}
		return true;
	}
}
