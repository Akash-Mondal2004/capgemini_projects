package non_premitive_typecasting;
import java.util.*;
public class DriverClass {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Which engine to fit:");
		System.out.println("1. Petrol Engine");
		System.out.println("2. Diesel Engine");
		System.out.println("Enter your choice");
		byte userchoice = userInput.nextByte();
		
		
		Engine engine = null;
		switch(userchoice) {
		case 1:
			Petrol_Engine petrolengine = new Petrol_Engine();
			engine = petrolengine;
			break;
		case 2:
			Diesal_Enigne diesalengine = new Diesal_Enigne();
			engine = diesalengine;
			break;
		default:
			Petrol_Engine petrolengine1 = new Petrol_Engine();
			engine = petrolengine1;
			break;
			
		}
		car.engine = engine;
		System.out.println(engine.getClass());
		if(instance of )
//		switch(userchoice) {
//		case 1:
//			Petrol_Engine petrolengine = (Petrol_Engine)  engine;
//			petrolengine.StartEngine();
//			break;
//		case 2:
//			Diesal_Enigne diesalengine = (Diesal_Enigne)  engine;
//			diesalengine.StartEngine();
//			break;
//		default:
//			Petrol_Engine petrolengine1 = (Petrol_Engine)  engine;
//			petrolengine1.StartEngine();
//			break;
//		}
	}
}
