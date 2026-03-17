package Jan_31;

import java.util.Stack;

public class Stack_4 {
    static int postfixEval(String s) {
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                st.push(c - '0');
            else {
                int b = st.pop();
                int a = st.pop();
                if (c=='+') st.push(a+b);
                if (c=='-') st.push(a-b);
                if (c=='*') st.push(a*b);
                if (c=='/') st.push(a/b);
            }
        }
        return st.pop();
    }

}
