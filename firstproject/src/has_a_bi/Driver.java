package has_a_bi;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine();
		Car c = new Car();
		c.engine = e;
		e.car= c;
		System.out.println(c);
		System.out.println(e);

	}

}
