package day6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
//		System.out.println("Start");
		Object[] arr = new Object[5];
//		Scanner sc = new Scanner(System.in);
////		arr[0]= true;
////		arr[1]= 'A';
////		arr[2]= 1;
////		arr[3]= "Akash";
////		arr[4]= 213439L;
//		for (int i = 0; i < arr.length; i++) {
//			String input = sc.nextLine();
//			
//			if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
//				arr[i] = Boolean.parseBoolean(input);
//			}
//			
//		}
		boolean[]  boolarray = {true,false,true};
		char[] chararray = {'A','B','G'};
		char[] chararray2 = {'A','B','G'};
		Object[] objarray = {"Akash",121,98L,true};
//		System.out.println(boolarray);
//		System.out.println(chararray.hashCode());
//		System.out.println(chararray2.hashCode());
//		System.out.println(objarray);
//		printarr(boolarray);
//		printarr(chararray);
		printarr(chararray);

	}
	public static void printarr(Object... obj) {

	    for (Object o : obj) {

	        if (o instanceof Object[]) {
	            Object[] arr = (Object[]) o;
	            for (Object val : arr) {
	                System.out.print(val + " ");
	            }
	            System.out.println();

	        } else if (o instanceof char[]) {
	            char[] arr = (char[]) o;
	            for (char c : arr) {
	                System.out.print(c + " ");
	            }
	            System.out.println();

	        } else if (o instanceof boolean[]) {
	            boolean[] arr = (boolean[]) o;
	            for (boolean b : arr) {
	                System.out.print(b + " ");
	            }
	            System.out.println();
	        }
	    }
	}

}
