package firstproject;

import java.util.Scanner;

public class SimpleCalulator {
	public static double addition(double a , double b) {
		return a+b;
	}
	public static double subtraction(double a , double b) {
		return a-b;
	}
	public static double multiplication(double a , double b) {
		return a*b;
	}
	public static double division(double a , double b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("Enter Operand 1");
			double a = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter operator");
			char ch = sc.next().charAt(0);
			System.out.println("Enter operand 2");
			double b = sc.nextDouble();
			sc.nextLine();
			switch (ch) {
			case '+':
				System.out.println("Result is "+addition(a,b));
				break;
			case '-':
				System.out.println("Result is "+subtraction(a,b));
				break;
			case '*':
				System.out.println("Result is "+multiplication(a,b));
				break;
			case '/':
				System.out.println("Result is "+division(a,b));
				break;
			default:
			    System.out.println("Invalid operator");
			 
			}
			System.out.println("want to continue then pres 'y'");
			char ch1 = sc.next().charAt(0);
			flag = (ch1 == 'y' || ch1 == 'Y');
		}while(flag);

	}

}
