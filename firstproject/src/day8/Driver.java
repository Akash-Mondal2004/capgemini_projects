package day8;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine();
//		System.out.println(e.noOfCylinder);
		Car c = new Car();
		c.engine = e;
		e.car = c;
//		through engine
		System.out.println(e.car.color);
		System.out.println(e.noOfCylinder);
//		through car 
		System.out.println(c.color);
		System.out.println(c.engine.noOfCylinder);

	}

}
