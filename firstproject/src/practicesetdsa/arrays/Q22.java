package practicesetdsa.arrays;

//Given a lowercase string where a=1, b=2, … z=26, find the starting index of a substring whose sum is K.
public class Q22 {
	public static int startingindex(String str,int k) {
		int left = 0,right =0,sum=0;
		while(right<str.length()) {
			int ch = str.charAt(right)-'a'+1;
			right++;
			sum += ch;
			while(sum>k && left<right) {
				sum -=  str.charAt(left)-'a'+1;
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
