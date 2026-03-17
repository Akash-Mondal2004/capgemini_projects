package has_a;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		Car car = new Car();
		car.engine = engine;
		System.out.println(car.color);
		System.out.println(car.engine.noOfCylinder);

	}

}
