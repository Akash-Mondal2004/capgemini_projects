package Jan_31;

import java.util.Stack;

public class Stack_6 {
    static void sortStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            int x = st.pop();
            while (!temp.isEmpty() && temp.peek() > x)
                st.push(temp.pop());
            temp.push(x);
        }
        while (!temp.isEmpty())
            st.push(temp.pop());
    }

}
