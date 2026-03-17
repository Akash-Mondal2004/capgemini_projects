package Jan_31;

import java.util.Stack;

public class Stack_19 {
    static String removeK(String num, int k) {
        Stack<Character> st = new Stack<>();
        for (char c : num.toCharArray()) {
            while (!st.isEmpty() && k>0 && st.peek()>c) {
                st.pop(); k--;
            }
            st.push(c);
        }
        while (k-- > 0) st.pop();

        String res = "";
        while (!st.isEmpty()) res = st.pop() + res;
        return res.replaceFirst("^0+", "");
    }

}
