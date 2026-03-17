package firstproject;

import java.util.Scanner;

public class Monthdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
		sc.nextLine();
		switch(month) {
		case 2:
			System.out.println("Enter the year");
			int year = sc.nextInt();
			sc.nextLine();
			if((year%400==0) || ((year %4==0) && (year%100!=0))) {
				System.out.println("Month 29 days");
			}else {
				System.out.println("Month 28 days");
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Month 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Month 30 days");
			break;
		}

	}

}
