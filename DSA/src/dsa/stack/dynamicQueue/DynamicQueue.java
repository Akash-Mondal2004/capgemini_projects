package dsa.stack.dynamicQueue;

public class DynamicQueue {
	private QueueNode head, tail;
	
	public void enqueue(int num) {
		QueueNode temp = new QueueNode(num);
		if (isEmpty()) head = temp;
		else tail.setNext(temp);
		tail = temp;
	}
	
	public Integer dequeue() {
		if (isEmpty()) return(null);
		if (head == tail) tail = null;
		QueueNode temp = head; 
		head = head.getNext();
		return temp.getNum();
	}
	
	public Integer front() {
		if (isEmpty()) return(null);
		return head.getNum();
	}
	
	public Integer back() {
		if (isEmpty()) return(null);
		return tail.getNum();
	}
	
	public boolean isEmpty() {
		return (head==null);
	}
}
