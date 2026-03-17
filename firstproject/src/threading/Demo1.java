package threading;

public class Demo1 implements Runnable {
	int count = 0;
	public void show() {
		count++;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<500;i++) {
			show();
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d =new Demo1();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d.count);
	}

}
