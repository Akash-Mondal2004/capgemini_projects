package Jan_31;

import java.util.Stack;

public class Stack_3 {
    static boolean hasDuplicate(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (st.peek() == '(') return true;
                while (st.pop() != '(');
            } else st.push(c);
        }
        return false;
    }

}
