package Jan_31;

import java.util.Stack;

public class Stack_7 {
    static void insertBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertBottom(st, x);
        st.push(temp);
    }

    static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int x = st.pop();
        reverse(st);
        insertBottom(st, x);
    }

}
