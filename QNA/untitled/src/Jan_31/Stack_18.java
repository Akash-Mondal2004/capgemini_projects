package Jan_31;

import java.util.Stack;

public class Stack_18 {
    static String decode(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        String curr = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                k = k*10 + (c-'0');
            else if (c=='[') {
                num.push(k);
                str.push(curr);
                k = 0;
                curr = "";
            } else if (c==']') {
                String temp = curr;
                curr = str.pop();
                int n = num.pop();
                while (n-- > 0) curr += temp;
            } else curr += c;
        }
        return curr;
    }

}
