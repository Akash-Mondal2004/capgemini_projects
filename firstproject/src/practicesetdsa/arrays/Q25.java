package practicesetdsa.arrays;
import java.util.*;
//Given an expression, write a program to check whether the parentheses are balanced using a stack.        
public class Q25 {
	public static boolean validparenthisis(Stack<Character> st,String str ) {
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[' ) {
				st.push(ch);
			}else {
				if(ch == ')' && st.pop()=='(') continue;
				if(ch == '}' && st.pop()=='{') continue;
				if(ch == ']' && st.pop()=='[') continue;
				System.out.println("not valid");
				return false;
				
			}
		}
		System.out.println(" valid");
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		String str = "({})";
		System.out.println(validparenthisis(st, str));

	}

}
