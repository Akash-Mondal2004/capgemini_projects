package dsa.stack.dynamicStack;

public class DynamicStack {
	private QueueNode top;
	
	public void push(int num) {
		QueueNode temp = new QueueNode(num);
		temp.setNext(top);
		top = temp;
	}
	
	public Integer pop() {
		if (top == null) return(null);
		QueueNode temp = top; 
		top = top.getNext();
		return temp.getNum();
	}
	
	public Integer peek() {
		if (top == null) return(null);
		return top.getNum();
	}
	
	public boolean isEmpty() {
		return (top==null);
	}
}
