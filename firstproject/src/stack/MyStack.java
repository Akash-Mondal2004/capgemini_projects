package stack;

public class MyStack {
	private int capacity;
	private int[] stackarr;
	private int top;
	public MyStack(int capacity) {
		this.capacity = capacity;
		stackarr = new int[capacity];
		this.top = -1;
	}
	public void push(int num) {
		if(top+1 == capacity) {
			System.out.println("Stack is full cannot be pushed");
			return;
		}
		stackarr[++top]=num;
	}
	public Object pop() {
		if(top== -1) {
			System.out.println("Stack is empty cannot be poped");
			return null;
		}
		
		return stackarr[top--];
	}
	public Object peek() {
		if (top == -1) {
	        System.out.println("Stack is empty");
	        return null;
	    }
	    return stackarr[top];
	}

	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	

}
