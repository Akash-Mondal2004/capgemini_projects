package day7;
import java.util.*;
public class Stringcheck {
	public static String s1 = "aka";
	public static String s2 = "bka";
	
	public static void swap(String s1,String s2){
		String temp = s1;
		s1=s2;
		s2=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = "akash";
//		String str2 = "akash";
//		str1 = "bika";
//		String str3 = new String("akash");
//		System.out.println(str1.hashCode() +" "+ str2.hashCode()+" "+str3.hashCode());
//		
//		System.out.println(str2 == str3);
		
//		System.out.println('a'-'A');
		StringBuilder str = new StringBuilder();
		String input = "  B@s1 a ";
//		char[] arr = input.sp;
//		for(int i =0;i<input.len gth();i++) {
//			if(input.charAt(i)>='A' && input.charAt(i)<='Z') {
//				str.append((char) (input.charAt(i)+32));
//			}else if(input.charAt(i)>='a' && input.charAt(i)<='z') {
//				str.append((char)(input.charAt(i)-32));
//			}else {
//				str.append(input.charAt(i));
//			}
//		}
//		System.out.println(str);
//		System.out.println(removespace(input));
//		System.out.println(palindrom("akab"));
		swap(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
		

	}
	static String removespace(String str1) {
//		return str.trim();
		StringBuilder str = new StringBuilder(str1);
		int i =0;
		while(i<str.length()) {
			if(str.charAt(i)==' ') {
				str.deleteCharAt(i);
			}else {
				break;
			}
		}
		return str.toString();
	}
	static boolean palindrom(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
		}
		return true;
	}
static boolean areAnagrams(String s1, String s2) {
        
        if (s1.length() != s2.length()) return false;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

}
