package foodordersystem;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to akash food system");
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		sc.next();
		System.out.println("Enter your email id ");
		String email = sc.nextLine();
		sc.next();
		System.out.println("Enter password ");
		String password = sc.nextLine();
		sc.next();
		
		Customer c1 = new Customer(name, email, password);
		System.out.println("Select the food and quantity");
		

	}

}
