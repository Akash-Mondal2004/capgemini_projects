package dsa.stack.staticStack;

public class MyStack {
	private int[] stack;
	private int capacity;
	private int top;
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
		this.top = -1;
	}
	
	public void push(int num) {
		if (top++ < capacity) this.stack[top] = num;
		else System.out.println("Stack overflow!");
	}
	
	public Object pop() {
		if (isEmpty()) {
			System.out.println("Empty stack!");
			return null;
		}
		return this.stack[top--];
	}
	
	public Object peek() {
		if (isEmpty()) {
			System.out.println("Empty stack!");
			return null;
		}
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top < 0) ? true : false;
	}
}
