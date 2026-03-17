package dsa.stack.dynamicStack;

public class Driver {
	public static void main(String[] args) {
		DynamicStack st = new DynamicStack();
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
