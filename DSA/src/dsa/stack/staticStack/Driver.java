package dsa.stack.staticStack;

public class Driver {

	public static void main(String[] args) {
		MyStack st = new MyStack(10);
		st.push(3);
		st.push(2);
		st.push(5);
		System.out.println("Top of the stack: " + st.peek());
		st.pop();
		st.pop();
		System.out.println("Top of the stack: " + st.peek());
		st.pop();
		st.pop();
		System.out.println("Top of the stack: " + st.peek());
		
	}

}
