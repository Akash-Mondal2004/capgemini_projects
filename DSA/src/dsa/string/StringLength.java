package dsa.string;

public class StringLength {

	private static String str = "yuewfvycevyuwev";
	
	public static void main(String[] args) {
		System.out.println(length(str));
	}
	
	@SuppressWarnings("unused")
	private static int length(String str) {
		int count = 0;
		for (char c : str.toCharArray()) count++;
		return count;
	}
	
}
