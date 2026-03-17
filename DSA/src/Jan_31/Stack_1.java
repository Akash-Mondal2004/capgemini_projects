package Jan_31;

import java.util.Stack;

public class Stack_1 {
    static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray())
            st.push(c);

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty())
            result.append(st.pop());

        return result.toString();
    }

}
