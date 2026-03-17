package dsa.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCount {
	public static String str = "assassinate";
	public static void main(String[] args) {
		System.out.println(stringDuplicateCounter(str));
		System.out.println(stringDuplicateCounterMap(str));		
	}
	public static int stringDuplicateCounter(String str) {
		int count = 0;
		char[] chr = str.toCharArray();
		for (int i=0; i<str.length(); i++) if (str.indexOf(chr[i]) < i) count++;
		return count;
	}
	public static int stringDuplicateCounterMap(String str) {
		int count = 0;
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i=0; i<str.length(); i++) charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), -1) + 1);
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) count += entry.getValue();
		return count;
	}
}
