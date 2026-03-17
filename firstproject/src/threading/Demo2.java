package threading;

class A
{
	public synchronized void methodA(B b) {
		System.out.println("Thread 1 holding A");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Thread 1 waiting for B");
		b.last();
	}
	public  void last() {
		System.out.println("Inside A last()");
	}
	
}

class B
{
	public synchronized void methodB(A a) {
		System.out.println("Thread 2 holding B");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Thread 2 waiting for A");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B last()");
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(() -> a.methodA(b));
		Thread t2 = new Thread(() -> b.methodB(a));
 
		t1.start();
		t2.start();
		
	}

}