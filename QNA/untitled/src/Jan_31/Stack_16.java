package Jan_31;

import java.util.Stack;

public class Stack_16 {
    static int celebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++) st.push(i);

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (M[a][b] == 1) st.push(b);
            else st.push(a);
        }

        int c = st.pop();
        for (int i=0;i<n;i++)
            if (i!=c && (M[c][i]==1 || M[i][c]==0))
                return -1;
        return c;
    }

}
