package dsa.problems;

public class Problem4 {
	public static String str = "I don't know";
	public static String pat1 = "don't";
	public static String pat2 = "dont";
	public static void main(String[] args) {
		System.out.println(containsPattern(str, pat1) ? "Contains pattern" : "Doesn't contain pattern");
		System.out.println(containsPattern(str, pat2) ? "Contains pattern" : "Doesn't contain pattern");
	}
	public static boolean containsPattern(String str, String pat) {
		if (str.length() < pat.length()) return false;
		for (int i = 0; i < (str.length() - pat.length()); i++) 
			if (str.substring(i, i+pat.length()).equals(pat)) return true;
		return false;
	}
}
