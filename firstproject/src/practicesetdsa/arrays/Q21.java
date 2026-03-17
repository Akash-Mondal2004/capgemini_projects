package practicesetdsa.arrays;
//Given a string, where each character’s ASCII value contributes to the sum, find the starting index of a substring whose sum equals K
public class Q21 {
	public static int startingindex(String str,int k) {
		int left = 0,right =0,sum=0;
		while(right<str.length()) {
			int ch = str.charAt(right);
			right++;
			sum += ch;
			while(sum>k && left<right) {
				sum -=  str.charAt(left);
				left++;
			}
			if(sum == k) {
				return left;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	
		 String str = "akash";
		 int k = 31; 
		 System.out.println(startingindex(str,k));
	
	}
}
