package recursion;
import java.util.*;
class Memo{
	static int j = 10;
	static {
    	System.out.println("from static block()");
    }
	public static void staticmethod() {
    	System.out.println("From static method");
    }
}

public class Demo {
    // Non-static variable (instance variable)
    int i = m1();
    public int m1() {
    	System.out.println("Non static block");
    	return 1;
    }
    // static variable 
    static int j = 10;
    // Non-static initialization block
    {
        System.out.println("from non static block()");
    }
//    static block 
//    static {
//    	System.out.println("from static block()");
//    }

    // Non-static method (instance method)
    public void nonstasticmethid() {
        System.out.println("From non static method()");
    }
//    static method 
//    public static void staticmethod() {
//    	System.out.println("From static method");
//    }
    // Constructor
    public Demo() {
        System.out.println("from constructor()");
    }

    public static void main(String[] args) {
        System.out.println("start of main");
        // Object creation
        Demo demo = new Demo();
//        Memo mem = new Memo();
//        Memo.staticmethod();
        System.out.println("end of main");
        HashSet<Integer> set = new HashSet<>();
    }
}

