package functional_interface;
class D3 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class D4 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println((char) i+65);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D3 d3 = new D3();
		D4 d4 = new D4();
		Thread td1 = new Thread(d3);
		Thread td2 = new  Thread(d4);
		
		td1.start();
		td2.start();
	}

}
