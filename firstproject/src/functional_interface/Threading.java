package functional_interface;
class D1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class D2 extends Thread{
	@Override
	public void run() {
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 t1 = new D1();
		D2 t2 = new D2();
		
		t1.start();
		t2.start();

	}

}
