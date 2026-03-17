package day7;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("assassinate");
		int[] freq = new int[26];
		boolean[] morethanone = new boolean[26];
		for(int i = 0;i<str.length();i++) {
			int ch = str.charAt(i) -'a';
			freq[ch] += 1;
			if(freq[ch]>1) {
				morethanone[ch] =true;
			}
		}
		for(int i =str.length()-1;i>=0;i--) {
			int ch = str.charAt(i)-'a';
			int count = freq[ch];
//			System.out.println(count);
			if(morethanone[ch]) {
				for (int j = 1; j <=count; j++) {
					str.insert(i, str.charAt(i));
				}
			}
//			System.out.println(str.toString());
			freq[ch]--;
			
			
		}
		System.out.println(str.toString());
		
		

	}


}
