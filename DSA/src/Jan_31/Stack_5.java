package Jan_31;

import java.util.Stack;

public class Stack_5 {

    static int prec(char c) {
        if (c=='+'||c=='-') return 1;
        if (c=='*'||c=='/') return 2;
        return -1;
    }

    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                res += c;
            else if (c == '(')
                st.push(c);
            else if (c == ')') {
                while (st.peek() != '(')
                    res += st.pop();
                st.pop();
            } else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c))
                    res += st.pop();
                st.push(c);
            }
        }
        while (!st.isEmpty())
            res += st.pop();

        return res;
    }

}
