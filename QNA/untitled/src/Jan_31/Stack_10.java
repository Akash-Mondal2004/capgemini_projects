package Jan_31;

import java.util.Stack;

public class Stack_10 {
    class MinStack {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();

        void push(int x) {
            st.push(x);
            if (min.isEmpty() || x <= min.peek())
                min.push(x);
        }

        void pop() {
            if (st.pop().equals(min.peek()))
                min.pop();
        }

        int getMin() {
            return min.peek();
        }
    }

}
