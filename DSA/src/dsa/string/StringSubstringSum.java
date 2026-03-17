package dsa.string;

public class StringSubstringSum {

	public static void main(String[] args) {
		
		System.out.println();
	}
	public static int substrIdx(String str, int k) {
		char[] chr = str.toCharArray();
		
		for (int i=1; i<=str.length(); i++) {
			int sum = 0;
			for (char c : str.substring(0, i).toCharArray()) sum += c;
			if (sum==k) return 0;
			
			for (int j=1; j<=str.length()-i; j++) {
				if ((sum+= chr[j+i-1]-chr[j-1]) == k) {
					return j;
				}
			}
		}
		return -1;
	}
	
}
