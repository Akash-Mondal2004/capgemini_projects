package dsa.stack.dynamicQueue;

public class QueueNode {
	private int num;
	private QueueNode next;
	
	public QueueNode(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public QueueNode getNext() {
		return next;
	}
	public void setNext(QueueNode next) {
		this.next = next;
	}
}
