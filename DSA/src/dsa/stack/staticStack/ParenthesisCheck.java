package dsa.stack.staticStack;

import java.util.Stack;

public class ParenthesisCheck {

	public static void main(String[] args) {
		System.out.println(isValid("[34*{(43-45)+588}-273]") ? "Valid equation" : "Invalid equation");
	}
	
	public static boolean isValid(String str) {
		if (str==null) return false;
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c=='(' || c=='{' || c=='[') stack.push(c);
			if (c==')' && (stack.isEmpty() || stack.pop() != '(')) return false;
			if ((c==']' || c=='}') && (stack.isEmpty() || stack.pop() != c-2)) return false;
		}
		return stack.isEmpty();
	}

}
