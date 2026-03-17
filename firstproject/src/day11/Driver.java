package day11;

public class Driver {
//	int x = 1;
//	static int y = 2;
//	void show() {
//		int x = 10;
//		int y =20;
//		System.out.println(x);
//		System.out.println(this.x);
//		System.out.println(y);
//		System.out.println(this.y);
//	}
	public static void main(String[] args) {
//		Parent p = new Child();
//		Child c = new Child();
//		System.out.println(c.x);
//		System.out.println(p.x);
//		Driver d = new Driver();
//		d.show();
//		Child c = new Child();
//		c.sum(10);
//		c.sum(10, 10);
		It itemp = new It();
		System.out.println(itemp.monthlySalCal());
		System.out.println(itemp.monthlySalCal(10000));
		Supporting support = new Supporting();
		System.out.println(support.monthlySalCal());
		
		
	}
	
}