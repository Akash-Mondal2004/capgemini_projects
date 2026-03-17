package dsa.string;

public class LowerSubstringSum {
	public static String str = "utryutyugfeyubfvyu";
	public static void main(String[] args) {
		System.out.println(strLowercase(str, 36));
		System.out.println("=== Basic correctness ===");
		System.out.println(strLowercase("abc", 0));   // -1
	    System.out.println(strLowercase("abc", 1));   // 0  -> "a"
	    System.out.println(strLowercase("abc", 2));   // 1  -> "b"
	    System.out.println(strLowercase("abc", 3));   // 2  -> "c"
	    System.out.println(strLowercase("abc", 5));   // 1  -> "bc"
	    System.out.println(strLowercase("abc", 6));   // 0  -> "abc"
	    System.out.println(strLowercase("abc", 7));   // -1
	}
	public static int strLowercase(String str, int k) {
		for (int i=1; i<=str.length(); i++) {
			int sum = 0;
			for (int j=0; j<i; j++) sum += (str.charAt(j)-'a'+1);
			if (sum==k) return 0;
			for (int j=1; j<=str.length()-i; j++) {
				sum += (str.charAt(j+i-1)-str.charAt(j-1));
				if (sum==k) return j;
			}
		}
		return -1;
	}
}
