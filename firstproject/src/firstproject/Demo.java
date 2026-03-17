package firstproject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
//		short num = userInput.nextShort();	
//		userInput.nextLine();
//		System.out.println("num: "+ num);
//		String name = userInput.nextLine();
//		System.out.println("name is :" +name);
//		upper llower number special
		char ch = '?';
		int res = 0;
		if(ch>=65 && ch<=90) {
			res=1;
			
		}else if (ch>=97 && ch<=122) {
			res =2;
			
		}else if (ch>=0 && ch <= 255) {
			res = 3;
		}else {
			res = 4;
		}
		
		switch(res) {
		case 1:
			System.out.println("capital");
			break;
		case 2:
			System.out.println("small");
			break;
		case 3:
			System.out.println("special");
			break;
		default :
			System.out.println("number");
		}
		
		userInput.close();
	}

}
