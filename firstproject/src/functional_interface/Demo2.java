package functional_interface;
@FunctionalInterface
interface A1{
	void show(String msg);
}
public class Demo2 {
	public void show1(String msg) {
		msg = msg.toLowerCase();
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		A1 a = (msg)->d.show1(msg);
		a.show("HELP");
	}
}
