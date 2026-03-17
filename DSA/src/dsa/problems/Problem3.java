package dsa.problems;

import java.util.Stack;

public class Problem3 {
	public static String pattern = "[34*{(43-45)+588}-273]";
	public static void main(String[] args) {
		System.out.println(isValid(pattern) ? "Valid equation" : "Invalid equation");
	}

	public static boolean isValid(String str) {
		if (str==null) return false;
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c=='(' || c=='{' || c=='[') stack.push(c);
			if (c==')' && (stack.isEmpty() || stack.pop() != '(')) return false;
			if (c=='}' && (stack.isEmpty() || stack.pop() != '{')) return false;
			if (c==']' && (stack.isEmpty() || stack.pop() != '[')) return false;
		}
		return stack.isEmpty();
	}

}
